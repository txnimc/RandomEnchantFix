import toni.blahaj.setup.modImplementation

plugins {
	id("toni.blahaj")
}

blahaj {
	config {
		// yarn()
		// versionedAccessWideners()
	}
	setup {
		txnilib("1.0.22")
		forgeConfig()

		if (mod.projectName == "1.21.1-fabric") {
			deps.modImplementation(modrinth("dungeons-and-taverns", "v4.4.4+mod"))
			deps.modImplementation(modrinth("when-dungeons-arise", "2.1.60"))
		}

		if (mod.projectName == "1.20.1-fabric") {
			deps.modImplementation(modrinth("dungeons-and-taverns", "d1sY0JqV"))
			deps.modImplementation(modrinth("when-dungeons-arise", "Vd5XOXlj"))
		}

		/* access Gradle's DependencyHandler
		deps.modImplementation("maven:modrinth:sodium:mc$mc-0.6.5-$loader")

		// configure Curseforge & Modrinth publish settings
		incompatibleWith("optifine")

		// add mods with Blahaj's fluent interface
		addMod("sodiumextras")
			.modrinth("sodium-extras") // override with Modrinth URL slug
			.addPlatform("1.21.1-neoforge", "neoforge-1.21.1-1.0.7")
			.addPlatform("1.21.1-fabric", "fabric-1.21.1-1.0.7") { required() } */
	}
}