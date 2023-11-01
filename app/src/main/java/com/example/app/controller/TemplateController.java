package com.example.app.controller;

import com.example.app.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {
    @Autowired
    private TemplateService apiService;

    @GetMapping("/get-data")
    public String fetchDataFromAPI() {
        String data = apiService.getDataFromExternalAPI();
        return data;
    }
    @PostMapping("/send-data")
    public String sendPostDataToAPI(@RequestBody String requestData) {
        String response = apiService.postDataToExternalAPI(requestData);
        return response;
    }
}
