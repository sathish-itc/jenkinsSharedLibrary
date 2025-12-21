def call(buildTag) {
    sh "docker build -t sathish-itc:${buildTag} ."
}
