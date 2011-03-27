package com.menswear.MensWearWebsite;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	private static final long serialVersionUID = -8942982937815398772L;
	private static final Logger LOG = Logger.getLogger(IndexAction.class);
    
    public String execute() throws Exception {
    	LOG.debug("am actually working!!");
        return SUCCESS;
    }
}
