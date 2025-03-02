# Kotlin Example

`build.gradle` 설정

```groovy
dependencies {
    // protobuf 의존성 추가
    implementation "com.google.protobuf:protobuf-kotlin:$protobufVersion"
    implementation "com.google.protobuf:protobuf-java:$protobufVersion"
    implementation "com.google.protobuf:protobuf-java-util:$protobufVersion"
    implementation "com.hubspot.jackson:jackson-datatype-protobuf:$jacksonProtobufVersion"
}

// 자동 생성된 코드 source set 설정
sourceSets {
    main {
        kotlin.srcDirs += "generated/kotlin"
        java.srcDirs += "generated/java"
    }
}
```