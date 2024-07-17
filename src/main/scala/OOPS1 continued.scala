object OOPS1Continued {
    object Person {
        // Class level functionality
        val N_EYES = 2
        def canFly: Boolean = false
    }
    class Person(val name: String, val age: Int) {
        // Instance-level functionality
        def salaryDoubler(salary: Int): Int = salary * 2
    }

    def main(args: Array[String]): Unit = {

        // Create an instance of Person
        
        // this is a companion design pattern
        val personInstance = new Person("Bond", 28)
        val personInstance2 = new Person("Anderson" , 43)
        
        println("Comparing personInstances")
        println(personInstance2 == personInstance)
        println(s"${personInstance.name} and ${personInstance2.name} are not equal")
        // Access properties and methods from the instance
        println(personInstance.name) // Prints the name
        println(personInstance.age)  // Prints the age
        println(personInstance.salaryDoubler(10000)) // Calls the salaryDoubler method

        // Access properties from the Person object (class-level)
        println(Person.N_EYES) // Prints the value of N_EYES
        println(Person.canFly) // Prints the value of canFly

    // Check if two Person objects are equal
        val James = new Person("James", 30)
        val John = new Person("John", 25)
        println(James == John) // Prints false
    }
}
