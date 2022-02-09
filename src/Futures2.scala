import scala.Console.println
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}

object Futures2 extends App with Futurable {

  def multiply(multiplier: Int): Future[Int] =
    if (multiplier == 0) {
      Future.successful(0)
    } else {
      Future(multiplier * generateMagicNumber())
    }

  val multiplyFuture = multiply(2)

  multiplyFuture onComplete {
    case Success(value) => value
    case Failure(exception) => {
      println(s"could not get the number due to${exception.getMessage}")
      -1
    }
  }

  val magicNumber: Int = Await.result(multiplyFuture, maxWaitTime)
  println(magicNumber)
}

// https://www.baeldung.com/scala/futures