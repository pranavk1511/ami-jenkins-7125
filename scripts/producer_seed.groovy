multibranchPipelineJob('producer') {
  branchSources {
    github {
      id('csye7125-producer')
      scanCredentialsId('jenkins-sydrawat')
      repoOwner('csye7125-fall2023-group05')
      repository('producer')
    }
  }

  orphanedItemStrategy {
    discardOldItems {
      numToKeep(-1)
      daysToKeep(-1)
    }
  }
}
