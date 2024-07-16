// String Interpolation a.k.a s Interpolation

var name: String = "Bond"

println(s"hello $name How are you?")

// printf("%d")

// F Interpolation

var  Pi: Double = 3.14159265

println(f"Value of Pi is $Pi%.3f")

// RAW Interpolation

println(raw"Hello how \n are you?")

val abc = 1 < 2

println(s"abc is $abc")

val lastName: String = "Bond"

val firstName: String = "James"


val z = lastName == firstName
println(s"$lastName and $firstName are same is $z")


// CONDITIONALS


if (1>3){
    println("1 is greater than 3")
}
else{
    println("1 is not greater than 3")
}

// MATCH CASE

val num = 1

num match {
    case 0 => println("0")
    case 1 => println("1")
    case 2 => println("2")
    case _ => println("Unknown") 
}

// FOR LOOPS

for(x <- 1 to 5){
    val square_numbers = x * x
    println(square_numbers)
}


// WHILE LOOPS


var Argentina = true 

while (Argentina == true){
    println("Rigged World Cup")
    Argentina = false
}

// BLOCK OF CODE

var var1 ={
val x = 10
x + 20
2
} //returns the last statement in the block

println(var1)

println({
    val x = 10
    x + 200
})


