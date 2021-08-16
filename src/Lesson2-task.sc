
println("extract all vowels from a string")


def isVowel(char: Char) = "aeiouy".contains(char)
isVowel('a')
isVowel('b')

def vowelsIter(str: String) = {
  var vowels = ""
  for (c <- str) {
    if (isVowel(c)) vowels += c
  }
  vowels
}

def vowelsYield(str: String) = {
  for (c <- str if isVowel(c)) yield c
}

def vowelsWhile(str: String) = {
  var vowels = ""
  var index = 0
  while (index < str.length) {
    if (isVowel(str(index))) vowels += str(index)
    index += 1
  }
  vowels
}

def vowelsRecursive(str: String): String = {
  if (str.isEmpty) return ""

  val head = str.head
  val tailVowels = vowelsRecursive(str.tail)

  if (isVowel(head)) head + tailVowels else tailVowels
}

vowelsIter("Ala ma kota, a kot ma Ale")
vowelsYield("Ala ma kota, a kot ma Ale")
vowelsWhile("Ala ma kota, a kot ma Ale")
vowelsRecursive("Ala ma kota, a kot ma Ale")