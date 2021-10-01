### Intro

`http:inbound-gateway >> service-activator >> http:outbound-gateway`

### Run

`mvn spring-boot:run`

### Test

`curl --location --request GET 'http://localhost:8086/format/abc'`