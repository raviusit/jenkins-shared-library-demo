@Library('jenkins-shared-library-demo@main')_
pipeline {
    agent any
    stages {
        stage('demo_9') {
            steps {
                script {
                    log.info 'Info!'
                    log.warn 'Warning!'
                    log.debug 'Debug!'
                }
            }
        }
    }
}
