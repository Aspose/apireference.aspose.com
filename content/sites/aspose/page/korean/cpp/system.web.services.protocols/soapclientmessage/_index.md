---
title: "System::Web::Services::Protocols::SoapClientMessage 클래스"
linktitle: "SoapClientMessage"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::SoapClientMessage 클래스. 전송된 SOAP 요청 또는 수신된 SOAP 응답의 데이터를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 300
url: /ko/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


전송된 SOAP 요청 또는 수신된 SOAP 응답의 데이터를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인수로 전달할 때 이 포인터를 사용하십시오.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Action](./get_action/)() override | 'SOAPAction' 속성의 값을 반환합니다. |
| [get_Client](./get_client/)() | 클라이언트 프록시 클래스의 인스턴스를 반환합니다. |
| virtual [get_OneWay](./get_oneway/)() | 클라이언트가 서버가 메서드 처리를 마칠 때까지 기다리지 않는지를 나타내는 값을 반환합니다. |
| [get_SoapVersion](./get_soapversion/)() override | 사용되는 SOAP 버전을 반환합니다. |
| [get_Url](./get_url/)() override | XML [Web](../../system.web/) 서비스 URL을 반환합니다. |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
