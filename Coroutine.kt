import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class Coroutine {
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