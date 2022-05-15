package com.example.usersaver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan
@SpringBootApplication
class UserSaverApplication

fun main(args: Array<String>) {
	runApplication<UserSaverApplication>(*args)
}
