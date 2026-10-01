## Change log
----------------------

Version 3.1
-------------

FIXED:

- the three testers in MeanBeanExtensions are no longer static. MeanBean keeps its service context
  per thread, keyed by a weakly held object, and every new tester or verifier replaces that key, so
  a tester in a static field depended on an object it does not own staying alive. Once anything
  else on the thread built its own tester or verifier and that object was collected, every call
  here threw "context key not available" - in a consumer it struck in CI only, while the same
  commit was green locally, and here on JDK 25 it failed 6 of this library's own 6 tests. A tester
  built inside the method owns its context for the duration of the call (#1)

CHANGED:

- build only: the Gradle wrapper goes from 8.9 to 9.7.1. 8.9 cannot run on JDK 25 at all
  ("Unsupported class file major version 69"), so the fix above could not have been verified
  without it
- build only: releases go through the Central Portal with the nmcp plugin and
  publishingType USER_MANAGED, so an upload waits for a deliberate release click. The old target,
  https://oss.sonatype.org/service/local/staging/deploy/maven2/, was shut down by Sonatype and
  would have published nowhere. Signing now follows the KEY rather than the version form, so a
  snapshot with a key is signed and a release without one is refused instead of published
  unsigned (#3)
- build only: an API compatibility gate compares every build against the last release from Maven
  Central with japicmp; within the same major a break fails the build. Measured by making a public
  method package-private, which it reported as METHOD_LESS_ACCESSIBLE (#3)
- build only: .gitignore no longer ignores the whole gradle/ directory. Files already tracked
  stayed tracked, so nothing looked wrong until a new build script was added and silently never
  committed - which is how the gate file above reached develop as a red build (#5)



Version 3
-------------

ADDED:

- new extension class MeanBeanExtensions
- new libs.versions.toml file for new automatic catalog versions update

CHANGED:

- update of jdk to version 17
- update of gradle to new version 8.9
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.51.0
- update of gradle-plugin dependency 'org.ajoberstar.grgit:grgit-gradle' to new version 5.2.2
- update of gradle-plugin dependency of 'com.diffplug.spotless:spotless-plugin-gradle' in version 7.0.0.BETA1
- update of test dependency silly-collection to new version 27.1
- update of test dependency junit-juniper to new version 5.11.0-M2
- update of test dependency junit-platform-launcher to new version 1.11.0-M2
- moved all factory classes to new package 'factory'

Version 1.3
-------------

ADDED:

- added new factory class for the new java.util.time package LocalDate, LocalTime and LocalDateTime
- added new test-dependency junit-jupiter (junit 5) in version 5.7.2

CHANGED:

- update gradle to new version 6.9
- changed to new package io.github.astrapi69
- update of dependency silly-collections to new version 8.7
- remove of test-dependency testng
- extracted project properties to gradle.properties

Version 1.2
-------------

ADDED:

- new build system gradle

CHANGED:

- removed maven build system and all related files
- removed all lombok dependent imports


Version 1.1.1
-------------

CHANGED:

- update of parent version to 4.4
- update of dependency silly-collections version to 5


Version 1.1
-------------

ADDED:

- added new dependency of silly-collections in version 4.31
- added new abstract generic factory classes
- added new factory class for List of string arrays

CHANGED:

- update of parent version to 3.11
- removed unneeded .0 at the end of version

Version 1.0.0
-------------

ADDED:

- initial version
- javadoc created
- this changelog file
- new factory classes for File, Locale, Object[], and String[] created

CHANGED:

- update of parent version


Notable links:
[keep a changelog](http://keepachangelog.com/en/1.0.0/) Don’t let your friends dump git logs into changelogs
