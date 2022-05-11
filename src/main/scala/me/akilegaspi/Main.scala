package me.akilegaspi

import akka.actor.{ActorSystem, CoordinatedShutdown}

object Main extends App {

  implicit val system = ActorSystem()
  val dummyActor = system.actorOf(DummyActor.props())

  dummyActor ! "Test"

  Thread.sleep(20000)
  CoordinatedShutdown(system)

}
