import kotlinx.coroutines.*

/*
Creación y Gestión de Corutinas en Kotlin
fun main() = runBlocking {
    launch {
        println("Coroutine is running")
    }
}

Ejemplo con Channels:
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking {
    val channel = Channel<Int>()
    launch {
        for (x in 1..5) channel.send(x * x)
        channel.close()
    }
    for (y in channel) println(y)
}

Comunicación y Colaboración entre Tareas Concurrentes
Ejemplo con Channels:
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking {
    val channel = Channel<Int>()
    launch {
        for (x in 1..5) channel.send(x * x)
        channel.close()
    }
    for (y in channel) println(y)
}

Data Race Condition
Kotlin:
Kotlin utiliza corutinas con contextos de sincronización como Mutex.

Ejemplo:
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class SafeCounter {
    private val mutex = Mutex()
    private var count = 0

    suspend fun increment() {
        mutex.withLock {
            count++
        }
    }

    suspend fun getCount(): Int {
        return mutex.withLock {
            count
        }
    }
}
*/
