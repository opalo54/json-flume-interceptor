package com.beeva.reportingcrm.flume.source.interceptor;

import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import com.beeva.reportingcrm.domain.ApxEvent;
import com.beeva.reportingcrm.utils.JsonToJava;

public class JsonInterceptor implements Interceptor, Interceptor.Builder {

	private JsonInterceptor interceptor;

	@Override
	public void configure(Context arg0) {
		interceptor = new JsonInterceptor();

	}

	@Override
	public Interceptor build() {
		return interceptor;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public Event intercept(Event event) {
		String bjson = new String(event.getBody());
		ByteArrayInputStream bis = new ByteArrayInputStream(event.getBody());
		System.out.println("BJSON :: " + bjson);
		// decode your json, e.g. Jackson
		ApxEvent apxEvent = JsonToJava.parseEvent(event);
		System.out.println("ACABA INTERCEPTOR");
		
		// MyDecodedJsonObject record; // pseudo class
		// event.getHeaders().put("timestamp",
		// record.getTimestamp().toString());
		String newBody = apxEvent.getData().getUUID() + "," + apxEvent.getData().getDES_DOMCOPRO() + "," + apxEvent.getData().getSubscriberKey() + "," + apxEvent.getData().getEmailAddress() + "," + apxEvent.getData().getXTI_SEXO() + "," + apxEvent.getData().getCOD_IDIOMA() + "," + apxEvent.getData().getDES_NOMPILA() + apxEvent.getEventDefinitionKey() + "," + apxEvent.getContactKey();
		
		System.out.println("NEWBODY :: " + newBody);
		event.setBody(newBody.getBytes());
		return event;
	}

	@Override
	public List<Event> intercept(List<Event> events) {
		for (Iterator<Event> iterator = events.iterator(); iterator.hasNext();) {
			Event next = intercept(iterator.next());
			if (next == null) {
				iterator.remove();
			}
		}
		return events;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
