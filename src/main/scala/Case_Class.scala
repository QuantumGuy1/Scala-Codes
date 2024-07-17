final case class Person(name:String, age:Int){

    // class parameters are promoted to fields
    val person = new Person("John", 30)
    println(person.name) // Output: John
    println(person.age) // Output: 30
    println(person.toString)
    println(person)

    // equals and hashCode methods implemented already

    val person2 = Person("Jane", 30)
    println(person == person2)

    //new keyword also not necessary

    val person3 = Person.apply("Joe", 30)
    println(person3)

    val person4 = Person("Reagan", 28)
    println(person4)

    // case classes have a handy copy method

    val person5 = person4.copy(age = 30)
    println(person5)

    //case classes are  serializable

}


