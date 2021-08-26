
This example demonstrate how does a high-level Jenkinsfile template defined as a shared library, and how Closure been used to extend.

Here is A FAILED EXAMPLE, this is not gonna work!

Content of ``demo_3.groovy``::

    def call(Closure postHelloStages) {
        pipeline {
            agent {
                node {
                    label ""
                }
            }
            stages {
                stage("Hello World") {
                    steps {
                        script {
                            sh """
                                echo Hello
                            """
                        }
                    }
                }
                postHelloStages()
            }
        }
    }

Content of ``Jenkinsfile``::

    demo_3 {
        stage("Post Hello") {
            script {
                sh """
                    echo post hello
                """
            }
        }
    }
