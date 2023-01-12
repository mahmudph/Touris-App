/**
 * Created by Mahmud on 08/01/23.
 * mahmud120398@gmail.com
 */

package com.example.core.data.source.remote.network

import retrofit2.http.GET
import com.example.core.data.source.remote.response.ListTourismResponse

interface ApiService {
    @GET("list")
    suspend fun getList(): ListTourismResponse
}