package com.jorge.core.data.network.api

import okhttp3.Interceptor
import okhttp3.Response
import java.sql.Timestamp

const val PUBLIC_KEY = "bb6894dced9cb987056a1f7c410e6d38"
const val PRIVETE_KEY = "525c6e06faa06762a6f821a4d45a55bc21923390"
class AuthInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val constructorrequest = chain.request().newBuilder()
        val timestamp = null


        val request = constructorrequest.addHeader(
            "apikey", PUBLIC_KEY
        )

        return chain.proceed(request.build())
    }
}