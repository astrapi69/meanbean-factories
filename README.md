# meanbean-factories

<div align="center">

[![Build Status](https://travis-ci.org/astrapi69/meanbean-factories.svg?branch=master)](https://travis-ci.org/astrapi69/meanbean-factories) 
[![Coverage Status](https://coveralls.io/repos/github/astrapi69/meanbean-factories/badge.svg?branch=develop)](https://coveralls.io/github/astrapi69/meanbean-factories?branch=develop) 
[![Open Issues](https://img.shields.io/github/issues/astrapi69/meanbean-factories.svg?style=flat)](https://github.com/astrapi69/meanbean-factories/issues) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/meanbean-factories/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/meanbean-factories)
[![Javadocs](http://www.javadoc.io/badge/de.alpharogroup/meanbean-factories.svg)](http://www.javadoc.io/doc/de.alpharogroup/meanbean-factories)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)

</div>

This project provides factory classes for not supported property types from the meanbean library. That factory classes are intended to use in unit tests with the meanbean library.

If you like this project put a ⭐ and donate

## License

The source code comes under the liberal MIT License, making meanbean-factories great for all types of applications.

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~meanbean-factories~~~) for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core functionality of meanbean-factories:

Than you can add the dependency to your dependencies:

	<properties>
			...
		<!-- MEANBEAN-FACTORIES version -->
		<meanbean-factories.version>2</meanbean-factories.version>
			...
	</properties>
			...
		<dependencies>
			...
			<!-- MEANBEAN-FACTORIES DEPENDENCY -->
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>meanbean-factories</artifactId>
				<version>${meanbean-factories.version}</version>
			</dependency>
			...
		</dependencies>

			
## gradle dependency

You can first define the version in the ext section and add than the following gradle dependency to your project `build.gradle` if you want to import the core functionality of meanbean-factories:

```
ext {
			...
    meanbeanFactoriesVersion = "2"
			...
}
dependencies {
			...
implementation("de.alpharogroup:meanbean-factories:$meanbeanFactoriesVersion")
			...
}
```
	


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


# Donations

If you like this library, please consider a donation through bitcoin or over bitcoin-cash with:

36JxRRDfRazLNqUV6NsywCw1q7TK38ukpC

or over ether with:

0x588Aa02De98B1Ef70afeDC3ec5290130a3E5e273

or over flattr:

<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Fastrapi69%2Fmeanbean-factories" target="_blank">
<img src="http://api.flattr.com/button/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0" />
</a>

## Credits

|Travis CI|
|:-:|
|![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png)|
|Many thanks to [Travis CI](https://travis-ci.org) for providing a free continuous integration service for open source projects.|




