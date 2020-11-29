# Kubernates

🔥 Installation : https://computingforgeeks.com/how-to-install-minikube-on-ubuntu-debian-linux/
🔥 Deployment : 
	►Create api
	►go to the directory where is docker file
	►minikube start
	►eval $(minikube docker-env)
	►docker build -t imgName:0.0.1 .
	►kubectl run podName --image=imgName:0.0.1 imagePullPolicy=Never --port=8081
	►kubectl get pods


🔥Kubernates main components🔥
	►Master node
	►Worker node


🔥Kubernates components🔥
	►Volumes
	►Pod
	►Service
	►Ingress
	►Deployment
	►Statefulset
	►Configmap
	►Secret



🔥What is kubernates ?
	►Ans : container(docker container) orchestration tool



 
🔥Orchestraion tool/k8s features🔥
	►No downtime
	►High performance
	►Backup and restore



🔥Pod : 
	►Smallest unit of k8s
	►Abstractoin over container
	►Environment component over container
	►Each pod has 1 IP
	►These ip is used to interact with other pod in a node using service(it contain static ip so no problem when pod down and create new)



🔥Ingress :
	►Forward external service to internal service



🔥Configmap :
	►External configuration of application like db url 



🔥Secret :
	►Used to store secret data like username password
	►Store format is base64 encoded


🔥Volumes :
	►Storage on local machine or remote out side of cluster
	►When any problems occure then cluster data store in this disk


🔥Raplica :
	►Act as blueprint of pod and load balancer


🔥Stafeulset :
	►It is like replica for db(db is often hosted out side of cluster)


🔥Worker machine in k8s cluster : 
	►Each node has multiple pods on it
	►3process(kubelet,kube proxy,container runtime) must be installed on every node
	►Worker node do the actual work
	►Kubelet interact with container and node and start the pod with a container inside
	►kubernates cluster has multiple nodes



🔥Master process : 
	►4process run on every master node
	
	
	
	►Api server :
		  ►Entry point of k8s cluster
		  ►Cluster gateway
		  ►Act as gatekeeper for authentication
	►Sheduler :
	  	  ►Where to put the pod based on cpu
	►Controller manager :
		  ►Detects cluster state changes
	►Etcd :
		  ►Key valu store
		  ►Cluster brain
		  ►No store any app data
		  
		  
		  
	►Master node has less resources but actual is in worker node


🔥Minikube🔥 
	►1 node k8s cluster that runs on virtual box on laptop/locally
	►For local cluster setup
	►Master and node process run on one machine



🔥Main K8s Components 🔥  
	►Node & Pod
	►Service & Ingress
	►ConfigMap & Secret
	►Volumes
	►Deployment & StatefulSet
	
	
🔥Kubectl🔥 
	►Command line tool for k8s cluster































