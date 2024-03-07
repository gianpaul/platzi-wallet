package com.cristianvillamil.platziwallet.ui

class UserSingleton private constructor(){
    var userName = "Cristian"
    companion object {
        private val instance: UserSingleton? = null

        fun getInstance(): UserSingleton {
            if (instance == null) {
                return UserSingleton()
            }
            return instance
        }
    }
}