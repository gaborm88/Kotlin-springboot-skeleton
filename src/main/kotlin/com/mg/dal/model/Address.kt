package com.mg.dal.model

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class Address(
        var street: String? = null,
        var city: String? = null,
        var state: String? = null,
        var zipcode: String? = null,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id")
        var user: User? = null) : BaseEntity()
