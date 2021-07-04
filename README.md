Application to get Fibonacci Number 

The application can be run directly or from the docker container as given below.

Prepare the Project
1. Import the project as a Maven Projects
2. Go to "/frontend" folder
3. Call command prompt in that folder and type the following commands
4. npm install
5. npm run

Part1: Run the backend end directly
1. Run as spring boot app
2. Go to "/frontend" folder
3. Call command prompt in that folder and type the following command
4. npm start
5. Go to http://localhost:3000/fibonacci, the application is already running.

Part2: Run from Docker Container
1. Run the project as "Maven Install" to get the jar file
2. Go to the app folder and open command prompt in that folder
3. docker build -t backend.jar .
1. Go to "/frontend" folder
2. In command prompt, type the following
3. docker build -t frontend .
Now, the two docker images have been created.
4. Go to application folder and type the following in the command prompt
5. docker-compose up
6. Go to http://localhost:3000/fibonacci, the application is already running.
