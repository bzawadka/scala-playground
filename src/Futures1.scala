import scala.Console.println
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}

object Futures1 extends App with Futurable {

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

  val magicNumber: Int = Await.result(numberFuture, maxWaitTime)
  println(magicNumber)
}

// https://www.baeldung.com/scala/futures