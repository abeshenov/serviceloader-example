package org.cadadr.serviceloader.helloworld

class HelloWorldService : org.cadadr.serviceloader.api.Service {
    override fun applyAction() {
        println("Hello, World!")
    }
}
