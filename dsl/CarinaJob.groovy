
folder('Management_Jobs') {
    displayName('Management Jobs')
}

job('Management_Jobs/RegisterOrganization') {
    description('Job para registrar la organización en Zebrunner')
    steps {
        shell('echo "Registrando organización en Zebrunner..."')
    }
}

job('Management_Jobs/RegisterRepository') {
    description('Job para registrar el repositorio en Zebrunner')
    steps {
        shell('echo "Registrando repositorio en Zebrunner..."')
    }
}

job('Management_Jobs/RegisterHubCredentials') {
    description('Job para registrar las credenciales del Selenium Grid en Zebrunner')
    steps {
        shell('echo "Registrando credenciales del hub en Zebrunner..."')
    }
}

job('Carina_Automation_Tests') {
    scm {
        git {
            remote {
                url('https://github.com/miguezmanuel/Jenkins')
            }
            branch('main')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell('mvn clean test -Dsuite=testng.xml')
    }
}
