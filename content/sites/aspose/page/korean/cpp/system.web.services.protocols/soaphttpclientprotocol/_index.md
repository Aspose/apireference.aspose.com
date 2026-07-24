---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol 클래스"
linktitle: "SoapHttpClientProtocol"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol 클래스. SOAP을 사용할 때 클라이언트 프록시 서비스는 이 클래스를 상속해야 합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 900
url: /ko/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


클라이언트 프록시 서비스는 SOAP을 사용할 때 이 클래스를 상속해야 합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Discover](./discover/)() | 현재 인스턴스를 XML [Web](../../system.web/) 서비스에 바인딩합니다. |
| [get_SoapVersion](./get_soapversion/)() | SOAP 버전을 가져옵니다. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | 내부 필드를 초기화합니다. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | SOAP 버전을 설정합니다. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
