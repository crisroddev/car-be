package com.udacity.boogle.maps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@WebMvcTest(MapsController.class)
public class BoogleMapsApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    MapsController mapsController;

    @Test
    public void testGetRequest() throws Exception{
        mockMvc.perform(get("/maps?lat=47.7&lon=-122.3"))
                .andExpect(status().isOk());
    }
}
