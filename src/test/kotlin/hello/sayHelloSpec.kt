package hello

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class SayHelloSpec : Spek({
    describe("#greeting") {
        it("provides a personalize hello message") {
           val personalizedGreeting = greeting("Steve")
            assertThat(personalizedGreeting, equalTo("Hello, Steve!"))
        }
    }
})
