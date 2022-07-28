pipeline {
      stages {
           stage ('Build') {
             parallel (
                 steps {
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
