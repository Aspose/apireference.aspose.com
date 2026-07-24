---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute 클래스"
linktitle: "SoapDocumentMethodAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute 클래스. 모든 SOAP 메시지가 메서드에서 전달되거나 반환될 때 Document 형식을 사용함을 지정합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 400
url: /ko/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


모든 SOAP 메시지가 메서드에서 전달되거나 반환될 때 Document 형식을 사용함을 지정합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Action](./get_action/)() | RTTI 정보. |
| [get_Binding](./get_binding/)() | XML 웹 서비스 메서드가 구현하는 작업에 대한 바인딩을 가져옵니다. |
| [get_OneWay](./get_oneway/)() | 클라이언트가 서버가 메서드 처리를 완료할 때까지 기다리지 않는지 여부를 나타내는 값을 가져옵니다. |
| [get_ParameterStyle](./get_parameterstyle/)() | 매개변수가 'Body' 요소 아래의 단일 XML 요소에 캡슐화되는지 여부를 나타내는 값을 가져옵니다. |
| [get_RequestElementName](./get_requestelementname/)() | 서비스 설명에서 작업으로 정의된 SOAP 요청과 연결된 XML 요소의 이름을 가져옵니다. |
| [get_RequestNamespace](./get_requestnamespace/)() | SOAP 요청과 연결된 네임스페이스를 가져옵니다. |
| [get_ResponseElementName](./get_responseelementname/)() | SOAP 응답과 연결된 XML 요소의 이름을 가져옵니다. |
| [get_ResponseNamespace](./get_responsenamespace/)() | SOAP 응답과 연결된 네임스페이스를 가져옵니다. |
| [get_Use](./get_use/)() | 메시지 인코딩 방식을 결정하는 값을 가져옵니다. |
| [set_Action](./set_action/)(String) | 'SOAPAction' 속성의 값을 설정합니다. |
| [set_Binding](./set_binding/)(String) | XML 웹 서비스 메서드가 작업을 구현하는 바인딩을 설정합니다. |
| [set_OneWay](./set_oneway/)(bool) | 클라이언트가 서버가 메서드 처리를 완료할 때까지 기다리지 않는지를 나타내는 값을 설정합니다. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | 'Body' 요소 아래에 매개변수가 단일 XML 요소에 캡슐화되는지를 나타내는 값을 설정합니다. |
| [set_RequestElementName](./set_requestelementname/)(String) | 서비스 설명에서 작업으로 정의된 SOAP 요청과 연결된 XML 요소의 이름을 설정합니다. |
| [set_RequestNamespace](./set_requestnamespace/)(String) | SOAP 요청과 연결된 네임스페이스를 설정합니다. |
| [set_ResponseElementName](./set_responseelementname/)(String) | SOAP 응답과 연결된 XML 요소의 이름을 설정합니다. |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | SOAP 응답과 연결된 네임스페이스를 설정합니다. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | 메시지 인코딩 방식을 결정하는 값을 설정합니다. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | 새 인스턴스를 생성합니다. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
