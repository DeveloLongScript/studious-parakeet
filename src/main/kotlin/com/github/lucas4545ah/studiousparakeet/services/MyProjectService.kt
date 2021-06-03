package com.github.lucas4545ah.studiousparakeet.services

import com.github.lucas4545ah.studiousparakeet.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
