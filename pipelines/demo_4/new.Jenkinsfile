@Library('jenkins-shared-library-demo@main')_
pipeline {
    agent {
        node {
            label ''
        }
    }
    stages {
        stage('Say Hello') {
            steps {
                demo_4()
                script {
                    sh '''
                        echo "Bye"
                    '''
                }
            }
        }
    }
}
