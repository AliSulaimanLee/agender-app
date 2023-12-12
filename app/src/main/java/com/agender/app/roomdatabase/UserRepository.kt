package com.agender.app.roomdatabase

class UserRepository(private val userDao: UserDAO) {

    suspend fun insert(user: User) {
        userDao.insert(user)
    }

    suspend fun login(email: String, password: String): User? {
        return userDao.login(email, password)
    }
}
