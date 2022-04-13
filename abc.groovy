pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                git 'https://github.com/sanjaypaliwal0510/seedjob.git'
            }
        }
        stage('Test') { 
            steps {
                echo 'hiii'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'hiii'
            }
        }
    }
}