package greeting;

import com.intuit.karate.junit5.Karate;

class GreetingRunner {
    @Karate.Test
    Karate testGreeting() {
        return Karate.run("greeting").relativeTo(getClass());
    }

}
