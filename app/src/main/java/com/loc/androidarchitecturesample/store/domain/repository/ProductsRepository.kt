package com.loc.androidarchitecturesample.store.domain.repository

import arrow.core.Either
import com.loc.androidarchitecturesample.store.domain.model.NetworkError
import com.loc.androidarchitecturesample.store.domain.model.Product

interface ProductsRepository {

    suspend fun getProducts(): Either<NetworkError, List<Product>>

}
