package com.mg.public.dto

import com.fasterxml.jackson.annotation.JsonBackReference
import java.util.*

data class AddressDto(
        var id: Long? = null,
        var created_at: Date? = null,
        var updated_at: Date? = null,
        var street: String? = null,
        var city: String? = null,
        var state: String? = null,
        var zipcode: String? = null,
        @JsonBackReference
        var user: UserDto? = null)