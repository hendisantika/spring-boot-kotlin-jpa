package id.my.hendisantika.kotlinjpa

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.Instant
import java.util.*

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-jpa
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/06/24
 * Time: 16.56
 * To change this template use File | Settings | File Templates.
 */
@Entity
class Coin {
    @Id
    @GeneratedValue
    var id: UUID? = null

    @Column(nullable = false, unique = true)
    var name: String = ""

    @Column
    var description: String = ""

    @CreatedDate
    var created = Instant.now()

    @LastModifiedDate
    var updated = Instant.now()

    @Column(nullable = false)
    var startDate: Instant? = null

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "coin_id")
    var priceList: MutableList<Price> = mutableListOf()
}
