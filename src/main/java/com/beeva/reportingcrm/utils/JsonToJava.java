package com.beeva.reportingcrm.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.apache.flume.Event;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.beeva.reportingcrm.domain.ApxEvent;

public class JsonToJava {

	public static void main(String[] args) {
		ApxEvent apxEvent = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			apxEvent = mapper.readValue(new File("/home/joseluismoreno/tests/rabbitMq/eventoContratacion.json"), ApxEvent.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("PARSED EVENT :: " + apxEvent);
	}

	public static ApxEvent parseEvent(Event event) {
		ApxEvent apxEvent = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			apxEvent = mapper.readValue(new ByteArrayInputStream(event.getBody()), ApxEvent.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("PARSED EVENT :: " + apxEvent);
		
		return apxEvent;
	}
}
