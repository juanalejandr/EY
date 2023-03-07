package com.EY_.EY_PRUEBASo1.Exception;

public class ServiceException extends  Exception{
    private static final long serislVersionUID= -1777306343576377317L;

    public ServiceException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }

    public ServiceException(String mensaje) {

    }
}
