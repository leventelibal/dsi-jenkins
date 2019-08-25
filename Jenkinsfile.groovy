pipeline{
    agent any
    stages{
        stage("Run Command"){
            steps{
                sh '''
                echo Hello
                yum install htttpd -y 
                ping -c 4 google.com
                '''
            }
        }
    }
}