package siin.happy.domain.member

import jakarta.persistence.*
import siin.happy.domain.AuditingEntity

@Entity
@Table(name = "Member")
class Member(
        name:String,
        email:String,
        password:String
) : AuditingEntity() {
        @Column(name = "name", nullable = false)
        var name:String = name
                protected set
        @Column(name = "email", nullable = false)
        var email:String = email
                protected set
        @Column(name = "password", nullable = false)
        var password:String = password
                protected set
}