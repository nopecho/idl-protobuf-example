# Java Example

`build.gradle` 설정

```groovy
dependencies {
    // protobuf 의존성 추가
    implementation "com.google.protobuf:protobuf-java:$protobufVersion"
}

// 자동 생성된 코드 source set 설정
sourceSets {
    main {
        java.srcDirs += "generated/java"
    }
}
```