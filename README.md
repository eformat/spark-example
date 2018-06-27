### spark-example

##### Run locally

```
mvn test
```

##### Run the Java application on Apache Spark cluster

```
./bin/spark-submit --class org.spark,example.WordCount --master local[2] /path to maven project/target/first-example-1.0-SNAPSHOT.jar /<path to a demo test file> /path to output directory
```
