pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
            git 'https://github.com/sanjaypaliwal0510/seedjob.git'
            }
        }
        stage('Build') { 
            steps {
            echo 'rj 45 tapap'
            }
        }
        stage('Test') { 
            steps {
                echo 'rj 45 tapaptappp'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'rj 45 tapaptappp'
            }
        }
    }

