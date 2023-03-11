🚀 JReleaser {{projectVersion}} has been released! {{releaseNotesUrl}}
🐞 This is a patch release that only includes bug fixes in the following areas: docker, java-archive, native-image, jlink, single-jar
🐳 Patched couple of buildx issues as well as when `docker.io` was used as a registry name instead of DEFAULT
☕️ java-archive failed to generate a suitable launcher for a modular application
📦 Assemblers can now specify a timestamp for all archive entries (reproducible builds FTW) as well as longFileMode/bigNumberMode for tars
🧩 All assemblers and package managers are now fully compatible with modular Java applications.
🏆 Deprecated NATIVE_IMAGE distribution type was accidentally removed. Use BINARY instead
🔗 Targets set in jlink.jdeps will be automatically converted to absolute paths
📝 Full list of changes available at the {{milestoneName}} milestone {{projectLinkVcsBrowser}}?q=is%3Aclosed+milestone%3A{{tagName}}
🙏 As always, feedback is welcome. Feel free to raise a ticket at {{projectLinkBugTracker}}