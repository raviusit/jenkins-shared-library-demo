@Library('jenkins-shared-library-demo@main')_
pipeline {
    agent {
        node {
            label ''
        }
    }
    stages {
        stage('Hello World') {
            steps {
                demo_2() // demo_2() uses the default parameter. you can also try: ``demo_2 "hi"`` or ``demo_2 "hello"``
            }
        }
    }
}
