pipeline {
    agent any  
    parameters {
        string(
               defaultValue: 'scriptcrunch', 
               name: 'STRING-PARAMETER', 
               trim: true    
        )        
    }
    stages {
           stage ('Build') {
                 steps {
                    parallel (
                      "first task" : {sh "echo hello"} ,
                      "second task" : {sh "echo parallel job test"}
                    )
                 }
            } 
           stage ('test') {
                 steps {
                  sh "echo parallel job test2"
                 }
           }
       }
 }  

