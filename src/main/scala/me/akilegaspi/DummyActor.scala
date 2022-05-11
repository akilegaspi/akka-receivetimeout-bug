package me.akilegaspi

import akka.actor.{Actor, Props}

import scala.concurrent.duration._

class DummyActor extends Actor {

  context.setReceiveTimeout(10.seconds)
  override def receive: Receive = {
    case "Test" => context.stop(self)
  }

}


object DummyActor {
  def props(): Props =
    Props(new DummyActor)
}