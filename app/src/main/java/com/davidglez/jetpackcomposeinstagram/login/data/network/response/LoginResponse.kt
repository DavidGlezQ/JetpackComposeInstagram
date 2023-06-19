package com.davidglez.jetpackcomposeinstagram.login.data.network.response

import com.google.gson.annotations.SerializedName

/**
* Created by davidgonzalez on 18/06/23
*/

data class LoginResponse(@SerializedName("success") val success: Boolean)
