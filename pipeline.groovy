pipeline {
    agent {label 'slave'}
    stages {
        stage('pull-stage') {
            steps {
                echo "pull stage success"
            }
        }
        stage('Build') {
            steps {
                echo " build sucess"
            }
        }
        stage('test') {
            steps {
                echo "test suecss"
            }
        }
        stage('deploy') {
            steps {
                echo "deploy sucess"
            }
        }
    }
}