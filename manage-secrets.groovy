pipeline {
    agent any 
    stages {
        stage('Build') {
            script {
                steps {
                    echo "This is Build stage."
                    printf("Hello world")
                    aws --version   
                }
            }
        }
        stage('Test') { 
            steps {
                echo "This is Test stage." 
            }
        }
        stage('Deploy') { 
            steps {
                echo "This is Deploy stage." 
            }
        }
    }
}