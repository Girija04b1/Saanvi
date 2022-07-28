pipeline {
    agent any 
    
      stages {
           stage ('Build') {
             parallel (
                 steps {
                  git 'https://github.com/Girija04b1/Saanvi.git'
                  sh "echo hello"
                     }
                 steps {
                  sh "echo parallel job test" 
                     }
                 steps {
                   sh "echo parallel job test2"
                     }
                )
               
            }
        }  
 }
