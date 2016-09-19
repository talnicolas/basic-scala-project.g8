logLevel := Level.Warn

resolvers += Resolver.url("TritonMeasurementIvy", url("http://artifactory.dev.stw/artifactory/meas-libraries-ivy"))(Resolver.ivyStylePatterns)
addSbtPlugin("streamtheworld" % "meas-fat-jar-sbt-plugin" % "1.+" changing())

resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(Resolver.ivyStylePatterns)
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.1")

/*import sbt._

object PluginDef extends Build {
  lazy val root = Project("plugins", file(".")) dependsOn (g8plugin)
  lazy val g8plugin =
    ProjectRef(uri("git://github.com/n8han/giter8#0.6.7"), "giter8-plugin")
}*/
