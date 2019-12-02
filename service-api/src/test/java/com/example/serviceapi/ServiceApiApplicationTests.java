package com.example.serviceapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import net.minidev.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

@SpringBootTest
class ServiceApiApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {

//        String json = "{\"r\":\"0.9997\",\"k0\":\"44.9257\",\"k1\":\"148.1533\",\"sixData\":[{\"abs\":\"222.58\",\"concentration\":\"1.000\",\"sn\":\"S1\"},{\"abs\":\"496.48\",\"concentration\":\"3.000\",\"sn\":\"S2\"},{\"abs\":\"787.84\",\"concentration\":\"5.000\",\"sn\":\"S3\"},{\"abs\":\"1095.69\",\"concentration\":\"7.000\",\"sn\":\"S4\"},{\"abs\":\"1527.18\",\"concentration\":\"10.000\",\"sn\":\"S5\"},{\"abs\":\"2999.76\",\"concentration\":\"20.000\",\"sn\":\"S6\"}],\"fluorescenceValue\":\"1290.08\",\"concentration\":\"8.405\",\"concentrationUnit\":\"μg/L\"}";

        String json = "{\"fluorescenceValue\":\"1290.08\",\"concentration\":\"8.405\",\"concentrationUnit\":\"μg/L\"}";

        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        OriginalAtlas originalAtlas = mapper.readValue(json, OriginalAtlas.class);

       String k1 = originalAtlas.getK1();

        JSONArray sixData = originalAtlas.getSixData();

        if (null != sixData) {

            System.out.println("aaa");
        }

    }

}
