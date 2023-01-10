def call() {
  def template="pipeline-bls-jdk8"
  pipeline {
     stages{
        stage("Build"){
           steps{
                script {
                  blsPipeline()
                } //script tag end
            } // Steps tag end
         }// stage tag end
     }//stages tag end
  }//pipeline tag end
} // call tag end

def blsPipeline() {
  utilLog.info("This is my awesome pipeline")
}
