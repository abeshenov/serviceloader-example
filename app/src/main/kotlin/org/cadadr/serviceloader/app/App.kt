package org.cadadr.serviceloader.app

import java.io.File
import java.net.URLClassLoader
import java.util.ServiceLoader

import org.cadadr.serviceloader.api.Service
import kotlin.system.exitProcess

class App : Runnable {
    override fun run() {
        val jarFile = File("hello-world-service.jar")

        if (!jarFile.exists()) {
            System.err.println("File ${jarFile.absolutePath} doesn't exist")
            exitProcess(1)
        }

        val classLoader: ClassLoader = URLClassLoader(arrayOf(jarFile.toURI().toURL()), javaClass.classLoader)
        val serviceLoader: ServiceLoader<Service> = ServiceLoader.load(Service::class.java, classLoader)
        val service = serviceLoader.first()

        service.applyAction()
    }
}

fun main() {
    App().run()
}
