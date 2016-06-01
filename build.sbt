name := "QueryFilter"

version := "1.0"

libraryDependencies ++= Seq(
  "org.reactivemongo" % "play2-reactivemongo_2.10" % "0.11.0.play23"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// TODO libraryDependencies += "com.github.t3hnar" %% "scala-bcrypt_2.10" % "2.2"