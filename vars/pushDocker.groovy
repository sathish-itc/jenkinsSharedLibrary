def call(String buildTag) {
    withCredentials([usernamePassword(
        credentialsId: 'sathish33',
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {
        sh '''
          echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
          docker tag sathish-itc:'"$buildTag"' "$DOCKER_USER"/sathish-itc:'"$buildTag"'
          docker push "$DOCKER_USER"/sathish-itc:'"$buildTag"'
        '''
    }
}
