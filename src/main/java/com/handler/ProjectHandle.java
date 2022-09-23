package com.handler;

import com.entity.Project;
import com.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.ProjectService;

import java.util.List;

@RestController
public class ProjectHandle {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/Project")
    public String project(Project project) {
        projectService.project(project);
        return "redirect:/index";
    }



}
