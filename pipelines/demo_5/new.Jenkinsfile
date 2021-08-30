@Library('jenkins-shared-library-demo@main')_
pipeline {
    agent {
        node {
            label ''
        }
    }
    stages {
        demo_5()
        stage('build') {
            steps {
                script {
                    sh '''
                        echo "build"
                    '''
                }
            }
        }
        stage('test') {
            steps {
                script {
                    sh '''
                        echo "test"
                    '''
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    sh '''
                        echo "deploy"
                    '''
                }
            }
        }
    }
}
