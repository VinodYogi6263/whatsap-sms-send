package com.rajguru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsappController {

	private final TwilioWhatsappService twilioWhatsappService;

	@Autowired
	public WhatsappController(TwilioWhatsappService twilioWhatsappService) {
		this.twilioWhatsappService = twilioWhatsappService;
	}

	@PostMapping("/sendWhatsappMessage")
	public void sendWhatsappMessage(@RequestParam String to, @RequestParam String body) {
	    twilioWhatsappService.sendWhatsAppMessage(to, body);
	}


}
