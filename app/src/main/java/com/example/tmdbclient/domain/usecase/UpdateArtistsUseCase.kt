package com.example.tmdbclient.domain.usecase

import com.example.tmdbclient.data.model.artist.Artist
import com.example.tmdbclient.domain.repository.ArtistRepo


class UpdateArtistsUseCase(private val artistRepo: ArtistRepo) {

    suspend fun execute():List<Artist>? = artistRepo.updateArtist()

}