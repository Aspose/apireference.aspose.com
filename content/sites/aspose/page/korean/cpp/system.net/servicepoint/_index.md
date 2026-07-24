---
title: "System::Net::ServicePoint 클래스"
linktitle: "ServicePoint"
second_title: "C++용 Aspose.Page"
description: "System::Net::ServicePoint 클래스. HTTP 연결 관리를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 3100
url: /ko/cpp/system.net/servicepoint/
---
## ServicePoint class


HTTP 연결 관리를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class ServicePoint : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | 지정된 연결 그룹에 속하는 연결을 닫고 제거합니다. |
| [get_Address](./get_address/)() | 현재 인스턴스가 연결되는 서버 URI를 반환합니다. |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | RTTI 정보. |
| [get_Certificate](./get_certificate/)() | 현재 인스턴스에서 사용되는 인증서를 반환합니다. |
| [get_ClientCertificate](./get_clientcertificate/)() | 마지막 클라이언트 인증서를 반환합니다. |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | 활성 [ServicePoint](./)가 닫히는 밀리초 단위의 시간 제한을 가져옵니다. |
| [get_ConnectionLimit](./get_connectionlimit/)() | 현재 인스턴스에서 허용되는 최대 연결 수를 가져옵니다. |
| [get_ConnectionName](./get_connectionname/)() | 연결 이름을 반환합니다. |
| [get_CurrentConnections](./get_currentconnections/)() | 열린 연결 수를 반환합니다. |
| [get_Expect100Continue](./get_expect100continue/)() | 100-Continue 동작이 사용되는지 여부를 나타내는 값을 가져옵니다. |
| [get_IdleSince](./get_idlesince/)() | 호스트에 대한 최신 연결의 날짜와 시간을 반환합니다. |
| [get_MaxIdleTime](./get_maxidletime/)() | 유휴 연결이 닫히는 시간(밀리초)을 가져옵니다. |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | HTTP 버전을 반환합니다. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | 수신 버퍼의 크기를 가져옵니다. |
| [get_SupportsPipelining](./get_supportspipelining/)() | 현재 인스턴스가 파이프라인 연결을 지원하는지 여부를 나타내는 값을 반환합니다. |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | 현재 인스턴스가 관리하는 연결에서 Nagle 알고리즘이 사용되는지 여부를 나타내는 값을 가져옵니다. |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | 현재 인스턴스와 로컬 [IPEndPoint](../ipendpoint/)을 연결하는 데 사용되는 대리자를 설정합니다. |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | 활성 [ServicePoint](./)이 닫히는 시간(밀리초)을 설정합니다. |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | 현재 인스턴스에서 허용되는 최대 연결 수를 설정합니다. |
| [set_Expect100Continue](./set_expect100continue/)(bool) | 100-Continue 동작이 사용되는지 여부를 나타내는 값을 설정합니다. |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | 유휴 연결이 닫히는 시간(밀리초)을 설정합니다. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | 수신 버퍼의 크기를 설정합니다. |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | 현재 인스턴스가 관리하는 연결에서 Nagle 알고리즘이 사용되는지 여부를 나타내는 값을 설정합니다. |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | 'Keep-Alive' 옵션이 활성화되어 있는지 여부를 나타내는 값을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
