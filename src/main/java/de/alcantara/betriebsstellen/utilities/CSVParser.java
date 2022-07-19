package de.alcantara.betriebsstellen.utilities;

import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import de.alcantara.betriebsstellen.model.Station;

public class CSVParser {

	public static List<Station> parse() {
		try {
			FileReader fReader = new FileReader("DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv");
			CSVReader reader = new CSVReaderBuilder(fReader).withSkipLines(1)
					.withCSVParser(new CSVParserBuilder().withSeparator(';').build()).build();
			List<Station> csv_objectList = reader.readAll().stream().map(data -> {
				Station station = new Station();
				station.setCode(data[1]);
				station.setName(data[2]);
				station.setShortName(data[3]);
				station.setTyp(data[4]);
				return station;
			}).collect(Collectors.toList());
			return csv_objectList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
