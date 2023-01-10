def call() {
  def template="pipeline-bls-jdk8"
  pipeline {
    stages{
      stage{
        script {
          blsPipeline()
        }
     }
  }
}

def blsPipeline() {
  utilLog.inf("This is my awesome pipeline")
}
