multibranchPipelineJob('nodejs-pipeline') {
  branchSources {
    git {
      remote('https://github.com/ksexton/docker-demo.git')
      includes('*')
    } 
  }
  orphanedItemStrategy {
    discardOldItems {
      numToKeep(20)
    }
  }
  configure {
    scriptPath('misc/Jenkinsfile-other')
  }
}
