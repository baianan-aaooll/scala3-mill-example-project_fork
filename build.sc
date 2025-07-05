import mill._, scalalib._

object examples extends ScalaModule {
  def scalaVersion = "3.7.1"
  
  override def scalacOptions = super.scalacOptions() ++ Seq(
    "-deprecation",   // show deprecation sites
  )
}
