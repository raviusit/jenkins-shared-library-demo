pipeline {
    agent any
    stages {
        stage ('Start') {
            steps {
                sendNotificationsStart()
            }
        }
    }
    post {
        success {
            sendNotificationsSuccess()
        }
    }
    post {
        failure {
            sendNotificationsFailure()
        }
    }
}
s
