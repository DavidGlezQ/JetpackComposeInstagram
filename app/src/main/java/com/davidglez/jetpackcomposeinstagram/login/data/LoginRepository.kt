package com.davidglez.jetpackcomposeinstagram.login.data

import com.davidglez.jetpackcomposeinstagram.login.data.network.LoginService
import javax.inject.Inject

/**
 * Created by davidgonzalez on 18/06/23
 */
class LoginRepository @Inject constructor(private val api: LoginService) {

    suspend fun doLogin(user:String, password: String): Boolean {
        return api.doLogin(user = user, password = password)
    }
}