import AssemblyKeys._

assemblySettings

scalaVersion := "2.11.8"

name := "template-scala-parallel-productranking"

organization := "org.apache.predictionio"

libraryDependencies ++= Seq(
  "org.apache.predictionio"    %% "apache-predictionio-core"          % "0.13.0" % "provided",
  "org.apache.spark" %% "spark-core"    % "2.1.1" % "provided",
  "org.apache.spark" %% "spark-mllib"   % "2.1.1" % "provided")
