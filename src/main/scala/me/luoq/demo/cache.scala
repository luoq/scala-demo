package me.luoq.demo

import spray.caching.{Cache, LruCache}
import scala.concurrent.ExecutionContext.Implicits.global

object MultiCachePut extends App{
  val cache: Cache[Int] = LruCache(maxCapacity=100, initialCapacity=10)
  def put1(x:Int) = cache(x) {
    println("put1")
    if(x>10)
      throw new Exception("put1 failed")
    x
  }
  def put2(x:Int) = cache(x) {
    println("put2")
    x*x+1
  }
  put1(10) map println
  put2(10) map println
  put1(100) map println
  put2(100) map println
  Thread sleep 3
  put2(100) map println
  put1(100) map println
}

