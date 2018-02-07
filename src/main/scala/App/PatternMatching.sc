sealed trait Pet {
  val name : String
  def speak() : String = "hello"
}

final case class Dog(override val name: String) extends Pet {
  override def speak(): String = "Woof!"
}

final case class Cat(override val name: String) extends Pet {
  override def speak(): String = "Meow!"
}

def whoDis(pet: Pet) = {
  pet match {
    case Dog(name) => s"This is a dog and their name is $name"
    case Cat(name) => s"This is a cat and their name is $name"
  }
}

val d = Dog("Reef")
val c = Cat("Kylo")

whoDis(d)
whoDis(c)