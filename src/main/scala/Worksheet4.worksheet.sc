// Scala Collections
val a = Array(1,2,3,4,8)

println(a.mkString("|"))

for (i <- a)
println(i)

a(2) = 11 // changing the Index 2 value

println(a.mkString("|"))

val list = List(1,3,1,3,4,5,6)

println(list.head)
println(list.tail) // everything other than head
println(list.isEmpty)

for (i <- list){
    println(i)
}

// adding a value to the head of the list is straightforward

111 :: list 

// TUPLES

val tuple = (1, "Employee_1" , 10000 , true)

println(tuple._2)

// if a tuple has just 2 elements, then we can treat it as a key value pair

val tuple2 = (1, "Employee_2")

val tuple3 = 1 -> "Employee_3"

// RANGE


val rng = 1 to 10

val rng2 = 1 until 10

for (i <- rng)
println(rng)

for (i <- rng2)
println(rng2)

// SET Method in Scala

val set = Set(1,1,2,3,4,4,55,6,6,7)

println(set)

set.min

set.max

set.sum



