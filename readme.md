# Leaderboard-BackEnd


## Introduction
The Leaderboard-BackEnd is a Java Spring Web Application which outputs a JSON API to be consumed by a Front-End. Leaderboard-BackEnd relies on a MySQL Database, but you are able to change to PostgreSQL or MongoDB if necessary. It's purpose is to serve as a simple Leaderboard for mobile games with multiple game instances. Each game activity will use the API to create a new Game Instance stored on the database. This is done to ensure that there is no arbitrary scores being associated with unrelated games or levels. Basic Authentication is included for Users and a API calls are made to a RESTful CRUD Framework.

## Development
To get started with developing the Leaderboard-BackEnd, you'll first meet the requirements:

Java 1.8
Gradle 4.2.1

Then you'll clone this repo:

```git clone https://github.com/Technopathic/Leaderboard-BackEnd.git```

The Leaderboard-BackEnd uses Gradle by default for build automation. In order to build the executable, you will run the following:

```./gradlew build```

Then to run the build:

```java -jar build/libs/leaderboard-0.1.0.jar```

Inside of the resources folder, you will find the application.properties file. This file is used to establish your Database Connection. By default, the configuration is set to migrate the schema upon each new server initialization, you may go ahead and change "create" to "none" after the first.

## API

/user/store

Creates a New User

/user/get

Gets an array of all Users

/game/store

Creates a New Game

/instance/store

Creates a New Instance

/instance/update

Updates an Instance

/score/store

Stores a New Score (Or Updates a previous one)

/score/showUser

Get an array of a single User scores

/score/showGame

Get an array of a single Game scores

/score/highScore

Get an array of scores in Descending order from a single Game

/score/get

Get an array of all scores


## License
MIT
