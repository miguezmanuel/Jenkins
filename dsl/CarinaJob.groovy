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
