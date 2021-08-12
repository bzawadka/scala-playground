/*
  https://docs.scala-lang.org/tutorials/FAQ/index.html
  https://stackoverflow.com/questions/7888944/what-do-all-of-scalas-symbolic-operators-mean/7890032#7890032

  I divide the operators, for the purpose of teaching, into four categories:

    - Keywords/reserved symbols
    - Automatically imported methods
    - Common methods
    - Syntactic sugars/composition
*/

// every operator is a method
10.+(1)
List(3, 4).max

// infix operator is easier to read (for operator)
10 + 1
List(3, 4) max

// adding (to) collections
List(1, 2) ++ List(3, 4)
List(1, 2).++(List(3, 4))

1 :: List(2, 3)
List(2, 3).::(1)

1 +: List(2, 3)

1 +: List(2, 3) :+ 4

List(1, 2) :+ 3

1 :: 2 :: 3 :: Nil
