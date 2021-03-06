// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.7")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.6")
addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.7")
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-bintray-bundle" % "1.0.2")
addSbtPlugin("com.lightbend.conductr" % "sbt-conductr" % "2.1.3")

resolvers += Resolver.url("lightbend-monitoring", url("https://lightbend.bintray.com/commercial-monitoring"))(Resolver.ivyStylePatterns)
addSbtPlugin("com.lightbend.cinnamon" % "sbt-cinnamon" % "2.0.0-RC2")
