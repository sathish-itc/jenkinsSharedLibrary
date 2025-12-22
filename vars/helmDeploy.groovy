def call(String release, String namespace, String tag) {
    sh """
      helm upgrade --install ${release} ./helm \
        --namespace ${namespace} \
        --set image.tag=${tag} \
        --create-namespace
    """
}
