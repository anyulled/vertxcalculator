pipeline {
  options {
    skipDefaultCheckout()
  }
  agent any
  stages {
    stage('Compile and Test') {
      steps {
        script {
          def scmVars = checkout scm
          sh "mvn -Dsmart.testing='new, changed' -Dsmart.testing.mode=ordering -Dscm.range.head=${scmVars.GIT_COMMIT} -Dscm.range.tail=${scmVars.GIT_PREVIOUS_COMMIT} test"
        }
      }
      post {
        success {
          junit 'target/surefire-reports/**/*.xml'
        }
      }
    }
  }
}