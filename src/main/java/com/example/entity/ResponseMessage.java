package com.example.entity;


import java.io.Serializable;


public class ResponseMessage implements Serializable {
    private int code;
    private String message;
    private Object obj;

    public ResponseMessage() {
        super();
    }

    public ResponseMessage(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public ResponseMessage(int code, String message, Object obj) {
        super();
        this.code = code;
        this.message = message;
        this.obj = obj;
    }


    public ResponseMessage success() {
        this.code = 1;
        return this;
    }

    public ResponseMessage success(String message) {
        this.code = 1;
        this.message = message;
        return this;
    }

    public ResponseMessage success(int code,String message) {
        this.code = code;
        this.message = message;
        return this;
    }

    public ResponseMessage success(String message, Object obj) {
        this.code = 1;
        this.message = message;
        this.obj = obj;
        return this;
    }

    public ResponseMessage success(int code,String message, Object obj) {
        this.code = code;
        this.message = message;
        this.obj = obj;
        return this;
    }


    public ResponseMessage failed() {
        this.code = 0;
        return this;
    }

    public ResponseMessage failed(String message) {
        this.code = 0;
        this.message = message;
        return this;
    }

    public ResponseMessage failed(int code, String message) {
        this.code = code;
        this.message = message;
        return this;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }


    public ResponseMessage setObj(Object obj) {
        this.obj = obj;
        return this;
    }

    public static class SimpleResponseMessage implements Serializable {
        private Integer code;
        private String message;

        public SimpleResponseMessage() {
            super();
        }

        public SimpleResponseMessage(Integer code, String message) {
            super();
            this.code = code;
            this.message = message;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}
