plugins {
    id("java")
    id("maven-publish")
}

group = "com.toofan.soft.school.api"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_19 // Use the Java version you want to support
    targetCompatibility = JavaVersion.VERSION_19 // Use the Java version you want to target
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

sourceSets {
    main {
        java.srcDirs("src/main/java")
    }
}


afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["java"])
//                groupId = "com.github.Toofan-Soft"
                groupId = "com.toofan.soft.school.api"
                artifactId = "school-api"
                version = "1.0"
            }
        }
    }
}

