package com.example.bhojanbox.domain.repo


import com.example.bhojanbox.common.ResultState
import com.example.bhojanbox.data.models.UserData
import kotlinx.coroutines.flow.Flow

interface Repo {
    fun loginWithEmailAndPassword(userData: UserData):Flow<ResultState<String>>
    fun registerWithEmailAndPassword(userData: UserData):Flow<ResultState<String>>
}