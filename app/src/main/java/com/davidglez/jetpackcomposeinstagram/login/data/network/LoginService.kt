package com.davidglez.jetpackcomposeinstagram.login.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * Created by davidgonzalez on 18/06/23
 */
class LoginService @Inject constructor(private val loginClient: LoginClient) {

    suspend fun doLogin(user: String, password: String): Boolean {
        //Para uso de coroutines siempre usamos el hilo IO
        return withContext(Dispatchers.IO) {
            val response = loginClient.doLogin()
            response.body()?.success ?: false
        }
    }
}