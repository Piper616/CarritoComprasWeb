pipeline {
    agent any

    stages {
        stage('Mensaje') {
            steps {
                bat 'echo "Hola.." '
            }
        }
        stage('Test') {
            steps {
                bat 'C:\Program Files\NetBeans 8.2\bin\CarritoTest.java'
            }
        }
        stage('Finalizando') {
            steps {
                bat 'echo "Tarea Cumplida...." '
            }
        }
    }
}
