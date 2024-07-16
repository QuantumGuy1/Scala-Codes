def doubler(i: Int): Int = {
    i * 2
}

// Assigning a function to a variable
// This is the Syntax

val a: Int => Int = doubler

println(a(3))

def tripler(i: Int): Int = {
    i*3
}

// Assigning a function as an argument to another function

def function(i: Int, f: Int => Int): Int = {
    f(i)
}

val b: Int => Int = tripler

println(b(4))

val function: Int => Int = function

println(function(4, tripler))


// returning a function from a function

def func = {
    (x: Int) => x*x
}

println(func(4))

//================================================================


// MAP FUNCTION

var ranger = 1 to 10

ranger.map(doubler)

ranger.map(tripler)


//================================================================



def factorial(input: Int): Int = {
    var result = 1
    for(i <- 1 to input){
        result = result * i
    }
    result

}
// Using recursion
def factorial1(input: Int): Int = {
    if (input == 1) 1
    else if (input == 0) 1
    else input * factorial1(input - 1)

}

factorial(5)
factorial1(5)

// tail recusrion
//================================================================

def factorial2(input: Int , result: Int): Int ={
    if(input == 0) 1
    else if (input == 1) 1
    else factorial2(input-1, result*input)

}

factorial2(5,1)


