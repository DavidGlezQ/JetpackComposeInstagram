package com.davidglez.jetpackcomposeinstagram.login.domain

import com.davidglez.jetpackcomposeinstagram.login.data.LoginRepository
import javax.inject.Inject

/**
 * Created by davidgonzalez on 18/06/23
 */
class LoginUseCase @Inject constructor(private val repository: LoginRepository) {

    //al hacer el invoke ahorramos el tener que crear una funcion al llamarla
    suspend operator fun invoke(user: String, password: String): Boolean {
        //Aqui va la logica en caso de tener un login real
        return repository.doLogin(user = user, password = password)
    }
}