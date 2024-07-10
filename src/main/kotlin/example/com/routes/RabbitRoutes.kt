package example.com.routes

import example.com.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

// TODO: ACTUAL WEBSITE URL
private const val BASE_URL = "http://10.110.113.40:8080"
// http://127.0.0.1:8080/
// ipv4 10.110.113.40 -> it will run andoroid emulator


private val rabbits = listOf(
    Rabbit("Carl", "A cute brown rabbit", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Emma", "Emma likes to eat apples", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("Florian", "Florian is always hungry", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("Federico", "Federico likes to climb mountains", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Gina", "Gina is a true beauty", "$BASE_URL/rabbits/rabbit5.jpg"),
)


fun Route.randomRabbit(){
    get("/randomrabbit"){
        //call.parameters["rabbitID"]

        // return random rabbit and respond with json string
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
        // http://127.0.0.1:8080/randomrabbit


    }
}