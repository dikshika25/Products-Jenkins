node{
    stage('SCM Checkout'){
      git 'https://github.com/dikshika25/Products-Jenkins'
    }
    stage('Compile-Package'){
//        def mvnHome= tool name: '', type: 'maven'
        sh 'mvn package'
    }
    
}
