def call(String env) {

    if (!env) {
        env = 'dev'
        echo "No env provided, defaulting to DEV"
    }

    if (env == 'dev') {
        echo "Deploying to DEV environment"
    } else if (env == 'qa') {
        echo "Deploying to QA environment"
    } else if (env == 'prod') {
        echo "Deploying to PROD environment"
    } else {
        error "Invalid environment selected: ${env}"
    }
}

