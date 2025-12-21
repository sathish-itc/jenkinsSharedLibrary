def call(buildTag) {
    sh "docker build -t flask-img:${buildTag} ."
}
