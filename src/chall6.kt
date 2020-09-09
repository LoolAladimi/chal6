open class Employee( name :String , age : Int , salary : Int ){
init {
    println("my name is $name , age is $age , salary is $salary .")
}
}

class webDeveloper ( name: String , age: Int , salary: Int) : Employee(name,age,salary) {
    fun website() {

        println(" website developer")
    }

    class androidDeveloper(name: String, age: Int, salary: Int) : Employee(name, age, salary) {
        fun android() {
            println("android app developer")
        }
    }

    class iosDeveloper(name: String, age: Int, salary: Int) : Employee(name, age, salary) {

        fun iosapp() {
            println("ios app developer")
        }

        fun main(args: Array<String>) {
            var wd = webDeveloper("ahmed", 26, 23000)
            wd.website()
            var ad = androidDeveloper("sameer", 33, 200000)
            ad.android()
            var iosd = iosDeveloper("jehan", 30, 100000)
            iosd.iosapp()
        }
    }
}

