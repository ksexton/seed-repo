pipelineJob("nodejs-pipeline") {
    scm {
      git('git://github.com/ksexton/docker-nodejs-demo.git') {
        node -> // is hudson.plugins.git.GitSCM
        node / gitConfigName('DSL User')
        node / gitConfigEmail('ks@mocker.org')
      }
      scriptPath("misc/Jenkinsfile")
    }  
}
