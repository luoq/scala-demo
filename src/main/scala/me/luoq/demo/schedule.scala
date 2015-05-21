package me.luoq.demo

import akka.actor.ActorSystem
import scala.concurrent.duration._

object AkkaSchedule extends App{
  val system = ActorSystem()
  val scheduler = system.scheduler
  import system.dispatcher
  scheduler.scheduleOnce(3 seconds) {
    println("hello")
  }
  scheduler.schedule(2 seconds, 1 seconds) {
    println("hi")
  }
  Thread sleep 8000
  println("waken up")
  system.shutdown
}
