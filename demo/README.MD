# Demo Application

## Описание
Данное приложение представляет собой простой пример CRUD-приложения на основе Spring Boot. Оно позволяет создавать, просматривать, обновлять и удалять пользователей.

## Установка и сборка
1. Клонируйте репозиторий с приложением.
2. Откройте проект в вашей любимой интегрированной среде разработки (IDE).
3. Установите все зависимости, указанные в файле `pom.xml`.
4. Запустите приложение, выполнив метод `main` в классе `DemoApplication`.

## Использование
1. Запустите приложение.
2. Откройте браузер и перейдите по адресу `http://localhost:8080/users` для просмотра списка пользователей.
3. Cоздание нового пользователя `http://localhost:8080/user-create` .
4. Обновления информации о пользователе `http://localhost:8080/user-update/{id}` .
5. Удаления пользователя `http://localhost:8080/user-delete/{id}` .

## Технологии
- Java
- Spring Boot
- Spring MVC
- Thymeleaf
- Lombok

## Полезные ссылки
- [Документация Spring Boot](https://spring.io/projects/spring-boot)
- [Документация Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- [Документация Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
- [Документация Lombok](https://projectlombok.org/)
