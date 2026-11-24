# meanbean-factories

<div align="center">

[![Build Status](https://api.travis-ci.com/astrapi69/meanbean-factories.svg?branch=master)](https://travis-ci.com/github/astrapi69/meanbean-factories)
[![Coverage Status](https://coveralls.io/repos/github/astrapi69/meanbean-factories/badge.svg?branch=develop)](https://coveralls.io/github/astrapi69/meanbean-factories?branch=develop)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/meanbean-factories.svg?style=flat)](https://github.com/astrapi69/meanbean-factories/issues)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/meanbean-factories/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/meanbean-factories)
[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/meanbean-factories.svg)](http://www.javadoc.io/doc/io.github.astrapi69/meanbean-factories)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=MJ7V43GU2H386)

</div>

This project provides factory classes for not supported property types from the meanbean library. That factory classes are intended to use in unit tests with the meanbean library.

If you like this project put a ⭐ and donate

## License

The source code comes under the liberal MIT License, making meanbean-factories great for all types of applications.


## gradle dependency

Replace the variable ${latestVersion} with the current latest version: [![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/meanbean-factories/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/meanbean-factories)

You can first define the version in the ext section and add than the following gradle dependency to
your project `build.gradle` if you want to import the core functionality of meanbean-factories:

define version in file gradle.properties

```
meanbeanFactoriesVersion=${latestVersion}
```

or in build.gradle ext area

```
ext {
            ...
    meanbeanFactoriesVersion = "${latestVersion}"
            ...
}
```

and then add the dependency to the dependencies area

```
dependencies {
            ...
implementation("io.github.astrapi69:meanbean-factories:$meanbeanFactoriesVersion")
            ...
}
```

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~io.github.astrapi69~meanbean-factories~~~) for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core functionality of meanbean-factories:

Than you can add the dependency to your dependencies:

    <properties>
            ...
        <!-- MEANBEAN-FACTORIES version -->
        <meanbean-factories.version>${latestVersion}</meanbean-factories.version>
            ...
    </properties>
            ...
        <dependencies>
            ...
            <!-- MEANBEAN-FACTORIES DEPENDENCY -->
            <dependency>
                <groupId>io.github.astrapi69</groupId>
                <artifactId>meanbean-factories</artifactId>
                <version>${meanbean-factories.version}</version>
            </dependency>
            ...
        </dependencies>


## Want to Help and improve it? ###

The source code for meanbean-factories are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/meanbean-factories/fork](https://github.com/astrapi69/meanbean-factories/fork)

To share your changes, [submit a pull request](https://github.com/astrapi69/meanbean-factories/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the meanbean-factories developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/astrapi69/meanbean-factories/issues).

## Note

No animals were harmed in the making of this library.

## License

The source code comes under the liberal MIT License, making jobj-core great for all types of applications.

## Support this project

If meanbean-factories is useful to you, a star on [GitHub](https://github.com/astrapi69/meanbean-factories) helps others find it.
Sharing it or reporting a bug helps just as much.

If you would like to contribute financially, the channels are on the repository's Sponsor button, which
reads [.github/FUNDING.yml](.github/FUNDING.yml): GitHub Sponsors, Liberapay, Ko-fi and PayPal.

## Credits

|Travis CI|
|:-:|
|![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png)|
|Many thanks to [Travis CI](https://travis-ci.com) for providing a free continuous integration service for open source projects.|

## Git hooks

The repository's git hooks live in `.githooks`: `commit-msg` where present, and `pre-commit`, which refuses a
commit whose files Spotless would format. Activate them once per clone or worktree:

```bash
git config core.hooksPath .githooks
```
