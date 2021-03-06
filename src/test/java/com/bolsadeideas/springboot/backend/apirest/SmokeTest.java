package com.bolsadeideas.springboot.backend.apirest;

import com.bolsadeideas.springboot.backend.apirest.controllers.IndexController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {
    @Autowired
    private IndexController indexController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(indexController).isNotNull();
    }
}
