package gatling_example


import java.util.concurrent.TimeUnit

import gatling_example.base_config.BaseSimulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration.{DurationInt, FiniteDuration}

class GoogleTest extends BaseSimulation {

  private val USERS = "USERS"
  private val RAMP_DURATION = "RAMP_DURATION"
  private val DURATION = "DURATION"
  private val FIVE = "5"
  private val TEN = "10"
  private val SIXTY = "60"

  private def getProperty(propertyName: String, defaultValue: String) = {
    Option(System.getenv(propertyName))
      .orElse(Option(System.getProperty(propertyName)))
      .getOrElse(defaultValue)
  }

  def userCount: Int = getProperty(USERS, FIVE).toInt
  def rampDuration: Int = getProperty(RAMP_DURATION, TEN).toInt
  def testDuration: Int = getProperty(DURATION, SIXTY).toInt

  val scn = scenario("Search 'Gatling demo'")
    .exec(openHomePage())
    .pause(1)
    .exec(searchForGatlingDemo())
    .pause(1)
    .exec(getAdditionalContent())

  setUp(
    scn.inject(
    nothingFor(5 seconds),
//      atOnceUsers(2)
    rampUsers(userCount) during (rampDuration seconds)
  ))
    .protocols(httpConf.inferHtmlResources())
    .maxDuration(testDuration seconds)
}