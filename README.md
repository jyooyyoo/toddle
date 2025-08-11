# toddle
AWS 4조 프로젝트 


# 1. 빌드 (Gradle or Maven)
./gradlew build 

# 2. SAM 빌드 (JAR 패키징 + .aws-sam 폴더 생성)
sam build

# 3. 로컬 API 서버 실행
sam local start-api