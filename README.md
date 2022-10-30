Training: BMW South Africa
Dates: 31 October to 04 November
Trainer: Thato Mohono (+27 82 556 1420)
Workshop Details: Java and Microservers using Quarkus


Introductions: 

Start 09.00 

* Safe Harbour Statement 
* Welcome 
* Objectives of this training
o Defining kinds of Java Editions and versions 
o Defining a MicroProfile
o Defining a Microservices 
o Implementing microservice with quarkus and microprofile
o Exposing a REST Endpoint
o Using Development mode in microservices
o Using various quarkus extensions 
o Using Panache ORM
o Connecting and sending messages to Kafka service
o Unifying Imperative and Reactive Programming
o Packaging a quarkus application
o Deploying to Docker and Kubernetes
* About the trainer 
o Picture
o Profile (linkedin, etc)
* Everyone to introduce themselves
o Tell us your name
o Tell us your experience with Java/C# or Python (or any other programming languages)
o What’s the nicest project you’ve gotten involved in, and your contribution 
o What are your expectations of the course
o Tell us a joke 


Day 01

* Objectives of this lesson
o Java roadmap
o JavaEE roadmap
o MicroProfile and different flavours  
o Setting up development environment 
* Java Editions
o JavaSE (Java Standard Edition)
o JavaEE (Java Enterprise Edition)
o JavaME (Java Micro Edition)
o JavaFX (Java Form Follows Functions)
* Java History and versions
o JDK 1.0 (Oak)- January 1996
o JDK 1.1 — February 1997
o J2SE 1.2 (Playground) — December 1998
o J2SE 1.3 (Kestrel) — May 2000
o J2SE 1.4 (Merlin) — February 2002
o J2SE 5.0 (Tiger) — September 2004
o Java SE 6 (Mustang) — December 2006
o Java SE 7 (Dolphin) — July 2011
o Java SE 8 — March 2014
o Java SE 9 — September, 21st 2017
o Java SE 10 — March, 20th 2018
o Java SE 11 — September, 25th 2018
o Java SE 12 — March, 19th 2019
o Java SE 13 — September, 17th 2019
o Java SE 14 — March, 17th 2020
o Java SE 15 — September, 15th 2020
o Java SE 16 — March, 16th 2021
o Java SE 17 — September, 14th 2021
o Java SE 18 — March, 22nd 2022
o Java SE 19 – September 2022
* Time based version-string scheme
o Starting from Java 10, Oracle has adapted time based version-string scheme. 
o The new time-based releases will not be delayed and features will be released every six months, with no constraints on what features can go out in the releases.
o The updates releases will occur every quarter
* The new format of the version number is:
o $FEATURE.$INTERIM.$UPDATE.$PATCH

Counter Name    Description$FEATURE    It will be incremented every 6 months and based on feature release versions e.g: JDK 10, JDK 11. (Formerly $MAJOR.)
$INTERIMUsually this will be zero, as there will be no interim release in a six month period. It will be incremented for non-feature releases that contain compatible bug fixes and enhancements but no incompatible changes, no feature removals, and no changes to standard APIs. (Formerly $MINOR.)$UPDATEIt will be incremented for compatible update releases that fix security issues, regressions, and bugs in newer features. (Formerly $SECURITY.)$PATCHIt will be incremented only when it’s necessary to produce an emergency release to fix a critical issue.
* Example of a java version reader 
o % java -version
* openjdk version “11.0.16.1” 
* version: 11
* interim: 0 
* update: 16
* patch: 1
* Java EE Platform
o Web Application Technologies (WebSocket, JSON, Servlet, JSF, JSP, EL)
o Enterprise Application Technologies (Concurrency, CDI, Bean Validation, EJB, Interceptors, JMS, Java Transaction API)
o Web Services Technologies (RESTful Web Services, Enterprise Web Services, XML-Based Web Service, Web Services Metadata, XML-Based RPC, XML Messaging)
o Management and Security Technologies (JASP, Java Authorization Contract, Application Deployment, J2EE Management, Debugging Support)
o Java EE-related Specs in Java SE (Java Architecture for XML Binding, Java API for XML Processing, Java Database Connectivity,  Java Management Extensions, JavaBeans Activation Framework, Streaming API for XML)

Java EE 8 — 2017-08 
Jakarta EE 8 — 2019-09 
Jakarta EE 9 — 2020-12 
Jakarta EE 9.1 — 2021-05
Jakarta EE 10 – September 2022


JAKARTA EE 10 - FEATURES AND BENEFITS
Jakarta EE 10 is packed with new features for building modernized, simplified, and lightweight cloud native Java applications. This new innovative community-driven release is designed for organizations looking to start developing new enterprise Java applications or advancing their existing ones.


JarkataEE Specifications:
* Jakarta Activation
* Jakarta Annotations
* Jakarta Authentication
* Jakarta Authorization
* Jakarta Batch
* Jakarta Bean Validation
* Jakarta Concurrency
* Jakarta Config
* Jakarta Connectors
* Jakarta Contexts and Dependency Injection
* Jakarta Data
* Jakarta Debugging Support for Other Languages
* Jakarta Dependency Injection
* Jakarta Deployment
* Jakarta Enterprise Beans
* Jakarta Enterprise Web Services
* Jakarta Expression Language
* Jakarta Faces
* Jakarta Interceptors
* Jakarta JSON Binding
* Jakarta JSON Processing* Jakarta Mail
* Jakarta Managed Beans
* Jakarta Management
* Jakarta Messaging
* Jakarta MVC
* Jakarta NoSQL
* Jakarta Persistence
* Jakarta RESTful Web Services
* Jakarta RPC
* Jakarta Security
* Jakarta Server Pages
* Jakarta Servlet
* Jakarta SOAP with Attachments
* Jakarta Standard Tag Library
* Jakarta Transactions
* Jakarta Web Services Metadata
* Jakarta WebSocket
* Jakarta XML Binding
* Jakarta XML Registries
* Jakarta XML RPC
* Jakarta XML Web Services Specification
* JarkataEE Profiles 
o Web vs Full Profile vs MicroProfile


* MicroProfile	
* What is a microprofile:
* MicroProfile is a community-driven specification designed to provide a baseline platform definition that optimizes the Enterprise Java for microservices architecture and delivers application portability across multiple MicroProfile runtimes, including Open Liberty. It gives Java developers a platform to collaborate and innovate on areas of common interest. The MicroProfile specification consists of a collection of Enterprise Java APIs and technologies that together form a core baseline for microservices that aims to deliver application portability across multiple runtimes.
* MicroProfile was created in 2016 and, shortly after version 1.0 was released, it became part of the Eclipse Foundation to ensure that it would remain vendor-neutral
* The main goal is to keep up with changes in the industry an optimize the existing platform for a microservice architecture.
* Eclipse MicroProfile currently contains twelve specifications.
* All specifications are vendor-agnostic and the implementation is shipped with the application server.
* MicroProfile offers vendor-neutral cloud-native APIs that can be freely used and can be integrated with many other cloud-native technologies and tools.
* It also includes eight MicroProfile specifications:
* Rest Client 2.0
* Open API 2.0
* Fault Tolerance 3.0
* JWT 1.2
* Config 2.0
* Open Tracing 2.0
* Health 3.0
* Metrics 3.0



* MicroProfile flavas
* MicroProfile architecture	Details
* Payara Micro - is a lightweight middleware platform for containerized Jakarta EE application deployments that requires no installation, configuration, or code rewrites for quick deployments
* WildFly - Is a lightweight, modular microservice framework that is centralized, simple, and user-focused and implements the latest in enterprise Java standards from Jakarta EE and Eclipse MicroProfile
* Quarkus - A Kubernetes Native Java stack built for GraalVM and OpenJDK HotSpot, crafted from the best of breed Java libraries and standards.
* Apache TomEE - This is the Apache Tomcat Java Enterprise Edition which combines several Java enterprise projects which include Apache OpenEJB, Apache OpenJPA, Apache OpenWebBeans, Apache MyFaces and many others
* Hammock - This is a bootstrapping CDI-based Java Enterprise MicroServices framework used for building applications due to its flexibility and simplicity.
* Open Liberty - Is an Open source lightweight Java EE microservice framework used to build fast and efficient cloud-native Java microservice applications which runs only the needed services while considering the latest Eclipse MicroProfile standards
* Helidon - This is a collection of Java libraries used for writing Java microservices which run on a fast Helidon Reactive WebServer, a web core powered by Netty, while supporting MicroProfile and its standard specifications
* KumuluzEE - is a lightweight framework utilized for developing microservices using standard Java/JavaEE/JakartaEE/EE4J technologies and APIs with optional extensions, such as with Node.js, Go, and other languages, and migrating existing applications to cloud-native architecture and microservices for easier cloud-native microservices development
* Fujitsu_Global Launcher - It was developed by Fujitsu, and is a Java EE microservice framework supporting certain MicroProfile specifications and can bundle the application into über-jar / fat files (JAR files with all its needed dependencies)
* ThornTail (Outdated) - Is a Java Enterprise microservices framework that bundles only needed and specified packages into a JAR file with enough runtime to run them

* Summary of the exercises
* Ensuring that the development environment has been setup for the tutorials
* Ensuring IntelliJ has been setup and all relevant plugins have been installed and setup 
* Using Microprofile to define, create and download a microservice project


Practice I: Checking the setup of the environment

* Checking the java environment
* Click on Start. Type CMD and open Command Prompt program
* Type: java -version 
* Type: javac -version 
* Type: echo %JAVA_HOME% 
* Type: mvn -version
* Type: echo %MAVEN_HOME% 
* Type: curl --version
* Type: echo %CURL_HOME% 
* Type: docker version
* Type: docker compose version



NOTE: Refer to Annexure for setting up the environment variables if not set. 

* Open IntelliJ IDE 
* Check the default java version 
* Check the default maven version 
* Add the following plugins:
* JPA Buddy
* Ant 
* Gradle 
* Maven
* JakartaEE 
* Quarkus
* Install Postman or any other preferred  cURL tools 

Exercise II: Create a new project using Microprofile.io

* Head over to the https://start.microprofile.io/index.xhtml website using your browser.

* It will appear as shown in the image below:

* You will see some options in it such as the groupId, artifactId,MicroProfile Version, Java SE Version, Build Tool (i.e., Maven and Gradle), MicroProfile Runtime, and Examples for Specifications.

* Once these are set, you will be able to download the zipped project. Then, unzip it to get the project as you would expect.
* Set the following:
o groupId: starter
o MicroProfile Version: MP 3.2
o Build Tool: Maven
o MicroProfile Runtime: Quarkus
o artifactId: za.co.bmw.workshop.starter
o Java SE Version: Java 11
o Examples for specifications: select all

* Click on the ‘Download’ button to download.

* We suggest that you create folder which will be your working folder. For the sake of the workshop, we will name our folder bmwworkshop

* Move the zip file you have just downloaded to your working folder. Open the project you have just downloaded, compile, and run a new project.

As you will notice, the project has two separate microservices; ‘service-a’ and ‘service-b’.
* service-a: These include the client, config, health, metric, openapi, resilient, and secure folders. 
* service-b: it has the client and secure folders only.

Open CMD terminal and navigate to the root of the downloaded project. 
$ cd za.co.bmw.workshop.starter 
$ cd service-a 
$ mvn.cmd package
$ mvn.cmd compile quarkus:dev


NOTE: A permission pop-up may appear, based on your laptop firewall settings, so allow the allow permission button. 

Open a browser and go to the URL: http://localhost:8080/ 




Click around the page to explore the Hello World application created by default. 
* MicroProfile
* Config
* Fault tolerance
* Health
* Metrics
* JWT Auth
* Open API
* Rest Client

* Once finished navigating the application, close the running application on the terminal by using (Ctlr + X) or (Ctlr + C) on your keyboard to shut down the application that has been started. 

* To run the application on a live environment, copy the packaged jar (za.co.bmw.workshop.starter-runner.jar) file and distribute it. In order to run the application independently. Ensure that you’re in service\target folder to run the application from the jar file. Follow these commands below: 

$ cd service-a\target\
$ java -jar za.co.bmw.workshop.starter-runner.jar



* Click the following link to see the application running from the jar file. http://localhost:8080
* Click on the app to navigate the app. 
* MicroProfile
* Config
* Fault tolerance
* Health
* Metrics
* JWT Auth
* Open API
* Rest Client

* If there are lingering ports that have not been closed. To stop the dev and debug processes that linger in the background, run the following commands:  
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number 
$ netstat -ano | findStr "5005"
$ taskkill /F /PID pid_number




* Using an editing tool, edit the pom.xml for service-a and add the openapi dependency in the pom.xml file: 

    <dependency>
      <groupId>org.webjars</groupId>
      <artifactId>swagger-ui</artifactId>
      <version>3.17.4</version>
    </dependency>

TIP: Find the dependencies tags in the pom.xml, and ensure you add the openapi on the correct tag. 
 
* Make sure you’re in the correct folder (service-a).

$ cd service-a

* Recompile the application to include the open api dependency just added on the steps above: 

$ mvn.cmd clean compile 

NOTE: Make note of the package files for openapi being downloaded, to be included as part of the project.
$ mvn package

* Run the application that you have just packaged

$ java -jar target\za.co.bmw.workshop.starter-runner.jar



* Open another CMD and run the following command 
$ curl http://localhost:8080/openapi



* Once finished navigating the application, close the running application on the terminal by using (Ctlr + X) or (Ctlr + C) on your keyboard to shut down the application that has been started. 


* If there are lingering ports that have not been closed. To stop the dev and debug processes that linger in the background, run the following commands:  
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number 
$ netstat -ano | findStr "5005"
$ taskkill /F /PID pid_number


Lesson 2

Objectives of this lesson
* What is a microservice
* JavaEE roadmap
* MicroProfile and different flavours  
* Setting up development environment 

What is Microservices
* Microservices are an architectural approach to develop modern software. Each core function, or service, represents a related business context which is built and deployed independently. 
* Microservices provide agility in building and maintaining applications and represent a contrast to the monolithic approach followed in legacy software development. 
* Application modernization today is synonymous with Microservices.
*  Like any good math problem, we need to begin by defining our variables. To put it succinctly, Microservices.io define microservices as "an architectural style that structures an application as a collection of services."
* They go on to list some of the characteristics those services need to include. For something to qualify as a microservice it must:
o Loosely coupled
o Independently deployable
o Testable and maintainable
o Organized by business capability
o Run by a small team


Benefits of Microservices
* Simplified deployment
o Accelerate time to market for new features by enabling continuous integration and continuous deployment supporting blue-green deployment models for services.
* Scale Performance on demand
o Scale services containers or data platform independently per service to meet the demand of that feature.
* Highly available by design
o Replace or retire independent services without impacting the entire application, individual service failures are gracefully handled by degrading service, rather than crashing the entire application


Differences Between Microservices and Monolithic Architectures

* Application design focuses on solving business requirements and implementing business logic. 
* In a monolithic architecture, the entire application is built as a single unit that contains all the business logic. 
* In the microservices architecture, the business logic is organized as multiple loosely coupled services.



Microservices Application and Database Relationship
* The microservices architecture pattern significantly changes the relationship between the application and the database. 
* Instead of sharing a single database with other services, we recommend that each service have its own database that best fits its requirements. 
* When you have one database for each service, you ensure loose coupling between services because all requests for data go through the service API and not through the shared database directly.


 

* The following table summarizes the differences between the microservices and monolithic architectures.
CharacteristicMicroservices ArchitectureMonolithic ArchitectureUnit designThe application consists of loosely coupled services. Each service supports a single business task.The entire application is designed, developed, and deployed as a single unit.Functionality reuseMicroservices define APIs that expose their functionality to any client. The clients could even be other applications.The opportunity for reusing functionality across applications is limited.Communication within the applicationTo communicate with each other, the microservices of an application use the request-response communication model. The typical implementation uses REST API calls based on the HTTP protocol.Internal procedures (function calls) facilitate communication between the components of the application. There is no need to limit the number of internal procedure calls.Technological flexibilityEach microservice can be developed using a programming language and framework that best suits the problem that the microservice is designed to solve.Usually, the entire application is written in a single programming language.Data managementDecentralized: Each microservice may use its own database.Centralized: The entire application uses one or more databases.DeploymentEach microservice is deployed independently, without affecting the other microservices in the application.Any change, however small, requires redeploying and restarting the entire application.MaintainabilityMicroservices are simple, focused, and independent. So the application is easier to maintain.As the application scope increases, maintaining the code becomes more complex.ResiliencyThe application functionality is distributed across multiple services. If a microservice fails, the functionality offered by the other microservices continues to be available.A failure in any component could affect the availability of the entire application.ScalabilityEach microservice can be scaled independently of the other services.The entire application must be scaled, even when the business requirement is for scaling only certain parts of the application.

* Advantages and Disadvantages of Microservices

Advantages of Microservices
* Microservices are self-contained, independent deployment module.
* The cost of scaling is comparatively less than the monolithic architecture.
* Microservices are independently manageable services. It can enable more and more services as the need arises. It minimizes the impact on existing service.
* It is possible to change or upgrade each service individually rather than upgrading in the entire application.
* Microservices allows us to develop an application which is organic (an application which latterly upgrades by adding more functions or modules) in nature.
* It enables event streaming technology to enable easy integration in comparison to heavyweight interposes communication.
* Microservices follows the single responsibility principle.
* The demanding service can be deployed on multiple servers to enhance performance.
* Less dependency and easy to test.
* Dynamic scaling.
* Faster release cycle.

Disadvantages of Microservices
* Microservices has all the associated complexities of the distributed system.
* There is a higher chance of failure during communication between different services.
* Difficult to manage a large number of services.
* The developer needs to solve the problem, such as network latency and load balancing.
* Complex testing over a distributed environment.


* Why the move to microservices
* Creating a cloud-native architecture has become more accessible in the recent past; however, challenges remain, especially for Java developers. 
* Serverless functions and microservices need faster start-up times, consume less memory, and above all offer developer joy. 
* Java, in that regard, has just in recent years done some improvements (e.g., ergonomics enhancements for containers, etc.). 
* However, to have a performing container-native Java, it hasn't been easy.

* inherent issues for developing container-native Java applications.
* Threads and containers - The sizing of an application depends on the number of concurrent requests rather than the number of available cores; this also means quota or limits in Kubernetes on the number of cores will not be of great help and eventually will result in throttling.
* Memory exhaustion - Threads also cost memory. Spreading that over multiple applications and threading to a large extent will cause more switching and, in some cases, performance degradation. 
* Quotas and limits - if the application uses more than the quota again, we end up with sizing based on cores, which in the case of traditional Java applications, using one thread per request, is not helpful at all.

* How do we fix these inherent container-native issues
* A straightforward solution to these problems would be to use asynchronous and non-blocking IO libraries and frameworks like Netty, Vert.x, or Akka. 
* They are more useful in containers due to their reactive nature. 
* By embracing non-blocking IO, the same thread can handle multiple concurrent requests. 
* While a request processing is waiting for some IO, the thread is released and so can be used to handle another request. 
* When the IO response required by the first request is finally received, processing of the first request can continue. 
* Interleaving request processing using the same thread reduces the number of threads drastically and also resources to handle the load.
* With non-blocking IO, the number of cores becomes the essential setting as it defines the number of IO threads you can run in parallel. Used properly, it efficient dispatches the load on the different cores, handling more with fewer resources.


* Quarkus Microservices
* Quarkus is a full-stack, Kubernetes-native Java framework made for Java virtual machines (JVMs) and native compilation.
* When developing microservices architecture, there are some new challenges that need to be addressed such as scalability, security, and observability.
* Microservices provides a list of cross-cutting concerns to correctly implement microservices.
* Kubernetes is a good start to implement these microservices but there are some gaps.
* MicroProfile is a specification to implement cross-cutting concerns using the Java programming language.
* Authentication among internal services may be achieved by using tokens 

* Quarkus Architecture
* Quarkus unifies both imperative and reactive programming models and its reactive core.
* Imperative programming is a software development paradigm where functions are implicitly coded in every step required to solve a problem. In imperative programming, every operation is coded and the code itself specifies how the problem is to be solved, which means that pre-coded models are not called on.
* Reactive programming describes a design paradigm that relies on asynchronous programming logic to handle real-time updates to otherwise static content. It provides an efficient means -- the use of automated data streams -- to handle data updates to content whenever a user makes an inquiry.
* You can implement reactive components and imperative components then combine them inside the very same application. No need to use different stacks, tooling or APIs; Quarkus bridges both worlds.
* Quarkus uses Vert.x and Netty at its core. And, it uses a bunch of reactive frameworks and extensions on top to help developers. Quarkus is not just for HTTP microservices, but also for event-driven architecture. Its reactive nature makes it very efficient when dealing with messages (e.g., Apache Kafka or AMQP).


* The Reactive Manifesto characterizes Reactive Systems as distributed systems having four characteristics:
* Responsive - they must respond in a timely fashion
* Elastic - they adapt themselves to the fluctuating load
* Resilient - they handle failures gracefully
* Asynchronous message passing - the component of a reactive system interact using messages

* Quarkus enable Reactive?
* Under the hood, Quarkus has a reactive engine. This engine, powered by Eclipse Vert.x and Netty, handles the non-blocking I/O interactions.
* Quarkus extensions and the application code can use this engine to orchestrate I/O interactions, interact with databases, send and receive messages, and so on.
* Resources, such as CPU and memory, are shared among multiple applications. 
* Greedy applications that consume lots of memory are inefficient and put penalties on sibling applications. 
* Quarkus uses non-blocking I/O, which allows a low number of OS threads to manage many concurrent I/Os. 
* Quarkus applications allow for higher concurrency, use less memory, and improve the deployment density.






* Traditional Application 

* Traditional applications use blocking I/O and an imperative (sequential) execution model.
* To handle concurrent requests, you need multiple threads, so, you need to introduce a worker thread pool. 
* The size of this pool constrains the concurrency of the application. 
* In addition, each thread has a cost in terms of memory and CPU. 
* Large thread pools result in greedy applications.




* Using scheduled IO blocks 
* A few threads can handle many concurrent I/O.
* When the request processing needs to call a remote service, you can’t block the thread anymore. 
* You schedule the I/O and pass a continuation, i.e., the code to execute once the I/O completes.


\


* Writing Reactive Code

* The two main ways to write reactive code with Quarkus are:
* Reactive Programming with Mutiny, and
* Coroutines with Kotlin

* First, Mutiny is an intuitive, event-driven reactive programming library. With Mutiny, you write event-driven code. 
* Your code is a pipeline receiving events and processing them. 
* Each stage in your pipeline can be seen as a continuation, as Mutiny invokes them when the upstream part of the pipeline emits an event.


* Summary of the exercises
* Creating a project using quarkus.io 
* Using IntelliJ to compile the downloaded quarkus project 
* Observing pom.xml file that makes up the quarkus project
* Starting up the application in dev profile 
* Test the application by running the default hello end point
* View and update the Test classes for the end points
* Adding more end points to the Resource class
* Using CDI to inject Service classes to Resource class 


Practice 2: Create a new project using Quarkus.io
Head over to the https://code.quarkus.io/ website using your browser.
* Group: za.co.bmw.workshop.day.one
* artifactId: bmw-workshop-day-one
* Build Tool: Maven
* Version: 1.0.0-SNAPSHOT
* Java SE Version: Java 11
* Starter Code: Yes
* In the origin: platform search for and select: RESTEasy Reactive


* Then click the Generate Your Application button

* Then click the Download The Zip button 

* Move the zip file you have just downloaded to your working folder. Extract the zip file you have just downloaded, then move it to your working directory (bmwworkshop)

* Open the project using IntelliJ IDEA

* Open the pom.xml file and note the dependencies:

* quarkus-resteasy-reactive
* quarkus-arc
* quarkus-junit5
* rest-assured



<dependencies>
  <dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-resteasy-reactive</artifactId>
  </dependency>
  <dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-arc</artifactId>
  </dependency>
  <dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-junit5</artifactId>
    <scope>test</scope>
  </dependency>
  <dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <scope>test</scope>
  </dependency>
</dependencies>


Part I: Using the default hello end point

* Open the GreetingResource file from the src/main/java/za/co/bmw/workshop directory. 
* Open Terminal at the bottom of IntelliJ 


* Start up the development environment, type the following command:
$ mvnw.cmd  compile
$ mvnw.cmd  quarkus:dev



* Then look up on the rest URL using curl on Terminal, to demonstrate the results using both the terminal and the browser.  

1. Open the browser to view the api results on the application using the following URL:  http://localhost:8080/hello  



2. Open Command Prompt (cmd) to run curl and view the API results 
$ curl http://localhost:8080/hello


Navigate the rest of the application to see what functions have been activated on this application.

http://localhost:8080/
* Reactive Restful Services
* DevUI (we’ll discuss later) 
* Selected extensions


* Now that you have seen the default behaviour of the application you have just deployed. 
* Open the GreetingResource file from the src/main/java/za/co/bmw/workshop directory. 
* Change the return statement with your own custom message. 


@GET
@Produces(MediaType.TEXT_PLAIN)
public String hello() {
    return "Excited about writing my first Quakus Microservice App!";
}


* Restart the development environment to test out the changes that you have just made:

$ mvnw.cmd  compile quarkus:dev

* Make note of some Errors coming up, throwing AssertionErrors on the logs.  



TIP: The reason for this AssertionError is because the @Test class was not updated, so it is expecting the old output. Navigate to the file to see the expected output.  


* To fix the AssetionErrors that have come up. Open the GreetingResourceTest file from the src/test/java/za/co/bmw/workshop directory.
* Look at the method with @Test and review the expected body output 
* Update the output of the testHelloEndpoint method by changing the. body() with the custom message on the steps you changed above.


@Test
public void testHelloEndpoint() {
    given()
      .when().get("/first")
      .then()
         .statusCode(200)
         .body(is("Excited about writing my first Quakus Microservice App!"));
}



* Restart the development environment to test out the changes that you have just made:

$ mvnw.cmd  compile quarkus:dev



Test the changes you have made either by using the browser or using curl
1. Open the browser to view the api results on the application using the following URL:  http://localhost:8080/hello  

2. Open Command Prompt (cmd) to run curl and view the API results 
$ curl http://localhost:8080/hello


Part II: Adding more restful service end points to the project

* Right click on the za.co.bmw.workshop.day.one and click on Class to add a new class to the project. The new class will be named GreetingService, with the following code: 
o Right Click (on the package)
o New -> Java Class



* Class Name: GreetingService


package za.co.bmw.workshop.day.one;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "hello " + name;
    }
}


* Go back to the GreetingResource file to make use the service you have built on the step above: 
o Inject the GreetingService
o Create an extra end point to make use of the greeting service

Below is the code snippets:


@Inject
GreetingService service;

Then import the javax.inject.Inject file in the class


@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/greeting/{name}")
public String greetingWithName(String name) {
    return service.greeting(name);
}


So, the GreetingResource file will look like this in full: 


package za.co.bmw.workshop.day.one;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService service;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Excited about writting my first Quakus Microservice App!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greetingWithName(String name) {
        return service.greeting(name);
    }

}


* As shown in the Part 1, we have to update the @Test class in order for our  


@Test
public void testGreetingEndpoint() {
    String uuid = UUID.randomUUID().toString();
    given()
            .pathParam("name", uuid)
            .when().get("/hello/greeting/{name}")
            .then()
            .statusCode(200)
            .body(is("hello " + uuid));
}

* If the dev machine is running, press r on the keyboard to re-run the test. Be careful to check the logs for any errors, if there are errors. Follow the next steps
$ mvnw.cmd  clean
$ mvnw.cmd  compile quarkus:dev

* If the dev machine is not running, switch it on by running the following command
$ mvnw.cmd  compile quarkus:dev


* Test the changes you have made either by using the browser or using curl
1. Open the browser to view the api results on the application using the following URL:  http://localhost:8080/hello/greeting/thato.mohono   

2. Open Command Prompt (cmd) to run curl and view the API results 
$ curl http://localhost:8080/hello/greeting/thato.mohono 

* Once finished navigating the application, close the running application on the terminal by using (Ctlr + X) or (Ctlr + C) on your keyboard to shut down the application that has been started. 

* If there are lingering ports that have not been closed. To stop the dev and debug processes that linger in the background, run the following commands:  
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number 
$ netstat -ano | findStr "5005"
$ taskkill /F /PID pid_number

* Create a package of the application for distribution purposes
$ mvnw.cmd  clean
$ mvnw.cmd  compile
$ mvnw.cmd  package

* Then look for the packaged file in the target folder target
o Filename: bmw-workshop-day-one-1.0.0-SNAPSHOT.jar


Lesson 3

* Objectives:
* Using defined configuration from the application.properties file 
* Quarkus applications to read configurations from the properties file 
* Using injections to get configurations 

* By default, Quarkus reads configuration properties from multiple sources (by descending ordinal):
* (400) System properties
* (300) Environment variables
* (295) .env file in the current working directory
* (260) Quarkus Application configuration file in $PWD/config/application.properties
* (250) Quarkus Application configuration file application.properties in classpath
* (100) MicroProfile Config configuration file META-INF/microprofile-config.properties in classpath

* The final configuration is the aggregation of the properties defined by all these sources. A configuration property lookup starts by the highest ordinal configuration source available and works it way down to other sources until a match is found.

* This means that any configuration property may override a value just by setting a different value in a higher ordinal config source. For example, a property configured using an environment property overrides the value provided using the application.properties file.


* System properties
System properties can be handed to the application through the -D flag during startup. The following examples assign the value youshallnotpass to the attribute quarkus.datasource.password.
* For Quarkus dev mode: ./mvnw quarkus:dev -Dquarkus.datasource.password=youshallnotpass
* For a runner jar: java -Dquarkus.datasource.password=youshallnotpass -jar target/quarkus-app/quarkus-run.jar
* For a native executable: ./target/myapp-runner -Dquarkus.datasource.password=youshallnotpass


* Environment variables
* For a runner jar: export QUARKUS_DATASOURCE_PASSWORD=youshallnotpass ; java -jar target/quarkus-app/quarkus-run.jar
* For a native executable: export QUARKUS_DATASOURCE_PASSWORD=youshallnotpass ; ./target/myapp-runner


* .env file in the current working directory
* .env: 

QUARKUS_DATASOURCE_PASSWORD=youshallnotpass


* Quarkus Application configuration file
* The Quarkus Application configuration file is loaded from the classpath resources, for instance src/main/resources/application.properties, src/test/resources/application.properties or from a jar dependency that contains an application.properties entry.

* application.properties: 

greeting.message=hello 
quarkus.http.port=9090



* MicroProfile Config configuration file
* Quarkus uses MicroProfile Config annotations to inject the configuration properties in the application.

* microprofile-config.properties

greeting.message=hello 
quarkus.http.port=9090


* Inject
* The MicroProfile Config configuration file in src/main/resources/META-INF/microprofile-config.properties.

@ConfigProperty(name = "greeting.message") 
String message;

You can use @Inject @ConfigProperty or just @ConfigProperty. The @Inject annotation is not necessary for members annotated with @ConfigProperty.

* Default Values
* If a property is associated with a default value (by way of the defaultValue attribute), and no configuration value is supplied for the property, then rather than throwing a javax.enterprise.inject.spi.DeploymentException, the default value will be used. The defaultValue value is expressed as a String, and uses the same conversion mechanism used to process configuration values.

@ConfigProperty(name = "greeting.suffix", defaultValue="Thato") 
String suffix;



* Programmatically access
* The org.eclipse.microprofile.config.ConfigProvider.getConfig() API allows to access the Config API programmatically. This API is mostly useful in situations where CDI injection is not available.

String databaseName = ConfigProvider.getConfig().getValue("database.name", String.class);
Optional<String> maybeDatabaseName = ConfigProvider.getConfig().getOptionalValue("database.name", String.class);

You can use @Inject @ConfigProperty or just @ConfigProperty. The @Inject annotation is not necessary for members annotated with @ConfigProperty.



* Profiles
* We often need to configure differently our application depending on the target environment. For example, the local development environment may be different from the production environment.

* Configuration Profiles allow for multiple configurations in the same file or separate files and select between them via a profile name.

* Profile in the property name

* To be able to set properties with the same name, each property needs to be prefixed with a percentage sign % followed by the profile name and a dot . in the syntax %{profile-name}.config.name:

* microprofile-config.properties
quarkus.http.port=9090
%dev.quarkus.http.port=8181

* .env
QUARKUS_HTTP_PORT=9090
_DEV_QUARKUS_HTTP_PORT=8181

* application.properties
developer.first_name=Thato
developer.surname=Mohono
developer.favorite_language=Java
developer.specialization=Architect


* Application gets configuration variables from various 
* Using various properties and configuration properties 
* Configuration options enable you to change the settings of your application in a single configuration file. 
* Quarkus supports configuration profiles that let you group related properties and switch between profiles as required.
* By default, Quarkus reads properties from the application.properties file located in the src/main/resources directory.
* Quarkus can also read application properties from different sources, such as the file system, database, or any source that can be loaded by a Java application.
* You can access the configuration through context and dependency injection (CDI) or by using a method defined in your code.
* Add configuration properties to your configuration file where <KEY> is the property name and <VALUE> is the value of the property
     <KEY>=<VALUE>


* The options for injecting values to the applications are:
* application.properties file
* Annotating a class with @ConfigProperties
* Using nested object configuration
* Annotating an interface with @ConfigProperties


* Summary of the exercises
* Part I: Update the properties file by updating port numbers on command line
* Part II: Update the properties file by updating port numbers for different profiles
* Part III: Update the properties file by using configuration variables, using ConfigProperty
* Part IV: Update the properties file and using @ConfigMapping
* Part V: Reading configurations from an external JSON file 


Practice 3: Using the properties and configuration properties

Part I: Update the properties file by updating port numbers on command line

* Ensure that the development server is not running by running the following commands:

* Stop the dev and debug server 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* From IntelliJ, open Terminal and run the following command:
$ mvn compile quarkus:dev -Dquarkus.http.port=9090

* Go to the following URL to see the updated port numbers using the following URL:  
http://localhost:9090/hello
http://localhost:9090/hello/greeting/thato


Part II: Update the properties file by updating port numbers for different profiles

* Ensure that the development server is not running by running the following commands:

* Stop the dev and debug server 
$ netstat -ano | findStr "8080"
$ kill <PID>

* Use the application.properties file to add some configuration values to the application 
* Open the application.properties file 
* Add the following line of codes to the properties file


quarkus.http.port=8088
%dev.quarkus.http.port=8180
%test.quarkus.http.port=8280


o If the dev machine is not running, switch it on by running the following command
$ mvnw.cmd compile quarkus:dev

* Go to the following URL to see the updated port numbers using the following URL:  
http://localhost:8180/hello
http://localhost:8180/hello/greeting/thato

* Use command prompt to run a test to see the updated code changes
$ curl http://localhost:8180/hello
$ curl http://localhost:8180/hello/greeting/thato


Part III: Update the properties file by using configuration variables

* Go back to the GreetingResource class to make use of the configuration variable defined in the class: 
o Define the @ConfigProperties by using class variables
o Call those defined variables in a method

Below is the code snippets:

@ConfigProperty (name = "bmw.training.course")
String course;

@ConfigProperty(name = "bmw.training.subject", defaultValue="Microservices")
String subject;

@ConfigProperty(name = "bmw.training.trainer")
Optional<String> trainer;


Import the following classes:


import org.eclipse.microprofile.config.inject.ConfigProperty;
import java.util.Optional;



And the method that will use the config variables defined above:


@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/course-details")
public String aboutTraining() {
    return course + " class done by  " +
            trainer.orElse("Oracle Guy") +
            ", the best parts are " + subject;
}


* And below is the full class definition.


package za.co.bmw.workshop.day.one;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty (name = "bmw.training.course")
    String course;

    @ConfigProperty(name = "bmw.training.subject", defaultValue="Microservices")
    String subject;

    @ConfigProperty(name = "bmw.training.trainer")
    Optional<String> trainer;


    @Inject
    GreetingService service;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Excited about writting my first Quakus Microservice App!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greetingWithName(String name) {
        return service.greeting(name);
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/course-details")
    public String aboutTraining() {
        return course + " class done by  " +
                trainer.orElse("Oracle Guy") +
                ", the best parts are " + subject;
    }
}



* Add the configuration details in the application.properties file to reference from the GreetingResource class file
* Open the application.properties file 
* Add the following line of codes to the properties file


bmw.training.course=java
bmw.training.trainer=thato-mohono
bmw.training.subject=quarkus-microservices


* Go to the following URL to see the updated port numbers using the following URL:  
http://localhost:8180/hello/course-details

* Use command prompt to run a test to see the updated code changes
$ curl http://localhost:8180/hello/course-details



Part IV: Update the properties file and using @ConfigMapping

* Mapping the configuration to interfaces and Classes 
* Open the application.properties file 
* Add the following line of codes to the properties file


bmwtraining.date=31 November 2022
bmwtraining.starttime= 09:00
bmwtraining.endtime = 16:00
bmwtraining.location = Menlo Park
bmwtraining.log.enabled = true
bmwtraining.log.suffix = .log
bmwtraining.log.rotate = false


* Create a new interface (TrainingDetails) that we will use to pull data from the application.properties file


package za.co.bmw.workshop.day.one;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "bmwtraining")
public interface TrainingDetails {
    String date();
    String starttime();
    String endtime();
    String location();
    Log log();

    interface Log {
        boolean enabled();

        String suffix();

        boolean rotate();
    }
}


* Go back to the GreetingResource class to make use of the configuration variables defined in the Interface: 
o Define the @ConfigProperties by using class variables
o Call those defined variables in a method

Below is the code snippets:

@Inject TrainingDetails details;


And the method that will use the config variables defined above:


@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/more-details")
public String trainingInterface() {
    return "Workshop is running at " + details.location() +
            " start date is " + details.date() +
            " start time is  " + details.starttime() +
            " projected end time is " + details.endtime();
}



* And below is the full class definition.


package za.co.bmw.workshop.day.one;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty (name = "bmw.training.course")
    String course;

    @ConfigProperty(name = "bmw.training.subject", defaultValue="Microservices")
    String subject;

    @ConfigProperty(name = "bmw.training.trainer")
    Optional<String> trainer;


    @Inject
    GreetingService service;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Excited about writting my first Quakus Microservice App!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greetingWithName(String name) {
        return service.greeting(name);
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/course-details")
    public String aboutTraining() {
        return course + " class done by  " +
                trainer.orElse("Oracle Guy") +
                ", the best parts are " + subject;
    }

    @Inject TrainingDetails details;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/more-details")
    public String trainingInterface() {
        return "Workshop is running at " + details.location() +
                " start date is " + details.date() +
                " start time is  " + details.starttime() +
                " projected end time is " + details.endtime();
    }

}


* If the dev machine is not running, switch it on by running the following command
$ mvnw.cmd  compile quarkus:dev

* Go to the following URL to see the updated port numbers using the following URL:  
http://localhost:8180/hello/more-details

* Use command prompt to run a test to see the updated code changes
$ curl http://localhost:8180/hello/more-details


Part V: Reading configurations from an external JSON file

* First, we will create a json file in the resource folder, which the application is going to use to read and using restful api services
* Create a coursedetails.json file in the resource folder. Go to src/main/resources, then create a coursedetails.json with the following contents. 


File name: coursedetails.json


{
  "subject": "History of Java",
  "details": "Detailed history and versions of Java. From version 1 to current version 18",
  "estimate duration": "30 mins"
}


* Create a SubjectDetails class in the src/main/java/za/co/bmw/workshop folder to read the JSON file. Use the code below  


package za.co.bmw.workshop.day.one;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class SubjectDetails  {
    public static String readFile() {

        String filePath = Objects.requireNonNull(SubjectDetails.class.getClassLoader().getResource("coursedetails.json")).getPath();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream
                     = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8))
        {
            //Read the content with Stream
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        String fileContent = contentBuilder.toString();
        return fileContent;

    }
}


* Go back to the GreetingResource class to make use of the configuration variables defined in the Interface: 
o Define the @ConfigProperties by using class variables
o Call those defined variables in a method

And the method that will use the config variables defined above:



@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/topics")
public String subjectDetails() {
    return SubjectDetails.readFile();

}


* And below is the full class definition.


package za.co.bmw.workshop.day.one;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty (name = "bmw.training.course")
    String course;

    @ConfigProperty(name = "bmw.training.subject", defaultValue="Microservices")
    String subject;

    @ConfigProperty(name = "bmw.training.trainer")
    Optional<String> trainer;


    @Inject
    GreetingService service;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Excited about writting my first Quakus Microservice App!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greetingWithName(String name) {
        return service.greeting(name);
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
        @Path("/course-details")
    public String aboutTraining() {
        return course + " class done by  " +
                trainer.orElse("Oracle Guy") +
                ", the best parts are " + subject;
    }

    @Inject TrainingDetails details;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/more-details")
    public String trainingInterface() {
        return "Workshop is running at " + details.location() +
                " start date is " + details.date() +
                " start time is  " + details.starttime() +
                " projected end time is " + details.endtime();
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/topics")
    public String subjectDetails() {
        return SubjectDetails.readFile();

    }

}


* If the dev machine is not running, switch it on by running the following command
$ mvnw.cmd  compile quarkus:dev


* Go to the following URL to see the updated port numbers using the following URL:  
http://localhost:8180/hello/topics

* Use command prompt to run a test to see the updated code changes
$ curl http://localhost:8180/hello/topics


Extra Work (self-practice)

* Create a new application with the following details:
o Use Quarkus URL: https://code.quarkus.io/ 
o Group: za.co.bmw.workshop.practice
o Artifact: eCommerce
o Build Tool: Maven
o Java Version: 11
o Dependencies:
* RESTEasy Reactive

* Create an Entity Class with the following details:
o class must be encapsulated; 
* int itemId; 
* String itemDescription;
* double price; 
* int quantity;
o ArrayList<String> chart;
o toString() method;
o setters and getter methods;

* Create an Items Resource Class with the following methods:
o String: purchase(ArrayList items) – return a string literal (for now)
o String: additemToChart(String item) – return a string (for now)
o String: removeItemFromChart(String item) – return a string (for now)
o String: updateItemInChart(String item) – return a string (for now)
o ArrayList: showItemsInChart() – return a string (for now)
o ArrayList: showItemInChart(int number) – return an empty ArrayList(for now)

* Create an Service Class with the following methods:
o ArrayList: showItemsInChart() – return all string literal (for now)
o ArrayList: showItemInChart(String item) – return a string (for now)
o String: addItem (String item) – return a string (for now)
o String: removeItem (String item) – return a string (for now)

* Run the dev server and test your own custom endpoints 



======== END-OF-DAY-01 ========


























































Day 2

* Objectives
* What is and using Bootstrap 
* Using CL to bootstrap a Restful service
* Some commands that are generally used  
* Generating a project using CML 
* Using Entity Bean and Panache to map bean and the database tables
* Using OpenAPI 
* Dependency Injection 
* Using Logging 
* Managing Quarkus lifecycle application
* Quarkus Configuring Profiles


What is Quarkus Bootstrap 

* Bootstrapping Quarkus
o This class is used to resolve all the relevant dependencies (both deployment and runtime) that are needed for the Quarkus application. The end result of this process is a CuratedApplication , which contains all the class loading information for the application.

* Quarkus class loading architecture is a flat class path when running a production application because everything is loaded into the system class loader.

* Bootstrap class in the independent-projects/bootstrap module. For the Quarkus application, this class is used to resolve each and every pertinent dependency, including runtime and deployment requirements. 

* The final product of this process is a CuratedApplication, which includes all of the application’s class loading data.

* The CuratedApplication can then be used to create an AugmentAction instance, which can create production application and start/restart runtime ones. This application instance exists within an isolated ClassLoader, it is not necessary to have any of the Quarkus deployment classes on the class path as the curate process will resolve them for you.

* A ClassLoader is said to be 'transformer safe' if it is safe to load classes in the class loader before the transformers are ready. 

* The CuratedApplication can then be used to create an AugmentAction instance, which can create production application and start/restart runtime ones. This application instance exists within an isolated ClassLoader, it is not necessary to have any of the Quarkus deployment classes on the class path as the curate process will resolve them for you.

* The AugmentAction instance, which has the ability to generate production applications and start/restart runtime ones, may then be created using the CuratedApplication. 
* The CuratedApplication can then be used to create an AugmentAction instance, which can create production application and start/restart runtime ones. This application instance exists within an isolated ClassLoader, it is not necessary to have any of the Quarkus deployment classes on the class path as the curate process will resolve them for you.

* The AugmentAction instance, which has the ability to generate production applications and start/restart runtime ones, may then be created using the CuratedApplication. 


* ClassLoader Implementations

* Quarkus has the following ClassLoaders:
o Base ClassLoader
This is usually the normal JVM System ClassLoader. In some environments such as Maven it may be different. This ClassLoader is used to load the bootstrap classes, and other ClassLoader instances will delegate the loading of JDK classes to it.

o Augment ClassLoader
This loads all the -deployment artifacts and their dependencies, as well as other user dependencies. It does not load the application root or any hot deployed code. This ClassLoader is persistent, even if the application restarts it will remain (which is why it cannot load application classes that may be hot deployed). Its parent is the base ClassLoader, and it is transformer safe.

o Deployment ClassLoader
This can load all application classes. Its parent is the Augment ClassLoader, so it can also load all deployment classes.

o Base Runtime ClassLoader
This loads all the runtime extension dependencies, as well as other user dependencies (note that this may include duplicate copies of classes also loaded by the Augment ClassLoader). It does not load the application root or any hot deployed code. This ClassLoader is persistent, even if the application restarts it will remain (which is why it cannot load application classes that may be hot deployed). Its parent is the base ClassLoader.

o Runtime Class Loader
This ClassLoader is used to load the application classes and other hot deployable resources. Its parent is the base runtime ClassLoader, and it is recreated when the application is restarted.

o Banned Dependencies
There are some dependencies that we can be sure we do not want. This generally happens when a dependency has had a name change (e.g. smallrye-config changing groups from org.smallrye to org.smallrye.config, the javax ? jakarta rename). This can cause problems, as if these artifacts end up in the dependency tree out of date classes can be loaded that are not compatible with Quarkus. To deal with this, extensions can specify artifacts that should never be loaded.

o Configuring Class Loading
It is possible to configure some aspects of class loading in dev and test mode. This can be done using application.properties. Note that class loading config is different to normal config, in that it does not use the standard Quarkus config mechanisms (as it is needed too early), so only supports application.properties. The following options are supported.

* Summary of the exercises
* Part I: Using Command Prompt to create a new project
* Part II: Class loader using Dev UI
* Part III: Using an ArrayList to display random names
* Part IV: Using an Google formatting library to display random names in a JSON format

Practice I: Using Quarkus bootstrap

Part I: Using Command Prompt to create a new project


* Using Quarkus bootstrap to create an app, displaying an ArrayList on a Rest endPoint

* Open CMD and run the following command:

$ mvn io.quarkus:quarkus-maven-plugin:2.9.2.Final:create -DprojectGroupId=za.co.bmw.workshop.day.two -DprojectArtifactId=bmw-workshop-day-two -DclassName""za.co.bmw.workshop.day.two.BMWDeveloperResource"" -Dpath""api/developer"" -Dextensions""resteasy-reactive-jackson""

* Open IntelliJ, and open the bmw-workshop-day-two project that you have just created above:

* Using refractor function from IntelliJ. Rename the GreetingResource class method to DeveloperResource. Rename click on the GreetingResource, Refractor -> Rename. Change the class name to DeveloperResource, click the Refractor button.

* Change the class @Path from /hello to /bmw

* Change the hello() method from the DeveloperResource to helloBMWDeveloper() with the following details


@Path("/bmw")



@GET
@Produces(MediaType.TEXT_PLAIN)
public String helloBMWDeveloper() {
    return "Hello, I am a Developer working at BMW";
}

So, the full class definition will look like below


package za.co.bmw.workshop.day.two;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bmw")
public class DeveloperResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloBMWDeveloper() {
        return "Hello, I am a Developer working at BMW";
    }
}


* Then update the Testing classes as well. Rename the GreetingResourceTest to DeveloperResourceTest, and the testHelloEndpoint to testHelloDeveloperEndpoint with the following contents below. 


package za.co.bmw.workshop.day.two;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class DeveloperResourceTest {

    @Test
    public void testHelloDeveloperEndpoint() {
        given()
          .when().get("/bmw")
          .then()
             .statusCode(200)
             .body(is("Hello, I am a Developer working at BMW"));
    }

}


NOTE: Check out if there are errors in the logs. If there are, restart the application in development environment   

* Also rename the GreetingResourceIT rename to DeveloperResourceIT


package za.co.bmw.workshop.day.two;

import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
public class DeveloperResourceIT extends DeveloperResourceTest {

    // Execute the same tests but in native mode.
}


* If the dev machine is running, press r on the keyboard to re-run the test. Be careful to check the logs for any errors, if there are errors. Follow the next steps
$ mvnw.cmd  clean
$ mvnw.cmd  compile quarkus:dev

* If the dev machine is not running, switch it on by running the following command
$ mvnw.cmd  compile quarkus:dev


* Go to the following URL to see the updated port numbers using the following URL:  
http://localhost:8080/bmw

* Use command prompt to run a test to see the updated code changes
$ curl http://localhost:8080/bmw

Part II: Class loader using Dev UI

* Go to the following URL to see the updated port numbers using the following URL:  
http://localhost:8080/ 

* Then click on Visit The Dev UI button
* Then click on the Arc card 
* View the loading process. All the classes that were loaded during the server start up
* From one of the loaded classes, click on the button to view dependencies (far left of the each loaded class)
* View the bean dependencies graph 




Part III: Using an ArrayList to display random names

Practice objectives:
* Using a fake name generator array 
* Display the endpoints using restful services 
* Generate random names using the name resource 


* Create the GenerateRandomNames class that will display random names from the array. Using an arrayList as a data resource. 


package za.co.bmw.workshop.day.two;

import java.util.List;

public class GenerateRandomNames {

    private static List<String> namesVault = List.of("Nonhlanhla Kuma", "Mike Robertso", "Fiona Brin", "Darren Moos", "Carmen Simela",
            "Boitumelo Alli", "Ronel Hoose", "Simone Robertso", "sello Chauk", "Paul Jouber", "sello Pete",
            "Ntokozo Beuke", "Julian Marai", "Nozipho Mulde", "Norman Siband", "Heather Mlangen", "Charles Delpor",
            "Muhammad Masang", "Johann Bennet", "Andre Mashab", "Musa Modis", "Sarah Mngomezul", "Teboho Wessel");
    ;

    public static List getRandomNames() {

        return namesVault;

    }
}



* Reference the static class variables to display the names in the DeveloperResource class, adding the following method. Add the getRandomNames() method 


@GET
@Produces(TEXT_PLAIN)
@Path("/names")
public List getRandomNames() {
    return GenerateRandomNames.getRandomNames();
}


Below is the full implementation of of the resource class


package za.co.bmw.workshop.day.two;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static javax.ws.rs.core.MediaType.*;

@Path("/bmw")
public class DeveloperResource {

    @GET
    @Produces(TEXT_PLAIN)
    public String helloBMWDeveloper() {
        return "Hello, I am a Developer working at BMW";
    }

    @GET
    @Produces(TEXT_PLAIN)
    @Path("/names")
    public List getRandomNames() {
        return GenerateRandomNames.getRandomNames();
    }

}


* Go to the following URL to see the updated port numbers using the following URL:  
* http://localhost:8080/bmw/names

* Use command prompt to run a test to see the updated code changes
$ curl  http://localhost:8080/bmw/names

* We now want to randomize the names list. So, go to the  update the getRandomNames() method to generate names in a random order. Open the GenerateRandomNames class and update the method as following:


public static List getRandomNames(){

    ArrayList randomList = new ArrayList();
    int size = namesVault.size();

    Random ran = new Random();
    int randomNumber;

    for (int val = 0; val < size; val++){
        randomNumber = ran.nextInt(size) + 0;
        randomList.add(namesVault.get(randomNumber));
    }

    return randomList;

}


* Go to the following URL to see the updated port numbers using the following URL:  
* http://localhost:8080/bmw/names

* Use command prompt to run a test to see the updated code changes
$ curl  http://localhost:8080/bmw/names


Part IV: Using an Google formatting library to display random 
names in a JSON format

* Convert the ArrayList to a JSON output using java programming languages. 
* Manually update the pom.xml to add gson dependency. 


<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
</dependency>


* Refresh your project by using the maven tool. Right click on the project, go to the bottom of the list and find Maven. Then click on Reload Project



* Update the GenerateRandomNames class to convert the ArrayList to a JSON output file. Add the method convertListToJSON() method to perform the conversion. 


public static String convertListToJSON(){
    List randomList = getRandomNames();
    Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
    String prettyJson = prettyGson.toJson(randomList);

    return prettyJson;

}


* Add the endpoint to the DeveloperResource to call the method and display the arrayList as a JSON


@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/json-names")
public String getRandomNamesJSON() {
    return GenerateRandomNames.convertListToJSON();
}


* Go to the following URL to see the updated port numbers using the following URL:  
* http://localhost:8080/bmw/json-names 

* Use command prompt to run a test to see the updated code changes
$ curl  http://localhost:8080/bmw/json-names 

Code Shrinking with Quarkus and Panache ORM

* Quarkus allows you to easily access relational databases, thanks to Hibernate ORM with Panache, as well as using templating thanks to Qute.

* Accessing the Database with Hibernate ORM with Panache
In Java, we have several APIs and frameworks to map objects to relational databases. One of these famous frameworks is Hibernate which implements the JPA specification. Hibernate makes mapping and querying Java objects easy. Hibernate ORM with Panache is built on top of Hibernate, and makes simple mapping and simple queries trivial.

* Panache is a Quarkus-specific library that simplifies the development of your Hibernate-based persistence layer. Similar to Spring Data JPA, Panache handles most of the repetitive boilerplate code for you. Its implementations of the repository and the active record pattern provide methods to create, update, and remove records, perform basic queries, and define and execute your own queries.

* Panache itself doesn’t require any additional configuration. But you need to configure your database connection, and you can use the properties described in the 1st part of this series to configure Hibernate.

* Zero Config Database Setup
o Quarkus can even provide you with a zero-config database out of the box when testing or running in dev mode, a feature we refer to as Dev Services. Depending on your database type, you may need Docker installed to use this feature.
o To use Dev Services, all you need to do is include the relevant extension for the type of database you want (either reactive or JDBC, or both), without configuring any database URL, username, and password.
o Quarkus will provide the database. You can just start coding without worrying about config.

* Panache is a Quarkus-specific library that simplifies the development of your Hibernate-based persistence layer. Panache handles most of the repetitive boilerplate code for you. Its implementations of the repository and the active record pattern provide methods to create, update, and remove records, perform basic queries, and define and execute your own queries.

* Panache implements the repository and the active record pattern. Both implementations provide you with standard methods to persist, read, update and remove entity objects. 

* Hibernate ORM With Panache
o Hibernate ORM is the de facto JPA implementation and offers you the full breadth of an Object Relational Mapper. It makes complex mappings possible, but it does not make simple and common mappings trivial. Hibernate ORM with Panache focuses on making your entities trivial and fun to write in Quarkus.
o Sample ORM Entity Class

@Entity
public class Person extends PanacheEntity {
    public String name;
    public LocalDate birth;
    public Status status;

    public static Person findByName(String name){
        return find("name", name).firstResult();
    }

    public static List<Person> findAlive(){
        return list("status", Status.Alive);
    }

    public static void deleteStefs(){
        delete("name", "Stef");
    }
}


o Sample pom.xml

<!-- Hibernate ORM specific dependencies -->
<dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-hibernate-orm-panache</artifactId>
</dependency>

o Most useful operations - Once you have written your entity, here are the most common operations you will be able to perform:

// creating a person
Person person = new Person();
person.name = "Stef";
person.birth = LocalDate.of(1910, Month.FEBRUARY, 1);
person.status = Status.Alive;

// persist it
person.persist();

// note that once persisted, you don't need to explicitly save your entity: all
// modifications are automatically persisted on transaction commit.

// check if it is persistent
if(person.isPersistent()){
    // delete it
    person.delete();
}

// getting a list of all Person entities
List<Person> allPersons = Person.listAll();

// finding a specific person by ID
person = Person.findById(personId);

// finding a specific person by ID via an Optional
Optional<Person> optional = Person.findByIdOptional(personId);
person = optional.orElseThrow(() -> new NotFoundException());

// finding all living persons
List<Person> livingPersons = Person.list("status", Status.Alive);

// counting all persons
long countAll = Person.count();

// counting all living persons
long countAlive = Person.count("status", Status.Alive);

// delete all living persons
Person.delete("status", Status.Alive);

// delete all persons
Person.deleteAll();

// delete by id
boolean deleted = Person.deleteById(personId);

// set the name of all living persons to 'Mortal'
Person.update("name = 'Mortal' where status = ?1", Status.Alive);


o Paging - You should only use list and stream methods if your table contains small enough data sets. For larger data sets you can use the find method equivalents, which return a PanacheQuery on which you can do paging:

// create a query for all living persons
PanacheQuery<Person> livingPersons = Person.find("status", Status.Alive);

// make it use pages of 25 entries at a time
livingPersons.page(Page.ofSize(25));

// get the first page
List<Person> firstPage = livingPersons.list();

// get the second page
List<Person> secondPage = livingPersons.nextPage().list();


o Named queries - You can reference a named query instead of a (simplified) HQL query by prefixing its name with the '#' character. You can also use named queries for count, update and delete queries.

@Entity
@NamedQueries({
    @NamedQuery(name = "Person.getByName", query = "from Person where name = ?1"),
    @NamedQuery(name = "Person.countByStatus", query = "select count(*) from Person p where p.status = :status"),
    @NamedQuery(name = "Person.updateStatusById", query = "update Person p set p.status = :status where p.id = :id"),
    @NamedQuery(name = "Person.deleteById", query = "delete from Person p where p.id = ?1")
})

public class Person extends PanacheEntity {
    public String name;
    public LocalDate birth;
    public Status status;

    public static Person findByName(String name){
        return find("#Person.getByName", name).firstResult();
    }
  . . .
}
* How and why we simplify Hibernate ORM mappings
o When it comes to writing Hibernate ORM entities, there are a number of annoying things that users have grown used to reluctantly deal with, such as:
* Duplicating ID logic: most entities need an ID, most people don’t care how it is set, because it is not really relevant to your model.
* Traditional EE patterns advise to split entity definition (the model) from the operations you can do on them (DAOs, Repositories), but really that requires a split between the state and its operations even though we would never do something like that for regular objects in the Object-Oriented architecture, where state and methods are in the same class. Moreover, this requires two classes per entity, and requires injection of the DAO or Repository where you need to do entity operations, which breaks your edit flow and requires you to get out of the code you’re writing to set up an injection point before coming back to use it.
* Hibernate queries are super powerful, but overly verbose for common operations, requiring you to write queries even when you don’t need all the parts.
* Hibernate is very general-purpose, but does not make it trivial to do trivial operations that make up 90% of our model usage.
o With Panache, we took an opinionated approach to tackle all these problems:
* Make your entities extend PanacheEntity: it has an ID field that is auto-generated. If you require a custom ID strategy, you can extend PanacheEntityBase instead and handle the ID yourself.
* Use public fields. Get rid of dumb getter and setters. Hibernate ORM w/o Panache also doesn’t require you to use getters and setters, but Panache will additionally generate all getters and setters that are missing, and rewrite every access to these fields to use the accessor methods. This way you can still write useful accessors when you need them, which will be used even though your entity users still use field accesses. This implies that from the Hibernate perspective you’re using accessors via getters and setters even while it looks like field accessors.
* With the active record pattern: put all your entity logic in static methods in your entity class and don’t create DAOs. Your entity superclass comes with lots of super useful static methods, and you can add your own in your entity class. Users can just start using your entity Person by typing Person. and getting completion for all the operations in a single place.
* Don’t write parts of the query that you don’t need: write Person.find("order by name") or Person.find("name = ?1 and status = ?2", "stef", Status.Alive) or even better Person.find("name", "stef").



* Hibernate Reactive With Panache
o Hibernate Reactive is the only reactive JPA implementation and offers you the full breadth of an Object Relational Mapper allowing you to access your database over reactive drivers. It makes complex mappings possible, but it does not make simple and common mappings trivial. Hibernate Reactive with Panache focuses on making your entities trivial and fun to write in Quarkus.

o Sample ORM Entity Class

@Entity
public class Person extends PanacheEntity {
    public String name;
    public LocalDate birth;
    public Status status;

    public static Uni<Person> findByName(String name){
        return find("name", name).firstResult();
    }

    public static Uni<List<Person>> findAlive(){
        return list("status", Status.Alive);
    }

    public static Uni<Long> deleteStefs(){
        return delete("name", "Stef");
    }
}


o Sample pom.xml

<dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-hibernate-reactive-panache</artifactId>
</dependency>

o Most useful operations - Once you have written your entity, here are the most common operations you will be able to perform:

// creating a person
Person person = new Person();
person.name = "Stef";
person.birth = LocalDate.of(1910, Month.FEBRUARY, 1);
person.status = Status.Alive;

// persist it
Uni<Void> persistOperation = person.persist();

// note that once persisted, you don't need to explicitly save your entity: all
// modifications are automatically persisted on transaction commit.

// check if it is persistent
if(person.isPersistent()){
    // delete it
    Uni<Void> deleteOperation = person.delete();
}

// getting a list of all Person entities
Uni<List<Person>> allPersons = Person.listAll();

// finding a specific person by ID
Uni<Person> personById = Person.findById(23L);

// finding all living persons
Uni<List<Person>> livingPersons = Person.list("status", Status.Alive);

// counting all persons
Uni<Long> countAll = Person.count();

// counting all living persons
Uni<Long> countAlive = Person.count("status", Status.Alive);

// delete all living persons
Uni<Long> deleteAliveOperation = Person.delete("status", Status.Alive);

// delete all persons
Uni<Long> deleteAllOperation = Person.deleteAll();

// delete by id
Uni<Boolean> deleteByIdOperation = Person.deleteById(23L);

// set the name of all living persons to 'Mortal'
Uni<Integer> updateOperation = Person.update("name = 'Mortal' where status = ?1", Status.Alive);


o Paging - You should only use the list methods if your table contains small enough data sets. For larger data sets you can use the find method equivalents, which return a PanacheQuery on which you can do paging:

// create a query for all living persons
PanacheQuery<Person> livingPersons = Person.find("status", Status.Alive);

// make it use pages of 25 entries at a time
livingPersons.page(Page.ofSize(25));

// get the first page
Uni<List<Person>> firstPage = livingPersons.list();

// get the second page
Uni<List<Person>> secondPage = livingPersons.nextPage().list();


o Named queries - You can reference a named query instead of a (simplified) HQL query by prefixing its name with the '#' character. You can also use named queries for count, update and delete queries.

@Entity
@NamedQueries({
    @NamedQuery(name = "Person.getByName", query = "from Person where name = ?1"),
    @NamedQuery(name = "Person.countByStatus", query = "select count(*) from Person p where p.status = :status"),
    @NamedQuery(name = "Person.updateStatusById", query = "update Person p set p.status = :status where p.id = :id"),
    @NamedQuery(name = "Person.deleteById", query = "delete from Person p where p.id = ?1")
})
public class Person extends PanacheEntity {
    public String name;
    public LocalDate birth;
    public Status status;

    public static Uni<Person> findByName(String name){
        return find("#Person.getByName", name).firstResult();
    }
  . . .
}
* How and why we simplify Hibernate ORM mappings
o When it comes to writing Hibernate Reactive entities, there are a number of annoying things that users have grown used to reluctantly deal with, such as:
* Duplicating ID logic: most entities need an ID, most people don’t care how it is set, because it is not really relevant to your model.
* Dumb getters and setters: since Java lacks support for properties in the language, we have to create fields, then generate getters and setters for those fields, even if they don’t actually do anything more than read/write the fields.
* Traditional EE patterns advise to split entity definition (the model) from the operations you can do on them (DAOs, Repositories), but really that requires an unnatural split between the state and its operations even though we would never do something like that for regular objects in the Object-Oriented architecture, where state and methods are in the same class. Moreover, this requires two classes per entity, and requires injection of the DAO or Repository where you need to do entity operations, which breaks your edit flow and requires you to get out of the code you’re writing to set up an injection point before coming back to use it.
* Hibernate queries are super powerful, but overly verbose for common operations, requiring you to write queries even when you don’t need all the parts.
* Hibernate is very general-purpose, but does not make it trivial to do trivial operations that make up 90% of our model usage.
o With Panache, we took an opinionated approach to tackle all these problems:
* Make your entities extend PanacheEntity: it has an ID field that is auto-generated. If you require a custom ID strategy, you can extend PanacheEntityBase instead and handle the ID yourself.
* Use public fields. Get rid of dumb getter and setters. Under the hood, we will generate all getters and setters that are missing, and rewrite every access to these fields to use the accessor methods. This way you can still write useful accessors when you need them, which will be used even though your entity users still use field accesses.
* With the active record pattern: put all your entity logic in static methods in your entity class and don’t create DAOs. Your entity superclass comes with lots of super useful static methods, and you can add your own in your entity class. Users can just start using your entity Person by typing Person. and getting completion for all the operations in a single place.
* Don’t write parts of the query that you don’t need: write Person.find("order by name") or Person.find("name = ?1 and status = ?2", "stef", Status.Alive) or even better Person.find("name", "stef").

* Using our command-line tool: 

-Dextensions="resteasy-jsonb, hibernate-orm-panache, jdbc-postgresql"

-Dextensions="resteasy-jsonb, hibernate-reactive-panache, jdbc-postgresql"


Dependency Injection

* What is a bean?
o Well, a bean is a container-managed object that supports a set of basic services, such as injection of dependencies, lifecycle callbacks and interceptors.

* What does "container-managed" mean?
o Simply put, you don’t control the lifecycle of the object instance directly. Instead, you can affect the lifecycle through declarative means, such as annotations, configuration, etc. The container is the environment where your application runs. It creates and destroys the instances of beans, associates the instances with a designated context, and injects them into other beans.

* What is it good for?
o An application developer can focus on the business logic rather than finding out "where and how" to obtain a fully initialized component with all of its dependencies.

* Simple Bean Example

import javax.inject.Inject;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.metrics.annotation.Counted;

@ApplicationScoped 
public class Translator {

    @Inject
    Dictionary dictionary; 

    @Counted  
    String translate(String sentence) {
      // ...
    }
}


* In CDI the process of matching a bean to an injection point is type-safe. Each bean declares a set of bean types. In our example above, the Translator bean has two bean types: Translator and java.lang.Object. Subsequently, a bean is assignable to an injection point if the bean has a bean type that matches the required type and has all the required qualifiers.

* If multiple beans declare the same type?
o There is a simple rule: exactly one bean must be assignable to an injection point, otherwise the build fails. If none is assignable the build fails with UnsatisfiedResolutionException. If multiple are assignable the build fails with AmbiguousResolutionException. This is very useful because your application fails fast whenever the container is not able to find an unambiguous dependency for any injection point.

* Qualifiers are annotations that help the container to distinguish beans that implement the same type. As we already said a bean is assignable to an injection point if it has all the required qualifiers. If you declare no qualifier at an injection point the @Default qualifier is assumed.

* Qualifier Example

@Qualifier
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
public @interface Superior {}


The qualifiers of a bean are declared by annotating the bean class or producer method or field with the qualifier types:

Bean With Custom Qualifier Example

@Superior 
@ApplicationScoped
public class SuperiorTranslator extends Translator {

    String translate(String sentence) {
      // ...
    }
}

* Quarkus is uses a simplified bean discovery. There is only single bean archive with the bean discovery mode annotated and no visibility boundaries.

* The bean archive is synthesized from:
o the application classes,
o dependencies that contain a beans.xml descriptor (content is ignored),
o dependencies that contain a Jandex index - META-INF/jandex.idx,
o dependencies referenced by quarkus.index-dependency in application.properties,
o and Quarkus integration code.

* Bean classes that don’t have a bean defining annotation are not discovered. This behaviour is defined by CDI. But producer methods and fields and observer methods are discovered even if the declaring class is not annotated with a bean defining annotation (this behaviour is different to what is defined in CDI). In fact, the declaring bean classes are considered annotated with @Dependent.

* What is the bean scope?
o The scope of a bean determines the lifecycle of its instances, i.e. when and where an instance should be created and destroyed. You can use all the built-in scopes mentioned by the specification except for javax.enterprise.context.ConversationScoped.

Short Overview of Quarkus Scopes 

ANNOTATIONINITIALIZATION TIMEINSTANCES@ApplicationScopedWhen a method on the injected instance gets called.One per application.@SingletonWhen injected into parent.One per application.@DependentWhen injected into parent.For every injection point.@RequestScopedWhen a method on the injected instance gets called.For every HTTP request.@SessionScopedWhen a method on the injected instance gets called.For every undertow session.Custome ScopeDepended on implementation.Depended on implementation.

* Summary of the exercises
* Part I: Starting to make use of Panache Entity
* Part II: Converting the Database list to a JSON format


Practice II: Working with Panache ORM

Part I: Starting to make use of Panache Entity

* Adding the relevant extensions to the bmw-workshop-day-two project using bootstrap commands. 
* Re-open Terminal on the project you created in the previous practice. Then run the following commands to add the postgres and ORM using the command line 

$ mvnw.cmd  quarkus:add-extension -Dextensions="jdbc-postgresql,hibernate-orm-panache,hibernate-validator"


* Refresh your project by using the maven tool. Right click on the project, go to the bottom of the list and find Maven. Then click on Reload Project



* On IntelliJ to add the Developer Entity class that will be mapped to the developer table created in the postgres database. Right click on the package and add Developer class


package za.co.bmw.workshop.day.two;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Developer extends PanacheEntity {
    String first_name;
    String surname;
    String favorite_language;
    String specialization;

    public String toString(){
        return "Developer{" +
                "id=" + id +
                ", name='" + first_name + '\'' +
                ", surname='" + surname + '\'' +
                ", favorite programming language=" + favorite_language +
                ", specializing in='" + specialization + '\'' +
                '}';
    }
}



* Then add validations to the Developer Entity Class 
* Ensure that the columns are not null 
* Map different column names with correct defined variables
* Set the minimum size of the string 



@NotNull
@Size (min = 3, max = 50)
String first_name;

@NotNull
@Size (min = 3, max = 50)
String surname;

@NotNull
@Size (min = 1, max = 50)
@Column(name = "fav_language", columnDefinition = "TEXT")
String favorite_language;

@NotNull
@Size (min = 1, max = 50)
@Column(name = "specializing_in", columnDefinition = "TEXT")
String specialization;


* Create a method that will show random Developers from the database call. Update the Developer class to add the findRandom() method. Here is the implementation below:


public static Developer findRandom() {
    long countDevelopers = count();
    Random random = new Random();
    int randomDeveloper = random.nextInt((int) countDevelopers);
    return findAll().page(randomDeveloper, 1).firstResult();
}



* Add a new DeveloperService class which will expose the CRUD endpoints. The class will define methods for findAllDevelopers, findDeveloperById, findRandomDeveloper, persistDeveloper, updateDeveloper and removeDeveloper methods. Below is the file implementation



package za.co.bmw.workshop.day.two;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.validation.Valid;

import java.util.List;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@ApplicationScoped
@Transactional(REQUIRED)
public class DeveloperService {
    @Transactional(SUPPORTS)
    public List<Developer> findAllDevelopers() {
        return Developer.listAll();
    }

    @Transactional(SUPPORTS)
    public Developer findDeveloperById(Long id) {
        return Developer.findById(id);
    }

    @Transactional(SUPPORTS)
    public Developer findRandomDeveloper() {
        Developer randomDeveloper = null;
        while (randomDeveloper == null) {
            randomDeveloper = Developer.findRandom();
        }
        return randomDeveloper;
    }

    public Developer persistDeveloper(@Valid Developer developer) {
        developer.persist();
        return developer;
    }

    public Developer updateDeveloper (@Valid Developer developer) {
        Developer entity = Developer.findById(developer.id);
        entity.first_name = developer.first_name;
        entity.surname = developer.surname;
        entity.favorite_language = developer.favorite_language;
        entity.specialization = developer.specialization;

        return entity;
    }

    public void removeDeveloper(Long id) {
        Developer developer = Developer.findById(id);
        developer.delete();
    }
}


* Update the DeveloperResource class to create an endpoint. For this project, we will only implement Add a newly added method with their corresponding endpoints to the DeveloperResource class. 
* First inject the Logger and DeveloperService classes
* Implement the getAllDevelopers() method in the DeveloperResource


@Inject
DeveloperService service;
@Inject
Logger logger;



@GET
@Path("/db-developers")
public Response getAllDevelopers() {
    List<Developer> developers = service.findAllDevelopers();
    logger.info("Total number of villains " + developers);
    return Response.ok(developers).build();
}


Reference: This is what the complete DeveloperResource class looks like.


package za.co.bmw.workshop.day.two;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.MediaType.*;

@Path("/bmw")
public class DeveloperResource {

    @GET
    @Produces(TEXT_PLAIN)
    public String helloBMWDeveloper() {
        return "Hello, I am a Developer working at BMW";
    }

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/names")
    public List getRandomNames() {
        return GenerateRandomNames.getRandomNames();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/array-names-json-fmt")
    public String getRandomNamesJSON() {
        return GenerateRandomNames.convertListToJSON();
    }

    @Inject
    DeveloperService service;
    @Inject
    Logger logger;

    @GET
    @Path("/developers")
    public Response getAllDevelopers() {
        List<Developer> developers = service.findAllDevelopers();
        logger.debug("Total number of villains " + developers);
        return Response.ok(developers).build();
    }

}


* Update the application.properties file to add the 


# drop and create the database at startup (use `update` to only update the schema)
quarkus.hibernate-orm.database.generation=drop-and-create
quarkus.hibernate-orm.sql-load-script=import.sql


quarkus.log.console.enable=true
quarkus.log.console.format=%d{HH:mm:ss} %-5p [%c{2.}] (%t) %s%e%n
quarkus.log.console.level=INFO
quarkus.log.console.darken=1


* Add an import.sql file in the resource folder, in the following folder, src/main/resource with the following contents 


INSERT INTO developer
(id, first_name, surname, fav_language, specializing_in)
VALUES 
(nextval('hibernate_sequence'),'Imani ', 'Pena', 'powerbi', 'code-less developer');


INSERT INTO developer
(id, first_name, surname, fav_language, specializing_in)
VALUES 
(nextval('hibernate_sequence'),'Sally ', 'Finley', 'finance', 'manager');


INSERT INTO developer
(id, first_name, surname, fav_language, specializing_in)
VALUES 
(nextval('hibernate_sequence'), 'Lacey-May ', 'Perez', 'php', 'developer');


INSERT INTO developer
(id, first_name, surname, fav_language, specializing_in)
VALUES 
(nextval('hibernate_sequence'), 'Leonard ', 'Ngubane', 'java developer', 'development');


INSERT INTO developer
(id, first_name, surname, fav_language, specializing_in)
VALUES 
(nextval('hibernate_sequence'), 'Deborah ', 'Van Dyk', 'full stack developer', 'full stack developer');


INSERT INTO developer
(id, first_name, surname, fav_language, specializing_in)
VALUES 
(nextval('hibernate_sequence'), 'Nicole ', 'Dladla', 'java developer', 'snr developer');


INSERT INTO developer
(id, first_name, surname, fav_language, specializing_in)
VALUES 
(nextval('hibernate_sequence'), 'Asanda ', 'Wolmarans', 'money', 'qs');


* Start up the Docker Desktop on your laptop to run in the background



* If the dev machine is running, press r on the keyboard to re-run the test. Be careful to check the logs for any errors, if there are errors. Follow the next steps
$ mvnw.cmd  clean
$ mvnw.cmd  compile quarkus:dev

* If the dev machine is not running, switch it on by running the following command
$ mvnw.cmd  compile quarkus:dev

* IntelliJ starts a postgres image in the background, so click Allow Access to that Windows Defender Firewall



* Go to the following URL to see the updated port numbers using the following URL:  
http://localhost:8080/bmw/db-developers 

* Use command prompt to run a test to see the updated code changes
$ curl http://localhost:8080/bmw/db-developers



Part II: Converting the Database list to a JSON format

* Convert the Postgres database entries to a JSON output. 

* Update the GenerateRandomNames class to convert the database table entries to a JSON output file. Add the method convertDBDataToJSON() method to perform the conversion. 


public static String convertDBDataToJSON(List<Developer> list){
    Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
    String prettyJson = prettyGson.toJson(list);

    return prettyJson;

}


* Add the endpoint to the DeveloperResource to call the method and display the DB Data as a JSON


@GET
@Path("/db-names-json-fmt")
public String getDBDataNamesJSON() {
    List<Developer> developers = service.findAllDevelopers();
    return GenerateRandomNames.convertDBDataToJSON(developers);
}



* Update the DeveloperResourceTest class to test the method aboves end points.  	

@Test
void shouldGetDBItems() {
    given()
            .when().get("/bmw/db-names-json-fmt")
            .then()
            .statusCode(OK.getStatusCode())
            .contentType(APPLICATION_JSON);

}


* Ensure that the dev and debug server is running
$ netstat -ano | findStr "8080"

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Go to the following URL to see the updated port numbers using the following URL:  
* http://localhost:8080/bmw/db-names-json-fmt 

* Use terminal to run a test to see the updated code changes
$ curl  http://localhost:8080/bmw/db-names-json-fmt  

Integrating OpenAPI on Quarkus App

* It is often the case that development of software is done by teams which specialize and work independently of one another. Some people work on the backend API and others work on the user interface. 

* This is intended to speed up delivery by allowing parallel work streams, but there are difficulties when it comes time to integrate the two and "integration parties" which might sound fun are actually desperate flailing to make things work together on a time crunch. 

* What if you could make development go even faster while reducing or eliminating integration issues? That's where Apicur.io and OpenAPI Generator can help.


* SmallRye OpenAPI extension takes care of providing API documentation and SwaggerUI is enabled in the dev mode.

* The default endpoints are:
o OpenAPI documentaion - /openapi
o SwaggerUI - /swaggerui


* Provide the Application Level OpenAPI Annotations using MicroProfile OpenAPI annotations which describe global API information, such as the following:
o API Title
o API Description
o Version
o Contact Information
o License


* Summary of the exercises
* Practice III: Adding and using OpenAPI extension to the project


Practice III: Adding and using OpenAPI extension to the project

* Re-open Terminal on the project you created in the previous practice. Then run the following commands to add the postgres and ORM using the command line 

* Add the open-api extension pack on the project

$ mvnw.cmd  quarkus:add-extension -Dextensions="quarkus-smallrye-openapi"

$ mvnw.cmd  compile quarkus:dev

* Open a browser and go to that URL: http://localhost:8080/q/openapi?format=json 

* Open another terminal and run the following:
$ curl http://localhost:8080/q/openapi

* Provide the Application Level OpenAPI Annotations using MicroProfile OpenAPI annotations which describe global API information, such as the following:
* API Title
* API Description
* Version
* Contact Information
* License

* Create a class (DevelopersApiApplication) that will document information about the Resource class. Use the following details. 


package za.co.bmw.workshop.day.two;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;


@OpenAPIDefinition(
        tags = {
                @Tag(name="company", description="BMW Workshop"),
                @Tag(name="country", description="South Africa"),
                @Tag(name="specializatation", description="Quarkus"),
                @Tag(name="language", description="Java")
        },
        info = @Info(
                title="BMW South Africa Workshop",
                version = "1.0.1",
                contact = @Contact(
                        name = "Thato Mohono",
                        url = "http://tm.mahquests.co.za",
                        email = "thato.mohono@gmail.com"),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html"))
)
public class DevelopersApiApplication extends Application {
}


* Update the application.properties file to add the inclusion of the swagger-ui class documentation. 


quarkus.swagger-ui.always-include=true


* Ensure that the dev and debug server is running
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/q/swagger-ui/ 




Debugging and Logging Activities

* Quarkus uses the JBoss LogManager logging backend to collect and manage log data. You can use JBoss Logging to collect data about Quarkus internal events and also about the events within your application. You can configure logging behavior in your application.properties file.

* JBoss LogManager supports several third-party logging APIs in addition to the JBoss Logging. JBoss LogManager merges the logs from all the supported logging APIs.

* Using logging adapters
o Quarkus relies on the JBoss Logging library for all the logging requirements.

* When you are using libraries that have dependencies on other logging libraries, such as Apache Commons Logging, Log4j, or SLF4j, you must exclude those logging libraries from the dependencies and use one of the adapters provided by JBoss Logging. You do not need to add an adapter for libraries that are dependencies of Quarkus extensions.

* Sample pom.xml

<dependency>
    <groupId>org.jboss.logging</groupId>
    <artifactId>commons-logging-jboss-logging</artifactId>
</dependency>


o Supported Logging APIs
Applications and components may use any of the following APIs for logging, and the logs will be merged:
* JDK java.util.logging (also called JUL)
* JBoss Logging
* SLF4J
* Apache Commons Logging

o Quarkus uses JBoss Logging
You can also use it inside your application so that no other dependencies should be added for your logs.

o Logging with Panache
Instead of declaring a Logger field, you can use the simplified logging API:

o Injecting a Logger
You can also inject a configured org.jboss.logging.Logger instance in your beans and resource classes.

o Apache Log4j
Log4j is a logging implementation: it contains a logging backend and a logging facade. Quarkus uses the JBoss Log Manager backend, so you will need to include the log4j2-jboss-logmanager library to route Log4j logs to JBoss Log Manager.



o Logging levels
o The default log level is INFO. These are the log levels used by Quarkus:
* OFF	- Special level to turn off logging.
* FATAL - A critical service failure/complete inability to service requests of any kind.
* ERROR - A significant disruption in a request or the inability to service a request.
* WARN - A non-critical service error or problem that may not require immediate correction.
* INFO - Service lifecycle events or important related very-low-frequency information.
* DEBUG - Messages that convey extra information regarding lifecycle or non-request-bound events which may be helpful for debugging.
* TRACE - Messages that convey extra per-request debugging information that may be very high frequency.
* ALL	- Special level for all messages including custom levels.

o In addition, the following levels may be configured for applications and libraries using java.util.logging:
* SEVERE - Same as ERROR.
* WARNING	- Same as WARN.
* CONFIG - Service configuration information.
* FINE - Same as DEBUG.
* FINER - Same as TRACE.
* FINEST - Event more debugging information than TRACE, maybe with even higher frequency.

o How to change the default Log Level
* The property you need to use is quarkus.log.level. You can set in application.properties. 

* quarkus.log.level=DEBUG

* As an alternative, you can pass it with -Dquarkus.log.level=LEVEL at startup:


o In most cases, you won’t need to change the Log Level for all packages available in your application. For example, you can define a log level for a single namespace such as org.jboss.resteasy. Example:

* quarkus.log.category."org.jboss.resteasy".level=DEBUG


o Runtime configuration
* Run time logging is configured in the application.properties file, for example, to set the default log level to INFO logging and include Hibernate DEBUG logs:

* quarkus.log.level=INFO
* quarkus.log.category."org.hibernate".level=DEBUG


o Setting a log level below DEBUG requires the minimum log level to be adjusted, either globally via the quarkus.log.min-level property or per-category as shown in the example above, as well as adjusting the log level itself.

o Logging Format
* By default, Quarkus uses a pattern-based logging formatter that generates human-readable text logs.
* You can configure the format for each log handler via a dedicated property. For the console handler, the property is quarkus.log.console.format.

* Summary of the exercises
* Practice IV: Configure and using Logging Systems


Practice IV: Configure and using Logging Systems

* Using the org.jboss.logging.Logger for application debugging
o Open the DeveloperService class and make use of the logger objects from the org.jboss.logging.logger to debug the code. 
* Initialize a Logger variable and then use the logger variable in the methods
* Add the logger in the method to display in the quarkus logs


@Inject
Logger LOGGER;


* Update the findAllDevelopers() method to include logger details.


@Transactional(SUPPORTS)
public List<Developer> findAllDevelopers() {
    LOGGER.info("Inside inside the findAllDevelopers() method");
    LOGGER.info(Developer.listAll());
    return Developer.listAll();
}


* Ensure that the dev and debug server is running
$ netstat -ano | findStr "8080"
$ taskkill /F /PID <process_id>

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/bmw/db-names-json-fmt 

* Then see the logs on the terminal. 



* Add more logs to your application

Managing Quarkus lifecycle application

* The command mode lifecycle
o When running a command mode application, the basic lifecycle is as follows:
* Start Quarkus
* Run the QuarkusApplication main method
* Shut down Quarkus and exit the JVM after the main method returns

o Shutdown is always initiated by the application main thread returning. If you want to run some logic on startup, and then run like a normal application (i.e. not exit) then you should call Quarkus.waitForExit from the main thread (A non-command mode application is essentially just running an application that just calls waitForExit).

o If you want to shut down a running application and you are not in the main thread, then you should call Quarkus.asyncExit in order to unblock the main thread and initiate the shutdown process.


o CDI Events allow beans to communicate so that one bean can define an event, another bean can fire the event, and yet another bean can handle the event. 

o Then, add the following CDI Bean to it:

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.jboss.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
class ApplicationLifeCycle {

    private static final Logger LOGGER = 
Logger.getLogger(ApplicationLifeCycle.class);
    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("The application has started");
    }
    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application is stopping...");
    }
}


o This is an example of how to take advantage of the CDI concept of events, in which you produce and subscribe to events occurring in your application in a way that enables you to maintain decoupled code between producers and observers. Quarkus runtime uses the javax.enterprise.event.Event class to create events, and you use the CDI’s @Observes annotation to subscribe to events.

o In our case, the CDI @Observes the io.quarkus.runtime.StartupEvent and the io.quarkus.runtime.ShutdownEvent. Therefore:

o On start with the StartupEvent you can execute code when the application is starting

o On shutdown with the ShutdownEvent you can execute code when the application is shutting down.

* @QuarkusMain 
* StartupEvent and ShutdownEvent
* @Startup


o @QuarkusMain 
Writing Command Mode Applications
* There are two different approaches that can be used to implement applications that exit.
* Implement QuarkusApplication and have Quarkus run this method automatically
* Implement QuarkusApplication and a Java main method, and use the Java main method to launch Quarkus

* The simplest possible command mode application with access to Quarkus APIs might appear as follows:


import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain    
public class HelloWorldMain implements QuarkusApplication {
  @Override
  public int run(String... args) throws Exception {   
    System.out.println("Hello " + args[1]);
    return 0;
 }
}

o The @QuarkusMain annotation tells Quarkus that this is the main entry point.
o The run method is invoked once Quarkus starts, and the application stops when it finishes.

* If we want to actually perform business logic on startup (or write applications that complete a task and then exit) we need to supply a io.quarkus.runtime.QuarkusApplication class to the run method. After Quarkus has been started the run method of the application will be invoked. When this method returns the Quarkus application will exit.

* If you want to perform logic on startup you should call Quarkus.waitForExit(), this method will wait until a shutdown is requested (either from an external signal like when you press Ctrl+C or because a thread has called Quarkus.asyncExit()).

* What is the difference from @Initialized(ApplicationScoped.class) and @Destroyed(ApplicationScoped.class)
o In the JVM mode, there is no real difference, except that StartupEvent is always fired after @Initialized(ApplicationScoped.class) and ShutdownEvent is fired before @Destroyed(ApplicationScoped.class). 
o For a native executable build, however, @Initialized(ApplicationScoped.class) is fired as part of the native build process, whereas StartupEvent is fired when the native image is executed. 
* In CDI applications, an event with qualifier @Initialized(ApplicationScoped.class) is fired when the application context is initialized. See the spec for more info.


* Application Lifecycle
o You can be notified when the application starts/stops by observing StartupEvent and ShutdownEvent events.

@ApplicationScoped
public class ApplicationLifecycle {
    void onStart(@Observes StartupEvent event) {}
    void onStop(@Observes ShutdownEvent event) {}
}

* Quarkus supports graceful shutdown. By default there is no timeout but can be set by using the quarkus.shutdown.timeout config property.


* Graceful Shutdown
o Quarkus includes support for graceful shutdown, this allows Quarkus to wait for running requests to finish, up till a set timeout. 
o By default, this is disabled, however you can configure this by setting the quarkus.shutdown.timeout config property. 
o When this is set shutdown will not happen until all running requests have completed, or until this timeout has elapsed. 
o This config property is a duration, and can be set using the standard java.time.Duration format, if only a number is specified it is interpreted as seconds.

Extensions that accept requests need to add support for this on an individual basis. At the moment only the HTTP extension supports this, so shutdown may still happen when messaging requests are active.


* Summary of the exercises
* Part I: Following Application LifeCycle
* Part II: StartupEvent and ShutdownEvent
* Part III: Using the @Startup annotation


Practice V: Managing Quarkus lifecycle application

Part I: Following Application LifeCycle

* Using @QuarkusMain:
o Using a Main class and implement the @QuarkusMain. Use the code below to implement a Main Injection. 
o Create Main class with the following code below: 



package za.co.bmw.workshop.day.two;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        System.out.println("In the Main Class, running the main() method!");
        Quarkus.run(args);
    }
}


* Restart the dev server to see the changes that has been made during the server startup process. 

$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev


* Make note of the print out on the startup logs



* Refractoring application initialization using @QuarkusMain injection:
o Update the Main class and implement the @QuarkusMain. Use the code below to implement a Main Injection. 


package za.co.bmw.workshop.day.two;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        System.out.println("Main Class: just before the DayTwoMain.main() method call ...");
        Quarkus.run(DayTwoMain.class, args);
    }

    public static class DayTwoMain implements QuarkusApplication {
        @Override
        public int run(String[] args) throws Exception {
            System.out.println("DayTwoMain Class: inside the main method here...");
            Quarkus.waitForExit();
            return 0;
        }
    }
}



* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Make note of the printout on the startup logs. And see the printout have moved to the bottom of the banner instead of the top of the banner like the previous code.


Part II: StartupEvent and ShutdownEvent

* Using StartupEven and ShutdownEvent injections
o Create an DayTwoLifeCycleBean class, using an Observes annotation with  ShutdownEvent and StartupEvent events. Use the code below to implement a Main Injection


package za.co.bmw.workshop.day.two;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;


@ApplicationScoped
public class DayTwoLifeCycleBean {

    private static final Logger LOGGER = Logger.getLogger(DayTwoLifeCycleBean.class);

    void onStart(@Observes StartupEvent event){
        LOGGER.info("DayTwoLifeCycleBean::StartupEvent - startup method");
    }

    void onStop(@Observes ShutdownEvent event){
        LOGGER.info("DayTwoLifeCycleBean::ShutdownEvent - shutdown method");
    }
}



* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev


Make note of the print out on the startup logs just above the Quarkus main thread






Part III: Using the @Startup annotation

* Create a new class and implement the @Startup. Use the code below to implement a DayTwoStartUp class 


package za.co.bmw.workshop.day.two;

import io.quarkus.runtime.Startup;
import org.jboss.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

@Startup
public class DayTwoStartUp {
    private static final Logger LOGGER = Logger.getLogger(DayTwoLifeCycleBean.class);

    @Inject
    DeveloperResource bmwDeveloperResource;

    @PostConstruct
    public void init(){
        LOGGER.info("DayTwoStartUp: init() method - inside the Startup class");
    }

    @PreDestroy
    public void beforeDestroy(){
        LOGGER.info("DayTwoStartUp: beforeDestroy() method - this is post the Startup class");
    }

}



* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Make note of the print out on the startup logs just above the Quarkus main thread






Quarkus Configuring Profiles

* What is Quarkus Configuration Profiles?
o Quarkus, like any other MicroProfile, follows the MicroProfile specifications. It allows developers to seamlessly set the variables found in the project and access them in the project scope during different life cycles.
o The project’s settings are usually stored in the application.properties file. In addition, developers can locate the file in the resources folder found in the main folder. Some variables that developers can set include pointing out to Datasource such as postgresql or mysql, Datasource properties and settings such as the username, password, url, and access port among others.
o Configuration files can hold variables needed during the operation of the application. These can include variables isolated from the main application source code files. Thus, the variables can later be injected into the application when needed only. Developers prefer config files to set the overall system properties and environment variables.
o Quarkus’ configuration profiles are like containers that hold on settings and variables to be used in the overall application or during a particular phase in the project life cycle. They can contain one or multiple variables and settings. When used, for example, during a phase, they override similar settings or variable data set before.
o Setting up these profiles is advantageous since one can quickly switch when the app is under different development stages. These are such as from development to testing and from testing to production. The switching between configurations does not require additional settings. The framework automatically does the switching for one.
o Locate the application.properties file located at the main folder as shown below:
o The file is for the overall application during the development, testing, and production phases.

Quarkus’ Configuration Profile formats
* The available configuration profiles for Quarkus are three. These are:
o dev: This is only active in the development phase. For instance, when executing ./mvnw compile quarkus:dev
o test: Its application is in the test phase. For instance, when executing the ./mvnw compile quarkus:test
o prod: This is only active in the production phase. For instance, when executing ./mvnw package. Finally, developers will apply the settings to the packaged application used in the operational environment.

* Quarkus recognizes by default the profiles above. However, this does not mean adding other customizable profiles apart from the three mentioned above is impossible. This method is shown later on.

* The configuration profiles have a particular format for them to be recognized and separated from another. It begins with the percentage or modulus sign (%), followed by the profile name and the variable or settings. Finally, these will be separated by a period sign (.). It will be ended by the value to be held.

This format will look as follows:

# An example of a configuration profile format
%{quarkus-profile-name}.configuration=value
%{quarkus-profile-name}.variable=value
So, for instance, if it is under the development profile, it can be:

%dev.quarkus.http.port=8082
That overrides the one in the default or the global configuration. Hence, the HTTP access port will be 8082 during the development phase.

Using default configuration profiles
To use the following in the application, copy and paste the following to the application.properties file:

# Global
# Normal configurations
quarkus.http.port=8081
quarkus.datasource.db-kind=postgresql
quarkus.datasource.username=username
quarkus.datasource.password=password
quarkus.datasource.jdbc.url=jdbc:postgresql://localhost:5432/my_db
quarkus.log.console.level=INFO

# Development configuration profile
%dev.quarkus.http.port=8082
%dev.quarkus.log.console.level=ALL

# Testing environment configuration profile
%test.quarkus.http.port=9090
%test.quarkus.log.console.level=DEBUG
%test.quarkus.datasource.db-kind=postgresql
%test.quarkus.datasource.username=username
%test.quarkus.datasource.password=password
%test.quarkus.datasource.jdbc.url=jdbc:postgresql://localhost:5432/my_db
%test.quarkus.http.access-log.enabled=true

# Production configuration profiles. This is mainly used for the final package before deployment
%prod.quarkus.package.type=uber-jar
%prod.quarkus.http.port=8085

* By default, Quarkus provides three profiles, that activate automatically in certain conditions:
o dev - Activated when in development mode (i.e. quarkus:dev)
o test - Activated when running tests
o prod - The default profile when not running in development or test mode

Dev mode
* Now run the application using the development configuration profile in dev mode. Do this by running this code in the terminal:
o $./mvnw compile quarkus:dev

Test mode
* Run the following command:
$./mvnw compile quarkus:test


* Production mode
o The settings will allow the application to be packaged as an ‘uber-jar’ file type. An uber-jar file has all its dependencies, unlike the typical jar file, which has its dependencies in a separate location.

* Run the following command:
$./mvnw package

* Check the packaged file inside the ’target’ folder. Run the jar file by executing the following command:
$ java -jar target/quarkus-config-profiles-1.0-SNAPSHOT-runner.jar


* Using user-defined configuration profile
Use the same format as shown above to accomplish this. For example, for a profile with the name “prototype”, under the other profiles, do the following:

# Prototype stage
%prototype.quarkus.http.port=9095
%prototype.quarkus.log.console.level=ALL

* Run the app in the profile set by running the following:
$ mvnw.cmd  compile quarkus:dev -Dquarkus.profile=prototype


* Setting up and using variables in different profiles
o Variables set in this location can be injected into the application following the Java EE and MicroProfile standards and specifications. The variables can override the previously set environment variable value depending on the configuration profile in use.

* Setting up variables
o To add variables, for instance, variables called ‘name’, ‘age’ and ‘height’ that belong to a ‘person’ object add the code below to the file under the GLOBAL configuration settings:

# Global variables
person.name=john
person.age=28
person.height=165

Add the following under the ‘dev’ profile:
# Dev variables
%dev.person.name=alice
%dev.person.age=20
%dev.person.height=154

Add the following under the ’test’ profile:
# Test variables
%test.person.name=mike
%test.person.age=22
%test.person.height=170

Add the following under the ‘prod’ profile:
# Production variables
person.name=tom
person.age=12
person.height=100
Add the following under the ‘prototype’ profile:

# Prototype variables
person.name=jane
person.age=54
person.height=174


* Summary of the exercises
* Practice VI: Creating, activating and using different profiles

Practice VI: Creating, activating and using different profiles

* Locate and open the application.properties file and add the following details


%dev.quarkus.http.port=8080
%dev.quarkus.log.console.level=ALL

%test.quarkus.http.port=9090
%test.quarkus.log.console.level=ALL

%prod.quarkus.http.port=8085
%prod.quarkus.log.console.level=ALL
%prod.quarkus.package.type=uber-jar

# Prototype stage
%prototype.quarkus.http.port=9095
%prototype.quarkus.log.console.level=ALL

# Dev variables
%dev.developer.first_name=Sifiso 
%dev.developer.surname=Fortuin
%dev.developer.favorite_language=Java
%dev.developer.specialization=Developer

# Test variables
%test.developer.first_name=Douglas  
%test.developer.surname=Park
%test.developer.favorite_language=HTML
%test.developer.specialization=UI Development

# Production variables
developer.first_name=Thato
developer.surname=Mohono
developer.favorite_language=Java
developer.specialization=Architect

# Prototype variables
%prototype.developer.first_name=Lesego 
%prototype.developer.surname=Abrahams
%prototype.developer.favorite_language=Java
%prototype.developer.specialization=JPA


* Update the DeveloperResource and add the following code:


@ConfigProperty(name = "developer.first_name")
String firstname;

@ConfigProperty(name = "developer.surname")
String surname;

@ConfigProperty(name = "developer.favorite_language")
String programming_language;

@ConfigProperty(name = "developer.specialization")
String specialization;

@Path("/profile-names")
@GET
@Produces(MediaType.TEXT_PLAIN)
public String person() {
    return "The developer is " + firstname + " " + surname
            + " whose favorite programming language is " + programming_language
            + ", and specializes in " + specialization;
}


* Update the DeveloperResourceTest and add the following code:


    @Test
    public void testPersonEndpoint() {
        given()
                .when().get("/bmw/profile-names")
                .then()
                .statusCode(200)
                .body(is("The developer is Douglas Park whose favorite programming language is HTML, and specializes in UI Development"));
    }




Dev Profile:
* Ensure that the dev and debug server is running
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open the browser to go to this URL: http://localhost:8080/bmw/profile-names 

* Open CMD and run the following:
$ curl http://localhost:8080/bmw/profile-names 


Test Profile:
* Ensure that the dev and debug server is running
$ netstat -ano | findStr "9090"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvn -Dquarkus-profile=test compile quarkus:dev

* Open the browser to go to this URL: http://localhost:9090/bmw/profile-names 

* Open CMD and run the following:
$ curl http://localhost:9090/bmw/profile-names 


Custom Profile (Prototype):
* Ensure that the dev and debug server is running
$ netstat -ano | findStr "9095"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvn -Dquarkus-profile=prototype compile quarkus:dev

* Open the browser to go to this URL: http://localhost:9095/bmw/profile-names 

* Open CMD and run the following:
$ curl http://localhost:9095/bmw/profile-names 


Production (not setup for this exercise):
* Ensure that the dev and debug server is running

* Package the application for production use
$ mvnw.cmd clean compile package

* If not up, then start the dev server up
$ java -jar target/quarkus-config-profiles-1.0-SNAPSHOT-runner.jar

* Open the browser to go to this URL: http://localhost:8085/bmw/profile-names 

* Open CMD and run the following:
$ curl http://localhost:8085/bmw/profile-names 


Homework: 

* Continue from the homework from yesterday (eCommerce project). 
o Ensure that the following extensions are added on the project
* RESTEasy JAX-RS (resteasy-jaxb)
* RESTEasy Jackson (resteasy-reactive-jackson)
* JDBC Driver - PostgreSQL (jdbc-postgresql)
* Hibernate ORM with Panache (hibernate-orm-panache, hibernate-validator)
* Agroal - Database connection pool 
* OpenAPI (quarkus-smallrye-openapi)
o Ensure that the Items class is marked as an Entity bean
* Map the entity bean to database columns 
* Add your own validations to the Entity Bean 
o Update and implement full Pinache methods from the 
* purchase()
* additemToChart()
* removeItemFromChart()
* updateItemInChart()
* showItemsInChart()
* showItemInChart()
o Update and implement the Items Service on the methods implemented before
* showItemsInChart()
* showItemInChart()
* addItem()
* removeItem()
o Make use of the logging class to track and trace movements in your code
o Set ports for dev, test and production profiles. 


======== END-OF-DAY-02 ========

















































Day 03

* Objectives
* Mutiny in Quarkus
* Using Web Sockets 
* Messaging using Kafka
* Using Dev UI
* Arc



Quarkus Mutiny

* What is Quarkus Mutiny
o Mutiny is the primary API when dealing with the reactive features from Quarkus. It means that most extensions support Mutiny either by exposing an API returning Unis and Multis (such as reactive data sources or rest clients) or understanding when your methods return a Uni or a Multi (such as RESTEasy Reactive or Reactive Messaging).

o These integrations make Mutiny a prominent and cohesive model for every reactive application developed with Quarkus. In addition, Mutiny architecture allows fine-grain dead-code elimination which improves the memory usage when compiled to native (such as with Quarkus native mode or GraalVM native image compiler).

o RESTEasy Reactive is the next generation of HTTP framework. It can ensure the best throughput by handling each HTTP request on an IO thread. This model has the following benefits:
* Firstly, smaller response time as there is no thread context switch.
* Next, less memory and cpu usage as it decreases the usage of threads.
* Finally, you are not limited by the number of threads.
* Let’s see how to code a Reactive REST application from the grounds up.

o Mutiny is taking a very different angle:
* Event-Driven - Mutiny places events at the core of its design. With Mutiny, you observe events, react to them, and create elegant and readable processing pipelines. A Ph.D. in functional programming is not required.
* Navigable - Even with intelligent code completion, classes with hundreds of methods are confusing. Mutiny provides a navigable and explicit API driving you towards the operator you need.
* Non-Blocking I/O - Mutiny is the perfect companion to tame the asynchronous nature of applications with non-blocking I/O (which powers Quarkus). Declaratively compose operations, transform data, enforce progress, recover from failures, and more.
* Made for an asynchronous world - Mutiny can be used in any asynchronous application such as event-driven microservices, message-based applications, network utilities, data stream processing, and of course…? reactive applications!
* Reactive Streams and Converters Built-In - Mutiny is based on the Reactive Streams specification, and so it can be integrated with any other reactive programming library. In addition, it proposes converters to interact with other popular libraries. 

o An event-driven reactive programming API
* Mutiny is very different from the other reactive programming libraries. It takes a different approach to design your program. With Mutiny everything is event-driven: you receive events, and you react to them. This event-driven aspect embraces the asynchronous nature of distributed systems and provides an elegant and precise way to express continuation.

o Mutiny offers two types that are both event-driven and lazy:
* A Uni emits a single event (an item or a failure). Unis are convenient to represent asynchronous actions that return 0 or 1 result. A good example is the result of sending a message to a message broker queue.
* A Multi emits multiple events (n items, 1 failure or 1 completion). Multis can represent streams of items, potentially unbounded. A good example is receiving messages from a message broker queue.

o These two types allow representing any type of interactions. They are event sources. You observe them (subscription) and you get notified when they emit an item, a failure, or, in the case of a bounded Multi, a completion event. When you (the subscriber) receive the event, you can process it (e.g., transform it, filter it). With Mutiny, you are going to write code like onX().action(), which reads as “on item X do action”.

o Uni and Multi streams
* Persistence operations are designed to use blocking IO for interaction with the database, and are therefore not appropriate for use in a reactive environment. Hibernate Reactive is the first ORM implementation which is able to take advantage of non-blocking database clients
* Hibernate Reactive works on the top of reactive programming environment like therefore you should be familiar with the concept of Reactive Streams.

* Reactive Streams is an initiative to provide a standard for asynchronous stream processing with non-blocking back pressure on the JVM
* Reactive Streams are implemented in the Mutiny framework which provides a variant of Vert.x streams, adapting Vert.x back pressure protocol to Reactive Streams. can wrapped by a chain of Java CompletionStages o Mutiny Uni/Multi streams.

o Uni comes from Mutiny, an intuitive, event-driven reactive programming library.
There are a few method to understand to use Uni:
* map : transforms (synchronously) an item when this item becomes available.
* chain: transforms an item, when it became available, into another Uni. The outcome will be the outcome of the produced Uni.
* replaceWith: replaces an item with something else.
* invoke: invokes the method when the item becomes available. It does not modify the item.
Uni is lazy. To trigger the computation you need to subscribe to it. However, most of the time, Quarkus handles the subscription for us.

o Mutiny offers two types that are both event-driven and lazy:
* A Uni emits a single event (an item or a failure). A good example is the result of sending a message to a message broker queue.
* A Multi emits multiple events (n items, 1 failure or 1 completion). A good example is receiving messages from a message broker queue.

o Firstly, as you can see, when we write persistence logic using Hibernate Reactive, we’ll be working with a reactive Mutiny SessionFactory. Most operations of this interface are non-blocking, and execution of SQL against the database is never performed synchronously.

There are 2 important points:
* The injected Vert.x instance has the io.vertx.mutiny.core.Vertx type which is the Mutiny variant of Vert.x;
* The Web Client is created from io.vertx.mutiny.ext.web.client.WebClient.

o The Mutiny version of the Vert.x APIs also offers:
* andAwait methods such as sendAndAwait. andAwait indicates that the caller thread is blocked until the result is available. Be aware not to block the event loop / IO thread that way.
* andForget methods such as writeAndForget. andForget is available for method returning a Uni. andForget indicates that you don’t need the resulting Uni indicating the success or failure of the operation. However, remember that if you don’t subscribe, the operation would not be triggered. andForget manages this for you and manage the subscription.

* toMulti methods allowing to transform a Vert.x ReadStream into a Multi
* toBlockingIterable / toBlockingStream methods allowing to transform a Vert.x ReadStream into a blocking iterable or blocking java.util.Stream

o RESTEasy Reactive by default handles each HTTP request on an IO thread (otherwise known as an event-loop thread)[2].



o This ensures that maximum throughput can be achieved, but it also means that the implementation of an endpoint method should complete in a timely fashion otherwise the thread will be used for too long[3] and other requests will be queued up and lead to degraded throughput.

o It is important to understand that a method body that uses imperative code only becomes a problem when it takes a long time to execute - which is almost always the case for blocking IO operations.

o For that reason, when the body of the method performs some kind of blocking IO operation (or even some CPU bound operation that requires time to complete), the request needs to be offloaded to a worker thread. In RESTEasy Reactive that is done declaratively using the @Blocking annotation - no reactive programming or complex Java concurrency related code is needed. Quarkus also warns you when you attempt to use blocking IO on an IO thread. If however the method body performs non-blocking IO (or some CPU bound operation that completes very quickly) then RESTEasy Reactive can continue to serve the entire request on the IO thread.

o Although RESTEasy Reactive was built from the ground up to do non-blocking IO and serve requests from the event loop threads (thus avoiding the needless usage of worker pool threads) it can effortlessly work with blocking IO and any piece of code that provides a blocking API (such as Hibernate) without blocking the event loop.

o The only thing you have to do is add @Blocking on your endpoint method or class. That’s it! If you use @Blocking you are back to the regular dispatching mechanism: a worker thread is used to execute your method.

o At a high level it this looks like this:




Does RESTEasy Reactive require Hibernate Reactive?
* As you can probably guess from the answer to the previous question, the answer is no.

* In scenarios where RESTEasy Reactive is used along with Hibernate, the @Blocking annotation should be placed on the endpoint methods that interact with Hibernate.

* In scenarios where RESTEasy Reactive is used along with Hibernate Reactive, no @Blocking annotation is necessary on the endpoint methods that interact with Hibernate Reactive.


* Summary of the exercises
* Part I: Creating Uni and Multi Return Types
* Practice II: Creating Uni and Multi with a Postgres database
* Practice II-I: Implementing the findAll endpoint 
* Practice II-II: Making use of an external API services


Practice I: Mutiny on Quarkus
Part I: Creating Uni and Multi Return Types


* In order to take advantage of the singular and multiple processes, we make use of Uni and Multi return type. 
o Open CMD and run the following command:

$ mvn io.quarkus:quarkus-maven-plugin:2.9.2.Final:create  -DprojectGroupId=za.co.bmw.workshop.day-three -DprojectArtifactId=bmw-workshop-day-three  -DclassName="za.co.bmw.workshop.day.three.ReactiveCarResource" -Dpath="/cars"  -Dextensions="resteasy-reactive-jackson, quarkus-hibernate-validator, quarkus-hibernate-reactive-panache ,quarkus-reactive-pg-client"

* Open IntelliJ, and open the bmw-workshop-day-three project that you have just created above:

o Update the ReactiveCarResource class, remove the default hello end pint and replace it with the allTimeFavoriteBrand() method with the following contents


@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/bias")
public String allTimeFavoriteBrand() {
    return "I may just be biased, but hey... Its BMW";
}


* Start up the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open another terminal and run the following:
$ curl -w "\n" http://localhost:8080/cars/bias 

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/cars/bias 

o Create a ReactiveCarService class, and add a favoriteCar() method which returns a Uni of List<String> which is an asynchronous type


package za.co.bmw.workshop.day.three;

import io.smallrye.mutiny.Uni;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReactiveCarService {

    public Uni<String> favoriteCar(String car) {
        return Uni.createFrom().item("my favorite car is "+ car);
    }

}


o Then update the ReactiveCarResource class to add a corresponding end point 


@Inject ReactiveCarService service;



@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/favorite/{car}")
public Uni<String> favoriteCar(String car) {
    return service.favoriteCar(car);
}


* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open another terminal and run the following:
$ curl http://localhost:8080/cars/favorite/bmw-x4 

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/cars/favorite/bmw-x4 


* Update the ReactiveCarService class, and add a favoriteElectronCar() method which returns a Multi String return types which emits multiple events. 


public Multi<String> favoriteElectronCar(int count, String car) {
    return Multi.createFrom().range(0,count)
            .onItem().transform(n->String.format("my favorite electron is " + car + ", and its carbon emission is up to  %d"+ count , n));
}



o Then update the ReactiveCarResource class to add a corresponding end point 


@GET
@Produces(MediaType.SERVER_SENT_EVENTS)
@Path("/e-car/{count}/{car}")
public Multi<String> eCar(int count, String car) {
    return service.favoriteElectronCar(count, car);
}




* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open another terminal and run the following:
$ curl http://localhost:8080/cars/e-car/5/bmw-i8 

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/cars/e-car/5/bmw-i8 



* Update the ReactiveCarService class, and add a futureFlyingCar() method which returns a Multi<String> which emits multiple events. 


public Multi<String> futureFlyingCar(String car) {
     return Multi.createFrom().ticks().every(Duration.ofSeconds(1))
     .onItem().transform(n-> String.format("future flying car ready on ... %s - %d", car, n));
}




* Then update the ReactiveCarResource class to add a corresponding end point 


@GET
@Produces(MediaType.SERVER_SENT_EVENTS)
@Path("/flying/{car}")
public Multi<String> flyingCarStream(String car) {
    return service.futureFlyingCar(car);
}





o Then update the ReactiveCarResourceTest class to add a corresponding @Test end point methods. Here is a full class implementation 


package za.co.bmw.workshop.day.three;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ReactiveCarResourceTest {

    private static final String DEFAULT_CAR = "BMW";
    private static final int DEFAULT_COUNT = 1;

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/cars/bias")
          .then()
             .statusCode(200)
             .body(is("I may just be biased, but hey... Its BMW"));
    }

    @Test
    public void testFavoriteCar() {
        given()
                .pathParam("car", DEFAULT_CAR)
                .when().get("/favorite/{car}")
                .then()
                .statusCode(404);
    }


    @Test
    public void testFavoriteElectricCar() {
        given()
                .pathParam("count", DEFAULT_COUNT)
                .pathParam("car", DEFAULT_CAR)
                .when().get("/e-car/{count}/{car}")
                .then()
                .statusCode(404);
    }

    @Test
    public void testFlyingCar() {
        given()
                .pathParam("car", DEFAULT_CAR)
                .when().get("/flying/{car}")
                .then()
                .statusCode(404);
    }
}





* Restart the dev server to see the changes that has been made during the server startup process. 

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open another terminal and run the following:
$ curl http://localhost:8080/cars/flying/bmw-m1-shark  

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/cars/flying/bmw-m1-shark  

Then close the browser because it will be an endless running process


Practice II: Creating Uni and Multi with a Postgres database

Practice II-I: Implementing the findAll endpoint 

* Quarkus provides many reactive APIs using the Mutiny model. In this section, we are going to see how you can use the Reactive PostgreSQL driver to interact with your database in a non-blocking and reactive way. Interacting with the database.
* 
* This application is interacting with a PostgreSQL database, so you need one. Create a database using docker.
$ docker run --name postgres-quarkus-reactive -p 5432:5432 -e POSTGRES_USER=quarkus_test -e POSTGRES_PASSWORD=quarkus_test -e POSTGRES_DB=quarkus_test -d postgres:13.0

o Ensure that required extensions for the project have been added


o Update the application.properties file to add the database configuration to the application. 


# drop and create the database at startup (use `update` to only update the schema)
quarkus.hibernate-orm.database.generation=drop-and-create
quarkus.hibernate-orm.sql-load-script=import.sql

quarkus.datasource.db-kind=postgresql
quarkus.datasource.username=quarkus_test
quarkus.datasource.password=quarkus_test
quarkus.datasource.reactive.url=postgresql://localhost:5432/quarkus_test
myapp.schema.create=true


o Create a child package called db, to store all the database files in that package:
* za.co.bmw.workshop.day.three.db

o Create a BMW class, and add the following variables:
* Long id;
* String model;
* String year;
* String price;
* String color;

o Update the BMW class, and add two constructors:
* BMW()
* BMW(Long id, String model, String year, String color, String price) 


package za.co.bmw.workshop.day.three.db;

import io.smallrye.mutiny.Multi;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.pgclient.PgPool;

public class BMW {

    public Long id;

    public String model;

    public String year;

    public String price;
    public String color;

    public BMW() {
    }

    public BMW(Long id, String model, String year, String color, String price) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
}

* Because of multiple class names, lets first import the correct classes


import io.smallrye.mutiny.Multi;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.pgclient.PgPool;


* Update the BMW class, and add the following methods
* from
* findAll


private static BMW from(Row row) {
    return new BMW(row.getLong("id"), row.getString("model"), row.getString("year"), row.getString("color"), row.getString("price"));
}



public static Multi<BMW> findAll(PgPool client) {
    return client.query("SELECT id, model, year, color, price FROM bmwcars ORDER BY id ASC").execute()
            .onItem().transformToMulti(set -> Multi.createFrom().iterable(set))
            .onItem().transform(BMW::from);
}



* The full class implementation looks like this.


package za.co.bmw.workshop.day.three.db;

import io.smallrye.mutiny.Multi;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.pgclient.PgPool;

public class BMW {

    public Long id;

    public String model;

    public String year;

    public String price;
    public String color;

    public BMW() {
    }

    public BMW(Long id, String model, String year, String color, String price) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }


    private static BMW from(Row row) {
        return new BMW(row.getLong("id"), row.getString("model"), row.getString("year"), row.getString("color"), row.getString("price"));
    }

    public static Multi<BMW> findAll(PgPool client) {
        return client.query("SELECT id, model, year, color, price FROM bmwcars ORDER BY id ASC").execute()
                .onItem().transformToMulti(set -> Multi.createFrom().iterable(set))
                .onItem().transform(BMW::from);
    }
}


* Create a BMWResource class, and add the following code:


package za.co.bmw.workshop.day.three.db;

import io.quarkus.runtime.StartupEvent;
import io.smallrye.mutiny.Multi;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import io.vertx.mutiny.pgclient.PgPool;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("bmwcars")
public class BMWResource {

    @Inject
    PgPool client;

    @Inject
    @ConfigProperty(name = "myapp.schema.create", defaultValue = "true")
    boolean schemaCreate;

    void config(@Observes StartupEvent ev) {
        if (schemaCreate) {
            initdb();
        }
    }

    private void initdb() {
        // TODO
        client.query("DROP TABLE IF EXISTS bmwcars").execute()
                .flatMap(r -> client.query("CREATE TABLE bmwcars (id SERIAL PRIMARY KEY, model TEXT NOT NULL, year TEXT NOT NULL, color TEXT NOT NULL, price TEXT NOT NULL)").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('X5','2016','charcole black', 'R599,000')").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('i8','2017','blue', 'R2,050,000')").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('M4','2020','white', 'R1,900,000')").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('330i','2021','passion red', 'R1,350,000')").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('200d','2019','brown', 'R900,000')").execute())
                .flatMap(r -> client.query("INSERT INTO bmwcars (model, year, color, price) VALUES ('X2','2018','mellow yellow', 'R599,000')").execute())
                .await().indefinitely();
    }

    @GET
    public Multi<BMW> get() {
        return BMW.findAll(client);
    }
}



* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open another terminal and run the following:
$ curl http://localhost:8080/bmwcars  

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/bmwcars 

Practice II-II: Implementing the findById endpoint 

* Open BMW class. First, because of multiple class names, lets first import the correct classes for this implementation.


import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.pgclient.PgPool;
import io.vertx.mutiny.sqlclient.RowSet;
import io.vertx.mutiny.sqlclient.Tuple;



* Open the BMW class and implement the persist method to add new cars in the database. Add the code below to the class. 


public static Uni<BMW> findById(PgPool client, Long id) {
    return client.preparedQuery("SELECT id, model, year, color, price FROM bmwcars WHERE id = $1").execute(Tuple.of(id))
            .onItem().transform(RowSet::iterator)
            .onItem().transform(iterator -> iterator.hasNext() ? from(iterator.next()) : null);
}



* Open BMWResource class first, because of multiple class names, lets first import the correct classes for this implementation.


import io.quarkus.runtime.StartupEvent;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import io.vertx.mutiny.pgclient.PgPool;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;



* Open the BMWResource class and implement the findById endpoint. Add the code below to the class. 


@GET
@Path("{id}")
public Uni<Response> getSingle(Long id) {
    return BMW.findById(client, id)
            .onItem().transform(bmw -> bmw != null ? Response.ok(bmw) : Response.status(Response.Status.NOT_FOUND))
            .onItem().transform(Response.ResponseBuilder::build);
}



* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open another terminal and run the following:
$ curl http://localhost:8080/bmwcars/2   

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/bmwcars/2  


Practice II-III: Implementing the add and delete object endpoint 

* Open BMW class. First, because of multiple class names, lets first import the correct classes for this implementation.


import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.pgclient.PgPool;
import io.vertx.mutiny.sqlclient.RowSet;
import io.vertx.mutiny.sqlclient.Tuple;



* Open the BMW class and implement the save() and delete() methods. Add the code below to the class. 


public Uni<Long> save(PgPool client) {
    return client.preparedQuery("INSERT INTO bmwcars (model, year, color, price) VALUES ($1, $2, $3, $4) RETURNING id").execute(Tuple.of(model, year, color, price))
            .onItem().transform(pgRowSet -> pgRowSet.iterator().next().getLong("id"));
}




public static Uni<Boolean> delete(PgPool client, Long id) {
    return client.preparedQuery("DELETE FROM bmwcars WHERE id = $1").execute(Tuple.of(id))
            .onItem().transform(pgRowSet -> pgRowSet.rowCount() == 1);
}




* Open BMWResource class first, because of multiple class names, lets first import the correct classes for this implementation.



import io.quarkus.runtime.StartupEvent;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import io.vertx.mutiny.pgclient.PgPool;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;




* Open the BMWResource class and implement the create() and delete() methods. Add the code below to the class. 


@POST
public Uni<Response> create(BMW bmw) {
    return bmw.save(client)
            .onItem().transform(id -> URI.create("/bmwcars/" + id))
            .onItem().transform(uri -> Response.created(uri).build());
}




@DELETE
@Path("{id}")
public Uni<Response> delete(Long id) {
    return BMW.delete(client, id)
            .onItem().transform(deleted -> deleted ? Response.Status.NO_CONTENT : Response.Status.NOT_FOUND)
            .onItem().transform(status -> Response.status(status).build());
}



* The start-up of the server could fail to compile because of both resteasy reactive and mutiny reactive, and you will have to comment out the Jackson reactive dependency 

$ mvnw.cmd  compile quarkus:dev


* Reload the project by using maven tool

* Using command line, add a new car in the database
$ curl --header "Content-Type: application/json" --request POST --data "{\"model\":\"760li\", \"year\":\"2021\", \"color\":\"Shining Shaddow Special\", \"price\":\"R3,570,664.00\"}" http://localhost:8080/bmwcars


* Go to the following URL to see the updated BMW car list using the URL below:  http://localhost:8080/bmwcars   

* Now create a frontend to use a browser to interact with the application.
o Navigate to src/main/resource/META-INF.resource and create a new page, bmwshop.html with the following contents


<!doctype html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8"/>
    <title>BMW Car Shop For Clients - Using Quarkus</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <script type="application/javascript" src="bmwcars.js"></script>
</head>
<body>

<div class="container-fluid p-5 bg-primary text-white text-center">
    <h1 class="display-1">BMW Quarkus Workshop</h1>
    <h1 class="display-6">Virtual BMW Cars Shop</h1>
</div>


<br><br>
<center>
    <div class="card" style="width:800px" align="center">
        <div class="card-body">
            <h4 class="card-title">All Cars</h4>
            <div id="all-bmws"></div>
        </div>
    </div>
</center>

<br><br>

<center>
    <div class="card" style="width:800px" align="center">
        <div class="card-body">

            <h2>Create BMW Car</h2>
            <input class="form-control" id="car-model" type="text" placeholder="Enter BMW Model" required>
            <input class="form-control" id="car-year" type="text" placeholder="Enter Year of manufacturing" required>
            <input class="form-control" id="car-color" type="text" placeholder="Enter Color Of Car" required>
            <input class="form-control" id="car-price" type="text" placeholder="Enter Price Of The Car" required>
            <br>
            <button class="btn btn-primary" id="create-car-button" type="button">Create</button>
            <div id="create-car"></div>

        </div>
    </div>
</center>

</body>
</html>



o Navigate to src/main/resource/META-INF.resource and create a new page, bmwcars.js with the following contents


function refresh() {
    $.get('/bmwcars', function (bmwcars) {

        var list = '';

        list = list
            + '<div class="container">'
            + '<table class="table table-hover">'
            + '<thead>'
            + '<tr>'
            + '<th>ID</th>'
            + '<th>Model</th>'
            + '<th>Yea</th>'
            + '<th>Color</th>'
            + '<th>Price</th>'
            + '<th>Action</th>'
            + '</tr>'
            + '</thead>'
            + '<tbody>';

        (bmwcars || []).forEach(function (bmw) {
            list = list
                    + '<tr>'
                        + '<td>' + bmw.id + '</td>'
                        + '<td>' + bmw.model + '</td>'
                        + '<td>' + bmw.year + '</td>'
                        + '<td>' + bmw.color + '</td>'
                        + '<td>' + bmw.price + '</td>'
                        + '<td><a href="#" onclick="deleteCar(' + bmw.id + ')">Delete</a></td>'
                    + '</tr>'
                + '</tbody>'
                + '</div>'
        });
        if (list.length > 0) {
            list = ''
                + '<table><thead><th>Id</th><th>Name</th><th></th></thead>'
                + list
                + '</table>';
        } else {
            list = "No BMW cars in database"
        }
        $('#all-bmws').html(list);
    });
}

function deleteCar(id) {
    $.ajax('/bmwcars/' + id, {method: 'DELETE'}).then(refresh);
}

$(document).ready(function () {

    $('#create-car-button').click(function () {
        var carModel = $('#car-model').val();
        var carYear = $('#car-year').val();
        var carColor = $('#car-color').val();
        var carPrice = $('#car-price').val();
        $.post({
            url: '/bmwcars',
            contentType: 'application/json',
            data: JSON.stringify({model: carModel,year: carYear,color: carColor,price: carPrice})
        }).then(refresh);
    });

    refresh();
});



* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open browser to http://localhost:8080/bmwshop.html   

Self-exercise: Add validations to the inputs, making sure that all the fields are populated before submitting to the database 

Practice III: Making use of an external API services

* Create a child package called client, to store all the database files in that package:
* za.co.bmw.workshop.day.three.client

* Manually edit the pom.xml file, to add the web-client dependency


<dependency>
  <groupId>io.smallrye.reactive</groupId>
  <artifactId>smallrye-mutiny-vertx-web-client</artifactId>
</dependency>


* Use the maven tool to update the project to add the new dependency. 


* Create a ResourceUsingExtAPI class, with the following code contents:


package za.co.bmw.workshop.day.three.client;


import io.smallrye.mutiny.Uni;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.WebClientOptions;
import io.vertx.mutiny.core.Vertx;
import io.vertx.mutiny.ext.web.client.WebClient;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ext-data")
public class ResourceUsingExtAPI {

    @Inject
    Vertx vertx;

    private WebClient client;

    @PostConstruct
    void initialize() {
        this.client = WebClient.create(vertx,
                new WebClientOptions().setDefaultHost("fruityvice.com").setDefaultPort(443).setSsl(true)
                        .setTrustAll(true));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{name}")
    public Uni<JsonObject> getExtData(String name) {
        return client.get("/api/fruit/" + name)
                .send()
                .map(resp -> {
                    if (resp.statusCode() == 200) {
                        return resp.bodyAsJsonObject();
                    } else {
                        return new JsonObject()
                                .put("code", resp.statusCode())
                                .put("message", resp.bodyAsString());
                    }
                });
    }
}



* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open another terminal and run the following:
$ curl http://localhost:8080/ext-data/Kiwi

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/ext-data/Kiwi  

	
* Self-Exercise: Update the base url and api url to play around with free API. Use the following free APIs to update the class:
o https://catfact.ninja/fact 
o https://www.boredapi.com/api/activity 
o https://api.genderize.io/?name=john 
o https://official-joke-api.appspot.com/random_joke 

Using Web Sockets

* Creating Web Sockets Applications
o The WebSocket protocol provides two-way communication between web clients and servers. Communications between clients and the server are event-based, allowing for faster processing and smaller bandwidth compared with polling-based methods. WebSocket is available for use in web applications using a JavaScript API and by client WebSocket endpoints using the Java Websocket API.

o A connection is first established between client and server as an HTTP connection. The client then requests a WebSocket connection using the Upgrade header. All communications are then full duplex over the same TCP/IP connection, with minimal data overhead. Because each message does not include unnecessary HTTP header content, Websocket communications require smaller bandwidth. The result is a low latency communications path suited to applications, which require real-time responsiveness.

o The JBoss EAP WebSocket implementation provides full dependency injection support for server endpoints, however, it does not provide CDI services for client endpoints.

o A WebSocket application requires the following components and configuration changes:
* A Java client or a WebSocket enabled HTML client. You can verify HTML client browser support at this location: http://caniuse.com/#feat=websockets
* A WebSocket server endpoint class.
* Project dependencies configured to declare a dependency on the WebSocket API.


o Typical WebSocket client contains these JavaScript functions:
* connect(): This function creates the WebSocket connection passing the WebSocket URI. The resource location matches the resource defined in the server endpoint class. This function also intercepts and handles the WebSocket onopen, onmessage, onerror, and onclose.
* sendMessage(): This function gets the name entered in the form, creates a message, and sends it using a WebSocket.send() command.
* disconnect(): This function issues the WebSocket.close() command.
* displayMessage(): This function sets the display message on the page to the value returned by the WebSocket endpoint method.
* displayStatus(): This function displays the WebSocket connection status.

* Summary of the exercises
* Practice III: Creating a two-way application Web Chat


Practice III: Creating a two-way application Web Chat
* Open the termina for the day three project and add the websockets extension

$ mvnw.cmd  quarkus:add-extension -Dextensions="websockets"

* Use the mavel tool to update the project to add the new dependency. 

* Create a child package called websocket :
o za.co.bmw.workshop.day.three.websockets

* Create a class to demonstrate a two-way chat communication between two users. Class name: ChatSocket with the following code.
o Add the Path and ApplicationScope



package za.co.bmw.workshop.day.three.websockets;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chat/{username}")
@ApplicationScoped
public class ChatSocket {
    
}

o Do all the relevant imports 


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.Session;


o Implement the broadcast() method


private void broadcast(String message) {
    sessions.values().forEach(s -> {
        s.getAsyncRemote().sendObject(message, result ->  {
            if (result.getException() != null) {
                System.out.println("Unable to send message: " + result.getException());
            }
        });
    });
}


o Implement the onOpen() method


Map<String, Session> sessions = new ConcurrentHashMap<>();

@OnOpen
public void onOpen(Session session, @PathParam("username") String username) {
    sessions.put(username, session);
}

o Implement the onClose() method


@OnClose
public void onClose(Session session, @PathParam("username") String username) {
    sessions.remove(username);
    broadcast("User " + username + " left");
}


o Implement the onError() method


@OnError
public void onError(Session session, @PathParam("username") String username, Throwable throwable) {
    sessions.remove(username);
    broadcast("User " + username + " left on error: " + throwable);
}


o Implement the onMessage() method


@OnMessage
public void onMessage(String message, @PathParam("username") String username) {
    if (message.equalsIgnoreCase("_ready_")) {
        broadcast("User " + username + " joined");
    } else {
        broadcast(">> " + username + ": " + message);
    }
}


* Here is the full ChatSocket class implementation


package za.co.bmw.workshop.day.three.websockets;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.Session;

@ServerEndpoint("/chat/{username}")
@ApplicationScoped
public class ChatSocket {

    Map<String, Session> sessions = new ConcurrentHashMap<>();

    @OnOpen
    public void onOpen(Session session, @PathParam("username") String username) {
        sessions.put(username, session);
    }

    @OnClose
    public void onClose(Session session, @PathParam("username") String username) {
        sessions.remove(username);
        broadcast("User " + username + " left");
    }

    @OnError
    public void onError(Session session, @PathParam("username") String username, Throwable throwable) {
        sessions.remove(username);
        broadcast("User " + username + " left on error: " + throwable);
    }

    @OnMessage
    public void onMessage(String message, @PathParam("username") String username) {
        if (message.equalsIgnoreCase("_ready_")) {
            broadcast("User " + username + " joined");
        } else {
            broadcast(">> " + username + ": " + message);
        }
    }

    private void broadcast(String message) {
        sessions.values().forEach(s -> {
            s.getAsyncRemote().sendObject(message, result ->  {
                if (result.getException() != null) {
                    System.out.println("Unable to send message: " + result.getException());
                }
            });
        });
    }

}


* Create a new html file that we will use for chatting. Call the file chat.html file in the src/main/resource/META-INF.resource/chat.html with the code below.


<!doctype html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8"/>
    <title>BMW Chat Tool</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <script type="application/javascript" src="bmwcars.js"></script>
    <style>
        #chat {
            resize: none;
            overflow: hidden;
            min-height: 300px;
            max-height: 300px;
        }
    </style>
    <script type="text/javascript">
        var connected = false;
        var socket;

        $( document ).ready(function() {
            $("#connect").click(connect);
            $("#send").click(sendMessage);

            $("#name").keypress(function(event){
                if(event.keyCode == 13 || event.which == 13) {
                    connect();
                }
            });

            $("#msg").keypress(function(event) {
                if(event.keyCode == 13 || event.which == 13) {
                    sendMessage();
                }
            });

            $("#chat").change(function() {
                scrollToBottom();
            });

            $("#name").focus();
        });

        var connect = function() {
            if (! connected) {
                var name = $("#name").val();
                console.log("Val: " + name);
                socket = new WebSocket("ws://" + location.host + "/chat/" + name);
                socket.onopen = function() {
                    connected = true;
                    console.log("Connected to the web socket");
                    $("#send").attr("disabled", false);
                    $("#connect").attr("disabled", true);
                    $("#name").attr("disabled", true);
                    $("#msg").focus();
                };
                socket.onmessage =function(m) {
                    console.log("Got message: " + m.data);
                    $("#chat").append(m.data + "\n");
                    scrollToBottom();
                };
            }
        };

        var sendMessage = function() {
            if (connected) {
                var value = $("#msg").val();
                console.log("Sending " + value);
                socket.send(value);
                $("#msg").val("");
            }
        };

        var scrollToBottom = function () {
            $('#chat').scrollTop($('#chat')[0].scrollHeight);
        };

    </script>

</head>
<body>


<section style="background-color: #eee;">
    <div class="container py-5">

        <div class="row d-flex justify-content-center">
            <div class="col-md-8 col-lg-6 col-xl-4">

                <div class="card">
                    <div class="card-header d-flex justify-content-between align-items-center p-3"
                         style="border-top: 4px solid #ffa900;">
                        <div class="input-group mb-3">
                            <input id="name" type="text" class="form-control" placeholder="Your Name" aria-label="Enter Your Name" aria-describedby="button-addon2">
                            <button id="connect" type="button" class="btn btn-outline-secondary">Connect</button>
                        </div>
                    </div>
                    <div class="card-body" data-mdb-perfect-scrollbar="true" >

                        <div class="row">
                            <textarea class="form-control" id="chat" style="height: 650px"></textarea>
                        </div>

                    </div>
                    <div class="card-footer text-muted d-flex justify-content-start align-items-center p-3">
                        <div class="input-group mb-0">
                            <input id="msg"  type="text" class="form-control" placeholder="Type message"
                                   aria-label="Type message" aria-describedby="button-addon2" />
                            <button class="btn btn-warning" type="button" id="send" style="padding-top: .55rem;">
                                Send
                            </button>
                        </div>
                    </div>
                </div>

            </div>
        </div>

    </div>
</section>
</body>
</html>



* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open another terminal and run the following:
$ curl http://localhost:8080/chat.html

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/chat.html  



Messaging using Kafka

* Architectural differences
o Apache Kafka is a popular open-source distributed event streaming platform. It is used commonly for high-performance data pipelines, streaming analytics, data integration, and mission-critical applications. Like a message queue, or an enterprise messaging platform, it lets you:
* publish (write) and subscribe to (read) streams of events, called records.
* store streams of records durably and reliably inside topics.
* process streams of records as they occur or retrospectively.

o And all this functionality is provided in a distributed, highly scalable, elastic, fault-tolerant, and secure manner.

o Because Smallrye Reactive Messaging framework supports different messaging backends like Apache Kafka, AMQP, Apache Camel, JMS, MQTT, etc., it employs a generic vocabulary:
* Applications send and receive messages. A message wraps a payload and can be extended with some metadata. With the Kafka connector, a message corresponds to a Kafka record.
* Messages transit on channels. Application components connect to channels to publish and consume messages. The Kafka connector maps channels to Kafka topics.
* Channels are connected to message backends using connectors. Connectors are configured to map incoming messages to a specific channel (consumed by the application) and collect outgoing messages sent to a specific channel. Each connector is dedicated to a specific messaging technology. For example, the connector dealing with Kafka is named smallrye-kafka.


o Architecture
* In this guide, we are going to develop two applications communicating with Kafka. The first application sends a quote request to Kafka and consumes Kafka messages from the quote topic. The second application receives the quote request and sends a quote back.

* Summary of the exercises
* Practice IV-I: Using processor and producer in a single project
* Practice IV-II: Using processor and producer in a separate dedicated project

Practice IV: Implementing a Kafka messaging application 
Practice IV-I: Using processor and producer in a single project

* Open a terminal to add the kafka extensions to the project.

$ mvnw.cmd  quarkus:add-extension -Dextensions="resteasy-reactive-jackson, smallrye-reactive-messaging-kafka"


* Start up the Kafka server using Docker. First make sure that the Docker Desktop is running in the background
$ cd practice/
$ docker compose -f docker-compose.yaml up -d


* Create a child package called websocket :
o za.co.bmw.workshop.day.three.kafka

* Create a class to demonstrate a two-way chat communication between two users. Class name: Car with variables model and year.


package za.co.bmw.workshop.day.three.kafka;

public class Car {

    public String model;
    public int year;
}


* Update the application.properties file to add the kafka producer and receiver configurations. 


# The Kafka broker location (defaults to localhost:9092)
kafka.bootstrap.servers=localhost:9092

# Configuring the incoming channel (reading from Kafka)
mp.messaging.incoming.cars-in.connector=smallrye-kafka
mp.messaging.incoming.cars-in.topic=cars
mp.messaging.incoming.cars-in.key.deserializer=org.apache.kafka.common.serialization.IntegerDeserializer
mp.messaging.incoming.cars-in.value.deserializer=org.apache.kafka.common.serialization.StringDeserializer

# Configuring the outgoing channel (writing to Kafka)
mp.messaging.outgoing.cars-out.connector=smallrye-kafka
mp.messaging.outgoing.cars-out.topic=cars
mp.messaging.outgoing.cars-out.key.serializer=org.apache.kafka.common.serialization.IntegerSerializer
mp.messaging.outgoing.cars-out.value.serializer=org.apache.kafka.common.serialization.StringSerializer


* Create a class CarProducer that will be sending messages to the kafka server.


package za.co.bmw.workshop.day.three.kafka;

import io.smallrye.reactive.messaging.kafka.Record;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CarProducer {

    @Inject @Channel("cars-out")
    Emitter<Record<Integer, String>> emitter;

    public void sendCarListToKafka(Car car) {
        emitter.send(Record.of(car.year, car.model));
    }
}


* Create a class CarConsumer that will be receiving cars and displaying them.


package za.co.bmw.workshop.day.three.kafka;


import io.smallrye.reactive.messaging.kafka.Record;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CarConsumer {

    private final Logger logger = Logger.getLogger(CarConsumer.class);

    @Incoming("cars-in")
    public void receive(Record<Integer, String> record) {
        logger.infof("Car details on the floor (Year - Model): %d - %s", record.key(), record.value());
    }
}


* Create an end point class CarResource that will be used by public to send and receive cars 



package za.co.bmw.workshop.day.three.kafka;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/kafka")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CarResource {

    @Inject
    CarProducer producer;

    @POST
    public Response send(Car car) {
        producer.sendCarListToKafka(car);
        // Return an 202 - Accepted response.
        return Response.accepted().build();
    }
}




* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Open another terminal and run the following:
$ curl --header "Content-Type: application/json" --request POST --data "{\"year\":\"2021\", \"model\":\"BMW 750d\"}" http://localhost:8080/kafka 

* Add 3 more car models using curl or other tools to send and receive cars from and to the kafka services. 


Practice IV-II: Using processor and producer in a separate dedicated project

* We have to first create applications that are dedicated as a producer and a processor projects. 
o Open CMD and run the following command:

$ mvn io.quarkus:quarkus-maven-plugin:2.9.2.Final:create  -DprojectGroupId=za.co.bmw.workshop.day-three-producer -DprojectArtifactId=bmw-workshop-day-three-producer  -DclassName="za.co.bmw.workshop.day.three.producer.QuotesResource" -Dpath="/bmw-quotes"  -Dextensions="resteasy-reactive-jackson, resteasy-reactive-jackson,smallrye-reactive-messaging-kafka"

$ mvn io.quarkus:quarkus-maven-plugin:2.9.2.Final:create  -DprojectGroupId=za.co.bmw.workshop.day-three-processor -DprojectArtifactId=bmw-workshop-day-three-processor  -DclassName="za.co.bmw.workshop.day.three.producer.QuotesProcessor"  -Dextensions="resteasy-reactive-jackson, resteasy-reactive-jackson,smallrye-reactive-messaging-kafka"

* Open IntelliJ and open the bmw-workshop-day-three-producer and then bmw-workshop-day-three-producer project on a new window, to have both projects running on your computer. 

o On both bmw-workshop-day-three-producer and bmw-workshop-day-three-producer projects, create a new class (Quote.class) that will be used to produce and receive messages



public class Quote {

    public String id;
    public int price;

    /**
     * Default constructor required for Jackson serializer
     */
    public Quote() { }

    public Quote(String id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}



* Open the producer project, then update the QuotesResource class with the following code


package za.co.bmw.workshop.day.three.producer;

import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.smallrye.mutiny.Multi;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Path("/quotes")
public class QuotesResource {

    @Channel("quotes")
    Multi<Quote> quotes;

    @Channel("quote-requests")
    Emitter<String> quoteRequestEmitter;

    /**
     * Endpoint to generate a new quote request id and send it to "quote-requests" Kafka topic using the emitter.
     */
    @POST
    @Path("/request")
    @Produces(MediaType.TEXT_PLAIN)
    public String createRequest() {
        UUID uuid = UUID.randomUUID();
        quoteRequestEmitter.send(uuid.toString());
        return uuid.toString();
    }

    /**
     * Endpoint retrieving the "quotes" Kafka topic and sending the items to a server sent event.
     */
    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    public Multi<Quote> stream() {
        return quotes;
    }
}



* Open the processor project, then update the QuotesProcessor class with the following code


package za.co.bmw.workshop.day.three.producer;


import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import io.smallrye.reactive.messaging.annotations.Blocking;


@ApplicationScoped
public class QuotesProcessor {

    private Random random = new Random();

    @Incoming("requests")
    @Outgoing("quotes")
    @Blocking
    public Quote process(String quoteRequest) throws InterruptedException {
        // simulate some hard working task
        Thread.sleep(200);
        return new Quote(quoteRequest, random.nextInt(2500000));
    }
}



* Open the processor project, then create a new html page which will be used as the front-end interface. Go to src/main/resources/META-INF/resources/ and create quotes.html



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Kafka Quotation System</title>

    <link rel="stylesheet" type="text/css"
          href="https://cdnjs.cloudflare.com/ajax/libs/patternfly/3.24.0/css/patternfly.min.css">
    <link rel="stylesheet" type="text/css"
          href="https://cdnjs.cloudflare.com/ajax/libs/patternfly/3.24.0/css/patternfly-additions.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container p-5 my-5 border" align="center">
    <h1 class="display-1">BMW Kafka Quotation System</h1>
    <h5>An external standalone Java Microsystem Kafka Quotation System. Compliments of Quarkus</h5>
</div>

<div class="container">
    <div class="card">
        <div class="card-body">
            <center>

                <h1 class="display-6">Click the button below to generate a quote</h1>
                <button type="button" class="btn btn-outline-primary btn-lg" class="btn btn-info" id="request-quote">
                    <span class="spinner-grow spinner-grow-sm"></span>
                    Request Quote
                </button>
                <br><br>
                <div class="quotes"></div>
            </center>
        </div>
    </div>
</div>
</body>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    $("#request-quote").click((event) => {
        fetch("/quotes/request", {method: "POST"})
            .then(res => res.text())
            .then(qid => {
                var row = $(`<h4 class='col-md-12' id='${qid}'>Quote # <i>${qid}</i> | <strong>Processing</strong></h4>`);
                $(".quotes").prepend(row);
            });
    });

    var source = new EventSource("/quotes");
    source.onmessage = (event) => {
        var json = JSON.parse(event.data);
        $(`#${json.id}`).html((index, html) => {
            return html.replace("Processing", `${json.description}`);
        });
    };
</script>
</html>


* Restart the dev server to see the changes that has been made during the server startup process. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* If not up, then start the dev server up
$ mvnw.cmd  compile quarkus:dev

* Go to the following URL to see the updated port numbers using the following URL:  http://localhost:8080/quotes.html  

Using Dev UI

* Architectural differences
o Feature sets aside, the Quarkus application that is run under dev mode differs architecturally from the production application (i.e. the one that is run using java -jar …).

o In dev mode, Quarkus uses a ClassLoader hierarchy that enables the live reload of user code without requiring a rebuild and restart of the application.

o In a production application, the aforementioned class loading infrastructure is entirely absent - there is a single, purpose built ClassLoader that loads (almost) all classes and dependencies.

* Dev-mode features
o In keeping with the mantra of providing developer joy, Quarkus provides a host of features when dev mode is enabled. The most important features are:

o Live reload
* This mightily important feature needs no introduction and has already been mentioned in the architectural differences section.

o Dev UI
* Quarkus provides a very useful UI accessible from the browser at /q/dev. This UI allows a developer to see the state of the application, but also provides access to various actions that can change that state (depending on the extensions that are present). Examples of such operations are:

o Changing configuration values

o Running Database migration scripts

o Clearing of caches

o Running scheduled operations

o Building a container

o Error pages
* In an effort to make development errors very easy to diagnose, Quarkus provides various detailed error pages when running in dev mode.

o Database import scripts
* The quarkus-hibernate-orm extension will run the import.sql script in src/main/resources when Quarkus is running in dev mode. More details can be found here.

o Dev Services
* When testing or running in dev mode Quarkus can even provide you with a zero config database out of the box, a feature we refer to as Dev Services. More information can be found here.

o Swagger UI
* The quarkus-smallrye-openapi extension will expose the Swagger UI when Quarkus is running in dev mode. Additional information can be found here.

o GraphQL UI
* The quarkus-smallrye-graphql extension will expose the GraphiQL UI when Quarkus is running in dev mode. More details can be found here.

o Health UI
* The quarkus-smallrye-health extension will expose the Health UI when Quarkus is running in dev mode. This section provides additional information.

o Mock mailer
* The quarkus-mailer extension will enable an in-memory mock mail server when Quarkus is running in dev mode. See this for more details.

o gRPC
* The gRPC Reflection Service is enabled in dev mode by default. That lets you use tools such as grpcurl. In production mode, the reflection service is disabled. You can enable it explicitly using quarkus.grpc-server.enable-reflection-service=true.

o In dev mode, quarkus.grpc.server.instances has no effect.

Practice VI: Observing various DevUI components

* Switch off any running projects. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* Navigate to the bmw-workshop-day-one project, and start 
$ cd  bmw-workshop-day-one/
$ mvnw.cmd  clean
$ mvnw.cmd  compile quarkus:dev

* Open your browser to application base, then navigate to DevUI for the project.  Go to http://localhost:8080
o See the selected extensions for this project. 


o Observe all the files that are contained in the project 

 
o Then click on the Visit The Dev UI button  



o Click on each card to navigate and see classes that area loaded, class sequence and other processes. 

* Do the same for all the other projects
o bmw-workshop-day-two 
o bmw-workshop-day-three
o bmw-workshop-day-three-processor
o bmw-workshop-day-three-producer

Homework: 

* Continue from the homework from yesterday (eCommerce project). 

o Create an additional package to the project - client
o Client Entity:
* id
* first_name
* surname
* id_number
* address 
* budget
o Create a postgres database table
o Implement getAll(), findById(), persist() and remove() data to the database, using Service and Resource classes
o Use Mutiny return types
o (Optional) Implement a 2-way chat system for customer service



======== END-OF-DAY-03 ========



























Day 04

Objectives
* Packaging and Distributing Native Applications 
* Deploying to Kubernetes
* Computing Stats
* Custom Quarkus Extension

Packaging and Distributing Native Applications

Producing a native executable
* The native executable for our application will contain the application code, required libraries, Java APIs, and a reduced version of a VM. The smaller VM base improves the startup time of the application and produces a minimal disk footprint.

* If you have generated the application from the previous tutorial, you can find in the pom.xml the following profile:
<profiles>
    <profile>
        <id>native</id>
        <properties>
            <quarkus.package.type>native</quarkus.package.type>
        </properties>
    </profile>
</profiles>

Choose a Packaging Format
* there are several aspects to pay attention:
o fast-jar or legacy-jar 
o create a uber-jar or deliver the quarkus-app-folder

* What is a uber-jar?
o Über is the German word for above or over (it’s actually cognate with the English over). Hence, in this context, an uber-jar is an "over-jar", one level up from a simple JAR (a), defined as one that contains both your package and all its dependencies in one single JAR file. The name can be thought to come from the same stable as ultrageek, superman, hyperspace, and metadata, which all have similar meanings of "beyond the normal".
o uber-jar is also known as fat jar i.e. jar with dependencies. There are three common methods for constructing an uber jar:
1. Unshaded: Unpack all JAR files, then repack them into a single JAR. Works with Java’s default class loader. Tools maven-assembly-plugin
2. Shaded: Same as unshaded, but rename (i.e., "shade") all packages of all dependencies. Works with Java’s default class loader. Avoids some (not all) dependency version clashes. Tools maven-shade-plugin
3. JAR of JARs: The final JAR file contains the other JAR files embedded within. Avoids dependency version clashes. All resource files are preserved. Tools: Eclipse JAR File Exporter
How to change the package type?
* You have to change the quarkus.package.type-property
* options:
o jar ? fast-jar
o legacy-jar
o uber-jar
o native
* Where can you change the property?
o application.properties

quarkus.package.type=uber-jar

o pom.xml
<properties>
  <quarkus.package.type>uber-jar</quarkus.package.type>
</properties>

o As a maven-parameter

       $ mvnw.cmd  clean package -Dquarkus.package.type=uber-jar


* Summary of the exercises
* Practice IV-I: Using processor and producer in a single project
* Practice IV-II: Using processor and producer in a separate dedicated project


Practice I: Packaging running native apps 

* Open Terminal and navigate to the bmw-workshop-day-one project, and start 
$ cd  bmw-workshop-day-one/
$ mvnw.cmd clean compile
$ mvnw.cmd install
$ java -jar target/quarkus-app/quarkus-run.jar


* Then the application will start as production, then you can navigate to the following URLs like you did on dev.
o http://localhost:8088/hello
o http://localhost:8088/hello/greeting/thato
o http://localhost:8088/hello/course-details 
o http://localhost:8088/hello/more-details 


* Open the project using IntelliJ and go to the application.properties file and add the new uber-jar package type with the following line 


quarkus.package.type=uber-jar



* Go back the the bmw-workshop-day-one terminal and run the following line of code. 
$ mvnw.cmd  compile install 

* Switch off any running projects. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number

* Run the application using the uber version. 
$ java -jar target\bmw-workshop-day-one-1.0.0-SNAPSHOT-runner.jar

* Then the application will start as production, then you can navigate to the following URLs like you did on dev.
o http://localhost:8088/hello
o http://localhost:8088/hello/greeting/thato
o http://localhost:8088/hello/course-details 
o http://localhost:8088/hello/more-details 

* Switch off any running projects. 
$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number


Practice II: Packaging your application as a Docker image 


* In preparing for a docker image. Go back to the application.properties file and remove the uber-jar line 


# quarkus.package.type=uber-jar



* Generate a docker image with your project. 
$ mvnw.cmd  compile install 

* Make sure the Docker Desktop is running in the background.  Open CMD and run the following command:
$ docker build -f src/main/docker/Dockerfile.jvm -t htl-bmwdayone/hello .

Open Docker to verify that image has been created. Open Docker, Click on Images


* Run the application from Docker instead of IntelliJ
$ docker run -i --rm -p 8088:8088 htl-bmwdayone/hello

* Then the application will start as production, then you can navigate to the following URLs like you did on dev.
o http://localhost:8088/hello
o http://localhost:8088/hello/greeting/thato
o http://localhost:8088/hello/course-details 
o http://localhost:8088/hello/more-details 

* Then stop the application by using Ctrl + C or Ctrl + Z

Practice III: Packaging your application as a Kubernetes image 

* Go to Docker Hub to create a repository. Click on https://hub.docker.com/, then login with.
o Click on Repositories 
o Click on Create Repository button to create a repository
o Make note of your repository name. For the sake of this training, I will name mine bmwtraining

* Then open Terminal to login on your docker local machine. 
$ docker login

* List the images that are created in the docker
$ docker images



Note: Make note of the docker image that you have just uploaded on the previous exercise.

* Upload to hub.docker.com. 

$ docker push htl-bmwdayone/hello


* Start the container using the Image we just built just to make sure that the image can be instantiated as a container with no issues.

$ docker container run -d -it --name bmwdayone htl-bmwdayone/hello:latest


* Show the container that you have just created above 

$ docker container list


* A Container cannot run standalone in Kubernetes it must always run inside a POD. So Creating a POD is technically creating a Container

$ kubectl run bmwtraining-pod --image=htl-bmwdayone/hello --port=8088 --generator=run/v1


* Make Sure the POD is created and Ready.

$ kubectl get pods|egrep -i "^NAME|bmwtraining"


* Validate the pod creation and find more information

$ kubectl get pods

$ kubectl get pods/bmwtraining-pod-jsrvz


$ kubectl describe pods/redis-pod-jsrvz


* Validation: check the newly created pod in Kubernetes Dashboard (GUI) – minikube

$ minikube dashboard



Homework:

NB: Run the following exercises on CMD as an Administrator. 



* Download graavelvm on your local machine and install it. And extract it in the Program Files folder, like the following: C:\Program Files\graalvm-ce-java11-22.2.0

* Download minikube on your local machine and install it. Navigate to https://minikube.sigs.k8s.io/docs/start/




* From the CMD you opened earlier, run the following commands:
$ setx /M GRAALVM_HOME "C:\Program Files\graalvm-ce-java11-22.2.0"
$ setx /M JAVA_HOME "C:\Program Files\graalvm-ce-java11-22.2.0"
$ setx /M PATH "C:\Program Files\graalvm-ce-java11-22.2.0\bin\;%PATH%"






* Open the bmw-workshop-day-one project using IntelliJ and open Terminal, run the following command
$ gu install native-image
$ minikube start

* Make sure the Docker Desktop is running in the background.  Open CMD and run the following command:

* From the CMD termina, navigate to bmw-workshop-day-one project and run the following command  
$ mvn clean package -Pnative

	NOTICE Errors: 

[ERROR]         [error]: Build step io.quarkus.container.image.deployment.ContainerImageProcessor#publishImageInfo threw an exception: java.lang.IllegalStateException: quarkus-container-image-jib and quarkus-container-image-docker were detected, at most one container-image extension can be present

* Navigate to pom.xml to remove/disable the quarkus-container-image-docker dependency in order to compile and run the application on 


<dependency>
  <groupId>io.quarkus</groupId>
  <artifactId>quarkus-kubernetes</artifactId>
</dependency>
<!--
<dependency>
  <groupId>io.quarkus</groupId>
  <artifactId>quarkus-container-image-docker</artifactId>
</dependency>
-->
<dependency>
  <groupId>io.quarkus</groupId>
  <artifactId>quarkus-minikube</artifactId>
</dependency>


* Reload the project using Maven. Right click on the project -> Maven -> Reload Project

* Download the Visual Studio Build Tools (C development environment) from visualstudio.microsoft.com.

* Start the Visual Studio Build Tools installation by clicking on the .exe file, and then press Continue:


* Check the Desktop development with C++ box in the main window. Also, on the right side under Installation Details, choose Windows 10 SDK, and click the Install button.

* After the installation completes, reboot your system.
o WINDOWS 10 SDK:
* Next, if you have Visual Studio 2019 installed, you will need to ensure Windows 10 SDK is available too:
o Open the Visual Studio Installer:


* Under the Installed tab, click Modify and choose Individual Components:

* Then scroll to the bottom and check if Windows 10 SDK is installed and confirm the build tools are installed:


Now that you have the Windows 10 SDK and Visual Studio tooling installed, you can start using GraalVM Native Image.

* On Windows, the native-image builder will only work when it’s executed from the x64 Native Tools Command Prompt. The command for initiating an x64 Native Tools command prompt is different if you only have the Visual Studio Build Tools installed, versus if you have the full VS Code 2019 installed.

* Alternatively, you can launch a Dev command prompt from the Visual Studio 2019 interface:



* Ensure that minikube is running
$ minikube start

* Login on Docker
$ docker login

Enter docker username and password

* Re-run the native packaging command from CMD  
$ mvn clean package -Dquarkus.kubernetes.deploy=true

* Now that the image has been created on Kubernetes, run a list of images running on your computer.
$ kubectl get pod



* Activate the Dashboard
$ minikube dashboard

* The application will redirect to the Dashboard, alternatively you can click below:
http://127.0.0.1:54677/api/v1/namespaces/kubernetes-dashboard/services/http:kubernetes-dashboard:/proxy/#/workloads?namespace=default 

o Click on Pods -> bmw-workshop-day-one
o Click around to see details of your pod (image) running on kubernetes

* Open another terminal from x64 Native Tools Command Prompt and run the following command
$ kubectl get svc



* Homework: Do the same for all the other projects
o bmw-workshop-day-two 
o bmw-workshop-day-three
o bmw-workshop-day-three-processor
o bmw-workshop-day-three-producer

Make note of the errors and see if you can fix them. 

TIP: Most errors are caused by the Testing classes (error 404), end point testing not completed in the previous sections
	
Quarkus Health and Computing Stats


* The general status of the health check is computed as a logical AND of all the declared health check procedures. The checks array is empty as we have not specified any health check procedure yet so let’s define some.

* Health checks are a necessary piece of any application, especially when running in a Kubernetes environment like OpenShift. When the pods are being scheduled and started, it tells Kubernetes when they are ready to be added to the service to accept requests.

* However, there is actual two pieces to health checking. The liveness check provides feedback on whether application is up and running. Of course, we don’t want to route requests to something not running. But the more important piece of health checking is its sibling, the readiness check. The readiness check not only provides feedback that the application is up and running, but that it’s ready to begin serving. Many times, there are gaps between the two.

* For example, with our Customer API, we will want to check to make sure the integration points are ready and connected. We want to make sure the database is there and up to speed. We would also want to check that we can connect out to any messaging infrastructure, such as a Kafka cluster, prior to serving any load. There are other use cases as well, such as cache loading, which will need to be performed prior to joining the service.

* MicroProfile Health allows services to report their health, and it publishes the overall health status to a defined endpoint. A service reports UP if it is available and reports DOWN if it is unavailable. MicroProfile Health reports an individual service status at the endpoint and indicates the overall status as UP if all the services are UP. A service orchestrator can then use the health statuses to make decisions.

* A service checks its own health by performing necessary self-checks and then reports its overall status by implementing the API provided by MicroProfile Health. A self-check can be a check on anything that the service needs, such as a dependency, a successful connection to an endpoint, a system property, a database connection, or the availability of required resources. MicroProfile offers checks for startup, liveness, and readiness.

* Visit the http://localhost:9080/health URL to see the overall health status of the application, as well as the aggregated data of the startup, liveness and readiness checks. Three checks show the state of the system service, and the other three checks show the state of the inventory service. As you might expect, all services are in the UP state, and the overall health status of the application is in the UP state.

* Access the /health/started endpoint by visiting the http://localhost:9080/health/started  URL to view the data from the startup health checks. You can also access the /health/live endpoint by visiting the http://localhost:9080/health/live  URL to view the data from the liveness health checks. Similarly, access the /health/ready endpoint by visiting the http://localhost:9080/health/ready  URL to view the data from the readiness health checks.

* All services must provide an implementation of the HealthCheck interface, which is used to verify their health. MicroProfile Health offers health checks for startup, liveness, and readiness. A startup check allows applications to define startup probes that are used for initial verification of the application before the Liveness probe takes over. For example, a startup check might check which applications require additional startup time on their first initialization. A liveness check allows third-party services to determine whether a microservice is running. If the liveness check fails, the application can be terminated. For example, a liveness check might fail if the application runs out of memory. A readiness check allows third-party services, such as Kubernetes, to determine whether a microservice is ready to process requests. For example, a readiness check might check dependencies, such as database connections.


* Let’s break down the test cases:
o The testStartup() test case compares the generated health report for the startup checks with the actual status of the services.
o The testLiveness() test case compares the generated health report for the liveness checks with the actual status of the services.
o The testReadiness() test case compares the generated health report for the readiness checks with the actual status of the services.
o The testHealth() test case compares the generated health report with the actual status of the services. This test also puts the inventory service in maintenance by setting the io_openliberty_guides_inventory_inMaintenance property to true and comparing the generated health report with the actual status of the services.


* Health Check
Health Checks are important in platforms like Kubernetes because it allows the infrastructure to be aware of the state of the application.

* There are two different types of health checks:
o Liveness probes tell your platform if your application is running ok or not. When your liveness probe is down, your platform might restart your instance to guarantee that you have the minimum required amount of running instances in production.
o Readiness probes tell your platform if your application is warm enough to reply to requests in a reasonable amount of time. Java applications, for example, might need some time to warm up, so the readiness probe should be up only when it’s ready to reply to a request in a timely manner. Checks that depend on other services should be implemented as readiness probes: if a remote service is down, restarting your application won’t fix the issue.

Running the health check
Importing the smallrye-health extension directly exposes three REST endpoints:

* /health/live - The application is up and running.
* /health/ready - The application is ready to serve requests.
* /health - Accumulating all health check procedures in the application.

To check that the smallrye-health extension is working as expected:

start your Quarkus application with ./mvnw compile quarkus:dev

access the http://localhost:8080/health/live  endpoint using your browser or curl http://localhost:8080/health/live 

All the health REST endpoints return a simple JSON object with two fields:
* status - the overall result of all the health check procedures
* checks -  an array of individual checks


* Add a custom readiness probe
In dev mode, all your heath checks are visible in health UI: http://localhost:8080/q/health-ui/ 

* Some extensions may provide default health checks, including that the extension will automatically register its health checks. For example, quarkus-agroal (that is used to manage Quarkus datasources) automatically registers a readiness health check that will validate each datasource.

* Since the readiness of the database is already assessed just by adding those extensions, we should look into defining health checks for other dependencies that we have. As we depend on the availability of https://www.fruityvice.com, let’s create a new ReadinessProbe to assess its availability prior to using it.


* Metrics
o When running applications in production we need to send monitoring information to some services like Prometheus.

* Quarkus provides JVM and other statistics out-of-box with the Metrics extension, but it’s very valuable for our application to produce its own metrics. Let’s see how we can achieve it in this chapter.

* As you can see health check procedures are defined as implementations of the HealthCheck interface which are defined as CDI beans with the one of the following CDI qualifiers:
o @Liveness - the liveness check accessible at /health/live
o @Readiness - the readiness check accessible at /health/ready

* HealthCheck is a functional interface whose single method call returns a HealthCheckResponse object which can be easily constructed by the fluent builder API shown in the example.

Practice IV: Using the default health checks provided by Quarkus 

* Open Terminal and navigate to the bmw-workshop-day-one project, and start 
$ cd  bmw-workshop-day-two/
$ mvnw.cmd  clean compile
$ mvnw.cmd  quarkus:dev 

* Then the application will start as production, then you can navigate to the following URLs like you did on dev.
o http://localhost:8080/q/health 
o http://localhost:8080/q/health/live 
o http://localhost:8080/q/health/ready   
o http://localhost:8080/q/health-ui/  

* Go back to Terminal and run the following command to list all running docker containers. 
$ docker container ls

* From the list of containers running, switch off the postgres container
$ docker container stop <Postgres Container ID>

* Then the application will start as production, then you can navigate to the following URLs like you did on dev.
o http://localhost:8080/q/health 
o http://localhost:8080/q/health/live 
o http://localhost:8080/q/health/ready   
o http://localhost:8080/q/health-ui/  

Practice V: Implementing custom health checks 

* Open IntelliJ and navigate to the bmw-workshop-day-one project
o Add a new package named health, defined as za.co.bmw.workshop.day.two.health

o Add a new class and name it CustomAppHealthCheck, created in the za.co.bmw.workshop.day.two.health package


package za.co.bmw.workshop.day.two.health;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;
import javax.enterprise.context.ApplicationScoped;

@Liveness
@ApplicationScoped
public class CustomAppHealthCheck implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("A custom health check parameter");
    }
}


o Add a new class and name it CustomDBHealthCheck, created in the za.co.bmw.workshop.day.two.health package


package za.co.bmw.workshop.day.two.health;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import javax.enterprise.context.ApplicationScoped;


@Liveness
@ApplicationScoped
public class CustomDBHealthCheck implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("A custom database health check parameter");
    }
}


* Open Terminal and navigate to the bmw-workshop-day-one project, and start 
$ mvnw.cmd  quarkus:dev 

* Then the application will start as production, then you can navigate to the following URLs like you did on dev.
o http://localhost:8080/q/health 
o http://localhost:8080/q/health/live 
o http://localhost:8080/q/health/ready   
o http://localhost:8080/q/health-ui/  


Practice VI: Implementing performance matrix checks 

* Open IntelliJ and navigate to the bmw-workshop-day-one project
o Add a new package named metrics, defined as za.co.bmw.workshop.day.two.metrics


* Add a new class and name it PerformanceResource, created in the za.co.bmw.workshop.day.two.metrics package


package za.co.bmw.workshop.day.two.metrics;

import java.time.Instant;
import java.util.Calendar;
import java.util.TimeZone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.instrument.MeterRegistry;

@Path("/metrics")
public class PerformanceResource {
    private final MeterRegistry registry;

    PerformanceResource(MeterRegistry registry) {
        this.registry = registry;
        registry.gauge("offsetFromUTC", this,
                PerformanceResource::offsetFromUTC);
    }

    @Counted(value = "time.now")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Instant now() {
        return Instant.now();
    }

    int offsetFromUTC() {
        return TimeZone.getDefault().getOffset(Calendar.ZONE_OFFSET)/(3600*1000);
    }
}


* Open Terminal and navigate to the bmw-workshop-day-one project, and start 
$ mvnw.cmd  quarkus:dev 

* Run a loop that will run through your application and show you timestamps between each execution
$ for /L %n in (1,1,5) do curl localhost:8080/metrics















Car racing Project

This is a race track in Kyalami, Midrand. We have a fleet of cars racing against BMW cars. On the one project, we will design and develop a restful quarkus application with a list on non-bmw cars and all their relevant details.

Then on another application we will design and develop restuful quarkus application with BMW models, with all its relevant details to each car.

Thereafter, we will design a quarkus application that will be tracking the races and results of each race. Lastly, we design a User Interface that will allow users to use the browser to interact with all relevant applications. 


Practice I: Implement the Non-BMW Cars Microservices using ORM


* Ensure that the Docker Desktop is running in the background. 
* Navigate to the resources folder, kyalami-racing/resources to run the script in order to create  the necessary database and kafka environments for this project. 
$ cd kyalami-racing/resources
$ docker compose -f docker-compose.yaml up -d

* Open CMD or terminal in order to create a new quarkus project by running the following command:

$ mvn io.quarkus:quarkus-maven-plugin:2.9.2.Final:create  -DprojectGroupId=bmw-workshop-kyalami-otherbrands -DprojectArtifactId=bmw-workshop-kyalami-otherbrands  -DclassName="za.co.bmw.workshop.kyalami.otherbrands.RaceCarResource" -Dpath="/racingcar"  -Dextensions="resteasy-reactive-jackson"


* Navigate to the pom.xml file to update the maven compiler version to 11 instead of the default 17 that gets created. 


<properties>
  <compiler-plugin.version>3.8.1</compiler-plugin.version>
  <failsafe.useModulePath>false</failsafe.useModulePath>
  <maven.compiler.release>11</maven.compiler.release>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
  <quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
  <quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
  <quarkus.platform.version>2.13.3.Final</quarkus.platform.version>
  <surefire-plugin.version>3.0.0-M7</surefire-plugin.version>
</properties>


* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

* Once you see the Dev server starts up without any errors, stop the server by pressing Ctlr + C on your laptop 

* Navigate to the RaceCarResource file that was created on the creation of the project. 

o Add a Path variable to point to @Path(“/info”) 
o Also make the updates that were performed on the hello() method to change the String to be returned. 


@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/info")
public String hello() {
    return "Microservice for racing cars that are not a BMW brand";
}


* Navigate to the OtherCarsResourceTest file that was created on the creation of the project. Customize and update the hello() method. 


@Test
public void testHelloEndpoint() {
    given()
            .when().get("/racingcar/info")
            .then()
            .statusCode(200)
            .body(is("Microservice for racing cars that are not a BMW brand"));
}


* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

* Then the application will start as production, then you can navigate to the following URLs like you did on dev.
o http://localhost:8080/racingcar/info 

* Add the ORM extension dependencies that we will be using in this project by running the following command on IntelliJ Terminal

$ mvnw.cmd  quarkus:add-extension -Dextensions="jdbc-postgresql,hibernate-orm-panache,hibernate-validator" 

* Reload the project using maven to update the project after the extensions that have just been added above



* Installing the OpenAPI extension

$ mvnw.cmd  quarkus:add-extension -Dextensions="smallrye-openapi"

* Reload the project using maven to update the project after the extensions that have just been added above

* Create a RaceCar that extends PanacheEntity, defines all variables and then implement a findRandom() method
o Also add validations to the variables
o Below is the full class implementation 


package za.co.bmw.workshop.kyalami.otherbrands;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Random;

@Entity
public class RaceCar  extends PanacheEntity {
    @NotNull
    @Size(min = 1, max = 50)
    public String brand;

    public String model;

    public String engineCapacity;

    @NotNull
    @Min(1900)
    @Max(2022)
    public int year;

    public int torque;

    public double zeroToHundred;

    public int topSpeed;


    public static RaceCar findRandom() {
        long countRaceCar = count();
        Random random = new Random();
        int randomRaceCar = random.nextInt((int) countRaceCar);
        return findAll().page(randomRaceCar, 1).firstResult();
    }

    @Override
    public String toString() {
        return "Race Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine capacity='" + engineCapacity + '\'' +
                ", year=" + year +
                ", torque='" + torque + " Nm" + '\'' +
                ", zero to hundred='" + zeroToHundred + " sec" + '\'' +
                ", topSpeed='" + topSpeed + '\'' +
                '}';
    }
}


* Create a RaceCarService that implements all the database transactions using a lazy operation


package za.co.bmw.workshop.kyalami.otherbrands;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@ApplicationScoped
@Transactional(REQUIRED)

public class RaceCarService {
    @Transactional(SUPPORTS)
    public List<RaceCar> findAllRaceCars() {
        return RaceCar.listAll();
    }

    @Transactional(SUPPORTS)
    public RaceCar findRaceCarById(Long id) {
        return RaceCar.findById(id);
    }

    @Transactional(SUPPORTS)
    public RaceCar findRandomRaceCar() {
        RaceCar randomRaceCar = null;
        while (randomRaceCar == null) {
            randomRaceCar = RaceCar.findRandom();
        }
        return randomRaceCar;
    }

    public RaceCar persistRaceCar(@Valid RaceCar raceCar) {
        raceCar.persist();
        return raceCar;
    }

    public RaceCar updateRaceCar(@Valid RaceCar raceCar) {
        RaceCar entity = RaceCar.findById(raceCar.id);
        entity.brand = raceCar.brand;
        entity.model = raceCar.model;
        entity.year = raceCar.year;
        entity.torque = raceCar.torque;
        entity.zeroToHundred = raceCar.zeroToHundred;

        return entity;
    }

    public void deleteRaceCar(Long id) {
        RaceCar raceCar = RaceCar.findById(id);
        raceCar.delete();
    }
}


* Update the RaceCarResource to implement all the other end points and API documentation as following


package za.co.bmw.workshop.kyalami.otherbrands;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.RestPath;

import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import java.net.URI;
import java.util.List;

import static javax.ws.rs.core.MediaType.*;

@Path("/racingcar")
@Tag(name="racingcar")
public class RaceCarResource {

    Logger logger;
    RaceCarService service;

    public RaceCarResource(Logger logger, RaceCarService service){
        this.service = service;
        this.logger = logger;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/info")
    @Tag(name="info")
    public String hello() {
        return "Microservice for racing cars that are not a BMW brand";
    }


    @Operation(summary = "Returns a random racing car")
    @GET
    @Path("/random")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = RaceCar.class, required = true)))
    public Response getRandomRacingCar() {
        RaceCar raceCar = service.findRandomRaceCar();
        logger.debug("Found random race car " + raceCar);
        return Response.ok(raceCar).build();
    }


    @Operation(summary = "Returns all the racing cars from the database")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = RaceCar.class, type = SchemaType.ARRAY)))
    @APIResponse(responseCode = "204", description = "No racing cars")
    @GET
    public Response getAllRaceCars() {
        List<RaceCar> raceCar = service.findAllRaceCars();
        logger.debug("Total number of race cars " + raceCar);
        return Response.ok(raceCar).build();
    }


    @Operation(summary = "Returns a racing cars for a given identifier")
    @GET
    @Path("/{id}")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = RaceCar.class)))
    @APIResponse(responseCode = "204", description = "The racing cars is not found for a given identifier")
    public Response getRaceCars(@RestPath Long id) {
        RaceCar raceCar = service.findRaceCarById(id);
        if (raceCar != null) {
            logger.debug("Found race car " + raceCar);
            return Response.ok(raceCar).build();
        } else {
            logger.debug("No race car found with id " + id);
            return Response.noContent().build();
        }
    }

    @Operation(summary = "Creates a valid racing car")
    @APIResponse(responseCode = "201", description = "The URI of the created racing car", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = URI.class)))
    @POST
    public Response createRaceCar(@Valid RaceCar raceCar, @Context UriInfo uriInfo) {
        raceCar = service.persistRaceCar(raceCar);
        UriBuilder builder = uriInfo.getAbsolutePathBuilder().path(Long.toString(raceCar.id));
        logger.debug("New race car created with URI " + builder.build().toString());
        return Response.created(builder.build()).build();
    }

    @Operation(summary = "Updates an exiting racing car")
    @APIResponse(responseCode = "200", description = "The updated racing car", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = RaceCar.class)))
    @PUT
    public Response updateRaceCar(@Valid RaceCar raceCar) {
        raceCar = service.updateRaceCar(raceCar);
        logger.debug("RaceCar updated with new valued " + raceCar);
        return Response.ok(raceCar).build();
    }


    @Operation(summary = "Deletes an exiting racing car")
    @APIResponse(responseCode = "204")
    @DELETE
    @Path("/{id}")
    public Response deleteRaceCar(@RestPath Long id) {
        service.deleteRaceCar(id);
        logger.debug("RaceCar deleted with " + id);
        return Response.noContent().build();
    }

}


* Update the applications.properties file to instruct the application to drop and create database from the import file


# Dev and Test Profiles
quarkus.hibernate-orm.database.generation=drop-and-create

# Production Profile
%prod.quarkus.datasource.username=otherbrands
%prod.quarkus.datasource.password=otherbrands
%prod.quarkus.datasource.jdbc.url=jdbc:postgresql://localhost:5432/otherbrands_database
%prod.quarkus.hibernate-orm.sql-load-script=import.sql


* Create an import.sql file in the src/main/resource folder 


INSERT INTO racecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'Chevrolet', 'Camaro ZL1', '6.2L LT4 SUPERCHARGED V8', 2021, 650, 3.7, 318);
INSERT INTO racecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'Ford', 'Mustang', '5.0-litre V8 - GT', 2018, 556, 4.5, 250);
INSERT INTO racecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'Toyota', 'TRD Camry', '3.5 L - V6', 2021, 267, 5.1, 315);
INSERT INTO racecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'Mercedes', 'AMG GT4', '4.0 litre V8 biturbo', 2020, 900, 3.2, 285);


* Update the RaceCarsResourceTest class, to implement @Test methods for all the RaceCars Resource end points
o Create default values for class variables
o Create methods for testing


package za.co.bmw.workshop.kyalami.otherbrands;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.common.mapper.TypeRef;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static javax.ws.rs.core.HttpHeaders.ACCEPT;
import static javax.ws.rs.core.HttpHeaders.CONTENT_TYPE;
import static javax.ws.rs.core.Response.Status.*;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RaceCarResourceTest {

    private static final String JSON = "application/json;charset=UTF-8";

    private static final String DEFAULT_BRAND = "DEFAULT_BRAND";
    private static final String UPDATED_BRAND = "UPDATED_BRAND";

    private static final String DEFAULT_MODEL = "DEFAULT_MODEL";
    private static final String UPDATED_MODEL = "UPDATED_MODEL";

    private static final String DEFAULT_ENGINECAPACITY = "DEFAULT_ENGINECAPACITY";
    private static final String UPDATED_ENGINECAPACITY = "UPDATED_ENGINECAPACITY";

    private static final int DEFAULT_YEAR = 1999;
    private static final int UPDATED_YEAR = 1999;

    private static final int DEFAULT_TORQUE  = 50;
    private static final int UPDATED_TORQUE = 55;

    private static final float DEFAULT_0_TO_100 = 20F;
    private static final float UPDATED_0_TO_100 = 125F;

    private static final int DEFAULT_TOPSPEED = 200;
    private static final double UPDATED_TOPSPEED = 200;

    private static final int NB_RACECARS = 4;

    private static String raceCarId;

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/racingcar/info")
                .then()
                .statusCode(200)
                .body(is("Microservice for racing cars that are not a BMW brand"));
    }

    @Test
    void shouldNotGetUnknownRaceCar() {
        Long randomId = new Random().nextLong();
        given()
                .pathParam("id", randomId)
                .when().get("/racingcar/{id}")
                .then()
                .statusCode(NO_CONTENT.getStatusCode());
    }

    @Test
    void shouldGetRandomRaceCar() {
        given()
                .when().get("/racingcar/random")
                .then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON);
    }

    @Test
    void shouldNotAddInvalidRaceCar() {
        RaceCar raceCar = new RaceCar();

        raceCar.brand = null;
        raceCar.model = null;
        raceCar.engineCapacity = null;
        raceCar.year = 2000;
        raceCar.torque = 0;
        raceCar.zeroToHundred = 0;
        raceCar.topSpeed = 0;

        given()
                .body(raceCar)
                .header(CONTENT_TYPE, JSON)
                .header(ACCEPT, JSON)
                .when()
                .post("/racingcar")
                .then()
                .statusCode(BAD_REQUEST.getStatusCode());
    }

    @Test
    @Order(1)
    void shouldGetInitialRaceCars() {
        List<RaceCar> raceCars = get("/racingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS, raceCars.size());
    }

    @Test
    @Order(2)
    void shouldAddAnRaceCar() {
        RaceCar raceCar = new RaceCar();
        raceCar.brand = DEFAULT_BRAND;
        raceCar.model = DEFAULT_MODEL;
        raceCar.engineCapacity = DEFAULT_ENGINECAPACITY;
        raceCar.year = DEFAULT_YEAR;
        raceCar.torque = DEFAULT_TORQUE;
        raceCar.zeroToHundred = DEFAULT_0_TO_100;
        raceCar.topSpeed = DEFAULT_TOPSPEED;


        String location = given()
                .body(raceCar)
                .header(CONTENT_TYPE, JSON)
                .header(ACCEPT, JSON)
                .when()
                .post("/racingcar")
                .then()
                .statusCode(CREATED.getStatusCode())
                .extract().header("Location");
        assertTrue(location.contains("/racingcar"));

        // Stores the id
        String[] segments = location.split("/");
        raceCarId = segments[segments.length - 1];
        assertNotNull(raceCarId);

        given()
                .pathParam("id", raceCarId)
                .when().get("/racingcar/{id}")
                .then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .body("brand", Is.is(DEFAULT_BRAND))
                .body("model", Is.is(DEFAULT_MODEL))
                .body("engineCapacity", Is.is(DEFAULT_ENGINECAPACITY))
                .body("year", Is.is(DEFAULT_YEAR))
                .body("torque", Is.is(DEFAULT_TORQUE))
                .body("zeroToHundred", Is.is(DEFAULT_0_TO_100))
                .body("topSpeed", Is.is(DEFAULT_TOPSPEED));

        List<RaceCar> raceCars = get("/racingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS + 1, raceCars.size());
    }

    @Test
    @Order(3)
    void testUpdatingAnRaceCar() {

        RaceCar raceCar = new RaceCar();

        raceCar.id = Long.valueOf(raceCarId);
        raceCar.brand = DEFAULT_BRAND;
        raceCar.model = DEFAULT_MODEL;
        raceCar.engineCapacity = DEFAULT_ENGINECAPACITY;
        raceCar.year = DEFAULT_YEAR;
        raceCar.torque = DEFAULT_TORQUE;
        raceCar.zeroToHundred = DEFAULT_0_TO_100;
        raceCar.topSpeed = DEFAULT_TOPSPEED;

        given()
                .body(raceCar)
                .header(CONTENT_TYPE, JSON)
                .header(ACCEPT, JSON)
                .when()
                .put("/racingcar")
                .then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .body("brand", Is.is(DEFAULT_BRAND))
                .body("model", Is.is(DEFAULT_MODEL))
                .body("engineCapacity", Is.is(DEFAULT_ENGINECAPACITY))
                .body("year", Is.is(DEFAULT_YEAR))
                .body("torque", Is.is(DEFAULT_TORQUE))
                .body("zeroToHundred", Is.is(DEFAULT_0_TO_100))
                .body("topSpeed", Is.is(DEFAULT_TOPSPEED));

        List<RaceCar> raceCars = get("/racingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS + 1, raceCars.size());
    }

    @Test
    @Order(4)
    void shouldRemoveAnRaceCar() {
        given()
                .pathParam("id", raceCarId)
                .when().delete("/racingcar/{id}")
                .then()
                .statusCode(NO_CONTENT.getStatusCode());

        List<RaceCar> raceCars = get("/racingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS, raceCars.size());
    }

    private TypeRef<List<RaceCar>> getRaceCarTypeRef() {
        return new TypeRef<List<RaceCar>>() {
        };
    }

    @Test
    void shouldPingOpenAPI() {
        given()
                .header(ACCEPT, JSON)
                .when().get("/q/openapi")
                .then()
                .statusCode(OK.getStatusCode());
    }

}


* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

* Use any cURL tool to query the APIs
o http://localhost:8080/racingcar/info 
o http://localhost:8080/racingcar/random
o http://localhost:8080/racingcar/3 
o http://localhost:8080/q/openapi 

* Create a RaceCarApplication that documents the API for this project


package za.co.bmw.workshop.kyalami.otherbrands;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Racing Cars API",
                description = "This API allows CRUD operations on a racing car",
                version = "1.0",
                contact = @Contact(name = "BMW-ZA Workshop", url = "https://github.com/mah-quests/bmwworkshop")),
        servers = {
                @Server(url = "http://localhost:8084")
        },
        externalDocs = @ExternalDocumentation(url = "https://github.com/mah-quests/bmwworkshop", description = "A 5 day quarkus microservices course")
)


public class RaceCarApplication extends Application{
}


* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

o Navigate to http://localhost:8080/q/openapi 
o Use Postman to see the api documentation using the URL above



* Add a LifeCycle implmenentation, call it RaceCarsApplicationLifeCycle class with the following implementation below to monitor the applications lifecycle. 


package za.co.bmw.workshop.kyalami.otherbrands;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

public class RaceCarsApplicationLifeCycle {
    private static final Logger LOGGER = Logger.getLogger(RaceCarsApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {

        LOGGER.info("====================================================================================================");
        LOGGER.info("                                                                           ");
        LOGGER.info(" /$$$$$$$                      /$$                            /$$$$$$                               ");
        LOGGER.info("| $$__  $$                    |__/                           /$$__  $$                              ");
        LOGGER.info("| $$    $$  /$$$$$$   /$$$$$$$ /$$ /$$$$$$$   /$$$$$$       | $$   __/  /$$$$$$   /$$$$$$   /$$$$$$$");
        LOGGER.info("| $$$$$$$/ |____  $$ /$$_____/| $$| $$__  $$ /$$__  $$      | $$       |____  $$ /$$__  $$ /$$_____/");
        LOGGER.info("| $$__  $$  /$$$$$$$| $$      | $$| $$    $$| $$    $$      | $$        /$$$$$$$| $$   __/|  $$$$$$ ");
        LOGGER.info("| $$    $$ /$$__  $$| $$      | $$| $$  | $$| $$  | $$      | $$    $$ /$$__  $$| $$        ____  $$");
        LOGGER.info("| $$  | $$|  $$$$$$$|  $$$$$$$| $$| $$  | $$|  $$$$$$$      |  $$$$$$/|  $$$$$$$| $$       /$$$$$$$/");
        LOGGER.info("|__/  |__/  _______/  _______/|__/|__/  |__/  ____  $$        ______    _______ |__/      |_______/ ");
        LOGGER.info("                                             /$$    $$                                              ");
        LOGGER.info("                                            |  $$$$$$/                                              ");
        LOGGER.info("                                              ______/                                               ");
        LOGGER.info("                                                                           ");
        LOGGER.info("  The application Racing Cars is starting with profile " + ProfileManager.getActiveProfile());
        LOGGER.info("====================================================================================================");
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application Race Cars is stopping...");
    }
}


* Update the application.properties file to:
o Add default ports
o Implement uber packaging 
o Set the cors property to true for cross 


# Setting up ports
%dev.quarkus.http.port=8081
%test.quarkus.http.port=8082
%prod.quarkus.http.port=8083
quarkus.http.port=8084

%prod.quarkus.package.type=uber-jar

quarkus.http.cors=true


* If the Dev server is running, restart it and run testing of the end points and the api documentation 

$ mvnw.cmd  clean compile quarkus:dev 

o Navigate to the following end points to test the application:
* http://localhost:8081/racingcar/info 
* http://localhost:8081/racingcar
* http://localhost:8081/racingcar/4 
* http://localhost:8081/q/openapi 

o Use Postman to see the API documentation using the URL above
* http://localhost:8081/q/openapi 

o Switch off the dev server. Either use q or Ctrl + C to switch off the server

* Now that we have tested the application on dev, we need to package the project as an uber package by running the following 

$ mvnw.cmd  clean compile package 

* Run the application on production

$ java -jar .\target\bmw-workshop-kyalami-otherbrands-1.0.0-SNAPSHOT-runner.jar

* Test the application
o Correct ports
o End points 
o Data imports

o Navigate to the following end points to test the application:
* http://localhost:8083/racingcar/info 
* http://localhost:8083/racingcar
* http://localhost:8083/racingcar/4 
* http://localhost:8083/q/openapi 

o Use Postman to see the API documentation using the URL above
* http://localhost:8083/q/openapi 

o We’re now finished with the Non-BMW Cars Microservices. Switch off the dev server. Either use q or Ctrl + C to switch off the server. We’ll return to it at a later stage. 

Practice II: Implement the BMW Cars Microservices using Reactive


* Ensure that the Docker Desktop is running in the background (if already run in the previous exercise, you can pass it)
o Navigate to the resources folder, kyalami-racing/resources to run the script in order to create  the necessary database and kafka environments for this project. 
$ cd kyalami-racing/resources
$ docker compose -f docker-compose.yaml up -d

* Open CMD or terminal in order to create a new quarkus project by running the following command:

$ mvn io.quarkus:quarkus-maven-plugin:2.9.2.Final:create  -DprojectGroupId=bmw-workshop-kyalami-bmwbrand -DprojectArtifactId=bmw-workshop-kyalami-bmwbrand  -DclassName="za.co.bmw.workshop.kyalami.bmwbrand.BMWRaceCarResource" -Dpath="/bmwracingcar"  -Dextensions="resteasy-reactive-jackson,quarkus-hibernate-validator,quarkus-smallrye-openapi,quarkus-hibernate-reactive-panache,quarkus-reactive-pg-client"


* Navigate to the pom.xml file to ensure the maven compiler version to 11 instead of the 17 


<properties>
  <compiler-plugin.version>3.8.1</compiler-plugin.version>
  <failsafe.useModulePath>false</failsafe.useModulePath>
  <maven.compiler.release>11</maven.compiler.release>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
  <quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
  <quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
  <quarkus.platform.version>2.13.3.Final</quarkus.platform.version>
  <surefire-plugin.version>3.0.0-M7</surefire-plugin.version>
</properties>



* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

* Once you see the Dev server starts up without any errors, stop the server by pressing Ctlr + C on your laptop 

* Navigate to the BMWRaceCarResource file that was created on the creation of the project. Also make the updates that were performed on the hello() method. 


@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/info")
public String hello() {
    return "Microservice for BMW racing cars";
}


* Navigate to the BMWRaceCarResourceTest file that was created on the creation of the project. Customize and update the hello() method. 


@Test
public void testHelloEndpoint() {
    given()
            .when().get("/racingcar/info")
            .then()
            .statusCode(200)
            .body(is("Microservice for BMW racing cars"));
}


* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

* Then the application will start as production, then you can navigate to the following URLs like you did on dev.
o http://localhost:8080/bmwracingcar/info 

* Add the BMWRaceCar entity class to define the BMWRaceCar class


package za.co.bmw.workshop.kyalami.bmwbrand;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import io.smallrye.mutiny.Uni;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Random;

@Entity
@Cacheable
public class BMWRaceCar extends PanacheEntity{

    public final String brand = "BMW";

    @NotNull
    @Size(min = 1, max = 50)
    public String model;


    @NotNull
    @Size(min = 3, max = 50)
    public String engineCapacity;

    @NotNull
    @Min(1900)
    @Max(2022)
    public int year;

    public int torque;

    public double zeroToHundred;

    public int topSpeed;

    public static Uni<BMWRaceCar> findRandom() {
        Random random = new Random();
        return count()
                .map(count -> random.nextInt(count.intValue()))
                .chain(randomBMWRaceCar -> findAll().page(randomBMWRaceCar, 1).firstResult());
    }

    @Override
    public String toString() {
        return "BMW Race Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine capacity='" + engineCapacity + '\'' +
                ", year=" + year +
                ", torque='" + torque + " Nm" + '\'' +
                ", zero to hundred='" + zeroToHundred + " sec" + '\'' +
                ", topSpeed='" + topSpeed + '\'' +
                '}';
    }
}



* Navigate and update the BMWRaceCarResource file that was created on the creation


package za.co.bmw.workshop.kyalami.bmwbrand;

import io.quarkus.hibernate.reactive.panache.common.runtime.ReactiveTransactional;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.RestPath;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;
import java.util.List;

import static javax.ws.rs.core.MediaType.*;

@Path("/bmwracingcar")
@ApplicationScoped
public class BMWRaceCarResource {

    Logger logger;

    public BMWRaceCarResource(Logger logger){
        this.logger = logger;
    }

    @GET
    @Path("/info")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Microservice for BMW racing cars";
    }


    @GET
    public Uni<List<BMWRaceCar>> getAllBMWRacingCar() {
        return BMWRaceCar.listAll();
    }

    @GET
    @Path("/random")
    public Uni<BMWRaceCar> getRandomBMWRacingCar() {
        return BMWRaceCar.findRandom()
                .invoke(h -> logger.debugf("Found random bmw racing car: %s", h));
    }


    @GET
    @Path("/{id}")
    public Uni<Response> getBMWRacingCar(@RestPath Long id) {
        return BMWRaceCar.<BMWRaceCar>findById(id)
                .map(bmwRacingCar -> {
                    if (bmwRacingCar != null) {
                        return Response.ok(bmwRacingCar).build();
                    }
                    logger.debugf("No BMW Racing Car found with id %d", id);
                    return Response.noContent().build();
                });
    }


    @POST
    @ReactiveTransactional
    public Uni<Response> createBMWRacingCar(@Valid BMWRaceCar bmwRaceCar, @Context UriInfo uriInfo) {
        return bmwRaceCar.<BMWRaceCar>persist()
                .map(h -> {
                    UriBuilder builder = uriInfo.getAbsolutePathBuilder().path(Long.toString(h.id));
                    logger.debug("New BMW Racing Car created with URI " + builder.build().toString());
                    return Response.created(builder.build()).build();
                });
    }

    @PUT
    @ReactiveTransactional
    public Uni<Response> updateBMWRacingCar(@Valid BMWRaceCar bmwRaceCar) {
        return BMWRaceCar.<BMWRaceCar>findById(bmwRaceCar.id)
                .map(retrieved -> {
                    retrieved.model = bmwRaceCar.model;
                    retrieved.engineCapacity = bmwRaceCar.engineCapacity;
                    retrieved.year = bmwRaceCar.year;
                    retrieved.torque = bmwRaceCar.torque;
                    retrieved.zeroToHundred = bmwRaceCar.zeroToHundred;
                    retrieved.topSpeed = bmwRaceCar.topSpeed;
                    return retrieved;
                })
                .map(h -> {
                    logger.debugf("BMW Racing Car updated with new valued %s", h);
                    return Response.ok(h).build();
                });
    }

    @DELETE
    @Path("/{id}")
    @ReactiveTransactional
    public Uni<Response> deleteBMWRacingCar(@RestPath Long id) {
        return BMWRaceCar.deleteById(id)
                .invoke(() -> logger.debugf("BMW Racing Car deleted with %d", id))
                .replaceWith(Response.noContent().build());
    }

}



* Navigate and update the BMWRaceCarResourceTest file that was created in the test folder as following: 


package za.co.bmw.workshop.kyalami.bmwbrand;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.common.mapper.TypeRef;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static javax.ws.rs.core.HttpHeaders.ACCEPT;
import static javax.ws.rs.core.HttpHeaders.CONTENT_TYPE;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BMWRaceCarResourceTest {

    private static final String JSON = "application/json;charset=UTF-8";


    private static final String DEFAULT_MODEL = "DEFAULT_MODEL";
    private static final String UPDATED_MODEL = "UPDATED_MODEL";

    private static final String DEFAULT_ENGINECAPACITY = "DEFAULT_ENGINECAPACITY";
    private static final String UPDATED_ENGINECAPACITY = "UPDATED_ENGINECAPACITY";

    private static final int DEFAULT_YEAR = 1999;
    private static final int UPDATED_YEAR = 1999;

    private static final int DEFAULT_TORQUE  = 50;
    private static final int UPDATED_TORQUE = 55;

    private static final float DEFAULT_0_TO_100 = 20F;
    private static final float UPDATED_0_TO_100 = 125F;

    private static final int DEFAULT_TOPSPEED = 200;
    private static final double UPDATED_TOPSPEED = 200;

    private static final int NB_RACECARS = 8;

    private static String raceCarId;

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/bmwracingcar/info")
          .then()
             .statusCode(200)
             .body(is("Microservice for BMW racing cars"));
    }

    @Test
    void shouldNotGetUnknownBMWRaceCar() {
        Long randomId = new Random().nextLong();
        given()
                .pathParam("id", randomId)
                .when().get("/bmwracingcar/{id}")
                .then()
                .statusCode(NO_CONTENT.getStatusCode());
    }

    @Test
    void shouldGetRandomBMWRaceCar() {
        given()
                .when().get("/bmwracingcar/random")
                .then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON);
    }

    @Test
    void shouldNotAddInvalidBMWRaceCar() {
        BMWRaceCar raceCar = new BMWRaceCar();

        raceCar.model = null;
        raceCar.engineCapacity = null;
        raceCar.year = 2000;
        raceCar.torque = 0;
        raceCar.zeroToHundred = 0;
        raceCar.topSpeed = 0;

        given()
                .body(raceCar)
                .header(CONTENT_TYPE, JSON)
                .header(ACCEPT, JSON)
                .when()
                .post("/bmwracingcar")
                .then()
                .statusCode(BAD_REQUEST.getStatusCode());
    }

    @Test
    @Order(1)
    void shouldGetInitialBMWRaceCars() {
        List<BMWRaceCar> raceCars = get("/bmwracingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS, raceCars.size());
    }

    @Test
    @Order(2)
    void shouldAddAnBMWRaceCar() {
        BMWRaceCar raceCar = new BMWRaceCar();

        raceCar.model = DEFAULT_MODEL;
        raceCar.engineCapacity = DEFAULT_ENGINECAPACITY;
        raceCar.year = DEFAULT_YEAR;
        raceCar.torque = DEFAULT_TORQUE;
        raceCar.zeroToHundred = DEFAULT_0_TO_100;
        raceCar.topSpeed = DEFAULT_TOPSPEED;


        String location = given()
                .body(raceCar)
                .header(CONTENT_TYPE, JSON)
                .header(ACCEPT, JSON)
                .when()
                .post("/bmwracingcar")
                .then()
                .statusCode(CREATED.getStatusCode())
                .extract().header("Location");
        assertTrue(location.contains("/bmwracingcar"));

        // Stores the id
        String[] segments = location.split("/");
        raceCarId = segments[segments.length - 1];
        assertNotNull(raceCarId);

        given()
                .pathParam("id", raceCarId)
                .when().get("/bmwracingcar/{id}")
                .then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .body("model", Is.is(DEFAULT_MODEL))
                .body("engineCapacity", Is.is(DEFAULT_ENGINECAPACITY))
                .body("year", Is.is(DEFAULT_YEAR))
                .body("torque", Is.is(DEFAULT_TORQUE))
                .body("zeroToHundred", Is.is(DEFAULT_0_TO_100))
                .body("topSpeed", Is.is(DEFAULT_TOPSPEED));

        List<BMWRaceCar> raceCars = get("/bmwracingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS + 1, raceCars.size());
    }

    @Test
    @Order(3)
    void testUpdatingAnRaceCar() {

        BMWRaceCar raceCar = new BMWRaceCar();

        raceCar.id = Long.valueOf(raceCarId);

        raceCar.model = DEFAULT_MODEL;
        raceCar.engineCapacity = DEFAULT_ENGINECAPACITY;
        raceCar.year = DEFAULT_YEAR;
        raceCar.torque = DEFAULT_TORQUE;
        raceCar.zeroToHundred = DEFAULT_0_TO_100;
        raceCar.topSpeed = DEFAULT_TOPSPEED;

        given()
                .body(raceCar)
                .header(CONTENT_TYPE, JSON)
                .header(ACCEPT, JSON)
                .when()
                .put("/bmwracingcar")
                .then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .body("model", Is.is(DEFAULT_MODEL))
                .body("engineCapacity", Is.is(DEFAULT_ENGINECAPACITY))
                .body("year", Is.is(DEFAULT_YEAR))
                .body("torque", Is.is(DEFAULT_TORQUE))
                .body("zeroToHundred", Is.is(DEFAULT_0_TO_100))
                .body("topSpeed", Is.is(DEFAULT_TOPSPEED));

        List<BMWRaceCar> raceCars = get("/bmwracingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS + 1, raceCars.size());
    }

    @Test
    @Order(4)
    void shouldRemoveAnRaceCar() {
        given()
                .pathParam("id", raceCarId)
                .when().delete("/bmwracingcar/{id}")
                .then()
                .statusCode(NO_CONTENT.getStatusCode());

        List<BMWRaceCar> raceCars = get("/bmwracingcar").then()
                .statusCode(OK.getStatusCode())
                .contentType(APPLICATION_JSON)
                .extract().body().as(getRaceCarTypeRef());
        assertEquals(NB_RACECARS, raceCars.size());
    }

    private TypeRef<List<BMWRaceCar>> getRaceCarTypeRef() {
        return new TypeRef<List<BMWRaceCar>>() {
        };
    }

    @Test
    void shouldPingOpenAPI() {
        given()
                .header(ACCEPT, JSON)
                .when().get("/q/openapi")
                .then()
                .statusCode(OK.getStatusCode());
    }

}


* Update the applications.properties file to instruct the application to drop and create database from the import file


quarkus.datasource.db-kind=postgresql
quarkus.hibernate-orm.database.generation=drop-and-create


%prod.quarkus.datasource.username=bmwbrands
%prod.quarkus.datasource.password=bmwbrands
%prod.quarkus.datasource.reactive.url=postgresql://localhost:5432/bmwbrands_database
%prod.quarkus.hibernate-orm.sql-load-script=import.sql



* Create an import.sql file in the src/main/resource folder 


INSERT INTO bmwracecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'BMW', 'BMW 328', '2.0-litre straight-six', 1936, 350, 5.6, 250);
INSERT INTO bmwracecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'BMW', 'BMW 3.0-litre CSL Batmobile', '3.0/3.2-litre', 1973, 650, 6.8, 220);
INSERT INTO bmwracecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'BMW', 'BMW M1 Procar', '5L - TDI V6', 1979, 383, 3.1, 260);
INSERT INTO bmwracecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'BMW', 'BMW 2002', '2.0L 3AT (100 HP) 4 Cylinders', 1968, 355, 3.2, 300);
INSERT INTO bmwracecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'BMW', 'BMW 635 CSI', 'E24 6 Series 635CSi', 1980, 315, 7.6, 230);
INSERT INTO bmwracecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'BMW', 'BMW E30 M3', '6.2 litre V6', 1987, 240, 6.5, 235);
INSERT INTO bmwracecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'BMW', 'BMW V12 LMR', 'BMW V12 LM', 1999, 367, 4.8, 340);
INSERT INTO bmwracecar(id, brand, model, engineCapacity, year, torque, zeroToHundred, topSpeed)
VALUES (nextval('hibernate_sequence'), 'BMW', 'BMW-Sauber F1.08', 'P86/8 2,400 cc (146 cu in) V8', 2008, 250, 4.2, 285);



* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

o Navigate to the following end points to test the application:
* http://localhost:8080/bmwracingcar/info 
* http://localhost:8080/bmwracingcar
* http://localhost:8080/bmwracingcar/4 
* http://localhost:8080/q/openapi 

o Using the cURL tool, Postman, run a GET method for this URL:
* http://localhost:8080/q/openapi 


* Update the BMWRaceCarResource file to add API documentation details


package za.co.bmw.workshop.kyalami.bmwbrand;

import io.quarkus.hibernate.reactive.panache.common.runtime.ReactiveTransactional;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.RestPath;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;
import java.util.List;

import static javax.ws.rs.core.MediaType.*;

@Path("/bmwracingcar")
@Tag(name = "bmwracingcar")
@ApplicationScoped
public class BMWRaceCarResource {

    Logger logger;

    public BMWRaceCarResource(Logger logger){
        this.logger = logger;
    }

    @GET
    @Path("/info")
    @Produces(MediaType.TEXT_PLAIN)
    @Tag(name = "info")
    public String hello() {
        return "Microservice for BMW racing cars";
    }


    @Operation(summary = "Returns all the BMW Racing Cars from the database")
    @GET
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = BMWRaceCar.class, type = SchemaType.ARRAY)))
    @APIResponse(responseCode = "204", description = "BMW Racing Cars")
    public Uni<List<BMWRaceCar>> getAllBMWRacingCar() {
        return BMWRaceCar.listAll();
    }

    @Operation(summary = "Returns a random BMW Racing Car")
    @GET
    @Path("/random")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = BMWRaceCar.class, required = true)))
    public Uni<BMWRaceCar> getRandomBMWRacingCar() {
        return BMWRaceCar.findRandom()
                .invoke(h -> logger.debugf("Found random bmw racing car: %s", h));
    }


    @Operation(summary = "Returns a BMW Racing Car for a given identifier")
    @GET
    @Path("/{id}")
    @APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = BMWRaceCar.class)))
    @APIResponse(responseCode = "204", description = "A BMW Racing Car is not found for a given identifier")
    public Uni<Response> getBMWRacingCar(@RestPath Long id) {
        return BMWRaceCar.<BMWRaceCar>findById(id)
                .map(bmwRacingCar -> {
                    if (bmwRacingCar != null) {
                        return Response.ok(bmwRacingCar).build();
                    }
                    logger.debugf("No BMW Racing Car found with id %d", id);
                    return Response.noContent().build();
                });
    }

    @Operation(summary = "Creates a valid BMW Racing Car")
    @POST
    @APIResponse(responseCode = "201", description = "The URI of the created BMW Racing Car", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = URI.class)))
    @ReactiveTransactional
    public Uni<Response> createBMWRacingCar(@Valid BMWRaceCar bmwRaceCar, @Context UriInfo uriInfo) {
        return bmwRaceCar.<BMWRaceCar>persist()
                .map(h -> {
                    UriBuilder builder = uriInfo.getAbsolutePathBuilder().path(Long.toString(h.id));
                    logger.debug("New BMW Racing Car created with URI " + builder.build().toString());
                    return Response.created(builder.build()).build();
                });
    }

    @Operation(summary = "Updates an exiting BMW Racing Car")
    @PUT
    @APIResponse(responseCode = "200", description = "The updated BMW Racing Car", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = BMWRaceCar.class)))
    @ReactiveTransactional
    public Uni<Response> updateBMWRacingCar(@Valid BMWRaceCar bmwRaceCar) {
        return BMWRaceCar.<BMWRaceCar>findById(bmwRaceCar.id)
                .map(retrieved -> {
                    retrieved.model = bmwRaceCar.model;
                    retrieved.engineCapacity = bmwRaceCar.engineCapacity;
                    retrieved.year = bmwRaceCar.year;
                    retrieved.torque = bmwRaceCar.torque;
                    retrieved.zeroToHundred = bmwRaceCar.zeroToHundred;
                    retrieved.topSpeed = bmwRaceCar.topSpeed;
                    return retrieved;
                })
                .map(h -> {
                    logger.debugf("BMW Racing Car updated with new valued %s", h);
                    return Response.ok(h).build();
                });
    }

    @Operation(summary = "Deletes an exiting BMW Racing Car")
    @DELETE
    @Path("/{id}")
    @APIResponse(responseCode = "204")
    @ReactiveTransactional
    public Uni<Response> deleteBMWRacingCar(@RestPath Long id) {
        return BMWRaceCar.deleteById(id)
                .invoke(() -> logger.debugf("BMW Racing Car deleted with %d", id))
                .replaceWith(Response.noContent().build());
    }

}



* Use any HTTP or cURL tool to query the APIs
o http://localhost:8080/bmwracingcar/info 
o http://localhost:8080/bmwracingcar/random
o http://localhost:8080/bmwracingcar/3 
o http://localhost:8080/q/openapi

* Using a cURL tool or CMD, add a new BMW Car to test the persistence to the database  

$ curl --header "Content-Type: application/json" --request POST --data  "{\"brand\":\"BMW\", \"model\":\"BMW E46 M3 GTR\", \"engineCapacity\":\"V8 engine\", \"year\":2001, \"torque\":468, \"zeroToHundred\":3.7, \"topSpeed\":295}"  -H "Content-Type: application/json" http://localhost:8080/bmwracingcar -v


* Update the applications.properties file to instruct the application to drop and create database from the import file


quarkus.datasource.db-kind=postgresql
quarkus.hibernate-orm.database.generation=drop-and-create

# Setting up ports
%dev.quarkus.http.port=8091
%test.quarkus.http.port=8092
%prod.quarkus.http.port=8093
quarkus.http.port=8094

%prod.quarkus.package.type=uber-jar

%prod.quarkus.datasource.username=bmwbrands
%prod.quarkus.datasource.password=bmwbrands
%prod.quarkus.datasource.reactive.url=postgresql://localhost:5432/bmwbrands_database
%prod.quarkus.hibernate-orm.sql-load-script=import.sql


quarkus.http.cors=true


* Package the project as an uber package by running the following 
$ mvnw.cmd  clean compile package 

* Run the application on production

$ java -jar .\target\bmw-workshop-kyalami-bmwbrand-1.0.0-SNAPSHOT-runner.jar

* Test the application
o Correct ports
o End points 
o Data imports

o Navigate to the following end points to test the application:
* http://localhost:8093/bmwracingcar/info 
* http://localhost:8093/bmwracingcar
* http://localhost:8093/bmwracingcar/4 
* http://localhost:8093/q/openapi 

o Use Postman to see the API documentation using the URL above
* http://localhost:8093/q/openapi 

o We’re now finished with the BMW Cars Microservices. Switch off the dev server. Either use q or Ctrl + C to switch off the server. We’ll return to it at a later stage. 




Practice III: Implement the Kyalami Race Track using client extensions to interact with BMW and Non-BMW Race Cars

* Ensure that the Docker Desktop is running in the background (if already run in the previous exercise, you can pass it)
o Navigate to the resources folder, kyalami-racing/resources to run the script in order to create  the necessary database and kafka environments for this project. 
$ cd kyalami-racing/resources
$ docker compose -f docker-compose.yaml up -d


* Open CMD or terminal in order to create a new quarkus project by running the following command:

$ mvn io.quarkus:quarkus-maven-plugin:2.9.2.Final:create  -DprojectGroupId=bmw-workshop-kyalami-racetrack -DprojectArtifactId=bmw-workshop-kyalami-racetrack  -DclassName="za.co.bmw.workshop.kyalami.racetrack.RaceTrackResource" -Dpath="/kyalamitrack"  -Dextensions="jdbc-postgresql, hibernate-orm-panache, hibernate-validator, quarkus-resteasy-reactive-jackson"


* Navigate to the pom.xml file to update the maven compiler version to 11 instead of the default 17 that gets created. 


<properties>
  <compiler-plugin.version>3.8.1</compiler-plugin.version>
  <failsafe.useModulePath>false</failsafe.useModulePath>
  <maven.compiler.release>11</maven.compiler.release>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
  <quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
  <quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
  <quarkus.platform.version>2.13.3.Final</quarkus.platform.version>
  <surefire-plugin.version>3.0.0-M7</surefire-plugin.version>
</properties>



* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

* Once you see the Dev server starts up without any errors, stop the server by pressing Ctlr + C on your laptop 

* To add the client extension, you can add the rest-client and the rest-client-jackson extensions to your project

$ mvnw.cmd  quarkus:add-extension -Dextensions='rest-client,rest-client-jackson'

* Navigate to the RaceTrackResource file that was created on the creation of the project. Also make the updates that were performed on the hello() method. 


@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/info")
public String hello() {
    return "Quarkus Microservices for car racing competition";
}


* Navigate to the BMWRaceCarResourceTest file that was created on the creation of the project. Customize and update the hello() method. 


@Test
public void testHelloEndpoint() {
    given()
            .when().get("/kyalamitrack/info")
            .then()
            .statusCode(200)
            .body(is("Quarkus Microservices for car racing competition"));
}


* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

* Then the application will start as production, then you can navigate to the following URLs like you did on dev.
o http://localhost:8080/ kyalamitrack/info 

* Open the project using IntelliJ and create a client package to use the BMW and OtherBrands end points:

za.co.bmw.workshop.kyalami.racetrack.client

o Create a Vice or Proxy file that will resemble the BMWRaceCar and RaceCar classes. Under the client package, add BMWCarVice class which is a reflection or mirror of the BMWRaceCar from the BMW Car Microservice. 


package za.co.bmw.workshop.kyalami.racetrack.client;


public class BMWCarVice {
    public static BMWCarVice EMPTY_CAR = new BMWCarVice();

    private String brand;

    private String model;

    private String engineCapacity;

    private int year;

    private int torque;

    private double zeroToHundred;

    private int topSpeed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public double getZeroToHundred() {
        return zeroToHundred;
    }

    public void setZeroToHundred(double zeroToHundred) {
        this.zeroToHundred = zeroToHundred;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}


o Create a BMWCarViceService interface that will Mock the actual end points from the BMW Car Microservice.


package za.co.bmw.workshop.kyalami.racetrack.client;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/bmwracingcar")
@RegisterRestClient
public interface BMWCarViceService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BMWCarVice> getAllBMWRaceCars();

    @GET
    @Path("/random")
    @Produces(MediaType.APPLICATION_JSON)
    public BMWCarVice getRandomBMWRaceCar();


}

	
o Implement the Resource end points for the BMWCarViceResource class with the implementation below:


package za.co.bmw.workshop.kyalami.racetrack.client;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;


@Path("/bmwcars")
public class BMWCarViceResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "BMW Race Car Vice Resource";
    }

    @RestClient
    BMWCarViceService bmwCarViceService;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BMWCarVice> getAllBMWRaceCars() {
        return bmwCarViceService.getAllBMWRaceCars();
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/random")
    public BMWCarVice getRandomBMWRaceCars() {
        return bmwCarViceService.getRandomBMWRaceCar();
    }
}


* Update the application.properties file to link the external resources to the Vice interfaces. 
o Link the external resources (end points) to vice interfaces



## Logging configuration
quarkus.log.console.enable=true
quarkus.log.console.format=%d{HH:mm:ss} %-5p [%c{2.}] (%t) %s%e%n
quarkus.log.console.level=DEBUG

za.co.bmw.workshop.kyalami.racetrack.client.BMWCarViceService/mp-rest/url=http://localhost:8093



* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

* Start up the BMW Race Cars project on production mode by following the steps:

$ cd kyalami-racing\bmw-workshop-kyalami-bmwbrand 
$ java -jar .\target\bmw-workshop-kyalami-bmwbrand-1.0.0-SNAPSHOT-runner.jar


* Use any cURL tool or browser to query the remote BMW Race Cars Microservices
o http://localhost:8080/bmwcars  
o http://localhost:8080/bmwcars/all  
o http://localhost:8080/bmwcars/random   

* Do the same thing for the non- BMW Make Vehicles 

o Create a Vice or Proxy file that will resemble the BMWRaceCar and RaceCar classes. Under the client package, add OtherCarsVice class which is a reflection or mirror of the RaceCar from the Other Car Microservice. 


package za.co.bmw.workshop.kyalami.racetrack.client;


public class OtherCarsVice {
    public static OtherCarsVice EMPTY_CAR = new OtherCarsVice();

    private String brand;

    private String model;

    private String engineCapacity;

    private int year;

    private int torque;

    private double zeroToHundred;

    private int topSpeed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public double getZeroToHundred() {
        return zeroToHundred;
    }

    public void setZeroToHundred(double zeroToHundred) {
        this.zeroToHundred = zeroToHundred;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}


o Create a OtherCarsViceService interface that will Mock the actual end points from the BMW Car Microservice.


package za.co.bmw.workshop.kyalami.racetrack.client;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/racingcar")
@RegisterRestClient
public interface OtherCarsViceService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<OtherCarsVice> getAllOtherRaceCars();

    @GET
    @Path("/random")
    @Produces(MediaType.APPLICATION_JSON)
    public OtherCarsVice getRandomRaceCar();

}


o Implement the Resource end points for the OtherCarsViceResource class with the implementation below:


package za.co.bmw.workshop.kyalami.racetrack.client;


import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;



@Path("/othercars")
public class OtherCarsViceResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Other Branded Race Car Vice Resource";
    }

    @RestClient
    OtherCarsViceService otherCarsViceService;
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<OtherCarsVice> getAllBMWRaceCars() {
        return otherCarsViceService.getAllOtherRaceCars();
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/random")
    public OtherCarsVice getRandomBMWRaceCars() {
        return otherCarsViceService.getRandomRaceCar();
    }
}


* Update the application.properties file to link the external resources to the Vice interfaces. 
o Link the external resources (end points) to vice interfaces



## Logging configuration
quarkus.log.console.enable=true
quarkus.log.console.format=%d{HH:mm:ss} %-5p [%c{2.}] (%t) %s%e%n
quarkus.log.console.level=DEBUG

za.co.bmw.workshop.kyalami.racetrack.client.BMWCarViceService/mp-rest/url=http://localhost:8093
za.co.bmw.workshop.kyalami.racetrack.client.OtherCarsViceService/mp-rest/url=http://localhost:8083


* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

* Start up the Other Race Cars project on production mode by following the steps:

$ cd kyalami-racing\bmw-workshop-kyalami-otherbrands 
$ java -jar .\target\bmw-workshop-kyalami-otherbrands-1.0.0-SNAPSHOT-runner.jar


* Use any cURL tool or browser to query the remote BMW Race Cars Microservices
o http://localhost:8080/othercars  
o http://localhost:8080/othercars/all  
o http://localhost:8080/othercars/random   

* Switch off the dev server to continue with the development work.

* Now we want to implement fault tolerance because we’re connecting to external service:
o Add the fault tolerance extension to project by running the following command.

$ mvnw.cmd  quarkus:add-extension -Dextensions='smallrye-fault-tolerance' 

o Refresh your project by using the maven tool. Right click on the project, go to the bottom of the list and find Maven. Then click on Reload Project

o Ensure that the dependency has been added to the pom.xml file

<dependency>
  <groupId>io.quarkus</groupId>
  <artifactId>quarkus-smallrye-fault-tolerance</artifactId>
</dependency>

o Update the BMWCarViceService interface to include fault tolerance


package za.co.bmw.workshop.kyalami.racetrack.client;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/bmwracingcar")
@RegisterRestClient
public interface BMWCarViceService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Retry(maxRetries = 3, delay = 2000)
    public List<BMWCarVice> getAllBMWRaceCars();

    @GET
    @Path("/random")
    @Retry(maxRetries = 3, delay = 2000)
    @Fallback(value = BMWRaceCarViceRecovery.class)
    @Produces(MediaType.APPLICATION_JSON)
    public BMWCarVice getRandomBMWRaceCar();

    public static class BMWRaceCarViceRecovery implements FallbackHandler<BMWCarVice> {

        @Override
        public BMWCarVice handle(ExecutionContext context) {
            return BMWCarVice.EMPTY_CAR;
        }

    }

}


o Update the OtherCarsViceService interface to include fault tolerance


package za.co.bmw.workshop.kyalami.racetrack.client;


import org.eclipse.microprofile.faulttolerance.ExecutionContext;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.FallbackHandler;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/racingcar")
@RegisterRestClient
public interface OtherCarsViceService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Retry(maxRetries = 3, delay = 2000)
    public List<OtherCarsVice> getAllOtherRaceCars();

    @GET
    @Path("/random")
    @Retry(maxRetries = 3, delay = 2000)
    @Fallback(value = OtherRacesCarViceRecovery.class)
    @Produces(MediaType.APPLICATION_JSON)
    public OtherCarsVice getRandomRaceCar();

    public static class OtherRacesCarViceRecovery implements FallbackHandler<OtherCarsVice> {

        @Override
        public OtherCarsVice handle(ExecutionContext context) {
            return OtherCarsVice.EMPTY_CAR;
        }

    }

}


* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 

* Ensure that the BMW Microservice and Other Cars Microservices are still running from the previous practices.

* Use any cURL tool or browser to query the remote BMW Race Cars Microservices
o http://localhost:8080/othercars  
o http://localhost:8080/othercars/all  
o http://localhost:8080/othercars/random   
o http://localhost:8080/bmwcars  
o http://localhost:8080/bmwcars/all  
o http://localhost:8080/bmwcars/random   


Now that we’re finished with the client proxy or vice, we can now focus on 

* Then start working on the actual competition between the two types of cars, the BMW Race Cars and the Other Race Cars.
o Go back to the za.co.bmw.workshop.kyalami.racetrack package. 
o Create a RaceTrack class that will combine both race cars and define the winner and looser


package za.co.bmw.workshop.kyalami.racetrack;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.Instant;


@Entity
public class RaceTrack extends PanacheEntity{

    @NotNull
    public Instant raceDate;


    @NotNull
    public String winner;

    @NotNull
    public String winnerBrand;
    @NotNull
    public String winnerModel;
    @NotNull
    public String winnerEngineCapacity;
    @NotNull
    public int winnerCarYear;
    @NotNull
    public int winnerTorque;
    @NotNull
    public double winnerZeroToHundred;
    @NotNull
    public int winnerTopSpeed;


    @NotNull
    public String looser;
    @NotNull
    public String looserBrand;
    @NotNull
    public String looserModel;
    @NotNull
    public String looserEngineCapacity;
    @NotNull
    public int looserCarYear;
    @NotNull
    public int looserTorque;
    @NotNull
    public double looserZeroToHundred;
    @NotNull
    public int looserTopSpeed;


}


o Create a RaceTrackService class that will define the logic of the project.


package za.co.bmw.workshop.kyalami.racetrack;

import io.smallrye.mutiny.Multi;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import za.co.bmw.workshop.kyalami.racetrack.client.BMWCarVice;
import za.co.bmw.workshop.kyalami.racetrack.client.BMWCarViceService;
import za.co.bmw.workshop.kyalami.racetrack.client.OtherCarsVice;
import za.co.bmw.workshop.kyalami.racetrack.client.OtherCarsViceService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.Random;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;


@ApplicationScoped
@Transactional(SUPPORTS)
public class RaceTrackService {


    @RestClient
    BMWCarViceService bmwRaceCarProxy;

    @RestClient
    OtherCarsViceService raceCarProxy;

    RaceTrack raceTrack;

    @Inject Logger logger;

    private final Random random = new Random();

    public List<RaceTrack> findAllRaces() {
        return RaceTrack.listAll();
    }

    public RaceTrack findRaceById(Long id) {
        return RaceTrack.findById(id);
    }


    public RaceTrack showRandomlySelectedCars() {

        logger.info("Simulating and toggling between race cars ... Its going to be fun!)");

        raceTrack = new RaceTrack();
        raceTrack.raceDate = Instant.now();

        Random rn = new Random();
        int odd_even = rn.nextInt(10) + 1;

        if ( odd_even % 2 == 0){
            bmwWonRace();
        } else {
            otherMakeWonRace();
        }
        return raceTrack;

    }

    public RaceTrack bmwWonRace() {

        logger.info("Yes, BMW Car won the race... Yay :-)");

        raceTrack = new RaceTrack();

        BMWCarVice chosenBMW = bmwRaceCarProxy.getRandomBMWRaceCar();
        OtherCarsVice chosenOther = raceCarProxy.getRandomRaceCar();

        populateBMWWonRace(raceTrack, chosenOther, chosenBMW);
        raceTrack.raceDate = Instant.now();

        return raceTrack;
    }


    public RaceTrack otherMakeWonRace() {

        logger.info("Eishhh, Other Make Car won the race... Eeehhhhh :-( ");

        raceTrack = new RaceTrack();

        BMWCarVice chosenBMW = bmwRaceCarProxy.getRandomBMWRaceCar();
        OtherCarsVice chosenOther = raceCarProxy.getRandomRaceCar();

        populateOtherBrandsWonRace(raceTrack, chosenOther, chosenBMW);
        raceTrack.raceDate = Instant.now();

        return raceTrack;
    }

    public RaceTrack populateBMWWonRace(RaceTrack raceTrack, OtherCarsVice chosenOther, BMWCarVice chosenBMW){

        raceTrack.winnerModel = chosenBMW.getModel();
        raceTrack.winnerBrand = chosenBMW.getBrand();
        raceTrack.winnerEngineCapacity = chosenBMW.getEngineCapacity();
        raceTrack.winnerCarYear = chosenBMW.getYear();
        raceTrack.winnerTorque = chosenBMW.getTorque();
        raceTrack.winnerTopSpeed = chosenBMW.getTopSpeed();
        raceTrack.winnerZeroToHundred = chosenBMW.getZeroToHundred();
        raceTrack.winner = raceTrack.winnerBrand + " - " + raceTrack.winnerModel;


        raceTrack.looserModel = chosenOther.getModel();
        raceTrack.looserBrand = chosenOther.getBrand();
        raceTrack.looserEngineCapacity = chosenOther.getEngineCapacity();
        raceTrack.looserCarYear = chosenOther.getYear();
        raceTrack.looserTorque = chosenOther.getTorque();
        raceTrack.looserTopSpeed = chosenOther.getTopSpeed();
        raceTrack.looserZeroToHundred = chosenOther.getZeroToHundred();
        raceTrack.looser = raceTrack.looserBrand + " - " + raceTrack.looserModel;


        return raceTrack;
    }



    public RaceTrack populateOtherBrandsWonRace(RaceTrack raceTrack, OtherCarsVice chosenOther, BMWCarVice chosenBMW){

        raceTrack.winnerModel = chosenOther.getModel();
        raceTrack.winnerBrand = chosenOther.getBrand();
        raceTrack.winnerEngineCapacity = chosenOther.getEngineCapacity();
        raceTrack.winnerCarYear = chosenOther.getYear();
        raceTrack.winnerTorque = chosenOther.getTorque();
        raceTrack.winnerTopSpeed = chosenOther.getTopSpeed();
        raceTrack.winnerZeroToHundred = chosenOther.getZeroToHundred();
        raceTrack.winner = raceTrack.winnerBrand + " - " + raceTrack.winnerModel;


        raceTrack.looserModel = chosenBMW.getModel();
        raceTrack.looserBrand = chosenBMW.getBrand();
        raceTrack.looserEngineCapacity = chosenBMW.getEngineCapacity();
        raceTrack.looserCarYear = chosenBMW.getYear();
        raceTrack.looserTorque = chosenBMW.getTorque();
        raceTrack.looserTopSpeed = chosenBMW.getTopSpeed();
        raceTrack.looserZeroToHundred = chosenBMW.getZeroToHundred();
        raceTrack.looser = raceTrack.looserBrand + " - " + raceTrack.looserBrand;


        return raceTrack;
    }

    @Transactional(REQUIRED)
    public RaceTrack persistRaceDetails(){

        Multi.createFrom().range(0,3)
                .onItem().transform(n->String.format("ready, steady, go %s - %d... ", n));


        logger.info("The Cars are On The Race Track, Ready to compete");

        raceTrack = new RaceTrack();

        BMWCarVice chosenBMW = bmwRaceCarProxy.getRandomBMWRaceCar();
        OtherCarsVice chosenOther = raceCarProxy.getRandomRaceCar();


        int bmwTurbo = random.nextInt(30);
        int carTurbo = random.nextInt(20);


        if ((chosenOther.getTorque() * carTurbo)
                > (chosenBMW.getTorque() * bmwTurbo)) {
            raceTrack = populateOtherBrandsWonRace(raceTrack, chosenOther, chosenBMW);
            logger.info("Another Race won by the other brands");
        } else if (chosenBMW.getTorque() * bmwTurbo < chosenOther.getTorque() * carTurbo) {
            raceTrack = populateBMWWonRace(raceTrack, chosenOther, chosenBMW);
            logger.info("Another Race won by the BMW brand");
        } else {
            raceTrack = random.nextBoolean() ? populateBMWWonRace(raceTrack, chosenOther, chosenBMW) :
                    populateOtherBrandsWonRace(raceTrack, chosenOther, chosenBMW);
        }

        raceTrack.raceDate = Instant.now();
        raceTrack.persist();

        return raceTrack;


    }

}

o Update the  a RaceTrackResource class that will define end points of the project.


package za.co.bmw.workshop.kyalami.racetrack;

import io.smallrye.mutiny.Multi;
import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.RestSseElementType;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.time.Duration;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Produces(APPLICATION_JSON)
@Path("/kyalamitrack")
public class RaceTrackResource {


    @GET
    @Path("/info")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Quarkus Microservices for car racing competition";
    }

    @Inject
    Logger logger;

    @Inject
    RaceTrackService raceTrackService;


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<RaceTrack> showRaceResults() {
        return raceTrackService.findAllRaces();
    }


    @GET
    @Path("/random-simulation")
    @Produces(MediaType.APPLICATION_JSON)
    public RaceTrack showRandomlySelectedRacingCars() {
        return raceTrackService.showRandomlySelectedCars();
    }


    @GET
    @Path("/actual-race")
    @Produces(MediaType.APPLICATION_JSON)
    public RaceTrack actualTrackRacingCars() {
        return raceTrackService.persistRaceDetails();
    }


}


* Update the application.properties file to link the external resources to the Vice interfaces. 
o Update the ports 
o Add the database configuration for both dev and production 
o Link the external resources (end points) to vice interfaces


# Setting up ports
%dev.quarkus.http.port=9091
%test.quarkus.http.port=9092
%prod.quarkus.http.port=9093
quarkus.http.port=9094

# drop and create the database at startup (use `update` to only update the schema)
quarkus.hibernate-orm.database.generation=drop-and-create

## Logging configuration
quarkus.log.console.enable=true
quarkus.log.console.format=%d{HH:mm:ss} %-5p [%c{2.}] (%t) %s%e%n
quarkus.log.console.level=DEBUG

## Production configuration
%prod.quarkus.datasource.jdbc.url=jdbc:postgresql://localhost:5432/carrace_database
%prod.quarkus.datasource.db-kind=postgresql
%prod.quarkus.datasource.username=carrace
%prod.quarkus.datasource.password=carrace
%prod.quarkus.hibernate-orm.sql-load-script=import.sql

%prod.quarkus.log.console.level=INFO
%prod.quarkus.hibernate-orm.database.generation=update

quarkus.http.cors=true


za.co.bmw.workshop.kyalami.racetrack.client.BMWCarViceService/mp-rest/url=http://localhost:8093
za.co.bmw.workshop.kyalami.racetrack.client.OtherCarsViceService/mp-rest/url=http://localhost:8083


* Create an import.sql file to load for dev and test profiles 


INSERT INTO racetrack(id, raceDate, winner, winnerBrand, winnerModel, winnerCarYear, winnerTorque, winnerZeroToHundred, winnerTopSpeed, looser, looserBrand, looserModel, looserCarYear, looserTorque, looserZeroToHundred, looserTopSpeed)
VALUES(nextval('hibernate_sequence'), current_timestamp, 'BMW - BMW 328', 'BMW', 'BMW 328', 1936, 350, 5.6, 250, 'Chevrolet - Camaro ZL1', 'Chevrolet', 'Camaro ZL1', 2021, 650, 3.7, 318);
INSERT INTO racetrack(id, raceDate, winner, winnerBrand, winnerModel, winnerCarYear, winnerTorque, winnerZeroToHundred, winnerTopSpeed, looser, looserBrand, looserModel, looserCarYear, looserTorque, looserZeroToHundred, looserTopSpeed)
VALUES(nextval('hibernate_sequence'), current_timestamp, 'Ford - Mustang', 'Ford', 'Mustang', 2018, 556, 4.5, 250, 'BMW - BMW M1 Procar', 'BMW', 'BMW M1 Procar', 1979, 383, 3.1, 260);
INSERT INTO racetrack(id, raceDate, winner, winnerBrand, winnerModel, winnerCarYear, winnerTorque, winnerZeroToHundred, winnerTopSpeed, looser, looserBrand, looserModel, looserCarYear, looserTorque, looserZeroToHundred, looserTopSpeed)
VALUES(nextval('hibernate_sequence'), current_timestamp, 'Toyota - TRD Camry', 'Toyota', 'TRD Camry', 2021, 267, 5.1, 315, 'BMW - BMW E30 M3', 'BMW', 'BMW E30 M3', 1987, 240, 6.5, 235);


* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 



* Use any cURL tool to query the APIs
o http://localhost:9091/kyalamitrack/info 
o http://localhost:9091/kyalamitrack/all 
o http://localhost:9091/kyalamitrack/random-simulation
o http://localhost:9091/kyalamitrack/actual-race  
o http://localhost:9091/kyalamitrack/all 

* Create the following html files in the META-INF/resource files
o landing.html 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Kylami Race Track - Simulation</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a><img src="kyalami.png" alt="logo" /></a>
        <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav">
                <a href="landing.html" class="nav-item nav-link active">Home</a>
                <a href="bmw_cars.html" class="nav-item nav-link">BMW</a>
                <a href="other_cars.html" class="nav-item nav-link">Other Brands</a>
                <a href="#" class="nav-item nav-link">Race Simulation</a>
            </div>
            <div class="navbar-nav ms-auto">
                <a href="#" class="nav-item nav-link">Register</a>
                <a href="#" class="nav-item nav-link">Login</a>
            </div>
        </div>
    </div>
</nav>
<div class="container">
    <div class="p-5 my-4 bg-light rounded-3">
        <h1>Kyalami Race Track Simulation - Using Quarkus</h1>
        <p class="lead"> The 16-turn, 4.522km anti - clockwise FIA graded circuit takes advantage of the naturally undulating landscape creating a challenging blend of sweeping, fast sections and tight, technical corners which makes Kyalami legendary.</p>
        <p><a href="simulation.html"  class="btn btn-success btn-lg">Start Simulation</a></p>
    </div>
    <div class="row">
        <div class="col-md-4">
            <h2 align="center">BMW</h2>
            <p>
                We live our passion for innovative engineering, high-performance machines, and the thrill of speed. BMW race cars, teams, and drivers have made an indelible mark on the world of motorsport since 1972, logging wins on the professional circuit and inspiring new generations to take the wheel with BMW M Motorsport vehicles.</p>
            <p><a href="bmw_cars.html"  class="btn btn-success">Go To &raquo;</a></p>
        </div>
        <div class="col-md-4">
            <h2 align="center">Other Brands</h2>
            <p>Porsche, Audi, Chevrolet, Ferrari, Jaguar, Bentley, Aston Martin, Lotus, Maserati, Lamborghini, Alfa Romeo, Lancia, Mercedes-Benz, and BMW is built in part upon success in sports car racing and the World Sportscar Championship. These makers' top road cars have often been very similar both in engineering and styling to those raced.</p>
            <p><a href="other_cars.html"  class="btn btn-success">Go To &raquo;</a></p>
        </div>
        <div class="col-md-4">
            <h2 align="center">Race Results</h2>
            <p>Making event results available for everyone. The results and timing information of all autosport -, motorsport- and other events timed with RSTime timing software are available on this website. From 2004 we have been building this online database including interesting information like:
            Results per class, Secor times, Pit and stimt times, and many more...</p>
            <p><a href="simulation_results.html" class="btn btn-success">Go To &raquo;</a></p>
        </div>
    </div>
    <hr>
    <footer>
        <div class="row">
            <div class="col-md-6">
                <p>No Copyright &copy; 2022 BMW ZA Training</p>
            </div>
        </div>
    </footer>
</div>
</body>
</html>


o bmw_cars.html

<!doctype html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8"/>
    <title>Kylami Race Track - BMW Brand</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <script type="application/javascript" src="bmwcars.js"></script>
</head>
<body>

<div class="container-fluid p-5 bg-primary text-white text-center">
    <h1 class="display-1">BMW Showroom</h1>
</div>


<br><br>
<center>
    <div class="card" style="width:1000px" align="center">
        <div class="card-body">
            <h4 class="card-title">All Cars</h4>
            <div id="all-bmws"></div>
        </div>
    </div>
</center>

<br><br><br>
<p align="center"><a onclick="history.back()"  class="btn btn-success btn-lg">Go Back &raquo;</a></p>

</body>
</html>


o bmwcars.js

function refresh() {
    $.get('/bmwcars/all', function (bmwcars) {

        var list = '';

        list = list
            + '<div class="container">'
            + '<table class="table table-hover">'
            + '<thead>'
            + '<tr>'
            + '<th>Brand</th>'
            + '<th>Model</th>'
            + '<th>Engine Capacity</th>'
            + '<th>Year</th>'
            + '<th>Torque</th>'
            + '<th>Zero to Hundred</th>'
            + '<th>Top Speed</th>'
            + '</tr>'
            + '</thead>'
            + '<tbody>';

        (bmwcars || []).forEach(function (bmw) {
            list = list
                    + '<tr>'
                        + '<td>' + bmw.brand + '</td>'
                        + '<td>' + bmw.model + '</td>'
                        + '<td>' + bmw.engineCapacity + '</td>'
                        + '<td>' + bmw.year + '</td>'
                        + '<td>' + bmw.torque + '</td>'
                        + '<td>' + bmw.zeroToHundred + '</td>'
                        + '<td>' + bmw.topSpeed + '</td>'
                    + '</tr>'
                + '</tbody>'
                + '</div>'
        });
        if (list.length > 0) {
            list = ''
                + '<table><thead><th></th><th></th><th></th></thead>'
                + list
                + '</table>';
        } else {
            list = "No BMW cars in database"
        }
        $('#all-bmws').html(list);
    });
}

function deleteCar(id) {
    $.ajax('/bmwcars/' + id, {method: 'DELETE'}).then(refresh);
}

$(document).ready(function () {

    $('#create-car-button').click(function () {
        var carModel = $('#car-model').val();
        var carYear = $('#car-year').val();
        var carColor = $('#car-color').val();
        var carPrice = $('#car-price').val();
        $.post({
            url: '/bmwcars',
            contentType: 'application/json',
            data: JSON.stringify({model: carModel,year: carYear,color: carColor,price: carPrice})
        }).then(refresh);
    });

    refresh();
});


o other_cars.html

<!doctype html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8"/>
    <title>Kylami Race Track - Other Brands</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <script type="application/javascript" src="othercars.js"></script>
</head>
<body>

<div class="container-fluid p-5 bg-primary text-white text-center">
    <h1 class="display-1">All Brands Showroom</h1>
</div>


<br><br>
<center>
    <div class="card" style="width:1000px" align="center">
        <div class="card-body">
            <h4 class="card-title">All Cars</h4>
            <div id="all-brands"></div>
        </div>
    </div>
</center>

<br><br><br>
<p align="center"><a onclick="history.back()"  class="btn btn-success btn-lg">Go Back &raquo;</a></p>

</body>
</html>


o othercars.js

function refresh() {
    $.get('/othercars/all', function (othercars) {

        var list = '';

        list = list
            + '<div class="container">'
            + '<table class="table table-hover">'
            + '<thead>'
            + '<tr>'
            + '<th>Brand</th>'
            + '<th>Model</th>'
            + '<th>Engine Capacity</th>'
            + '<th>Year</th>'
            + '<th>Torque</th>'
            + '<th>Zero to Hundred</th>'
            + '<th>Top Speed</th>'
            + '</tr>'
            + '</thead>'
            + '<tbody>';

        (othercars || []).forEach(function (bmw) {
            list = list
                    + '<tr>'
                        + '<td>' + bmw.brand + '</td>'
                        + '<td>' + bmw.model + '</td>'
                        + '<td>' + bmw.engineCapacity + '</td>'
                        + '<td>' + bmw.year + '</td>'
                        + '<td>' + bmw.torque + '</td>'
                        + '<td>' + bmw.zeroToHundred + '</td>'
                        + '<td>' + bmw.topSpeed + '</td>'
                    + '</tr>'
                + '</tbody>'
                + '</div>'
        });
        if (list.length > 0) {
            list = ''
                + '<table><thead><th></th><th></th><th></th></thead>'
                + list
                + '</table>';
        } else {
            list = "No Other race cars in database"
        }
        $('#all-brands').html(list);
    });
}

function deleteCar(id) {
    $.ajax('/othercars/' + id, {method: 'DELETE'}).then(refresh);
}

$(document).ready(function () {

    $('#create-car-button').click(function () {
        var carModel = $('#car-model').val();
        var carYear = $('#car-year').val();
        var carColor = $('#car-color').val();
        var carPrice = $('#car-price').val();
        $.post({
            url: '/othercars',
            contentType: 'application/json',
            data: JSON.stringify({model: carModel,year: carYear,color: carColor,price: carPrice})
        }).then(refresh);
    });

    refresh();
});


o simulation_results.html

<!doctype html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8"/>
    <title>Kylami Race Track - Simulation Results</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <script type="application/javascript" src="simulatedresults.js"></script>
</head>
<body>

<div class="container-fluid p-5 bg-primary text-white text-center">
    <h1 class="display-1">Simulated Race Results</h1>
</div>


<br><br>
<center>
    <div class="card" style="width:1000px" align="center">
        <div class="card-body">
            <h4 class="card-title">All Races</h4>
            <div id="race-results"></div>
        </div>
    </div>
</center>

<br><br><br>
<p align="center"><a onclick="history.back()"  class="btn btn-success btn-lg">Go Back &raquo;</a></p>

</body>
</html>

o simulatedresults.js 

function refresh() {
    $.get('/kyalamitrack/all', function (results) {

        var list = '';

        list = list
            + '<div class="container">'
            + '<table class="table table-hover">'
            + '<thead>'
            + '<tr>'
            + '<th>Winner</th>'
            + '<th>Looser</th>'
            + '<th>Winner Top Speed</th>'
            + '<th>Looser Top Speed</th>'
            + '<th>Winner Torque</th>'
            + '<th>Looser Torque</th>'
            + '<th>Date & Time</th>'
            + '</tr>'
            + '</thead>'
            + '<tbody>';

        (results || []).forEach(function (showresult) {
            list = list
                    + '<tr>'
                        + '<td>' + showresult.winner + '</td>'
                        + '<td>' + showresult.looser + '</td>'
                        + '<td>' + showresult.winnerTopSpeed + '</td>'
                        + '<td>' + showresult.looserTopSpeed + '</td>'
                        + '<td>' + showresult.winnerTorque + '</td>'
                        + '<td>' + showresult.looserTorque + '</td>'
                        + '<td>' + showresult.raceDate + '</td>'
                    + '</tr>'
                + '</tbody>'
                + '</div>'
        });
        if (list.length > 0) {
            list = ''
                + '<table><thead><th></th><th></th><th></th></thead>'
                + list
                + '</table>';
        } else {
            list = "No simulated races in database"
        }
        $('#race-results').html(list);
    });
}

function deleteCar(id) {
    $.ajax('/kyalamitrack/' + id, {method: 'DELETE'}).then(refresh);
}

$(document).ready(function () {

    $('#create-car-button').click(function () {
        var carModel = $('#car-model').val();
        var carYear = $('#car-year').val();
        var carColor = $('#car-color').val();
        var carPrice = $('#car-price').val();
        $.post({
            url: '/kyalamitrack',
            contentType: 'application/json',
            data: JSON.stringify({model: carModel,year: carYear,color: carColor,price: carPrice})
        }).then(refresh);
    });

    refresh();
});


* Switch on the Dev profile to make sure that the maven compiler has been updated successfully 

$ mvnw.cmd  clean compile quarkus:dev 


* Go to the following URL to see the UI you’ve just worked on for the Kylami Racetrack project. 
o http://localhost:9091/landing.html 

Play around with the application to view the whole application.

* Package the project as an uber package by running the following 

$ mvnw.cmd  clean compile package 


* Run the system on production profile

$ java -jar target/bmw-workshop-kyalami-bmwbrand-1.0.0-SNAPSHOT-runner.jar

* Test the application
o Correct ports
o End points 
o Data imports



=== THE END ===

























Annexure:
Common Tasks in this training 

Head over to the https://code.quarkus.io/ website using your browser.
* Group: za.co.bmw.workshop.day.one
* artifactId: bmw-workshop-day-one
* Java SE Version: Java 11
* Build Tool: Maven
* Version: 1.0.0-SNAPSHOT
* Starter Code: Yes

$ java -jar za.co.bmw.workshop.starter-runner.jar

$ netstat -ano | findStr "8080"
$ taskkill /F /PID pid_number 


$ netstat -ano | findStr "5005"
$ taskkill /F /PID pid_number


$ quarkus create app org.acme:rest-client-quickstart \
--extension=resteasy,resteasy-jackson,rest-client,rest-client-jackson \
--no-code

$ mvnw.cmd  quarkus:add-extension -Dextensions="rest-client,rest-client-jackson"

$ mvnw.cmd  quarkus:remove-extension -Dextensions="rest-client,rest-client-jackson"

$ mvnw.cmd  clean package

$ mvnw.cmd  compile quarkus:dev 

$ mvnw.cmd  quarkus:dev

How to set JAVA_HOME & JAVAC in Windows 10

1. Open Advanced System Settings

In Windows 10 press Windows key + Pause Key, This will open the System Settings window. Go to Change settings and select the Advanced tab.
Alternatively:
Open “Windows search” – you will find it next to the Windows logo


	

1. In the search field type in – advanced system settings
2. Click on the match on top of the list

2. Set JAVA_HOME Environment variable
In the “System Properties window” click “Environment Variables…”

Under “System variables” click the “New…” button and enter JAVA_HOME as “Variable name” and the path to your Java JDK directory under “Variable value”

3. Update System PATH
1. In “Environment Variables” window under “System variables” select Path
2. Click on “Edit…”
3. In “Edit environment variable” window click “New”
4. Type in %JAVA_HOME%\bin

4. Test your configuration
Open a new command prompt and type in:

echo %JAVA_HOME%

this will print out the directory JAVA_HOME points to or empty line if the environment variable is not set correctly
Now type in:

javac -version

this will print out the java compiler version if the Path variable is set correctly or “javac is not recognized as an internal or external command…” otherwise. UPDATE: in the comments below, several suggest running the command prompt as administrator if you see the error message. Please make sure you try this option





Reference Sites:

* https://lordofthejars.github.io/quarkus-cheat-sheet/
* https://htl-leonding-college.github.io/quarkus-docker-gh-actions-demo/
* https://quarkus.io/guides/deploying-to-kubernetes
* http://www.mastertheboss.com/soa-cloud/quarkus/how-to-run-quarkus-applications-on-kubernetes/ 
* https://redhat-developer-demos.github.io/quarkus-tutorial/quarkus-tutorial/kubernetes.html 
* https://medium.com/graalvm/using-graalvm-and-native-image-on-windows-10-9954dc071311 
* https://redhat-developer-demos.github.io/quarkus-tutorial/quarkus-tutorial/health.html
* https://quarkus.pro/guides/microprofile-health.html
* https://stephennimmo.com/adding-health-checks-to-your-quarkus-application/
* https://quarkus.io/guides/smallrye-metrics 
* https://redhat-developer-demos.github.io/quarkus-tutorial/quarkus-tutorial/kubernetes.html
* 

