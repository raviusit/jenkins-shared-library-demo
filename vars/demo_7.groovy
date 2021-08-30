def call (params) {
    pipeline {
        agent any
        environment {
            examples_var1 = sh( script : ' echo "The current time is: `date`" ' , returnStdout : true ).trim()
        }
        stages {
            stage('pull') {
                steps {
                    git url : "${params.git_url}", branch: 'main'
                }
            }
            stage('print') {
                steps {
                    script {
                        execShell "${env.examples_var1}"
                    }
                }
            }
            stage('command') {
                steps {
                    script {
                        sh "${params.cmd}"
                    }
                }
            }
            stage('input') {
                steps {
                    script {
                        inputMsg([id : "${params.input_id}" , msg : "${params.input_msg}"])
                    }
                }
            }
        }
    }
}
