pipeline{
    agent any
    stages{
        stage("Run Command"){
            steps{
                sh '''
                set +xe
                echo Hello
                ech hello
                sudo yum install htttpd -y 
                ping -c 4 google.com
                '''
            }
        }
    }
}