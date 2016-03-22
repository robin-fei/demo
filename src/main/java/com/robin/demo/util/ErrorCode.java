package com.robin.demo.util;

/**
 * Created by Administrator on 2016/3/22.
 */
public enum ErrorCode {
    OK(0, "success"),
    ErrorCode_QUERY_FAIL(1, "查询失败");

    ErrorCode(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    private int errorCode;
    private String errorMsg;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {

        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
