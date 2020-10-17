package com.github.bglmmz.contractplugin.services

import com.intellij.openapi.project.Project
import com.github.bglmmz.contractplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
