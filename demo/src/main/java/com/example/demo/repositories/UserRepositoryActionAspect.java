package com.example.demo.repositories;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserRepositoryActionAspect {

    @AfterReturning("execution(* com.example.demo.repositories.UserRepository.*(..))")
    public void afterRepositoryAction(JoinPoint joinPoint) {
        System.out.println("Зарегистрировано действие в хранилище: " + joinPoint.getSignature().getName());
    }
}

