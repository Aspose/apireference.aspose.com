---
title: "System::Net::Sockets::TcpListener 클래스"
linktitle: "TcpListener"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::TcpListener 클래스. TCP 네트워크 서비스에 대한 리스너를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오."
type: docs
weight: 600
url: /ko/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


TCP 네트워크 서비스에 대한 리스너를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class TcpListener : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | 대기 중인 연결 요청을 수락하고 데이터를 송수신하는 데 사용되는 소켓을 반환합니다. |
| [AcceptTcpClient](./accepttcpclient/)() | 대기 중인 연결 요청을 수락하고 데이터를 송수신하는 데 사용되는 TcpClient 클래스 인스턴스를 반환합니다. |
| [AllowNatTraversal](./allownattraversal/)(bool) | NAT 트래버설을 활성화하거나 비활성화합니다. |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | 비동기 수락 작업을 시작합니다. |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | 비동기 수락 작업을 시작합니다. |
| static [Create](./create/)(int32_t) | 지정된 포트 번호를 사용하여 새 인스턴스를 생성합니다. |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | 지정된 비동기 수락 작업이 완료될 때까지 대기합니다. |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | 지정된 비동기 수락 작업이 완료될 때까지 대기합니다. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | 현재 인스턴스가 포트를 하나의 클라이언트만 사용하도록 허용하는지 여부를 나타내는 값을 가져옵니다. |
| [get_LocalEndpoint](./get_localendpoint/)() | 기본 엔드포인트를 반환합니다. |
| [get_Server](./get_server/)() | RTTI 정보. |
| [Pending](./pending/)() | 대기 중인 연결 요청이 있는지 여부를 나타내는 값을 반환합니다. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | 현재 인스턴스가 포트를 하나의 클라이언트만 사용하도록 허용하는지 여부를 나타내는 값을 설정합니다. |
| [Start](./start/)() | 들어오는 연결을 수신하기 시작합니다. |
| [Start](./start/)(int32_t) | 들어오는 연결을 수신하기 시작합니다. |
| [Stop](./stop/)() | 들어오는 연결에 대한 수신을 중지합니다. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | 새 인스턴스를 생성합니다. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | 새 인스턴스를 생성합니다. |
| [TcpListener](./tcplistener/)(int32_t) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
