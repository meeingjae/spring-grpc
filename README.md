# 주문 배송 시스템 
**SpringBoot - gRPC framework 맛보기**
-- --
## 요구사항
* **사용자**가 **물건**을 **주문**하고, **배송** 받을 수 있다.
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
* ~~물건~~
* ~~사용자~~
* **주문**
  * 사용자는 주문을 요청한다
  * 사용자는 주문 결과를 확인할 수 있다
* **배송**
  * 사용자는 배송 결과를 확인할 수 있다.
-- --
## To do
- Test Code 생성
- 각 도메인을 모듈로 분리 (MSA 환경 구성)
- DB 연동하여 병원, 사용자 정보를 구현