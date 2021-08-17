println("maps")

var scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 7)
val bobScore = scores("Bob")
val bartekScore = scores.getOrElse("Bartek", 100)
scores = scores + ("Bob" -> 9, "Bartek" -> 99)
scores = scores - "Alice"

for ((k, v) <- scores)
  println(k + " has value: " + v)

// mutable
val mscores = scala.collection.mutable.Map("Alice" -> 9)
mscores("Fred") = 10
mscores

// tuples
var tuple = (1, 3.1415, "Fred")
tuple._1
tuple._2
tuple._3

val (_, second, third) = tuple
second
third
