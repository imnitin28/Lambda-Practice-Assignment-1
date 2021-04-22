pipeline{
    agent any

    stages{
        stage('Verify Branch') {
            steps {
                echo "$GIT_BRANCH"
            }
            post {
                success {
                    echo "App started succesfully"
                    echo "$BUILD_NUMBER"
                }
                failure {
                    echo "Some error ocurred"
                }
            }
        }
    }
}
