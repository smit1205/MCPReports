pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh '$HOME/maven/bin/mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh '$HOME/maven/bin/mvn test'
            }
        }

        stage('Report') {
            steps {
                publishHTML(target: [
                    reportDir: 'reports',
                    reportFiles: 'extent-report.html',
                    reportName: 'Extent Report',
                    keepAll: true,
                    alwaysLinkToLastBuild: true
                ])
            }
        }

    }
}
