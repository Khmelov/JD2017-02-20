package by.it.loktev.project.java.controller;

import javax.servlet.http.HttpServletRequest;

enum Actions {

    SIGNUP {
        {
            this.command=new CmdSignup();
        }
    },
    LOGIN {
        {
            this.command=new CmdLogin();
        }
    },
    PROFILE {
        {
            this.command=new CmdProfile();
        }
    },
    ERROR {
        {
            this.command=new CmdError();
        }
    },
    TASKLIST {
        {
            this.command=new CmdTaskList();
        }
    },
    TASKCREATE {
        {
            this.command=new CmdTaskCreate();
        }
    },
    TASKEDIT {
        {
            this.command=new CmdTaskEdit();
        }
    };


    public Action command;

    static Action defineFrom(HttpServletRequest request){
        String command=request.getParameter("command");
        if ( command==null ){
            command="index";
        }
        Action res;
        try {
            res = Actions.valueOf(command.toUpperCase()).command;
        } catch ( IllegalArgumentException e ){
            res=Actions.ERROR.command;
        }
        return res;
    }
}
