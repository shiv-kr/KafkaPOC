# KafkaPOC
 A Spring Boot POC that produces and consumes message
 
## Start Zookeeper
 ```sh
$ zkserver
```

## Start Kafka Server
```sh
$ .\bin\windows\kafka-server-start.bat .\config\server.properties
```

## Create Kafka Topic
```sh
$ .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafkatest
```

> Now Run the Application and test
>  
> Post an Employee object to "http://localhost:8081/kafka/publish". 
> It should return "Published successfully" and print the Employee object in System Logs
>  
>  
> (Note: - Please ensure you do have lombok dependency and plugin.)
 
