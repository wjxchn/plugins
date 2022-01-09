package com.github.wjxchn.plugins.services

import com.intellij.openapi.project.Project
import com.github.wjxchn.plugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
