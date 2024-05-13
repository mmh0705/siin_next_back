package siin.happy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HappyApplication

fun main(args: Array<String>) {
	runApplication<HappyApplication>(*args)
}
