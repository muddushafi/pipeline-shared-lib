def call() {
  def template="pipeline-bls-jdk8"
  pipeline {
        stage("Build"){
           steps{
                script {
                  blsPipeline()
                } //script tag end
            } // Steps tag end
         }// stage tag end
  }//pipeline tag end
} // call tag end

def blsPipeline() {
  utilLog.info("This is my awesome pipeline")
}
