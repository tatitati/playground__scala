//
// First: using function-argument
//
def sum1(a: Int, b: (Int) => Int): Int = {
    a + b(a)
}

assert(sum1(2,  (c: Int) => {c*10}) == 22)
// assert(sum1(2,  3 + 3) == 22) // wrong



//
// Second, using by-name arguments
//
def sum2(a: Int, b: => Int): Int = {
  a + b
}


assert(sum2(2, 3 + 3) == 8)
