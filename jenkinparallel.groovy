pipeline {
    agent any 
    
      stages {
         parallel {
           stage ('Build') {
             steps {
                  git 'https://github.com/Girija04b1/Saanvi.git'
                  sh "echo hello"
                    }
              } 
           stage ('test') {
             steps {
                  sh "echo parallel job test" 
                   }
              }
           stage ('test') {
              steps {
                   sh "echo parallel job test2"
                    }
             }
          } 
    }
}
