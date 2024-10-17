fun main() {
    val student:Student? = Student();
    student?.let { st ->
        st.Hi()
        st.bye()
        st.name = "Kolya"
    }
    println(student?.name)
    val student2 = student?.apply{
        Hi()
        bye()
        name = "asjh"
    }
    println(student?.name)
    println(student2?.name)

    val ageStudent = Student().run{
        Hi()
        bye()
        name = "DJHad"
        age=10
        age
    }
    println(ageStudent)
    val ageStudent2 = with(Student()){
        Hi()
        bye()
        age=15
        age
    }
    Student().also{st ->
        st.bye()
        st.Hi()
        st.name = "kjfj"

    }

}