package id.my.hendisantika.kotlinjpa

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-jpa
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/06/24
 * Time: 16.59
 * To change this template use File | Settings | File Templates.
 */
@RestController
class CoinRestController {

    @Autowired
    lateinit var coinRepository: CoinRepository

    @GetMapping("/")
    fun getCoins(): List<Coin> {
        return coinRepository.findAll()
    }

}
