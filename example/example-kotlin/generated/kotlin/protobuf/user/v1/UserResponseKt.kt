// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protobuf/user/v1/user.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package protobuf.user.v1;

@kotlin.jvm.JvmName("-initializeuserResponse")
public inline fun userResponse(block: protobuf.user.v1.UserResponseKt.Dsl.() -> kotlin.Unit): protobuf.user.v1.UserResponse =
  protobuf.user.v1.UserResponseKt.Dsl._create(protobuf.user.v1.UserResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `protobuf.user.v1.UserResponse`
 */
public object UserResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: protobuf.user.v1.UserResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: protobuf.user.v1.UserResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): protobuf.user.v1.UserResponse = _builder.build()

    /**
     * `.protobuf.user.v1.User data = 1 [json_name = "data"];`
     */
    public var data: protobuf.user.v1.User
      @JvmName("getData")
      get() = _builder.data
      @JvmName("setData")
      set(value) {
        _builder.data = value
      }
    /**
     * `.protobuf.user.v1.User data = 1 [json_name = "data"];`
     */
    public fun clearData() {
      _builder.clearData()
    }
    /**
     * `.protobuf.user.v1.User data = 1 [json_name = "data"];`
     * @return Whether the data field is set.
     */
    public fun hasData(): kotlin.Boolean {
      return _builder.hasData()
    }

    public val UserResponseKt.Dsl.dataOrNull: protobuf.user.v1.User?
      get() = _builder.dataOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun protobuf.user.v1.UserResponse.copy(block: `protobuf.user.v1`.UserResponseKt.Dsl.() -> kotlin.Unit): protobuf.user.v1.UserResponse =
  `protobuf.user.v1`.UserResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val protobuf.user.v1.UserResponseOrBuilder.dataOrNull: protobuf.user.v1.User?
  get() = if (hasData()) getData() else null

