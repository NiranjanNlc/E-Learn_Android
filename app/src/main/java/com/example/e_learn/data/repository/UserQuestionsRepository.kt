package com.example.e_learn.data.repository

import com.example.e_learn.data.api.ApiList
import com.example.e_learn.data.model.UserQuestionResponse
import retrofit2.Call

class UserQuestionsRepository (private val apilist: ApiList) {
    fun userQuestions(userId: String): Call<UserQuestionResponse> {
        return apilist.userQuestions(userId)
    }
}