package com.example.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class TemplateService {

    @Autowired
    private RestTemplate restTemplate;


    public String getDataFromExternalAPI() {
        String apiUrl = "http://localhost:8080/accounts"; // Replace with the actual API URL

        // Make a GET request to the API and specify the response type
        String response = restTemplate.getForObject(apiUrl, String.class);

        return response;
    }

    public String postDataToExternalAPI(String requestData) {
        String apiUrl = "http://localhost:8080/accounts"; // Replace with the actual POST API URL

        // Make a POST request to the API and specify the request body and response type
        String response = restTemplate.postForObject(apiUrl, requestData, String.class);

        // Set request headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create a request entity with headers and data
        HttpEntity<String> requestEntity = new HttpEntity<>(requestData, headers);

        // Make a POST request to the API and specify the response type
        String responses = restTemplate.postForObject(apiUrl, requestEntity, String.class);

        return responses;
    }

}
