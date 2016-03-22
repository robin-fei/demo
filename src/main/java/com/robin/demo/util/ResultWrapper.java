package com.robin.demo.util;

import java.security.PrivateKey;

/**
 * Created by Administrator on 2016/3/22.
 */
public class ResultWrapper<T> {
    private T result;
    private ErrorCode errorCode;

    public ResultWrapper(ErrorCode errorCode){
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ResultWrapper(ErrorCode errorCode, T val){
        this.errorCode = errorCode;
        result = val;

    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
