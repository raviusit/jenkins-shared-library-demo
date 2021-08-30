def call (params) {
    try {
        print(params)
        input(
            id : "${params.id }" , message : "${params.msg}"
        )

    } catch (err) {
        // Get users who execute Input
        env.user = err.causes[0].user.toString()
        userInput = false
        env.QATEST_TEST  =  false
        echo " Aborted by: [${user}] "
        // Throw an exception to ensure that the process is terminated
        throw err
    }
}

void print(def params) {
    println("${params.id}")
    println("${params.msg}")
}
