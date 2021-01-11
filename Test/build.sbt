name := "hello"
version := "1.0"
scalaVersion := "2.12.12"

lazy val actor= project.in(file("actor"))
  .settings(
    libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor-typed" % "2.6.10" , "com.typesafe.akka" %% "akka-persistence-typed" % "2.6.9"
 , "org.scalactic" %% "scalactic" % "3.3.0-SNAP2" , "org.scalatest" %% "scalatest" % "3.3.0-SNAP2" % Test ,
    "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.9" % Test, "com.typesafe.akka" %% "akka-persistence-testkit" % "2.6.10" % Test )
)

lazy val persistence = project.in(file("persistence")).settings(
     libraryDependencies ++= Seq("com.typesafe.slick" %% "slick" % "3.3.2" , "mysql" % "mysql-connector-java" % "8.0.18" , 
 "org.scalatest" %% "scalatest" % "3.3.0-SNAP2" % Test , "org.eclipse.dirigible" % "dirigible-database-h2" % "5.6.0" % Test 
)
)
  

lazy val root = project.in(file("root")).aggregate(actor , persistence )
