node{
	stage('Checkout project from GIT') {
		echo 'Checking out project from GIT...'
		git url: 'https://github.com/hshah108/order-service.git'
	}
	stage('compile') {
		echo 'Compile the project..'
		def mvnHome = tool 'Maven 3.3.9'
		def mvnCMD = "${mvnHome}/bin/mvn"
		sh "${mvnCMD} clean package"
	}
	stage( 'Build Docker Image') {
		sh 'sudo docker build -t hshah108/order-service:1.0.0 .'
	}
	stage(' Run docker container') {
		sh 'sudo docker run -d --net=techotip --name order-service hshah108/order-service:1.0.0'
	}
}