def call() {
  def template="pipeline-bls-jdk8"
  pipeline {
      agent any
      stages {
          stage('Build') {
              steps {
                  echo "Starting my pipeline"
                  script {
                      echo "Entered script tag"
                      blsPipeline()
                      echo "Finished calling blspipeline"
                  }
              }
          }
      }
  }//pipeline tag end
} // call tag end

def blsPipeline() {
  utilLog.info("This is a BLS Pipeline")
  def loadconfig = readYaml file:'/src/acceleratedskillip/abc.yaml'
  echo ${loadconfig}
}
