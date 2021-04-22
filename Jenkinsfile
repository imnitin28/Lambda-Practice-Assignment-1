stage('Always Run'){
        steps {
                echo "Hello Jenkins"
        }
}
stage('Runs on master'){
        when(branch 'main') {
          steps {
                echo "Hello Jenkins"
          }
    }
}
