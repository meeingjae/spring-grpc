# 병원 예약 방문 시스템 
**SpringBoot - gRPC framework 맛보기**
-- --
## 요구사항
* **사용자**가 **병원**을 **예약**하고, **방문**할 수 있다
* **단일 시나리오** 기반으로 동작한다
    * 단일 사용자 + 단일 병원
-- --
## Modules
### proto-interface
 - gRPC 통신의 proto 정의 
 - ```subscription``` 정의
### grpc-server
 - ```client``` 에게 **resource 제공**
### grpc-client
 - resource 요청
 - ```server``` 로부터 **응답** 받은 **resource 제공**
-- --
## Domain
* ~~병원~~
* ~~사용자~~
* **에약**
* **방문**
-- --
## To do
- Test Code 생성
- 각 도메인을 모듈로 분리 (MSA 환경 구성)
- DB 연동하여 병원, 사용자 정보를 구현