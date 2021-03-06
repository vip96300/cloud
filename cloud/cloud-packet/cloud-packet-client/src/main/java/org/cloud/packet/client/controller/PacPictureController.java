package org.cloud.packet.client.controller;

import org.cloud.packet.client.service.PacPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@RequestMapping(value="/packet/packet/picture")
public class PacPictureController {
	
	
	@Autowired
	private PacPictureService pacPictureService;
	
}
