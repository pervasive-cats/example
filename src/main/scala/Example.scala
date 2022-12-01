/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats

trait Example {

  val a: Int
  
  val b: Double
}

object Example {

  final private case class ExampleImpl(a: Int, b: Double) extends Example

  def apply(a: Int, b: Double): Example = ExampleImpl(a, b)
}
