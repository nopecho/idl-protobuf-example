// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protobuf/user/v1/user.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package protobuf.user.v1;

@kotlin.jvm.JvmName("-initializeuser")
public inline fun user(block: protobuf.user.v1.UserKt.Dsl.() -> kotlin.Unit): protobuf.user.v1.User =
  protobuf.user.v1.UserKt.Dsl._create(protobuf.user.v1.User.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `protobuf.user.v1.User`
 */
public object UserKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: protobuf.user.v1.User.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: protobuf.user.v1.User.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): protobuf.user.v1.User = _builder.build()

    /**
     * `string id = 1 [json_name = "id"];`
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.id
      @JvmName("setId")
      set(value) {
        _builder.id = value
      }
    /**
     * `string id = 1 [json_name = "id"];`
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * `string name = 2 [json_name = "name"];`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.name
      @JvmName("setName")
      set(value) {
        _builder.name = value
      }
    /**
     * `string name = 2 [json_name = "name"];`
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * `.protobuf.user.v1.UserGrade grade = 3 [json_name = "grade"];`
     */
    public var grade: protobuf.user.v1.UserGrade
      @JvmName("getGrade")
      get() = _builder.grade
      @JvmName("setGrade")
      set(value) {
        _builder.grade = value
      }
    public var gradeValue: kotlin.Int
      @JvmName("getGradeValue")
      get() = _builder.gradeValue
      @JvmName("setGradeValue")
      set(value) {
        _builder.gradeValue = value
      }
    /**
     * `.protobuf.user.v1.UserGrade grade = 3 [json_name = "grade"];`
     */
    public fun clearGrade() {
      _builder.clearGrade()
    }

    /**
     * `.google.protobuf.Timestamp created_at = 4 [json_name = "createdAt"];`
     */
    public var createdAt: com.google.protobuf.Timestamp
      @JvmName("getCreatedAt")
      get() = _builder.createdAt
      @JvmName("setCreatedAt")
      set(value) {
        _builder.createdAt = value
      }
    /**
     * `.google.protobuf.Timestamp created_at = 4 [json_name = "createdAt"];`
     */
    public fun clearCreatedAt() {
      _builder.clearCreatedAt()
    }
    /**
     * `.google.protobuf.Timestamp created_at = 4 [json_name = "createdAt"];`
     * @return Whether the createdAt field is set.
     */
    public fun hasCreatedAt(): kotlin.Boolean {
      return _builder.hasCreatedAt()
    }

    public val UserKt.Dsl.createdAtOrNull: com.google.protobuf.Timestamp?
      get() = _builder.createdAtOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun protobuf.user.v1.User.copy(block: `protobuf.user.v1`.UserKt.Dsl.() -> kotlin.Unit): protobuf.user.v1.User =
  `protobuf.user.v1`.UserKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val protobuf.user.v1.UserOrBuilder.createdAtOrNull: com.google.protobuf.Timestamp?
  get() = if (hasCreatedAt()) getCreatedAt() else null

