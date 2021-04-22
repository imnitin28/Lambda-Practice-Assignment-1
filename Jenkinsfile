stage('Always Run'){
        steps {
                echo "Hello Jenkins"
        }
}
stage('Runs on master'){
        when(branch 'master') {
          steps {
                echo "Hello Jenkins"
          }
    }
}
