package me.ggikko.gcm;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Park Ji Hong, ggikko.
 */
public class GcmDto {

    @Data
    public static class Response{

        private String status_code;
        private String response;

    }

    @Data
    public static class Request{

        private HashMap<String, String> data;
        private String to;

    }

    @Data
    public static class Test{
        private String data;
        private String to;
    }
}
