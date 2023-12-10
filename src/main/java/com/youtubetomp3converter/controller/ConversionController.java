package com.youtubetomp3converter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ConversionController {

	// Controller
	@GetMapping("/conversion")
	public ResponseEntity<?> GetResponse(@RequestParam("link") String link) {
		return ResponseEntity.ok().body("Your link: "+link);
	}
	
}
