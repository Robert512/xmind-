package javabasic.framework.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class RequestLogAspect {
    private static final Logger logger = LoggerFactory.getLogger(RequestLogAspect.class);

    @Pointcut("execution(public * javabasic.framework.web..*.*(..))")
    public void webLog(){

    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint){
        // 接受到请求，记录请求内容
        ServletRequestAttributes attibutes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attibutes.getRequest();

        logger.info("URL : " + request.getRequestURI().toString());
        logger.info("IP : " + request.getRemoteAddr());
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret){
        // 处理完请求，返回内容
        logger.info("RESPONESE : " + ret);
    }


}
