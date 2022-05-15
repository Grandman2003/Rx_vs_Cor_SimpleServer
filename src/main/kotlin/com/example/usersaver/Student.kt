package com.example.usersaver

data class Student(
    var name: String? = null,
    var lastName: String? = null,
    var firstName: String? = null,
    var age: Int = 0,
    var course: Int = 0,
    var isPass: Boolean = false,)
    {
    override fun toString(): String {
        return name + " (" + age + "лет)"
    }
}
