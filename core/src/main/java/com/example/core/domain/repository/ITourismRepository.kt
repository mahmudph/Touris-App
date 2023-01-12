/**
 * Created by Mahmud on 08/01/23.
 * mahmud120398@gmail.com
 */

package com.example.core.domain.repository

import com.example.core.data.Resource
import com.example.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface ITourismRepository {
    fun getAllTourism(): Flow<Resource<List<Tourism>>>
    fun getFavoriteTourism(): Flow<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}