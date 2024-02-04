package com.example.demo.action;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
/**
 * Аспект, используемый для отслеживания действий пользователя в слое сервиса.
 * Этот аспект перехватывает выполнение методов, помеченных аннотацией TrackUserAction,
 * и регистрирует соответствующие действия пользователя.
 */
@Aspect
@Component
public class UserActionAspect {

    @AfterReturning(pointcut = "@annotation(com.example.demo.action.TrackUserAction)", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        if (result == null) {
            System.out.println("Не удалось выполнить действие пользователя: " + joinPoint.getSignature().getName());
        }

        System.out.println("Зарегистрировано действие пользователя: " + joinPoint.getSignature().getName());
    }
}
