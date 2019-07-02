pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        bat(script: 'echo "PATH = %PATH%"           echo "MAVEN_HOME = %MAVEN_HOME%"           ', encoding: 'UTF-8')
        bat(script: 'mvnw.cmd -version', encoding: 'UTF-8')
      }
    }
    stage('build') {
      steps {
        echo 'Iniciando pipeline'
        bat(script: 'mvnw.cmd clean', encoding: 'UTF-8')
        bat(script: 'mvnw.cmd install -DskipTests', encoding: 'UTF-8')
      }
    }
  }
  tools {
    maven 'Maven3.6.1'
    jdk 'JAVA8_211'
  }
}
