plugins {
  id("org.jetbrains.kotlin.multiplatform").version("1.9.20")
  id("com.apollographql.apollo3").version("3.8.2")
}

kotlin {
  jvm()
  
  sourceSets {
    getByName("jvmTest") {
      dependencies {
        implementation(kotlin("test"))
      }
    }
  }
}

apollo {
  service("api") {
    packageName.set("api")
  }
}