# Spring Boot Demo Application

## Описание проекта

Данный проект представляет собой простое Spring Boot приложение, созданное для демонстрации базового функционала разработки на Java с использованием Spring Framework. Приложение включает следующие слои:
- **Контроллеры** для обработки HTTP-запросов.
- **Модель** для описания данных.
- **Репозиторий** для взаимодействия с базой данных.
- **Конфигурация безопасности** для настройки авторизации и аутентификации.

## Структура проекта

```plaintext
.mvn/                  # Maven wrapper файлы
src/
  main/
    java/com/example/demo/
      controller/      # Контроллеры приложения
      model/           # Модели данных
      repository/      # Репозиторий для доступа к данным
      SecurityConfig.java  # Конфигурация безопасности
      DemoApplication.java # Главный класс приложения
    resources/
      static/          # Статические ресурсы (CSS, JS и др.)
      templates/       # Шаблоны (например, для Thymeleaf)
      application.properties # Настройки приложения
  test/
    java/com/example/demo/  # Юнит-тесты
pom.xml                # Maven-конфигурация
README.md              # Описание проекта
```

## Основные файлы и их назначение

- **DemoApplication.java**: Главный класс для запуска приложения.
- **controller/**: Содержит REST или веб-контроллеры для обработки запросов.
- **model/**: Определяет структуры данных.
- **repository/**: Обеспечивает взаимодействие с базой данных.
- **SecurityConfig.java**: Конфигурирует безопасность приложения, например, доступ к эндпоинтам.
- **application.properties**: Содержит настройки приложения, такие как порт сервера, параметры подключения к БД и др.

## Пример конфигурации `application.properties`
```properties
# Настройки сервера
server.port=8080

# Настройки безопасности
spring.security.user.name=admin
spring.security.user.password=admin123

# Настройки базы данных (пример для H2)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## Зависимости

Основные зависимости, используемые в проекте (указаны в `pom.xml`):
- **Spring Boot Starter Web**: Для разработки веб-приложений.
- **Spring Boot Starter Security**: Для добавления авторизации и аутентификации.
- **Spring Boot Starter Data JPA**: Для работы с базой данных.
- **H2 Database**: Встроенная база данных для тестирования.

## Тестирование

Для запуска тестов выполните:
```bash
./mvnw test
```
Или запустите тесты из IDE.

Автор: Мельник Эмилия, ИВТ 4 курс 2 группа.
