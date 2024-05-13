package siin.happy.domain.chat

import jakarta.persistence.*
import siin.happy.domain.AuditingEntity

@Entity
@Table(name = "Chat")
class Chat(
        member_id:Long,
        content:String
) : AuditingEntity(){
    @Column(name = "member_id",  nullable = false)
    var member_id:Long = member_id
        protected set

    @Column(name = "content")
    var content:String = content
        protected set
}