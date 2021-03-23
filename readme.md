https://reflectoring.io/spring-boot-kafka/

https://www.goavega.com/install-apache-kafka-on-windows/

cd C:\kafka
git clone

cd C:\kafka\kafka_2.13-2.7.0\bin
zookeeper-server-start.bat C:\kafka\kafka_2.13-2.7.0\config\zookeeper.properties

cd C:\kafka\kafka_2.13-2.7.0\bin
kafka-server-start.bat C:\kafka\kafka_2.13-2.7.0\config\server.properties

run project a
run project b

go to http://localhost:8770/ to send message to B
go to http://localhost:8771/ to send message to A