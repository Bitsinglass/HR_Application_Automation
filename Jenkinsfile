pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                build 'Maven_proj'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello World'
            }
}        
        stage('Deploy') {
            steps {
                echoo 'Hello World'
            }
        }
    }
    post{
        always {
            emailext body: 'Hi Jatin this is from pipeline', subject: 'Mail from Pipeline', to: 'jatin.bakshi@bitsinglass.com'
        }
    }
}
