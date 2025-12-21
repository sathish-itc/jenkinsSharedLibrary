def call(buildTag) {
    sh """
        helm upgrade --install flaskapp ./helm/flaskapp -n devops \
            --set image.tag=${buildTag}
    """
}
