package siin.happy.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController() {
    @GetMapping("/test")
    fun testMethod():String {
        return "happy";
    }
}