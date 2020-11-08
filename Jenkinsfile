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
                dir("C:\Program Files\NetBeans 8.2\bin\Neatbeans64.exe CarritoTest.java")
            }
        }
        stage('Finalizando') {
            steps {
                bat 'echo "Tarea Cumplida...." '
            }
        }
    }
}
