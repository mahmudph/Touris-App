/**
 * Created by Mahmud on 08/01/23.
 * mahmud120398@gmail.com
 */

package com.example.core.domain.usecase

import com.example.core.domain.model.Tourism
import com.example.core.domain.repository.ITourismRepository

class TourismInteractor(private val tourismRepository: ITourismRepository) : TourismUseCase {
    override fun getAllTourism() = tourismRepository.getAllTourism()
    override fun getFavoriteTourism() = tourismRepository.getFavoriteTourism()
    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) = tourismRepository.setFavoriteTourism(tourism, state)
}