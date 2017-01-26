import AssemblyKeys._

assemblySettings

name := "delta"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions += "-target:jvm-1.7"

libraryDependencies += "org.apache.maven.indexer" % "indexer-core" % "5.1.1"

libraryDependencies += "org.apache.lucene" % "lucene-core" % "4.8.1"

libraryDependencies += "com.amazonaws" % "aws-java-sdk-s3" % "1.11.8"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.7"

libraryDependencies += "org.mindrot" % "jbcrypt" % "0.3m"
