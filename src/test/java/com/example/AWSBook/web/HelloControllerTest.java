package com.example.AWSBook.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DisplayName("-- Return Hello 리턴됩니다. --")
    public void helloTest() throws Exception {
        String returnValue = "hello";
        final String user = "Moongg";

        URI targetUrl = UriComponentsBuilder.fromUriString("/hello")
                .queryParam("user", user)
                .build()
                .encode()
                .toUri();

        String message = this.restTemplate.getForObject(targetUrl, String.class);
        System.out.println(message);
        assertEquals("Hello "+user+", Have a Hard Work!!!", message);
    }
}
