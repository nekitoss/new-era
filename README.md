## About

This multi-module project contains 4 modules resulting in microservice with auto-routing via gateway, auto-discovery and load balancing (if multiple instances present).

### Discovery-service

This service is eureka-server, where other modules will register.

Eureka monitoring is available at `http://localhost:8761/`

Clients register via `http://localhost:8761/eureka`

### Gateway

This is routing and load balancing service, it will automatically get information about adress and number of available instances for MS1 and MS2

`http://localhost:8080/ms1` will be redirected to MS1 `http://localhost:port/ms1/hello`

`http://localhost:8080/ms2` will be redirected to MS1 `http://localhost:port/ms2/hello`

### MS1 and MS2
Hello-world services.
With default ports endpoints will be:

`http://localhost:8081/ms1/hello`
`http://localhost:8082/ms2/hello`



## Running application
Build and test:
`mvn clean test`

Run each service in different console:
```
cd ./discovery-service/
mvn spring-boot:run
```

```
cd ./gateway/
mvn spring-boot:run
```

```
cd ./MS1/
mvn spring-boot:run
```

```
cd ./MS2/
mvn spring-boot:run
```


Also run additional instances - for example for MS1 on port 8077 it will be:

```
cd ./MS1/
mvn spring-boot:run  -Dspring-boot.run.jvmArguments=-Dserver.port=8077
```

## Check-up
After all instances are up and registered to discovery-service you can try access

`http://localhost:8080/ms1`

If you started two instances of MS1 as was shown - each reload will show different port: 8081 or 8077.
It that is true - service is successfully routing and load-balancing!

