---
title: "System::Net::Sockets::TcpClient 클래스"
linktitle: "TcpClient"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::TcpClient 클래스. TCP 네트워크 서비스용 클라이언트를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 500
url: /ko/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


TCP 네트워크 서비스용 클라이언트를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class TcpClient : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 비동기 연결 작업을 시작합니다. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 비동기 연결 작업을 시작합니다. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 비동기 연결 작업을 시작합니다. |
| [Close](./close/)() | 연결을 닫고 현재 인스턴스를 해제합니다. |
| [Connect](./connect/)(String, int32_t) | 지정된 원격 호스트에 연결을 설정합니다. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | 지정된 원격 호스트에 연결을 설정합니다. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | 지정된 원격 호스트에 연결을 설정합니다. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | 지정된 원격 호스트에 연결을 설정합니다. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | 지정된 비동기 연결 작업이 완료될 때까지 기다립니다. |
| [get_Available](./get_available/)() | 수신되어 읽을 준비가 된 바이트 수를 반환합니다. |
| [get_Client](./get_client/)() | RTTI 정보. |
| [get_Connected](./get_connected/)() | 소켓이 원격 호스트에 연결되어 있는지 여부를 나타내는 값을 반환합니다. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | 현재 인스턴스가 포트를 하나의 클라이언트만 사용하도록 허용하는지 여부를 나타내는 값을 가져옵니다. |
| [get_LingerState](./get_lingerstate/)() | 소켓이 모든 보류 중인 데이터를 전송하려고 닫기를 지연시킬지 여부를 나타내는 값을 가져옵니다. |
| [get_NoDelay](./get_nodelay/)() | 현재 인스턴스가 Nagle 알고리즘을 사용 중인지 여부를 나타내는 값을 가져옵니다. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | 데이터 수신에 사용되는 버퍼 크기를 가져옵니다. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | 데이터 수신이 시간 초과될 때까지의 시간을 나타내는 값을 가져옵니다. |
| [get_SendBufferSize](./get_sendbuffersize/)() | 데이터 전송에 사용되는 버퍼 크기를 가져옵니다. |
| [get_SendTimeout](./get_sendtimeout/)() | 데이터 전송이 시간 초과될 때까지의 시간을 나타내는 값을 가져옵니다. |
| [GetStream](./getstream/)() | 데이터 송수신에 사용되는 스트림을 반환합니다. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | 소켓을 설정합니다. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | 현재 인스턴스가 포트를 하나의 클라이언트만 사용하도록 허용하는지 여부를 나타내는 값을 설정합니다. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | 소켓이 모든 보류 중인 데이터를 전송하려고 닫기를 지연시킬지 여부를 나타내는 값을 설정합니다. |
| [set_NoDelay](./set_nodelay/)(bool) | 현재 인스턴스가 Nagle 알고리즘을 사용 중인지 여부를 나타내는 값을 설정합니다. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | 데이터 수신에 사용되는 버퍼 크기를 설정합니다. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | 데이터 수신이 시간 초과될 때까지의 시간을 나타내는 값을 설정합니다. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | 데이터 전송에 사용되는 버퍼 크기를 설정합니다. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | 데이터 전송이 시간 초과될 때까지의 시간을 나타내는 값을 설정합니다. |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | 새 인스턴스를 생성합니다. |
| [TcpClient](./tcpclient/)() | 새 인스턴스를 생성합니다. |
| [TcpClient](./tcpclient/)(AddressFamily) | 새 인스턴스를 생성합니다. |
| [TcpClient](./tcpclient/)(String, int32_t) | 새 인스턴스를 생성합니다. |
| virtual [~TcpClient](./~tcpclient/)() | 현재 인스턴스를 소멸시킵니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
