/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.*

class Test extends AnyFunSpec {

  describe("An Example") {
    describe("when first initialize") {
      it("should retain its values") {
        val a = 1
        val b = 2.0
        val c = 5L
        val example = Example(a, b, c)
        example.a shouldBe a
        example.b shouldBe b
        example.c shouldBe c
      }
    }
  }
}
