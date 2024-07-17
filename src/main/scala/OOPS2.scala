
object OOPS2 {
    class Animal {
    def eat: Unit = println("Animals eat a lot")
}
    class Cat extends Animal {
    def preferredMeal: Unit = println("Meat")
}

    def main(args: Array[String]): Unit = {
        val AnimalInstance = new Cat

        AnimalInstance.eat
        AnimalInstance.preferredMeal

    // ABSTRACT CLASS CONCEPT

        abstract class AnimalAbstract {
            val creatureType: String
            def eat: Unit
            def sleep: Unit = print("Animals sleep a lot")
    }

            class Dog extends AnimalAbstract {
                val creatureType: String = "Canine"
                def eat: Unit = println("Crunch crunch")
    }

    // WHAT IS A TRAIT??

            trait Carnivore {
                def foodHabit: Unit
    }

            trait ColdBlooded

        abstract class Alligator extends AnimalAbstract with Carnivore with ColdBlooded{
            val creatureType: String = "Reptile" // Provide a stub value for creatureType
            def eat: Unit = println("Alligators eat fish") // Provide a stub implementation for eat
    }

            val alligatorInstance = new Alligator {}
            println(alligatorInstance.creatureType)
            println(alligatorInstance.eat)
            println(alligatorInstance.sleep)
}
}
