package com.loc.androidarchitecturesample.store.data.remote

import com.loc.androidarchitecturesample.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>

}