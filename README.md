# Micro-Services CodeLab
Micro-Services CodeLab using Spring - Boot

#Services
The Project has four services:

- ***car-races*** : for managing races, running on port ```8081```
- ***race-participants***: for managing people participating in a particular race, running on port ```8082```
- ***race-web-client***: User interface for managing both car-races and race-participants, running on port ```8080```
- ***race-service-disocvery***: Service Service discovery for above services, running on port ```8090```

#Running the services

- ```cd into the <service_directory>```
- Run  ```mvn:spring-boot:run```
- In the browser, to see the service, go to ```http://localhost:<service_port>```
