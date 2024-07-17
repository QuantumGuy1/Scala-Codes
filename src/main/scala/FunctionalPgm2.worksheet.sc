def areaOfCircle = {
    val PI= Math.PI
    (x:Int) => PI * x * x

}
val PI = 3.5

areaOfCircle(10) // it takes the value of Math.PI as it is a closure


// the value of PI is fixed even if you change it later

val a = areaOfCircle

a(10)

val pi = 4

a(10)

// as you can see it is bound to the parameter PI and it does not change


//================================================================

// 2. Scala Type System


//                Any
//               /   \
//          AnyVal   AnyRef

//================================================================

//AnyVal => Byte , Short , int , long , float , double , boolean , unit , char
//AnyRef => String , List , Set , Map , Array , Option



// only for reference types Null is defined

val a1 = 4

val a2 = println("Hello, world")

