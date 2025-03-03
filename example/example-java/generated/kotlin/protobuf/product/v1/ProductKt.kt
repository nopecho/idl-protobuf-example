// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protobuf/product/v1/product.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package protobuf.product.v1;

@kotlin.jvm.JvmName("-initializeproduct")
public inline fun product(block: protobuf.product.v1.ProductKt.Dsl.() -> kotlin.Unit): protobuf.product.v1.Product =
  protobuf.product.v1.ProductKt.Dsl._create(protobuf.product.v1.Product.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `protobuf.product.v1.Product`
 */
public object ProductKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: protobuf.product.v1.Product.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: protobuf.product.v1.Product.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): protobuf.product.v1.Product = _builder.build()

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
     * `.protobuf.product.v1.ProductType type = 2 [json_name = "type"];`
     */
    public var type: protobuf.product.v1.ProductType
      @JvmName("getType")
      get() = _builder.type
      @JvmName("setType")
      set(value) {
        _builder.type = value
      }
    public var typeValue: kotlin.Int
      @JvmName("getTypeValue")
      get() = _builder.typeValue
      @JvmName("setTypeValue")
      set(value) {
        _builder.typeValue = value
      }
    /**
     * `.protobuf.product.v1.ProductType type = 2 [json_name = "type"];`
     */
    public fun clearType() {
      _builder.clearType()
    }

    /**
     * `string name = 3 [json_name = "name"];`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.name
      @JvmName("setName")
      set(value) {
        _builder.name = value
      }
    /**
     * `string name = 3 [json_name = "name"];`
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * `uint32 quantity = 4 [json_name = "quantity"];`
     */
    public var quantity: kotlin.Int
      @JvmName("getQuantity")
      get() = _builder.quantity
      @JvmName("setQuantity")
      set(value) {
        _builder.quantity = value
      }
    /**
     * `uint32 quantity = 4 [json_name = "quantity"];`
     */
    public fun clearQuantity() {
      _builder.clearQuantity()
    }

    /**
     * `.protobuf.product.v1.ProductPrice price = 5 [json_name = "price"];`
     */
    public var price: protobuf.product.v1.ProductPrice
      @JvmName("getPrice")
      get() = _builder.price
      @JvmName("setPrice")
      set(value) {
        _builder.price = value
      }
    /**
     * `.protobuf.product.v1.ProductPrice price = 5 [json_name = "price"];`
     */
    public fun clearPrice() {
      _builder.clearPrice()
    }
    /**
     * `.protobuf.product.v1.ProductPrice price = 5 [json_name = "price"];`
     * @return Whether the price field is set.
     */
    public fun hasPrice(): kotlin.Boolean {
      return _builder.hasPrice()
    }

    public val ProductKt.Dsl.priceOrNull: protobuf.product.v1.ProductPrice?
      get() = _builder.priceOrNull

    /**
     * `.google.protobuf.Timestamp created_at = 6 [json_name = "createdAt"];`
     */
    public var createdAt: com.google.protobuf.Timestamp
      @JvmName("getCreatedAt")
      get() = _builder.createdAt
      @JvmName("setCreatedAt")
      set(value) {
        _builder.createdAt = value
      }
    /**
     * `.google.protobuf.Timestamp created_at = 6 [json_name = "createdAt"];`
     */
    public fun clearCreatedAt() {
      _builder.clearCreatedAt()
    }
    /**
     * `.google.protobuf.Timestamp created_at = 6 [json_name = "createdAt"];`
     * @return Whether the createdAt field is set.
     */
    public fun hasCreatedAt(): kotlin.Boolean {
      return _builder.hasCreatedAt()
    }

    public val ProductKt.Dsl.createdAtOrNull: com.google.protobuf.Timestamp?
      get() = _builder.createdAtOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun protobuf.product.v1.Product.copy(block: `protobuf.product.v1`.ProductKt.Dsl.() -> kotlin.Unit): protobuf.product.v1.Product =
  `protobuf.product.v1`.ProductKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val protobuf.product.v1.ProductOrBuilder.priceOrNull: protobuf.product.v1.ProductPrice?
  get() = if (hasPrice()) getPrice() else null

public val protobuf.product.v1.ProductOrBuilder.createdAtOrNull: com.google.protobuf.Timestamp?
  get() = if (hasCreatedAt()) getCreatedAt() else null

