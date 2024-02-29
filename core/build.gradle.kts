plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}


dependencies{
    //Retrofit
    api ("com.squareup.retrofit2:retrofit:2.9.0")
    api ("com.squareup.retrofit2:converter-gson:2.9.0")
    api ("com.google.code.gson:gson:2.10.1")
    //https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor
    api("com.squareup.okhttp3:logging-interceptor:4.12.0")
}