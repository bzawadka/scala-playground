println("arrays")
val nums = new Array[Int](10)
for (i <- 0 until nums.length) nums(i) = i * i
nums

println("fixed length array")
val a = Array("Hello", "World")
a(0) = "Goodbye"
for (element <- a) println(element)
for (i <- 0 until a.length) println(a(i))

println("array buffer")

import scala.collection.mutable.ArrayBuffer

val b = new ArrayBuffer[Int]
b += 1
b += (2, 3, 4)
b ++= Array(8, 13, 21)

println("array functions")
b.remove(3)
b
b.insert(3, 42)
b
b.insert(2, 22)
b
b.trimEnd(2)
b

val a = Array(2, 3, 4, 7, 11)
val result = for (elem <- a if elem % 2 != 0) yield 2 * elem
a
a.sum
a.max
a.sorted.reverse
a.mkString(" | ")
a.mkString("[", " - ", "]")
