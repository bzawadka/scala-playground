import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext
import scala.concurrent.duration.{Duration, FiniteDuration}

trait Futurable {
  implicit val executionContext: ExecutionContext = ExecutionContext.global

  val maxWaitTime: FiniteDuration = Duration(5, TimeUnit.SECONDS)

  def generateMagicNumber(): Int = {
    Thread.sleep(2000L)
    43
  }
}
