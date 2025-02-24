package protobuf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@Import(ObjectMapperConfig.class)
@WebMvcTest(ProtobufController.class)
class ProtobufControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void user_protobuf() throws Exception {
        mockMvc.perform(get("/user"))
                .andExpectAll(
                        status().isOk(),
                        content().contentType(MediaType.APPLICATION_JSON),
                        jsonPath("$.id").exists(),
                        jsonPath("$.name").exists(),
                        jsonPath("$.grade").exists(),
                        jsonPath("$.createdAt").exists()
                );
    }

    @Test
    void users_protobuf() throws Exception {
        mockMvc.perform(get("/users"))
                .andExpectAll(
                        status().isOk(),
                        content().contentType(MediaType.APPLICATION_JSON),
                        jsonPath("$.data").exists(),
                        jsonPath("$.data").isArray(),
                        jsonPath("$.data[0].id").exists(),
                        jsonPath("$.data[0].name").exists(),
                        jsonPath("$.data[0].grade").exists(),
                        jsonPath("$.data[0].createdAt").exists()
                );
    }
}