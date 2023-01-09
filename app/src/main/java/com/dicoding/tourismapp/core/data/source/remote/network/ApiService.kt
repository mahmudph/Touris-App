/**
 * Created by Mahmud on 08/01/23.
 * mahmud120398@gmail.com
 */

package com.dicoding.tourismapp.core.data.source.remote.network

import retrofit2.http.GET
import com.dicoding.tourismapp.core.data.source.remote.response.ListTourismResponse
import io.reactivex.Flowable


interface ApiService {
    @GET("list")
    fun getList(): Flowable<ListTourismResponse>
}