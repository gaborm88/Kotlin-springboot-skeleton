package com.mg.dal

import com.mg.dal.model.Address
import org.springframework.data.repository.CrudRepository

interface AddressRepository: CrudRepository<Address, Long> {
}
