package com.example.mvvm_architecture_project.data.api

import com.example.mvvm_architecture_project.data.model.User
//import com.mindorks.framework.mvvm.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}