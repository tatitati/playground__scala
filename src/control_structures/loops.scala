val mylist = List("myfirst", "mysecond", "mythird")

//
// For vs foreach
//
for(i <- mylist) println(i)
// myfirst
// mysecond
// mythird
mylist.foreach((i => println(i)))
// myfirst
// mysecond
// mythird




//
// Guards: If vs withFilter
//
for{
  i <- mylist
  if i != "mysecond"
} println(i)

//myfirst
//mythird


mylist
  .withFilter((i => i!="mysecond"))
  .foreach((i => println(i)))

//myfirst
//mythird





//
// Yield vs map
//
val newlist = for(i <- mylist) yield i + "!!!"
println(newlist) // List(myfirst!!!, mysecond!!!, mythird!!!)


val newlist2 = mylist.map(i => i + "!!!")
println(newlist2) // List(myfirst!!!, mysecond!!!, mythird!!!)


//
// Mix
//
val newlist3 = mylist
                .withFilter(i => i != "mysecond")
                .map(i => i)
println(newlist3) // List(myfirst, mythird)