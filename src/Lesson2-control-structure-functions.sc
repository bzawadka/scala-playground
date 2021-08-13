println("conditional expressions")
val x = 4
val result = if (x > 0) 1 else -1
val anyResult = if (x > 0) "positive" else -1

val y = -4
val unitTypeResult = if (y > 0) "positive"
val unitType = ()

println("block expressions")
println("value of the block is the last expression")
val girth = {
  val a = 10
  val b = 20
  a * 2 + b * 2
}

println("generators, guards, collecting results")
val n = 10
for (i <- 1 to n) println(i)
for (c <- "Hello") println(c)
for (i <- 1 to 3; j <- 1 to 3) println(10 * i + j)
for (i <- 1 to 3; j <- 1 to 3 if i != j) println(10 * i + j)
for (i <- 1 to 10) yield i % 3

println("functions")
def abs(x: Double) = if (x >= 0) x else -x
println("return type is inferred unless the function is recursive")
def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

def fac(n: Int) = {
  var r = 1
  for (i <- 1 to n) r = r * i
  r
}