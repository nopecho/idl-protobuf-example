package protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.util.Timestamps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import protobuf.common.api.v1.ApiMetadata;
import protobuf.common.api.v1.ApiResponse;
import protobuf.order.v1.Order;
import protobuf.order.v1.OrderStatus;
import protobuf.product.v1.Product;
import protobuf.product.v1.ProductPrice;
import protobuf.product.v1.ProductType;
import protobuf.user.v1.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ProtobufController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/user")
    public ResponseEntity<User> user() {
        return ResponseEntity.ok(User.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setName("nopecho")
                .setGrade(UserGrade.USER_GRADE_BRONZE)
                .setCreatedAt(Timestamps.now())
                .build());
    }

    @GetMapping("/users")
    public ResponseEntity<UserListResponse> users() {
        return ResponseEntity.ok(UserListResponse.newBuilder()
                .addAllData(List.of(
                        User.newBuilder()
                                .setId(UUID.randomUUID().toString())
                                .setName("nopecho")
                                .setGrade(UserGrade.USER_GRADE_BRONZE)
                                .setCreatedAt(Timestamps.now())
                                .build()
                ))
                .build());
    }

    @PostMapping("/user")
    public ResponseEntity<UserResponse> createUser(@RequestBody CreateUserRequest request) {
        logger.info("create user: {}", request);
        return ResponseEntity.ok(UserResponse.newBuilder()
                .setData(User.newBuilder()
                        .setId(UUID.randomUUID().toString())
                        .setName(request.getName())
                        .setGrade(UserGrade.USER_GRADE_BRONZE)
                        .setCreatedAt(Timestamps.now())
                        .build())
                .build());
    }

    @GetMapping("/order")
    public Order order() {
        return Order.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setUserId(UUID.randomUUID().toString())
                .setProductId(UUID.randomUUID().toString())
                .setStatus(OrderStatus.ORDER_STATUS_CREATED)
                .setCreatedAt(Timestamps.now())
                .build();
    }

    @GetMapping("/product")
    public Product product() {
        return Product.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setName("product")
                .setType(ProductType.PRODUCT_TYPE_SPECIAL)
                .setQuantity(1000)
                .setPrice(ProductPrice.newBuilder()
                        .setOriginPrice(2000)
                        .setSalePrice(1000)
                        .build())
                .setCreatedAt(Timestamps.now())
                .build();
    }

    @GetMapping("/api")
    public ApiResponse api() {
        return ApiResponse.newBuilder()
                .setMetadata(ApiMetadata.newBuilder()
                        .setSize(1)
                        .setLastCursor(UUID.randomUUID().toString())
                        .setHasMore(true)
                        .build())
                .setData(Any.pack(product()))
                .build();
    }

    @GetMapping("/custom")
    public CustomObject<Product> custom() {
        CustomObject<Product> customObject = new CustomObject<>();
        customObject.setData(product());
        return customObject;
    }

    public static class CustomObject<T> {
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
