package br.com.agilworks.gotogheter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GotogheterApplication

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<GotogheterApplication>(*args)
}
