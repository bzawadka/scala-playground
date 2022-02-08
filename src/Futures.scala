import java.util.concurrent.TimeUnit
import scala.Console.println
import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.{Failure, Success}

object Futures extends App {

  implicit val executionContext: ExecutionContext = ExecutionContext.global

  def generateMagicNumber(): Int = {
    Thread.sleep(2000L)
    23
  }

  val numberFuture: Future[Int] = Future {
    generateMagicNumber()
  }

  numberFuture onComplete {
    case Success(value) => value
    case Failure(exception) => {
      println(s"could not get the number due to${exception.getMessage}")
      -1
    }
  }

  val maxWaitTime: FiniteDuration = Duration(5, TimeUnit.SECONDS)
  val magicNumber: Int = Await.result(numberFuture, maxWaitTime)

  println(magicNumber)
}

// https://www.baeldung.com/scala/futures