package by.it.prigozhanov.project.java.controller;

import com.sun.deploy.net.HttpRequest;

/**
 * Created by v-omf on 5/5/2017!
 */
public class CommandError implements ActionCommand {
    @Override
    public String execute(HttpRequest request) {
        return "/error.jsp";
    }
}
