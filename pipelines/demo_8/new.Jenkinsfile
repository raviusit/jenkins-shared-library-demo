@Library('jenkins-shared-library-demo@main')
import org.example.Student

pipeline {
    agent any
    stages {
        stage('demo_8') {
            steps {
                script {
                    Student st = new Student()
                    st.setStudentID(1)
                    st.setStudentName('Joe')
                    println(st.getStudentID())
                    println(st.getStudentName())
                }
            }
        }
    }
}
