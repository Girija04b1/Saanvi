pipeline {
    agent any 
    
      stages {
          stage ('Build') {
            parallel steps {
                  git 'https://github.com/Girija04b1/integrationwithjenkins.git'
                  sh "echo hello"
                    }
          } 
          stage ('Build') {
            parallel steps {
                  git 'https://github.com/Girija04b1/integrationwithjenkins.git'
                  sh "echo hello printing again"
                    }
          } 
          stage ('Build') {
              steps {
                  git 'https://github.com/Girija04b1/Saanvi.git'
                  sh "echo Hellow Saanvi"
                    }
          } 
}
