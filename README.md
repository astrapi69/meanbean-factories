# meanbean-factories

<div align="center">

[![Build Status](https://api.travis-ci.com/astrapi69/meanbean-factories.svg?branch=master)](https://travis-ci.com/github/astrapi69/meanbean-factories)
[![Coverage Status](https://coveralls.io/repos/github/astrapi69/meanbean-factories/badge.svg?branch=develop)](https://coveralls.io/github/astrapi69/meanbean-factories?branch=develop)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/meanbean-factories.svg?style=flat)](https://github.com/astrapi69/meanbean-factories/issues)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/meanbean-factories/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.astrapi69/meanbean-factories)
[![Javadocs](http://www.javadoc.io/badge/io.github.astrapi69/meanbean-factories.svg)](http://www.javadoc.io/doc/io.github.astrapi69/meanbean-factories)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)

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

# Donations

This project is kept as an open source product and relies on contributions to remain being
developed. If you like this library, please consider a donation

over paypal: <br><br>
<a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=MJ7V43GU2H386" target="_blank">
<img src="https://www.paypalobjects.com/en_US/GB/i/btn/btn_donateCC_LG.gif" alt="PayPal this" title="PayPal – The safer, easier way to pay online!" style="border: none" />
</a>
<br><br>
or over bitcoin(BTC) with this address:

bc1ql2y99q7e8psndhcc3gferk03esw3qqf677rhjy

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/bc1ql2y99q7e8psndhcc3gferk03esw3qqf677rhjy.png"
alt="Donation Bitcoin Wallet" width="250"/>

or over FIO with this address:

FIO7tFMUVAA9cHiPPqKMfMXiSxHrbpiFyRYqTketNuM67aULuwjop

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/FIO7tFMUVAA9cHiPPqKMfMXiSxHrbpiFyRYqTketNuM67aULuwjop.png"
alt="Donation FIO Wallet" width="250"/>

or over Ethereum(ETH) with:

0xc057D159D3C8f3311E73568b334FF6fE82EB2b7D

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/0xc057D159D3C8f3311E73568b334FF6fE82EB2b7D.png"
alt="Donation Ethereum Wallet" width="250"/>

or over Ethereum Classic(ETC) with:

0xF708cA86D86C246B69c3F4BAe431eBbe0c2bfddD

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/0xF708cA86D86C246B69c3F4BAe431eBbe0c2bfddD.png"
alt="Donation Ethereum Classic Wallet" width="250"/>

or over Dogecoin(DOGE) with:

D5yi4Um8cpakd6yPRm2hGWuQ5nrVzhSSW1

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/D5yi4Um8cpakd6yPRm2hGWuQ5nrVzhSSW1.png"
alt="Donation Dogecoin Wallet" width="250"/>

or over Monero(XMR) with:

49bqeRQ7Bf49oJFVC72pqpe5hFbb62pfXDYPdLsadGGF81KZW2ZfrPZ8PbAVu5X2v1TYAspeczMya3cYQysNS4usRRPQHVw

<img src="https://github.com/astrapi69/jgeohash/blob/master/src/main/resources/img/49bqeRQ7Bf49oJFVC72pqpe5hFbb62pfXDYPdLsadGGF81KZW2ZfrPZ8PbAVu5X2v1TYAspeczMya3cYQysNS4usRRPQHVw.png"
alt="Donation Monero Wallet" width="250"/>

or over flattr:

<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Fastrapi69%2Fmeanbean-factories" target="_blank">
<img src="http://api.flattr.com/button/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0" />
</a>

## Credits

|Travis CI|
|:-:|
|![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png)|
|Many thanks to [Travis CI](https://travis-ci.com) for providing a free continuous integration service for open source projects.|
