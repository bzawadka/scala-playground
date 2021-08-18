import scala.collection.mutable.ArrayBuffer

println("remove all but first negative number from an array")

val numbers = ArrayBuffer(1, -2, 3, 0, 4, -4, -11, 22, -1)
// expectedResult = (1, -2, 3, 0, 4, 22)

def removeAllButFirstNegative(src: ArrayBuffer[Int]) = {
  val negativeIndices = for (i <- 0 until src.length if src(i) < 0) yield i
  val indicesToRemove = negativeIndices.drop(1)
  for (i <- indicesToRemove.reverse) src.remove(i)
  src
}

def removeAllButFirstNegative2(src: ArrayBuffer[Int]) = {
  val indicesToRemove = (for (i <- 0 until src.length if src(i) < 0) yield i).drop(1)
  for (i <- 0 until src.length if !indicesToRemove.contains(i)) yield src(i)
}

removeAllButFirstNegative(numbers)
removeAllButFirstNegative2(numbers)