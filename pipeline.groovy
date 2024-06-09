pipeline {
    agent any

    stages {
        stage('Print disk space') {
            steps {
                script {
                    def dfOutput = sh(script: 'df -h', returnStdout: true)
                    println "Disk Usage:\n${dfOutput}"
                }
            }
        }
    }
}
