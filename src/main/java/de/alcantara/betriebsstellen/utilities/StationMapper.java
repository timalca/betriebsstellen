package de.alcantara.betriebsstellen.utilities;

import de.alcantara.betriebsstellen.model.Station;
import de.alcantara.betriebsstellen.model.StationReturn;

public class StationMapper {

	public static StationReturn map(Station station) {
		StationReturn result = new StationReturn();
		result.setName(station.getName());
		result.setShortName(station.getShortName());
		result.setTyp(station.getTyp());
		return result;

	}

}
