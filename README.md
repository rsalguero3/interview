# Hammerhead Interview Development Assignment

Start by forking this repo and solving the problem with completed instructions for building/running.

Open a PR against the original hammerheadnav/interview repo when you're finished.

## Instructions

Write a simple program in a language of your choice that has implementations for three "services" (Strava, RWGPS, and Komoot).

Results should be printed to standard output after following the build instructions.

### src.main.Services

Each service has the ability to get routes. src.main.Services can retreive all routes or retrieve routes for a specific user.

#### Strava

* Has fixed routes  `["SRT", "CVT", "Perkiomen"]`
* For user routes, Strava prepends the user id onto the route.

#### RWGPS

* Has fixed routes  `["CVT", "Perkiomen", "Welsh Mountain"]`
* For user routes, RWGPS appends the user id onto the route.

#### Komoot

* Has fixed routes  `["SRT", "Welsh Mountain", "Oaks to Philly"]`
* For user routes, Komoot prepends *and* appends the user id onto the route.

### Results

The code should have the following functionality:

#### All Routes

Return the list of the routes across all services.

#### Unique Routes

Return a *unique* list of the routes across all services.

#### All User Routes

Given a user id and return a list of all the routes the user has across all services.

#### Users Routes by Service

Given a user id and a subset of the list of services (e.g. `["Strava", "Komoot"]`)
return the user's routes for only the services listed.


## Building/Running

- Use any IDE of your choice and open project
- Create jar
- Use the run command on the IDE and run the Main class or Open terminal
- Go to root project
- Run the following command java -jar [LOCATION OF JAR]

- Main class will print out the sample output using "42" userId.

- Test file is used with Junit 4. It located under the test folder.
