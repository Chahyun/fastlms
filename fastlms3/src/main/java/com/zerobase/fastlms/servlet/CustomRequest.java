package com.zerobase.fastlms.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomRequest extends HttpServletRequestWrapper {
    public CustomRequest(HttpServletRequest request){
        super(request);
    }


}
