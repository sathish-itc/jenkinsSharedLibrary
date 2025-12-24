def call(Map config) {

    sh """
      helm upgrade --install ${config.release} ${config.chartPath} \
        --namespace ${config.namespace} \
        --create-namespace \
        --set image.tag=${config.imageTag}
    """
}
