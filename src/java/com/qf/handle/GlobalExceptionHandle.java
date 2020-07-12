package com.qf.handle;

import com.qf.Exception.DaoException;
import com.qf.Exception.ServiceException;
import com.qf.utils.ResponseEntity;
import com.qf.utils.StatusEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(Exception.class)
    public ResponseEntity handlerException(Exception e){
        return ResponseEntity.error(StatusEnum.ERROR_STATUS);
    }

    @ExceptionHandler(DaoException.class)
    public ResponseEntity handlerDaoException(DaoException e){
        return ResponseEntity.error(e.getStatus(),e.getMsg());
    }

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity handlerServiceException(ServiceException e){
        return ResponseEntity.error(e.getStatus(),e.getMsg());
    }
}
