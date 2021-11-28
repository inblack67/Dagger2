package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction


fun main() {

//    Database.connect("jdbc:postgresql://localhost:5432/postgres", driver = "org.postgresql.Driver",
//        user = "postgres", password = "postgres")
//
//    transaction {
//        // print sql to std-out
//        addLogger(StdOutSqlLogger)
////        SchemaUtils.create ()
//    }

    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
        configureHTTP()
    }.start(wait = true)
}
