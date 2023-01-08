# Demo of java.util.ServiceLoader

This is a small demo of how
[ServiceLoaders](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ServiceLoader.html)
work in Java.
For more information, see my note
https://abeshenov.github.io/blog/2023-01-08-serviceliader.html


## Running the demo

First, package our service provider into a JAR:

```shell
./gradlew hello-world-service:jar
```

Now confirm that it really provides our service:

```shell
jar --file hello-world-service/build/libs/hello-world-service.jar --describe-module
```

Copy the JAR to the application directory:

```shell
cp hello-world-service/build/libs/hello-world-service.jar app
```

Run the app:

```shell
./gradlew app:run
```
