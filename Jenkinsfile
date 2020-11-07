pipeline {
    agent{label 'master'}

    stages {
        stage('Mensaje') {
            steps {
                bat 'echo "Hola.." '
            }
        }
        stage('Test') {
            steps {
                bat 'Neatbeans64.exe CarritoTest.java'
            }
        }
        stage('Finalizando') {
            steps {
                bat 'echo "Tarea Cumplida...." '
            }
        }
    }
}
