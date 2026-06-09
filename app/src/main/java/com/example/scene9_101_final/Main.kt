package com.example.scene9_101_final

class Student(
    val name: String,
    val program: String,
    val isActive: Boolean
) {
    fun showProfile() {
        println("Name: $name")
        println("Program: $program")
        println("Is an Active Student? $isActive")
    }
}

class User(
    val userName: String,
    val isVerified: Boolean,
    val followers: Int
) {
    fun showProfile() {
        println("Username: $userName")
        println("Followers: $followers")
        println("Verified user: $isVerified")
    }
}

class Book(
    val title: String,
    val author: String,
    val year: Int
) {
    fun showBookDetails() {
        println("Title: $title")
        println("Author: $author")
        println("Year: $year")
    }
}

class Employee(
    val employeeName: String,
    val employeePosition: String,
    val employeeSalary: Int
) {
    fun employeeInfo() {
        println("employeeName: $employeeName")
        println("employeePosition: $employeePosition")
        println("employeeSalary: $employeeSalary")
    }
}

fun main() {

    // CHALLENGE 1
    println(calculateDiscount(originalPrice = 100.0, discountPercentage = 20.0))

    // LAMBDA EXAMPLE 1
    val sayHi = { println("Hi") }
    sayHi()

    // LAMBDA EXAMPLE 2
    val multiply = { number1: Int, number2: Int -> number1 * number2 }
    println(multiply(4, 5))

    // CHALLENGE 2
    val welcome = { println("Welcome") }
    welcome()

    val printCity = { city: String -> println(city) }
    printCity("Las Vegas")

    val addNumbers = { number1: Int, number2: Int -> number1 + number2 }
    println(addNumbers(10, 20))

    // CHALLENGE 3
    val isEven = { number: Int -> number % 2 == 0 }
    println(isEven(4))
    println(isEven(7))

    // STUDENTS
    val student1 = Student(name = "Paola", program = "MD12", isActive = true)
    val student2 = Student(name = "Wendell", program = "MD12", isActive = true)
    val student3 = Student(name = "Ramone", program = "MD12", isActive = true)

    student1.showProfile()
    student2.showProfile()
    student3.showProfile()

    val user1 = User(userName = "Ramone45", isVerified = true, followers = 1000)
    val user2 = User(userName = "Paola22", isVerified = true, followers = 500)
    val user3 = User(userName = "Wendell99", isVerified = true, followers = 750)

    user1.showProfile()
    user2.showProfile()
    user3.showProfile()

    // CHALLENGE 4 - Books
    val book1 = Book(title = "The Alchemist", author = "Paulo Coelho", year = 1988)
    val book2 = Book(title = "48 Laws of Power", author = "Robert Greene", year = 1998)
    val book3 = Book(title = "Atomic Habits", author = "James Clear", year = 2018)

    book1.showBookDetails()
    book2.showBookDetails()
    book3.showBookDetails()

    // CHALLENGE 5
    val employee1 = Employee(employeeName = "Tony", employeePosition = "manager", employeeSalary = 80000)
    val employee2 = Employee(employeeName = "Alex", employeePosition = "security", employeeSalary = 40000)
    val employee3 = Employee(employeeName = "Ken", employeePosition = "bartender", employeeSalary = 30000)

    employee1.employeeInfo()
    employee2.employeeInfo()
    employee3.employeeInfo()

    // NULLABILITY EXAMPLE
    println("\n======NULLABILITY======")
    val middleName: String? = null
    println(middleName)

    val nickname: String? = null
    println(nickname)

    val displayname: String? = null
    println(displayname)

    // CHALLENGE 6

    val middleName1: String? = null
    val gpa: Double? = null

    println(middleName1 ?: "No middle name provided")
    println(gpa ?: "No GPA provided")


}



fun calculateDiscount(originalPrice: Double, discountPercentage: Double): Double {
    val discount = originalPrice * (discountPercentage / 100)
    val finalPrice = originalPrice - discount
    return finalPrice
}
