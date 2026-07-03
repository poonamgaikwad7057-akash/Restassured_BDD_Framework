pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/poonamgaikwad7057-akash/Restassured_BDD_Framework.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean test'
            }
        }

    }
}