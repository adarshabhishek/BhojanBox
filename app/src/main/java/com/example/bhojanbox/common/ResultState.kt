package com.example.bhojanbox.common

sealed class ResultState <out T>{

    data class Success<T>(val data: T): ResultState<T>()
    data class Error(val message: String): ResultState<Nothing>()
    object Loading: ResultState<Nothing>()
}