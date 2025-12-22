def call(buildTag) {
   
        sh """
            sed -i "s/IMAGE_TAG/${buildTag}/g" deployment.yaml
            kubectl apply -f deployment.yaml
        """
   
}

// for minikube cluster 

// def call(String version) {
//     def date = new Date().format('yyyyMMdd')
//     def buildTag = "${version}-${date}.${env.BUILD_NUMBER}"
//     currentBuild.displayName = buildTag
//     sh "echo BUILD_TAG=${buildTag} > build.env"
//     return buildTag
// }


