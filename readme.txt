install oracle jdbc jar
:mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.3 -Dpackaging=jar -Dfile=/home/chandika/Desktop/Spring_Boot_Micro_Service/ojdbc6.jar -DgeneratePom=true

#Chandika
terminal - go to project home
:mvn package
:java -jar target/BTekService-1.0.0.jar