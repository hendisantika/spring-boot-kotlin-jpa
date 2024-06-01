package id.my.hendisantika.kotlinjpa

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
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
class Price {

    @Id
    @GeneratedValue
    var id: UUID? = null

    @Column(nullable = false)
    var value: BigDecimal = BigDecimal.ZERO

    @Column(nullable = false)
    var date: Instant? = null
}
