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
                demo_6()
                script {
                    sh '''
                        echo "fullname is"
                    '''
                }
            }
        }
    }
}
