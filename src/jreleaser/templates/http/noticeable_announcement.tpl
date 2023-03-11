JReleaser {{projectVersion}} is now available! This is a patch release that only includes bug fixes in the following
areas: docker, java-archive, native-image, jlink, single-jar.

**Docker:** Fixed a couple of issues when buildx was configured as well as when `docker.io` was used as a registry name
instead of `DEFAULT`.

**Assemblers:** Assemblers can now specify a timestamp for all archive entries (reproducible builds FTW) as well as
longFileMode/bigNumberMode for tars. java-archive failed to generate a suitable launcher for a modular application.
The deprecated NATIVE_IMAGE distribution type was accidentally removed; use BINARY instead. Targets set in `jlink.jdeps`
will be automatically converted to absolute paths. All assemblers and package managers are now fully compatible with
modular Java applications.

[🚀 Changelog](https://github.com/jreleaser/jreleaser/releases/tag/{{tagName}}) [📝 Milestone]({projectLinkVcsBrowser}}?q=is%3Aclosed+milestone%3A{{tagName}})