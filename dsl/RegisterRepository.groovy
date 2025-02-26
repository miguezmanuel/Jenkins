job('Management_Jobs/RegisterRepository') {
    description('Job to register the repository in Zebrunner')

    scm {
        git {
            remote {
                url('https://github.com/miguezmanuel/Jenkins')
            }
            branch('main')
        }
    }

    steps {
        shell('echo "Registering Repository..."')
        shell('curl -X POST https://your-zebrunner-instance/api/register-repository')
    }
}
