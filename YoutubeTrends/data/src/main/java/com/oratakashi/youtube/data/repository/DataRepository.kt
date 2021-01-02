package com.oratakashi.youtube.data.repository

import androidx.lifecycle.LiveData
import com.oratakashi.youtube.data.repository.local.LocalRepository
import com.oratakashi.youtube.data.repository.remote.RemoteRepository
import com.oratakashi.youtube.domain.repository.Repository
import com.oratakashi.youtube.domain.state.DomainMainState

class DataRepository (
    private val localRepository: LocalRepository,
    private val remoteRepository: RemoteRepository
) : Repository {
    override fun getTrends(): LiveData<DomainMainState> {
        return remoteRepository.getTrends()
    }
}