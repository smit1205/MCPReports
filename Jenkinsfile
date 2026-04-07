pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh '"/Users/mac air/maven/bin/mvn" clean compile'
            }
        }

        stage('Test') {
            steps {
                sh '"/Users/mac air/maven/bin/mvn" test'
            }
        }

        stage('Report') {
            steps {
                publishHTML(target: [
                    reportDir: 'target',
                    reportFiles: 'ExtentReport.html',
                    reportName: 'Extent Report',
                    keepAll: true,
                    alwaysLinkToLastBuild: true
                ])
            }
        }

    }
}
