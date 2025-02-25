import {useProtobuf} from "./useProtobuf.ts";
import {useState} from "react";
import {toJson} from "@bufbuild/protobuf";
import {CreateUserRequestSchema, UserSchema} from "../generated/ts/protobuf/user/v1/user_pb.ts";
import {OrderSchema} from "../generated/ts/protobuf/order/v1/order_pb.ts";
import {ProductSchema} from "../generated/ts/protobuf/product/v1/product_pb.ts";

function App() {
    const protobuf = useProtobuf();

    const [request, setRequest] = useState<object[]>([]);
    const [response, setResponse] = useState<object[]>([]);

    return (
        <>
            <h1>Protocol Buffers(protobuf) Example</h1>

            <div>
                <h3>
                    protobuf Json 생성
                </h3>
                <div>
                    <button
                        onClick={() => {
                            setRequest([...request, toJson(CreateUserRequestSchema, protobuf.createUserRequest())])
                        }}
                    >
                        createUserRequest
                    </button>
                </div>
                <div>
                    <button
                        onClick={() => {
                            setRequest([...request, toJson(UserSchema, protobuf.user())])
                        }}
                    >
                        user
                    </button>
                </div>
                <div>
                    <button
                        onClick={() => {
                            setRequest([...request, toJson(OrderSchema, protobuf.order())])
                        }}
                    >
                        order
                    </button>
                </div>
                <div>
                    <button
                        onClick={() => {
                            setRequest([...request, toJson(ProductSchema, protobuf.product())])
                        }}
                    >
                        product
                    </button>
                </div>
            </div>
            <hr/>
            <div>
                {request.map((r, i) => (
                    <>
                        <li key={i}>[REQ] {JSON.stringify(r)}</li>
                    </>
                ))}
            </div>

            <br/>
            <div>
                <h3>
                    protobuf API 호출 결과
                </h3>
                <div>
                    <button
                        onClick={async () => {
                            setResponse([...response, await protobuf.createUser(protobuf.createUserRequest())]);
                        }}
                    >
                        createUserRequest
                    </button>
                </div>
                <div>
                    <button
                        onClick={async () => {
                            setResponse([...response, await protobuf.getUser()]);
                        }}
                    >
                        getUser
                    </button>
                </div>
                <div>
                    <button
                        onClick={async () => {
                            setResponse([...response, await protobuf.getUserList()]);
                        }}
                    >
                        getUserList
                    </button>
                </div>
                <div>
                    <button
                        onClick={async () => {
                            setResponse([...response, await protobuf.getOrder()]);
                        }}
                    >
                        getOrder
                    </button>
                </div>
                <div>
                    <button
                        onClick={async () => {
                            setResponse([...response, await protobuf.getProduct()]);
                        }}
                    >
                        getProduct
                    </button>
                </div>
            </div>
            <hr/>
            <div>
                {response.map((r, i) => (
                    <li key={i}>[RES] {JSON.stringify(r)}</li>
                ))}
            </div>
        </>
    )
}

export default App
