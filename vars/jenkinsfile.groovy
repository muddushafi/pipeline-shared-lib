def call() {
  def template="pipeline-bls-jdk8"
  pipeline {
        stage("Build"){
           step{
                echo "Starting my pipeline"
                script {
                  echo "Entered script tag"
                  blsPipeline()
                  echo "Finished calling blspipeline"
                } //script tag end
            } // Steps tag end
         }// stage tag end
  }//pipeline tag end
} // call tag end

def blsPipeline() {
  utilLog.info("This is my awesome pipeline")
}
