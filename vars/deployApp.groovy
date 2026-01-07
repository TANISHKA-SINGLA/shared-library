def call(String env) {
    if (env == 'dev') {
        echo "Deploying to DEV environment"
    } else if (env == 'qa') {
        echo "Deploying to QA environment"
    } else if (env == 'prod') {
        echo "Deploying to PROD environment"
    }
}
