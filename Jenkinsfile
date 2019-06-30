pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'Iniciando pipeline'
        bat(script: 'mvn clean', encoding: 'UTF-8', returnStatus: true, returnStdout: true, label: 'clean')
      }
    }
  }
}