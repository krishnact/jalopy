# Jalopy

A source code formatter/beautifier/pretty printer for the Java programming language.

[License](http://img.shields.io/badge/license-MIT-lightgrey.svg?style=flat)

## Source Code

This is a fork of the late/great jalopy source formatter at http://sourceforge.net/projects/jalopy/, later forked by @lukespragg, and later forked again by me. The swing application and log4j appenders were removed. What remains is just the library part.

Or download the [latest zip archive](https://github.com/rotty3000/jalopy/archive/master.zip).

## Contributing

Send me pull requests OR create issues!

## Usage

### Maven

    <dependency>
        <groupId>com.github.rotty3000</groupId>
        <artifactId>jalopy</artifactId>
        <version>3000.0.0</version>
    </dependency>

### Gradle

    repositories {
        mavenLocal()
        mavenCentral()
    }
    dependencies {
        compile 'com.github.rotty3000:jalopy:3000.0.0'
    }

## Documentation

To generate the the Javadocs with Maven, use the `mvn javadoc:javadoc` command. To view the javadocs simply go to `target/site/apidocs/` and open `index.html` in a web browser.

## Legal Stuff

Jalopy is licensed under the [BSD 3-Clause License](https://tldrlegal.com/l/bsd3). Basically, you can do whatever you want as long as you include the original copyright. Please see the `LICENSE.txt` file for details.

## Credits

* The original developers of the Jalopy project and jalopy-maven-plugin.
* All the people behind [Java](http://www.oracle.com/technetwork/java/index.html), [Maven](http://maven.apache.org/), and [Gradle](http://www.gradle.org/).
* Luke Spragg for trying to get this going again.