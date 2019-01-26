package com.mg.dal.model

import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
data class User(
        var firstName: String? = null,
        var lastName: String? = null,
        var login: String? = null,
        @OneToMany(mappedBy = "user")
        var addresses: List<Address>? = null) : BaseEntity()