import com.google.protobuf.Timestamp;
import org.junit.jupiter.api.Test;
import protobuf.user.v1.User;
import protobuf.user.v1.UserGrade;

import java.util.UUID;

public class ProtobufTest {

    @Test
    void user() {
        var user = User.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setName("nopecho")
                .setGrade(UserGrade.USER_GRADE_BRONZE)
                .setCreatedAt(Timestamp.newBuilder()
                        .build())
                .build();

        System.out.println(user);
    }
}
