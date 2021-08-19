import java.net.URL
import java.util.Scanner

println("word count (mutable)")
val count1 = scala.collection.mutable.Map[String, Int]()
val in = new Scanner(new URL("https://www.google.com/robots.txt").openStream())
while (in.hasNext) {
  val word = in.next()
  count1(word) = count1.getOrElse(word, 0) + 1
}

count1("Allow:")
count1("Disallow:")

println("word count (immutable)")
var count2 = Map[String, Int]()
val in = new Scanner(new URL("https://www.google.com/robots.txt").openStream())
while (in.hasNext) {
  val word = in.next()
  count2 = count2 + (word -> (count2.getOrElse(word, 0) + 1))
}

count2("Allow:")
count2("Disallow:")