pipeline {
    agent {
                node {
                    label 'master'
                }
            }
    stages {
        stage('Main') {
            steps {
                script{
                properties([ 
    parameters([
        [$class: 'org.biouno.unochoice.ChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: 'Select a choice', filterLength: 1, filterable: false, name: 'choice1', script: [$class: 'org.biouno.unochoice.model.GroovyScript', secureFallbackScript: [sandbox: true, script: 'return ["ERROR"]'], secureScript: [sandbox: true, script: 'return[\'aaa\',\'bbb\']']]], 
        [$class: 'org.biouno.unochoice.CascadeChoiceParameter', choiceType: 'PT_SINGLE_SELECT', description: 'Active Choices Reactive parameter', filterLength: 1, filterable: false, name: 'choice2', randomName: 'choice-parameter-7601237141171', referencedParameters: 'choice1', script: [$class: 'org.biouno.unochoice.model.GroovyScript', secureFallbackScript: [sandbox: true, script: 'return ["ERROR"]'], secureScript: [sandbox: true, script: 'if(choice1.equals("aaa")){return [\'a\', \'b\']} else {return [\'aaaaaa\',\'fffffff\']}']]]
    ])
])
            }
            }
        }
    }
}
