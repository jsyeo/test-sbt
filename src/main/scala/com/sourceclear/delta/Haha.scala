package com.sourceclear.delta

import org.mindrot.jbcrypt.BCrypt

object Haha {
  def main(args: Array[String]): Unit = {
    println("LOL")

    val hashed = BCrypt.hashpw(candidate, BCrypt.gensalt(12))

    BCrypt.checkpw(candidate, hashed)
  }
}
