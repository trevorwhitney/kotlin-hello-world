# Kotlin Hello World

This was my first attempt at kotlin. I did a jvm and script version of hello world along with gradle
integration. To compile the "JVM" version

```bash
kotlinc src/main/kotlin/hello/sayHello.kt -include-runtime -d hello.jar
```

Or using gradle:
```bash
./gradlew clean buld
```

To run the script version:
```bash
kotlinc -script script/hello.kts
```

## Notes on gradle
This bit is all necessary for gradle to build an executable jar:
```
apply plugin: 'kotlin'
apply plugin: 'application'

mainClassName = 'hello.SayHelloKt'
jar {
    manifest {
        attributes 'Main-Class': 'hello.SayHelloKt'
    }

    // This line of code recursively collects and copies all of a project's files
    // and adds them to the JAR itself. One can extend this task, to skip certain
    // files or particular types at will
    from { configurations.compile.collect { it.isDirectory() ? it : zipTree(it) } }
}
```