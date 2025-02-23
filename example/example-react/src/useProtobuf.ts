import {create, toJson} from "@bufbuild/protobuf";
import {timestampNow} from "@bufbuild/protobuf/wkt";
import {OrderSchema, OrderStatus} from "../generated/js/protobuf/order/v1/order_pb";

const useProtobuf = () => {

    const order = () => {
        const order = create(OrderSchema, {
            id: "1",
            userId: "1",
            productId: "1",
            status: OrderStatus.PAYMENT_WAITING,
            createdAt: timestampNow()
        });

        toJson(OrderSchema, order)
    }


}