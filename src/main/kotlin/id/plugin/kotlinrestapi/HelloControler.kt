package id.plugin.kotlinrestapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloControler {
    @GetMapping("/greet")
    fun sayHello() ="Hello world !"
}
