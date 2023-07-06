fun main() {
    val banker = Banker("Nancy", 24)
    banker.talk("Hello customer")
    banker.eat()
    banker.sleep()

    var ans = banker.countMoney(arrayOf(100, 100, 500, 50, 200))
    println(ans)

    val doctor = Doctor("Purity", 23)
    doctor.treatPatient("mercy", "tuberclosis")

    doctor.introduction("Ambrose", 25)


//
//    doctor.eat()
//    doctor.sleep()
//    doctor.talk("Hi")
//    doctor.treatPatient("Kimani", "Covid")
//
//    val farmer = Farmer("Jane", 21)
//    farmer.sleep()
//    farmer.eat()
//    farmer.talk("Hello")
//    farmer.cultivateLand()
//
//    val doctor = Doctor("Jane", 24)
//    doctor.eat()
//
//    val farmer = Farmer("James", 25)
//    farmer.eat()

}

open class Person(var name: String, var age: Int){
    fun talk(words: String){
        println(words)
    }
    open fun eat(){
        println("yum")
    }
    fun sleep(){
        println("zzzzz")
    }
    fun introduction(){
        println("Hi my name is $name")
    }
}


class Banker( name: String, age: Int): Person(name, age){
    fun countMoney(notes :Array<Int>):Int{
        return notes.sum()
    }
}

class Doctor( name :String,  age: Int): Person(name, age){
    fun treatPatient(patientName: String, disease: String){
        println("Treating $patientName for $disease")
    }
        fun introduction(name: String, age: Int){
//        super.introduction()
        println("Hi my name is Dr $name")
    }
}

class Farmer( name: String, age : Int): Person(name, age){
    fun cultivateLand(name: String, age: Int){
        println("farner $name dig, dig, dig")
    }

    override fun eat(){
        super.eat()
       println("I am eating the beans from my farm")
    }
}
