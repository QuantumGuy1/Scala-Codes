// Define the Person class
class Person(val name: String, val age: Int) {
    println(s"$name, $age")
    val x =20
    def ageDoubler = age*2
    def salaryDoubler(salary:Int) = {
        salary*2
    }
}







// Create an instance of the Person class
object Main {
    def main(args: Array[String]): Unit = {
        val person = new Person("Bond", 28)
        println(person.x)
        println(person.salaryDoubler(10000))
    }
}


