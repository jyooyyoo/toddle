# toddle
AWS 4조 프로젝트 

### 1. 프로젝트 개요

Toddle은 유동인구, 안전 시설, 가로등, 유흥가 정보를 참조한 강화학습 모델을 이용해 사용자가 설정한 도착지와 출발지에 대해 안전 점수가 높은 경로를 반환하는 애플리케이션입니다.

---

### 2. 주요 기술 스택

* **언어:** Java, Python
* **프레임워크:** Spring Boot
* **빌드 도구:** Gradle
* **테스트:** JUnit (Spring Boot Test)
* **환경 설정:** `application.properties`

---

### 3. 디렉토리 구조

```
toddle-main/
 ├─ .gitattributes
 ├─ .gitignore
 ├─ build.gradle
 ├─ gradlew / gradlew.bat
 ├─ settings.gradle
 ├─ gradle/wrapper/
 │   ├─ gradle-wrapper.jar
 │   └─ gradle-wrapper.properties
 ├─ src/
 │   ├─ main/
 │   │   ├─ java/com/four/toddle/ToddleApplication.java
 │   │   └─ resources/application.properties
 │   └─ test/
 │       └─ java/com/four/toddle/ToddleApplicationTests.java
 └─ README.md
```

