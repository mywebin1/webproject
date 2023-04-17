#!groovy
@Library('tenix@master')_
import groovy.json.*

node("${env.SF_AGENT}") {
  currentBuild.result="SUCCESS"
  try{
    stage('CLONE'){
      //Checkout the Salesforce Repo
      //checkout ([$class" 'GitSCM', branches: [[name:env.GIT_BRANCH]], doGenerateSubmoduleConfigurations: false, extensions: [[$class" 'CloneOption',depth:50, shallow: true, timeout: 30]],
      
    }
  }
