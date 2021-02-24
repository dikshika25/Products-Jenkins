pipeline {

    agent any
    tools {
        maven 'maven_3_6_3' 
    }
    stages {
        stage('Compile stage') {
            steps {
                bat "mvn clean compile" 
        }
    }
         stage('testing stage') {
             steps {
                sh 'mvn test'
        }
    }

          stage('deployment stage') {
              steps {
                sh 'mvn deploy'
        }
    }

  }
}

