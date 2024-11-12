def call(String credID, String imagename, String imagetag){
                  withCredentials([usernamePassword(
                    credentialsId:"${credID}",
                    usernameVariable:"dockerHubUser", 
                    passwordVariable:"dockerHubPass")]){
                sh 'echo $dockerHubPass | docker login -u $dockerHubUser --password-stdin'
                sh "docker image tag ${imagename}:${imagetag} ${env.dockerHubUser}/${imagename}:${imagetag}"
                sh "docker push ${env.dockerHubUser}/${imagename}:${imagetag}"
                }
}
