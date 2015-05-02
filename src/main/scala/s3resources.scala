package ohnosequencesBundles.statika

import ohnosequences.statika.bundles._

import sys.process._
import java.net.URL
import java.io.File

case object s3resources {

  case object S3resources extends Module {

    lazy val baseS3URL: URL = new URL("https://s3-eu-west-1.amazonaws.com/resources.ohnosequences.com")

    final def downloadTo(relativeURL: String, file: File): Unit = 
      new URL(baseS3URL, relativeURL) #> file !!
  }

}
