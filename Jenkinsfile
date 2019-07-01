pipeline {
  agent any
  tools {
    maven 'Maven3.6.1'
    jdk 'JAVA8_211'
  }
  stages {
    stage('Initialize'){
      steps {
        sh '''
          echo "PATH = ${PATH}"
          echo "MAVEN_HOME = ${MAVEN_HOME}"
          echo "M2_HOME = ${M2_HOME}"
        '''
      }
    }
    stage('build') {
      steps {
        echo 'Iniciando pipeline'
        bat(script: 'mvn clean', encoding: 'UTF-8', returnStatus: true, returnStdout: true, label: 'clean')
      }
    }
  }
}
