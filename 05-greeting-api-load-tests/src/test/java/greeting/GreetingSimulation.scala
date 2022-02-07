package greeting

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration._
import scala.language.postfixOps

class GreetingSimulation extends Simulation{
  val getGreeting = scenario("Get greeting message").exec(karateFeature("classpath:greeting/greeting.feature"))
  setUp(
    getGreeting.inject(rampUsers(10).during(60 seconds))
  )
}