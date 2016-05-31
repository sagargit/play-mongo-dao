name := "QueryFilter"

version := "1.0"

libraryDependencies ++= Seq(
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.2"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// TODO libraryDependencies += "com.github.t3hnar" %% "scala-bcrypt_2.10" % "2.2"