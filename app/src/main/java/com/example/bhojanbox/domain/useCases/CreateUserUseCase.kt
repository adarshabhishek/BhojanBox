package com.example.bhojanbox.domain.useCases

import com.example.bhojanbox.common.ResultState
import com.example.bhojanbox.data.models.UserData
import com.example.bhojanbox.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CreateUserUseCase @Inject constructor(val repo: Repo) {
    fun createUser(userData: UserData): Flow<ResultState<String>> {
        return repo.registerWithEmailAndPassword(userData)
    }
}