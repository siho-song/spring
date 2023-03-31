package com.example.client.dto;

public class Req<T> {
    private Header header;
    private T resBody;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public T getResBody() {
        return resBody;
    }

    public void setResBody(T resBody) {
        this.resBody = resBody;
    }

    public static class Header{

        private String responseCode;
        public String getResponseCode() {
            return responseCode;
        }

        public void setResponseCode(String responseCode) {
            this.responseCode = responseCode;
        }

        @Override
        public String toString() {
            return "Header{" +
                    "responseCode='" + responseCode + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "req{" +
                "header=" + header +
                ", body=" + resBody +
                '}';
    }
}
