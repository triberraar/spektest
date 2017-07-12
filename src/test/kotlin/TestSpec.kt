
import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object TestSpec : Spek({
    given("A greeter") {
        on("something") {
            it("should fail") {
                "hello" shouldEqual "hellosdf"
            }
        }

    }

})

