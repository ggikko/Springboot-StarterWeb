package me.ggikko.gcm;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Park Ji Hong, ggikko.
 */
@Service
public class GcmTest {

    @Autowired
    ModelMapper modelMapper;

    private static String url = "https://gcm-http.googleapis.com/gcm/send";

    public void pushMessageToApp() {
        GcmDto.Request request = new GcmDto.Request();

        HashMap<String, String> tempMap = new HashMap<String, String>();
        tempMap.put("title", "ggikko");
        tempMap.put("message", "hello");

        request.setData(tempMap);
        request.setTo("eJEpqWGrc7I:APA91bHLB_cNuu2IF8W119RGJh4WsQjMs10tSkfmrwb_A6P3CF2zPq0MocII8K3wOoZA9cqMW-cCS0_W4GY4lRYPZOg2n6oi6zIXC37fBN0BR6-QpYE9hvHd51xBT1EHD7tC7wqZF7eI");


        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

//        MultiValueMap<String, String> parameter = new LinkedMultiValueMap<String, String>();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "key=AIzaSyCHAEzmhfRb08b5H2VPPhDJpzAntBufh4Q");
//        try {
//            HttpEntity<String> entity = new HttpEntity<String>(objectMapper.writeValueAsString(request), headers);
//            restTemplate.postForLocation(url, objectMapper.writeValueAsString(entity));
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }


        MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();

        body.add("Authorization", "key=AIzaSyCHAEzmhfRb08b5H2VPPhDJpzAntBufh4Q");


//        try {
//            HttpEntity<?> httpEntity = new HttpEntity<Object>(body, objectMapper.writeValueAsString(request));
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }


//        restTemplate.postForObject("https://gcm-http.googleapis.com/gcm/send", GcmDto.Request.class, GcmDto.Response.class, request);

//        restTemplate.getForObject("https://gcm-http.googleapis.com/gcm/send", GcmDto.Response.class);


    }

    public void pushMessageToApp2(String title, String message) throws IOException {
//
//        HttpClient httpClient = HttpClients.custom().build();
//        HttpUriRequest request = RequestBuilder.get()
//                .setUri(url)
//                .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
//                .setHeader("Authorization", "key=AIzaSyCHAEzmhfRb08b5H2VPPhDJpzAntBufh4Q")
//                .build();
//
//        httpClient.execute(request);
//
//        CloseableHttpClient

//        RestTemplate restTemplate = new RestTemplate();
//        GcmDto.Test test = new GcmDto.Test();
//        test.setData("Data : hello");
//        test.setTo("eJEpqWGrc7I:APA91bHLB_cNuu2IF8W119RGJh4WsQjMs10tSkfmrwb_A6P3CF2zPq0MocII8K3wOoZA9cqMW-cCS0_W4GY4lRYPZOg2n6oi6zIXC37fBN0BR6-QpYE9hvHd51xBT1EHD7tC7wqZF7eI");
//        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
//        headers.add( "Content-Type", "application/json");
//        headers.add("Authorization", "key=AIzaSyCHAEzmhfRb08b5H2VPPhDJpzAntBufh4Q");
//        HttpEntity httpEntity = new HttpEntity(test, headers);
//       // httpEntity.toString();
//        restTemplate.postForObject(url, httpEntity, String.class);

        String deviceId = "eJEpqWGrc7I:APA91bHLB_cNuu2IF8W119RGJh4WsQjMs10tSkfmrwb_A6P3CF2zPq0MocII8K3wOoZA9cqMW-cCS0_W4GY4lRYPZOg2n6oi6zIXC37fBN0BR6-QpYE9hvHd51xBT1EHD7tC7wqZF7eI";
        String deviceId2 = "cvQNt4Mo218:APA91bHOqHWU7rEA4KEzOQwmhZI2kvwJ-uw8LYuAYOt1sZryncT7ToygPbnsTn-HXsdnQ3xTKIg73pLQ7l7GAJEeBV0ZErW9wHR9vMZZSLG7gt6b5lR_EX6B7Yisw3FqmIk-2B3vwjFt";

        System.out.printf("test");


        final Message.Builder messagebuilder = new Message.Builder();
//        messagebuilder.addData("message", URLEncoder.encode(message, "UTF-8"));
//        messagebuilder.addData("title", URLEncoder.encode(title, "UTF-8"));
        messagebuilder.addData("message", URLEncoder.encode(message, "UTF-8"));
        messagebuilder.addData("title", URLEncoder.encode(title, "UTF-8"));

        Sender sender =new Sender("AIzaSyCHAEzmhfRb08b5H2VPPhDJpzAntBufh4Q");

        Result result = sender.send(messagebuilder.build(),deviceId2, 5 );
        final String Stringresponse = result.getMessageId();

    }
}