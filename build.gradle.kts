plugins {
    id("java")
    id("maven-publish")
}

//group = "com.toofan.soft.school.api"
//version = "1.0-SNAPSHOT"
group = "com.github.Toofan-Soft"
version = "1.0"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
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
                groupId = "com.github.Toofan-Soft"
                artifactId = "school-api"
                version = "1.0"
            }
        }
    }
}

