job('Management_Jobs/RegisterHubCredentials') {
    description('Job to register the Selenium Grid Hub credentials in Zebrunner')

    scm {
        git {
            remote {
                url('https://github.com/miguezmanuel/Jenkins')
            }
            branch('main')
        }
    }

    steps {
        shell('echo "Registering Hub Credentials..."')
        shell('curl -X POST https://your-zebrunner-instance/api/register-hub-credentials')
    }
}
