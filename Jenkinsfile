pipeline {
   agent any
 
       stage('Build') {
           steps {
               sh 'mvn clean compile'
           }
       }
 
       stage('Test') {
           steps {
               sh 'mvn test'
           }
       }
 
       stage('Report') {
           steps {
               publishHTML([
                   reportDir: 'reports',
                   reportFiles: 'extent-report.html',
                   reportName: 'Test Report'
               ])
           }
       }
   }
}
