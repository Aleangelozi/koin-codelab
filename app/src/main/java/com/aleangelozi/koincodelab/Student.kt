package com.aleangelozi.koincodelab

class Student(val course: SchoolCourse, val friend: Friend) {

    fun beSmart() {
        course.study()
        friend.hangout()
    }
}
