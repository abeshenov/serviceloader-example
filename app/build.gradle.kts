plugins {
    application
}

dependencies {
    implementation(project(":api"))
}

application {
    mainClass.set("org.cadadr.serviceloader.app.AppKt")
}
