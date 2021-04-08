import sbt.Keys._

name := "calculator"
scalaVersion := "2.13.3"
version := "0.1.5"
organization := "safe2008"

// configs for sbt-github-packages plugin
githubOwner := "safe2008"
githubRepository := "sbt-github-package-demo"
githubTokenSource :=TokenSource.Environment("GITHUB_TOKEN")

resolvers += Resolver.githubPackages("safe2008", "sbt-github-package-demo")

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest"   %%  "scalatest"       %   "3.2.0",
      "safe2008"        %%  "calculator"      %   "0.1.5"

    )
  )

checksums in update := Nil