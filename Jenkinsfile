pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        bat(script: 'echo "PATH = %PATH%"           echo "MAVEN_HOME = %MAVEN_HOME%"           echo "MAVEN_HOME = %MAVEN_HOME%}"', encoding: 'UTF-8')
        bat(script: 'mvn -version', encoding: 'UTF-8')
      }
    }
    stage('build') {
      steps {
        echo 'Iniciando pipeline'
        bat(script: 'mvn clean', encoding: 'UTF-8')
      }
    }
  }
  tools {
    maven 'Maven3.6.1'
    jdk 'JAVA8_211'
  }
}
