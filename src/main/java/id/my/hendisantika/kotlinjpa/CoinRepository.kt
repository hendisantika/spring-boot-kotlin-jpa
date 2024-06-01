package id.my.hendisantika.kotlinjpa

import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-jpa
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/06/24
 * Time: 16.57
 * To change this template use File | Settings | File Templates.
 */
@Repository
interface CoinRepository : JpaRepository<Coin, UUID> {

    fun findAllByOrderByNameDesc(): List<Coin>

    fun findAllByOrderByStartDateDesc(page: Pageable): List<Coin>

    fun findAllByOrderByDescriptionDescNameAsc(): List<Coin>

    fun findByName(name: String): Optional<Coin>
}
