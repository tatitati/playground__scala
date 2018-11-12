// val are constant
val mynumber1: Int = 5
println(mynumber1) // 5


// var can be modified
var mynumber2: Int = 5
mynumber2 = 1212
println(mynumber2) // 1212


//
// computed variables
//
val number3: Int = 40;
val myvariable: String = {
        if (number3 > 50)
                "is bigger than 50"
        else
                "is less than 50"
}

println(myvariable) // is less than 50