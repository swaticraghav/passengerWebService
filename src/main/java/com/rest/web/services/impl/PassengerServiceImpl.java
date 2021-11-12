package com.rest.web.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

import org.springframework.stereotype.Service;

import com.rest.web.services.dto.Passenger;
import com.rest.web.services.interfaces.PassengerService;

@Service
public class PassengerServiceImpl implements PassengerService{

	List<Passenger> passengerList = new ArrayList<Passenger>();
	int id;
	
	@Override
	public List<Passenger> getPassengers(int start, int end) {
		System.err.println("Query Param start value" + start);
		System.err.println("Query Param end value" + end);
		return passengerList;
	}

	 @Override public Passenger addPassenger(Passenger passenger) {
	 passenger.setId(++id); passengerList.add(passenger); return passenger; }

	@Override
	public String formParamTest(String firstName, String lastName) {
		System.err.println(firstName);
		System.err.println(lastName);
		return "Hurray";
	}

	@Override
	public String headerParam(String agentName) {
		System.err.println("Agent Name:" +agentName);
		return "Agent Name: " +agentName;
	}

	@Override
	public String getHeaders(HttpHeaders headers) {
		
		
		MultivaluedMap<String,String> requestHeaders = headers.getRequestHeaders();
		Set<String> keySet = requestHeaders.keySet();
		for (String key : keySet) {
			System.err.println("Headers:---------------------");
			System.out.println("key: " +key);
			System.out.println("key value: " + headers.getHeaderString(key));
		}
		
		
		Map<String, Cookie> cookies = headers.getCookies();
		Set<String> cookieKeys = cookies.keySet();
		for (String cookieKey : cookieKeys) {
			System.err.println("Cookies:---------------------");
			System.out.println("cookie name: " + cookieKey);
			System.out.println("cookie value" + cookies.get(cookieKey).getValue());
		}
		System.err.println("End:---------------------");
		return "Headers here.";
	}

}
