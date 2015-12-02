package me.ggikko.gcmtest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import me.ggikko.Application;
import me.ggikko.gcm.ContainData;
import me.ggikko.gcm.GcmDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Park Ji Hong, ggikko.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class GcmTest {

    @Autowired
    WebApplicationContext wac;

    @Autowired
    ObjectMapper objectMapper;

    MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void sendingGcm() throws Exception {


//        GcmDto.Request request = new GcmDto.Request();
//
//        HashMap<String, String> tempMap = new HashMap<String, String>();
//        tempMap.put("title", "ggikko");
//        tempMap.put("message", "hello");
//
//        request.setData(tempMap);
//        request.setTo("eJEpqWGrc7I:APA91bHLB_cNuu2IF8W119RGJh4WsQjMs10tSkfmrwb_A6P3CF2zPq0MocII8K3wOoZA9cqMW-cCS0_W4GY4lRYPZOg2n6oi6zIXC37fBN0BR6-QpYE9hvHd51xBT1EHD7tC7wqZF7eI");
//
//        ResultActions result = mockMvc.perform(post("gcm").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(request)));
//        result.andDo(print());
//        result.andExpect(status().isOk());


    }


}
