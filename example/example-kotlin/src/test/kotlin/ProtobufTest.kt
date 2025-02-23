import com.google.protobuf.Timestamp
import org.junit.jupiter.api.Test
import protobuf.user.v1.User
import protobuf.user.v1.UserGrade
import protobuf.user.v1.user
import java.util.UUID

class ProtobufTest {

    @Test
    fun user() {
        // kotlin style
        user {
            id = UUID.randomUUID().toString()
            name = "foo"
            grade = UserGrade.USER_GRADE_UNKNOWN
            createdAt = Timestamp.getDefaultInstance()
        }.also {
            println(it)
        }

        // java style
        User.newBuilder()
            .setId(UUID.randomUUID().toString())
            .setName("foo")
            .setGrade(UserGrade.USER_GRADE_UNKNOWN)
            .setCreatedAt(Timestamp.getDefaultInstance())
            .build()
            .also {
                println(it)
            }
    }
}