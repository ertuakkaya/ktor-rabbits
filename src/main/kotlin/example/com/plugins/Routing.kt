package example.com.plugins

import example.com.routes.randomRabbit
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.io.File

fun Application.configureRouting() {
    routing {

        randomRabbit()


        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }




    }
}
