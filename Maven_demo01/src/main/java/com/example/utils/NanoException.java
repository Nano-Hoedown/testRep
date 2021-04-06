package com.example.utils;

public class NanoException extends RuntimeException{
    private static final long serialVersionUID = 5162710183389028792L;

    public NanoException() {
        super();
    }

    /**˵���쳣�������Ϣ��ԭ��
     *
     * @param message ��Ϣ
     * @param cause ԭ��
     */
    public NanoException(String message,Throwable cause){
        super(message,cause);
    }
    public NanoException(String message){
        super(message);
    }
    public NanoException(Throwable cause){
        super(cause);
    }
}
