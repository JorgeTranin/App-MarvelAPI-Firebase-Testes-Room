package com.jorge.core.data.network.response

data class DataContainerResponse(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val characterResponses: List<CharacterResponse>,
    val total: Int
)