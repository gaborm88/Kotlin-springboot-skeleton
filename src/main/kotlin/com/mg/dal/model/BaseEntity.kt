package com.mg.dal.model

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.UpdateTimestamp
import java.util.*
import javax.persistence.*

@MappedSuperclass
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    var id: Long? = null

    @field:CreationTimestamp
    @Column(nullable = false, updatable=false)
    var created_at: Date? = Date()
    @field:UpdateTimestamp
    var updated_at: Date? = Date()
}
