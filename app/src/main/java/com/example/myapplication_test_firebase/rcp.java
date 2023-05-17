package com.example.myapplication_test_firebase;

public class rcp {

    // 변수 선언
    private String rcp_parts_dtls;
    private String rcp_nm;
    private String rcp_tools;
    private String rcp_parts;

    public rcp(){}

    public String getRcp_parts_dtls(){
        return rcp_parts_dtls;
    }

    public void setRcp_parts_dtls(String rcp_parts_dtls){
        this.rcp_parts_dtls = rcp_parts_dtls;
    }

    public String getRcp_nm(){
        return rcp_nm;
    }

    public void setRcp_nm(String rcp_nm){
        this.rcp_nm = rcp_nm;
    }

    public String getRcp_tools(){
        return rcp_tools;
    }

    public void setRcp_tools(String rcp_tools){
        this.rcp_tools = rcp_tools;
    }

    public String getRcp_parts(){
        return rcp_parts;
    }

    public void setRcp_parts(String rcp_parts){
        this.rcp_parts = rcp_parts;
    }


    // 그룹을 생성할 때 사용하는 부분
    public rcp(String rcp_parts_dtls, String rcp_nm, String rcp_tools, String rcp_parts){
        this.rcp_parts_dtls = rcp_parts_dtls;
        this.rcp_nm = rcp_nm;
        this.rcp_tools = rcp_tools;
        this.rcp_parts = rcp_parts;
    }
}
