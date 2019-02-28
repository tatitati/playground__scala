def sum1(a: Int)(b: Int)(c: Int): Int = {
  a + b + c
}

assert(sum1(1)(2)(3) == 6)



//
// For group arguments you can use expressions block
//
def sum2(a: Int)(b: Int) ={
  a + b
}

println(
  sum2(1){
    sum1(1)(2)(3) + sum1(1)(2)(3) - 1
  }
) // => 12

