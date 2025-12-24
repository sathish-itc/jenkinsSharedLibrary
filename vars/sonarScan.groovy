def call(Map config) {

    def scannerHome = tool(
        name: config.scannerName,
        type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    )

    withSonarQubeEnv(config.sonarServer) {
        sh """
          ${scannerHome}/bin/sonar-scanner \
            -Dsonar.projectKey=${config.projectKey} \
            -Dsonar.sources=${config.sources ?: '.'} \
            -Dsonar.host.url=${config.hostUrl} \
            -Dsonar.login=${config.token}
        """
    }
}
