name := """scala-demo"""

organization := "me.luoq.demo"

version := "0.0.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.10",
  "io.spray" %% "spray-caching" % "1.3.3"
)
