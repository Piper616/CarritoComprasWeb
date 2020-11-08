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
                dir("C:/Program Files/NetBeans 8.2/bin/netbeans64.exe Carrito.java")
            }
        }
        stage('Finalizando') {
            steps {
                bat 'echo "Tarea Cumplida...." '
            }
        }
    }
}
