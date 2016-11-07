package hello

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.Test

class SayHelloTest {
    @Test fun greetingReturnsNameInString() {
        val personalizedGreeting = greeting("Steve")
        assertThat(personalizedGreeting, equalTo("Hello, Steve!"))
    }
}

