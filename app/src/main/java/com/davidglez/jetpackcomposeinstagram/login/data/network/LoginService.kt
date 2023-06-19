package com.davidglez.jetpackcomposeinstagram.login.data.network

import com.davidglez.jetpackcomposeinstagram.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Created by davidgonzalez on 18/06/23
 */
class LoginService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user: String, password: String): Boolean {
        //Para uso de coroutines siempre usamos el hilo IO
        return withContext(Dispatchers.IO) {
            val response =
                retrofit.create(LoginClient::class.java).doLogin()
            response.body()?.success ?: false
        }
    }
}