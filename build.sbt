Nice.scalaProject

name          := "s3resources"
organization  := "ohnosequences-bundles"
description   := "A bundle for s3resources tool"

publishBucketSuffix := "era7.com"

resolvers += "Era7 maven releases" at "https://s3-eu-west-1.amazonaws.com/releases.era7.com"

libraryDependencies += "ohnosequences" %% "statika" % "2.0.0-M1"