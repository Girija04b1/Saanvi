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
           parallel (
            stage ('hellow task') {
                steps {
                    sh "echo hellow Saanvi"
                }
            }
            stage ('hellow message') {
                steps {
                    sh "echo hellow Havish"
                }
            }    
            stage ('hellow print') {
                steps {
                    sh "echo hellow Chitti"
                }
            }   
           )
           stage ('test') {
                 steps {
                  sh "echo parallel job test2"
                 }
           }
       }
    post {
        always {
            emailext body: 'A Test EMail', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test'
        }
    }
 }
