/**
 * Created by Mahmud on 08/01/23.
 * mahmud120398@gmail.com
 */

package com.dicoding.tourismapp.core.data.source.remote.network

import retrofit2.Call
import retrofit2.http.GET
import com.dicoding.tourismapp.core.data.source.remote.response.ListTourismResponse


interface ApiService {
    @GET("list")
    fun getList(): Call<ListTourismResponse>
}