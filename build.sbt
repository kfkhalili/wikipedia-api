name := "Wikiscraper"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.2.0",
  "org.scalatest" %% "scalatest" % "3.2.0" % "test",
  "org.scalaj" %% "scalaj-http" % "2.4.2",
  "org.apache.spark" %% "spark-core" % "2.4.3",
  "org.apache.spark" %% "spark-sql" % "2.4.3",
  "net.liftweb" %% "lift-json" % "3.4.2",
  "com.lihaoyi" %% "requests" % "0.6.5"
)

scalacOptions ++= Seq("-unchecked", "-deprecation")