package chapter7._07_03.begin

class Student(val firstName: String, val lastName: String, val grade: Int) {

    override fun toString(): String {
        return "$firstName $lastName $grade"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Student){
            return firstName == other.firstName &&
                    lastName == other.lastName &&
                    grade == other.grade
        }
        return false
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + grade
        return result
    }
}

data class Student2(val firstName: String, val lastName: String, val grade: Int)

fun main() {
    val students = mutableListOf<Student>(
        Student("abel", "baker", 11),
        Student("abel", "baker", 11),
        Student("delta", "echo", 12)
    )

    println(students)
    println("First two equals: ${students[0] == students[1]}")
    //[abel baker 11, abel baker 11, delta echo 12]
    //First two equals: true

    val student2s = mutableListOf<Student2>(
        Student2("abel", "baker", 11),
        Student2("abel", "baker", 11),
        Student2("delta", "echo", 12)
    )
    println(student2s)
    println("First two equals: ${student2s[0] == student2s[1]}")
    //[Student2(firstName=abel, lastName=baker, grade=11), Student2(firstName=abel, lastName=baker, grade=11),
    //Student2(firstName=delta, lastName=echo, grade=12)]
    //First two equals: true
}
