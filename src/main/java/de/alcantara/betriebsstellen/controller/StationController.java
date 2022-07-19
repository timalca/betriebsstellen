package de.alcantara.betriebsstellen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.alcantara.betriebsstellen.model.StationReturn;
import de.alcantara.betriebsstellen.service.StationService;

@RestController
@RequestMapping("/betriebsstelle")
public class StationController {

	@GetMapping("/{code}")
	public ResponseEntity<StationReturn> show(@PathVariable String code) {
		return ResponseEntity.ok(StationService.findByCode(code));
	}
}
