---
title: "System::Net::Sockets::UdpClient 클래스"
linktitle: "UdpClient"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::UdpClient 클래스. 사용자 데이터그램 프로토콜(UDP) 네트워크 서비스를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 700
url: /ko/cpp/system.net.sockets/udpclient/
---
## UdpClient class


사용자 데이터그램 프로토콜(UDP) 네트워크 서비스를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class UdpClient : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() | UDP 연결을 닫습니다. |
| [Connect](./connect/)(String, int32_t) | 지정된 호스트의 지정된 포트에 연결을 설정합니다. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | 지정된 포트의 지정된 주소에 있는 호스트와 연결을 설정합니다. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | 원격 엔드포인트에 연결을 설정합니다. |
| [Dispose](./dispose/)() override | 관리 및 비관리 리소스를 [UdpClient](./)이(가) 사용한 것을 해제합니다. |
| [get_Client](./get_client/)() | RTTI 정보. |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | 서버가 보낸 데이터그램을 반환합니다. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | 원격 엔드포인트의 호스트에 UDP 데이터그램을 보냅니다. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | 지정된 원격 호스트의 지정된 포트에 UDP 데이터그램을 보냅니다. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | 원격 호스트에 UDP 데이터그램을 보냅니다. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | 기본 네트워크 소켓을 제공하는 데 사용됩니다. |
| [UdpClient](./udpclient/)() | 새로운 [UdpClient](./) 클래스 인스턴스를 초기화합니다. |
| [UdpClient](./udpclient/)(AddressFamily) | 새로운 [UdpClient](./) 클래스 인스턴스를 초기화합니다. |
| [UdpClient](./udpclient/)(int32_t) | 새로운 [UdpClient](./) 클래스 인스턴스를 초기화합니다. |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | 새로운 [UdpClient](./) 클래스 인스턴스를 초기화합니다. |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | 새로운 [UdpClient](./) 클래스 인스턴스를 초기화합니다. param local EP 로컬 엔드포인트는 UDP 연결을 바인드할 대상입니다. |
| [UdpClient](./udpclient/)(String, int32_t) | 새로운 [UdpClient](./) 클래스 인스턴스를 생성하고 지정된 포트의 지정된 원격 호스트에 연결합니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
