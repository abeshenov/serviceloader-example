# Demo of ServiceLoader

This is a small demo of how
link:https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ServiceLoader.html[ServiceLoaders]
work in Java.

First, package our service provider into a JAR:

[source, shell]
----
./gradlew hello-world-service:jar
----

Now confirm that it really provides our service:

[source, shell]
----
jar --file hello-world-service/build/libs/hello-world-service.jar --describe-module
----

Copy the JAR to the application directory:

[source, shell]
----
cp hello-world-service/build/libs/hello-world-service.jar app
----

Run the app:

[source, shell]
----
./gradlew app:run
----
