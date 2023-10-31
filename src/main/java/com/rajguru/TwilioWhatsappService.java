package com.rajguru;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TwilioWhatsappService {

	@Value("${twilio.accountSid}")
	private String accountSid;

	@Value("${twilio.authToken}")
	private String authToken;

	@Value("${twilio.whatsappNumber}")
	private String fromNumber;

	public void sendWhatsAppMessage(String to, String messageBody) {
		Twilio.init(accountSid, authToken);
		Message.creator(new PhoneNumber("whatsapp:" + to), new PhoneNumber(fromNumber), messageBody).create();
	}
}
