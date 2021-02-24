  
pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
//               bat "rmdir  /s /q TicketBookingServiceJunitTesting"
                bat "git clone https://github.com/dikshika25/Products-Jenkins.git"
           //     bat "mvn clean -f Product-Jenkins"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f Product-Jenkins"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f Product-Jenkins"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f Product-Jenkins"
            }
        }
    }
}
