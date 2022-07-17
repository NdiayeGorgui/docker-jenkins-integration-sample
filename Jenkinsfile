pipeline {
    agent any 
    stages {
        stage('Git clone') { 
            steps {
             git 'https://github.com/NdiayeGorgui/docker-jenkins-integration-sample.git'
            }
        }
        stage('Maven Test') { 
            steps {
             bat 'mvn test'
            }
        }
        stage('Maven Build') { 
            steps {
            bat 'mvn package'
            }
        }
         stage('Maven Deploy') { 
            steps {
             echo "dploying war file to the server"
            }
        }
    }
}
