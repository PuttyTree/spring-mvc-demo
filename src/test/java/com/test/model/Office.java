package com.test.model;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/3/19.
 */

public class Office
{
    private String officeNo ="001";
    public String getOfficeNo(){
        return this.officeNo;
    }
    public void setOfficeNo(String officeNo){
        this.officeNo = officeNo;
    }

    @Override
    public String toString() {
        return "officeNo:" + officeNo;
    }

}
