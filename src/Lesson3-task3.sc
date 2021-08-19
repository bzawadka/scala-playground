import scala.collection.mutable.ArrayBuffer

println("grouping")
val words = Array("Mary", "had", "a", "little", "lamb", "its", "fleece", "was", "white", "as", "Mary")
words.groupBy(_.substring(0, 1))
words.groupBy(_.length)
words.groupBy(_.substring(0, 1).charAt(0).isUpper)


println("partitions")
"New York".partition(_.isUpper)
"New York".partition(_.isWhitespace)

val numbers = ArrayBuffer(1, -2, 3, 0, 4, -4, -11, 22, -1)
val (positives, negatives) = numbers.partition(_ >= 0)
val result = positives
result += negatives.head


println("zips")
val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)

var buff = ""
for (pair <- pairs) for(_ <- 1 to pair._2) buff += pair._1
buff

var buff2 = ""
for((symbol, count) <- pairs) buff2 += symbol * count
buff2