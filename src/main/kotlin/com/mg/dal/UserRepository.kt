package com.mg.dal

import com.mg.dal.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Long> {
}
