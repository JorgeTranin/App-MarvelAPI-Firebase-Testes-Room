package com.jorge.core.data.network.api

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object RetrofitHelper {

    const val BASE_URL = "https://gateway.marvel.com:443/v1/public/"


    val okHttpClient = OkHttpClient.Builder().readTimeout(20, TimeUnit.SECONDS).writeTimeout(20, TimeUnit.SECONDS)
        //.addInterceptor()


}