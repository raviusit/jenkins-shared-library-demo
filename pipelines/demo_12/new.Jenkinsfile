@Library('jenkins-shared-library-demo@main')_
pipeline {
  agent any
  stages {
    stage('hello') {
      steps {
        helloWorld(name: 'Fred', dayOfWeek: 'Friday')
      }
    }
  }
}
