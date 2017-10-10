multibranchPipelineJob('nodejs-pipeline') {
    definition {
        cpsScm{
          scm{
               git('https://github.com/ksexton/docker-demo.git') {
        node -> // is hudson.plugins.git.GitSCM
        node / gitConfigName('DSL User')
        node / gitConfigEmail('ks@mocker.org')
      }
       
          }
          scriptPath('misc/Jenkinsfile-other')	
        }
    }
}
