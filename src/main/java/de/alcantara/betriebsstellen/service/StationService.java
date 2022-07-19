package de.alcantara.betriebsstellen.service;

import java.util.List;

import de.alcantara.betriebsstellen.model.Station;
import de.alcantara.betriebsstellen.model.StationReturn;
import de.alcantara.betriebsstellen.utilities.CSVParser;
import de.alcantara.betriebsstellen.utilities.StationMapper;

public class StationService {

	public static StationReturn findByCode(String code) {
		List<Station> statonList = CSVParser.parse();
		for (Station s : statonList) {
			if (s.getCode().equals(code)) {
				return StationMapper.map(s);
			}
		}
		Station stationNotFound = new Station();
		stationNotFound.setName("Not Found");
		return StationMapper.map(stationNotFound);
	}

}
