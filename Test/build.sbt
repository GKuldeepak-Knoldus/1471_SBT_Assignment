name := "hello"
version := "1.0"
scalaVersion := "2.12.12"

lazy val play= (project in file("play"))

lazy val http = project.in(file("http"))


lazy val root = project.in(file("root")).aggregate(play , http )
