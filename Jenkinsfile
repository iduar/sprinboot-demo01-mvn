pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        bat(script:
            'echo "PATH = %PATH%"
            echo "JAVA_HOME = %JAVA_HOME%"
            ', encoding: 'UTF-8')
        bat(script: 'mvnw.bat -version', encoding: 'UTF-8')
      }
    }
    stage('build') {
      steps {
        echo 'Iniciando pipeline'
        bat(script: 'mvnw.bat clean', encoding: 'UTF-8')
        bat(script: 'mvnw.bat install -DskipTests', encoding: 'UTF-8')
      }
    }
  }
  tools {
    maven 'Maven3.6.1'
    jdk 'JAVA8_211'
  }
}
