package com.example.mvvm_architecture_project.data.repository

import com.example.mvvm_architecture_project.data.api.ApiHelper
import com.example.mvvm_architecture_project.data.model.User
//import com.mindorks.framework.mvvm.data.api.ApiHelper
//import com.mindorks.framework.mvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}