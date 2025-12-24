def call(Map config) {

    sh """
      mkdir -p dist
      tar -czf dist/${config.name}-${config.version}.tar.gz \
        --exclude=dist \
        --exclude=.git \
        .
    """

    archiveArtifacts artifacts: 'dist/*.tar.gz', fingerprint: true
}
