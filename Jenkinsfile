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
                bat '\\Program Files\\Java\\jdk1.8.0_111\\bin CarritoTest.java'
            }
        }
        stage('Finalizando') {
            steps {
                bat 'echo "Tarea Cumplida...." '
            }
        }
    }
}
