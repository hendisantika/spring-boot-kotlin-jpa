package id.my.hendisantika.kotlinjpa

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.Instant
import java.util.*

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-jpa
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/06/24
 * Time: 16.54
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "t_price")
class Price {

    @Id
    @GeneratedValue
    var priceId: UUID? = null

    @Column(nullable = false)
    var value: BigDecimal = BigDecimal.ZERO

    @Column(nullable = false)
    var date: Instant? = null
}
