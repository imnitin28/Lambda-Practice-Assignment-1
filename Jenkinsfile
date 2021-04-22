pipeline{
    agent any

    stages{
        stage('Verify Branch') {
            steps {
                echo "Hello current branch "
                echo $GIT_BRANCH
            }
            post {
                success {
                    echo "App started succesfully"
                }
                failure {
                    echo "Some error ocurred"
                }
            }
        }
    }
}
