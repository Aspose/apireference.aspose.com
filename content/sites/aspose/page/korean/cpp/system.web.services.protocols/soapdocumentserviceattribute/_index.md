---
title: "System::Web::Services::Protocols::SoapDocumentServiceAttribute 클래스"
linktitle: "SoapDocumentServiceAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::SoapDocumentServiceAttribute 클래스. SOAP 요청 및 응답의 기본 형식을 설정합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 500
url: /ko/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


SOAP 요청 및 응답의 기본 형식을 설정합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인수로 전달할 때 이 포인터를 사용하십시오.

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | RTTI 정보. |
| [get_RoutingStyle](./get_routingstyle/)() | SOAP 메시지가 서비스로 라우팅되는 방식을 나타내는 값을 가져옵니다. |
| [get_Use](./get_use/)() | 매개변수 형식을 가져옵니다. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | 'Body' 요소 아래에 매개변수가 단일 XML 요소에 캡슐화되는지를 나타내는 값을 설정합니다. |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | SOAP 메시지가 서비스로 라우팅되는 방식을 나타내는 값을 설정합니다. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | 매개변수 형식을 설정합니다. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | 새 인스턴스를 생성합니다. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | 새 인스턴스를 생성합니다. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
