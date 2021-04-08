import sbt.Keys._

// name := "calculator"
// scalaVersion := "2.13.5"
// version := "0.1.5"
// organization := "safe2008"

// configs for sbt-github-packages plugin
githubOwner := "safe2008"
githubRepository := "sbt-github-package-demo"
githubTokenSource := TokenSource.Or(TokenSource.Environment("GITHUB_TOKEN"), TokenSource.GitConfig("github.token"))
resolvers += Resolver.githubPackages("safe2008", "sbt-github-package-demo")

credentials +=
  Credentials(
    "GitHub Package Registry",
    "maven.pkg.github.com",
    "safe2008",
    sys.env.getOrElse("GITHUB_TOKEN", "N/A")
  )

val projectNamespace = "safe2008"
val projectName = "github-packages-playground"
val projectVersion = "1.0.1"

lazy val commonSettings = Seq(
  organization := projectNamespace,
  scalaVersion := "2.13.5",
  version := projectVersion
)

lazy val root = (project in file("."))
  .settings(
    commonSettings,
    name := projectName,
    libraryDependencies ++= Seq(
      "org.scalatest"           %%  "scalatest"           %   "3.2.0",
      "safe2008"                %%  "calculator"          %   "0.1.5"

    )
  )

checksums in update := Nil