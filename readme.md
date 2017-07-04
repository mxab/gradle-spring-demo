#Buildship union classpath issue

We have a service bean (_MyService_) that is picked up by Spring's component scan in the classpath.

For our tests we want to override our component and therefore add a Test Configuration that provides another MyService bean that is primary so it gets picked up

If you build/run it with gradle via the command line you will see that:

- the tests will output the message from the MyService bean from the test config (`./gradlew test` ) ("THIS IS A TEST MESSAGE")

- the run will output from the real MyService bean (`./gradlew bootRun`) ("Hello World")


If you run it in eclipse imported via buildship with the "Run as Java Application" and "Run as Junit test" you will both times see:

"THIS IS A TEST MESSAGE"

