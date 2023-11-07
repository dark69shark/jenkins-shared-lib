def call(Map args, Closure body) {
    defaults = [
        var1: 1,
        var2: 2,
        var3: "stfing"
    ]
    args = defaults + args
    pipeline {
        agent any
        stages {
            stage("commonStage1"){
                steps {
                    echo "stage1"
                }
            }
            stage("Build"){
                steps {
                    script {
                        body(args)
                    }
                }
            }
        }
    }
}