package com.azavea.stac4s

import com.azavea.stac4s.geometry.Geometry
import com.azavea.stac4s.testing.JsInstances._

import io.circe.testing.{ArbitraryInstances, CodecTests}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers
import org.scalatestplus.scalacheck.Checkers
import org.typelevel.discipline.scalatest.FunSuiteDiscipline

class JsSerDeSpec extends AnyFunSuite with FunSuiteDiscipline with Checkers with Matchers with ArbitraryInstances {
  checkAll("Codec.ItemCollection", CodecTests[ItemCollection].unserializableCodec)
  checkAll("Codec.StacItem", CodecTests[StacItem].unserializableCodec)
  checkAll("Codec.Geometry", CodecTests[Geometry].unserializableCodec)

}
