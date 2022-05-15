package com.example.usersaver

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServlet

@EnableAutoConfiguration
@RestController
class NameController: HttpServlet() {
    var rez: String="";
    var list: ArrayList<Student> = arrayListOf();


    @RequestMapping(value= ["/names/players/add"],method = [RequestMethod.POST])
    fun putStudent(@RequestBody student: Student ): Student{
        list.add(student);
        println("Добавлен студент $student.name");
        return student;
    }

    @RequestMapping("/names/players/list")
    fun getStudents(): ArrayList<Student> {
        return list;
    }


}