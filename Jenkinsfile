node{
    stage('SCM Checkout'){
      git 'https://github.com/dikshika25/Products-Jenkins'
    }
    stage('Compile-Package'){
        def mvnHome= tool name: 'maven', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
    
}
