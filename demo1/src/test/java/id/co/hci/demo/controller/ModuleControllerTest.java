package id.co.hci.demo.controller;

import id.co.hci.demo.pojo.ModulesPojo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ModuleControllerTest extends AbstractTest{

    @Override
    @BeforeEach
    public void setUp() {
        super.setUp();
    }


    // UserID : albert
    String jsonExpectedUserAlbert = "{\"modules\":[{\"moduleName\":\"PromoCard\",\"moduleOrder\":1},{\"moduleName\":\"CategoryCard\",\"moduleOrder\":2},{\"moduleName\":\"FlashSaleCard\",\"moduleOrder\":3},{\"moduleName\":\"HistoryCard\",\"moduleOrder\":4},{\"moduleName\":\"NewsCard\",\"moduleOrder\":5}]}";

   // UserID : johnny
    String jsonExpected = "{\"modules\":[{\"moduleName\":\"CategoryCard\",\"moduleOrder\":1},{\"moduleName\":\"PromoCard\",\"moduleOrder\":2},{\"moduleName\":\"FlashSaleCard\",\"moduleOrder\":3},{\"moduleName\":\"HistoryCard\",\"moduleOrder\":4},{\"moduleName\":\"NewsCard\",\"moduleOrder\":5}]}";

    // Normal Case
    @Test
    public void getModuleList() throws Exception {
        String uri = "/api/module/johnny";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(jsonExpected, content);
    }

    // User not Found case
    @Test
    public void getModuleListUserNotFound() throws Exception {
        String uri = "/api/module/kiki";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("User Id Not Found", content);
    }


}