---
title: "System::Web::Services::Protocols::SoapHeaderAttribute 클래스"
linktitle: "SoapHeaderAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::SoapHeaderAttribute 클래스. XML Web 서비스 메서드 또는 XML Web 서비스 클라이언트가 처리할 수 있는 SOAP 헤더를 지정합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 700
url: /ko/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


XML [Web](../../system.web/) 서비스 메서드 또는 XML [Web](../../system.web/) 서비스 클라이언트가 처리할 수 있는 SOAP 헤더를 지정합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Direction](./get_direction/)() | RTTI 정보. |
| [get_MemberName](./get_membername/)() | SOAP 헤더 내용을 수신하는 데 사용되는 XML SOAP 서비스의 멤버 변수 이름을 가져옵니다. |
| [get_Required](./get_required/)() | 수신자 XML [Web](../../system.web/) 서비스 또는 XML [Web](../../system.web/) 서비스 클라이언트가 SOAP 헤더를 이해하고 처리해야 하는지를 나타내는 값을 가져옵니다. |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | SOAP 헤더 방향을 설정합니다. |
| [set_MemberName](./set_membername/)(String) | SOAP 헤더 내용을 수신하는 데 사용되는 XML SOAP 서비스의 멤버 변수 이름을 설정합니다. |
| [set_Required](./set_required/)(bool) | 수신자 XML [Web](../../system.web/) 서비스 또는 XML [Web](../../system.web/) 서비스 클라이언트가 SOAP 헤더를 이해하고 처리해야 하는지를 나타내는 값을 설정합니다. |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
