job('Management_Jobs/RegisterOrganization') {
    description('Job to register the organization in Zebrunner')

    scm {
        git {
            remote {
                url('https://github.com/miguezmanuel/Jenkins')
            }
            branch('main')
        }
    }

    steps {
        shell('echo "Registering Organization..."')
        shell('curl -X POST https://your-zebrunner-instance/api/register-organization')
    }
}
