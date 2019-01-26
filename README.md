# Kotlin Spring boot example project

This is an skeleton project for a Spring boot with Kotlin. Doesn't contain any business logic, but it has two demo entity, you can make CRUD operations on them (User and Address).
The project also using Flyway for migration.


##### Development with the project:
1. Start a mysql container. Example:
`docker run --name mysql_for_skeleton -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=test -p 3306:3306 -d mysql:latest`
> Later you can start only the image:
`docker start mysql_for_skeleton`
2. Start the application from your IDE
To enjoy the benefit of the hotswap, set up your ide in Intellij:
https://stackoverflow.com/questions/6402162/how-to-enable-intellij-hot-code-swap

##### Start with the prod profile:
1. Build the source and get image:
`./gradlew build buildDocker`
>Without tests:
`./gradlew build -x test buildDocker`

2. Start the application and the mysql image:
`docker run -p 8080:8080 -t kotlin-springboot-skeleton:latest`


##### Todos:
- Single command for run with docker-compose
- Save address through the user api (sub document)
- address api doesn't map address.user
- Tests
- Setup gradle to create an other library from the public package
- Add demo requests to readme
- and more ... :)
