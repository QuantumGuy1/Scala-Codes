// Scala supports both Functional and OOPs style

// Scala is preferred because of its natural functional programming style

def squareIt(x: Int): Int = {
    x*x
} 

var square_numbers = squareIt(22)

println(square_numbers)


// passing function as an argument

def transformInt(x: Int , f: Int => Int): Int = {
    f(x) // calling squareIt function as f
}
val result = transformInt(55,squareIt)

println(result)


// Anonymous function 

transformInt(2, x => x*x*x)

transformInt(4 , x => x*x)


def divideBy2(x: Int): Int ={
    x/2
}

var division_by_2 = divideBy2(22)

println(division_by_2)

// using anonymous function

transformInt(22, x => x/2)

// question

transformInt(2, x => {
    val y = x*2
    y*y
})

