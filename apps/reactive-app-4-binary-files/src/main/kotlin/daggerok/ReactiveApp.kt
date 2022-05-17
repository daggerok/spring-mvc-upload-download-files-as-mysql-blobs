package daggerok

import java.time.ZoneId
import java.time.ZoneOffset
import java.util.Locale
import java.util.TimeZone
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveApp

fun main(args: Array<String>) {
    runApplication<ReactiveApp>(*args) {
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.from(ZoneOffset.UTC)))
        Locale.setDefault(Locale.US)
    }
}
