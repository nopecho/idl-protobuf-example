import {create, toJsonString} from "@bufbuild/protobuf";
import {v4 as uuid} from 'uuid';
import {timestampNow} from "@bufbuild/protobuf/wkt";
import {Order, OrderJson, OrderSchema, OrderStatus} from "../generated/ts/protobuf/order/v1/order_pb.ts";
import {
    Product,
    ProductJson,
    ProductPriceSchema,
    ProductSchema,
    ProductType
} from "../generated/ts/protobuf/product/v1/product_pb.ts";
import {
    CreateUserRequest,
    CreateUserRequestSchema,
    User,
    UserJson,
    UserListResponseJson,
    UserResponseJson,
    UserSchema
} from "../generated/ts/protobuf/user/v1/user_pb.ts";

export const useProtobuf = () => {
    const baseUrl = 'http://localhost:8080';

    const order = (): Order => {
        return create(OrderSchema, {
            id: uuid(),
            userId: uuid(),
            productId: uuid(),
            status: OrderStatus.CREATED,
            createdAt: timestampNow()
        });
    }

    const product = (): Product => {
        return create(ProductSchema, {
            id: uuid(),
            name: `Product-${uuid()}`,
            type: ProductType.SPECIAL,
            price: create(ProductPriceSchema, {
                originPrice: 100,
                salePrice: 80
            }),
            quantity: 1,
            createdAt: timestampNow()
        });
    }

    const user = (): User => {
        return create(UserSchema, {
            id: uuid(),
            name: `User-${uuid()}`,
            createdAt: timestampNow()
        });
    }

    const createUserRequest = (): CreateUserRequest => {
        return create(CreateUserRequestSchema, {
            name: `User-${uuid()}`
        });
    }

    const createUser = async (request: CreateUserRequest): Promise<UserResponseJson> => {
        const res = await fetch(`${baseUrl}/user`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: toJsonString(CreateUserRequestSchema, request)
        });

        return await res.json();
    }

    const getUser = async (): Promise<UserJson> => {
        const res = await fetch(`${baseUrl}/user`, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        });
        return await res.json();
    }

    const getUserList = async (): Promise<UserListResponseJson> => {
        const res = await fetch(`${baseUrl}/users`, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        });
        return await res.json();
    }

    const getOrder = async (): Promise<OrderJson> => {
        const res = await fetch(`${baseUrl}/order`, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        });
        return await res.json();
    }

    const getProduct = async (): Promise<ProductJson> => {
        const res = await fetch(`${baseUrl}/product`, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        });
        return await res.json();
    }

    return {
        order,
        product,
        user,
        createUserRequest,
        createUser,
        getUser,
        getUserList,
        getOrder,
        getProduct
    }
}