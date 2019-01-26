package com.mg.public.dto

import com.fasterxml.jackson.annotation.JsonManagedReference
import java.util.*

data class UserDto(
        var id: Long? = null,
        var created_at: Date? = null,
        var updated_at: Date? = null,
        var firstName: String? = null,
        var lastName: String? = null,
        var login: String? = null,
        @JsonManagedReference
        var addresses: List<AddressDto>? = null)
