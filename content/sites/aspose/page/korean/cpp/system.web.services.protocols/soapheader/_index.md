---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::SoapHeader class. SOAP 헤더의 내용을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, C++에서 함수 인수로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 600
url: /ko/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


SOAP 헤더의 내용을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class SoapHeader : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Actor](./get_actor/)() | SOAP 버전 1.1을 사용할 때 SOAP 헤더 수신자의 URI를 가져옵니다. |
| [get_DidUnderstand](./get_didunderstand/)() | SOAP 헤더가 올바르게 처리되었는지 여부를 나타내는 값을 가져옵니다. |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | SOAP 버전 1.1을 사용할 때 'mustUnderstand' 속성의 값을 가져옵니다. |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | SOAP 버전 1.2를 사용할 때 'mustUnderstand' 속성의 값을 가져옵니다. |
| [get_EncodedRelay](./get_encodedrelay/)() | 'relay' 속성 값의 문자열 표현을 가져옵니다. |
| [get_MustUnderstand](./get_mustunderstand/)() | SOAP 헤더를 반드시 이해해야 하는지 여부를 나타내는 값을 가져옵니다. |
| [get_Relay](./get_relay/)() | 'relay' 속성의 값을 가져옵니다. |
| [get_Role](./get_role/)() | SOAP 버전 1.2를 사용할 때 SOAP 헤더 수신자의 URI를 가져옵니다. |
| [set_Actor](./set_actor/)(String) | SOAP 버전 1.1을 사용할 때 SOAP 헤더 수신자의 URI를 설정합니다. |
| [set_DidUnderstand](./set_didunderstand/)(bool) | SOAP 헤더가 올바르게 처리되었는지 여부를 나타내는 값을 설정합니다. |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | SOAP 버전 1.1을 사용할 때 'mustUnderstand' 속성의 값을 설정합니다. |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | SOAP 버전 1.2를 사용할 때 'mustUnderstand' 속성의 값을 설정합니다. |
| [set_EncodedRelay](./set_encodedrelay/)(String) | 'relay' 속성 값의 문자열 표현을 설정합니다. |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | SOAP 헤더를 반드시 이해해야 하는지 여부를 나타내는 값을 설정합니다. |
| [set_Relay](./set_relay/)(bool) | 'relay' 속성의 값을 설정합니다. |
| [set_Role](./set_role/)(String) | SOAP 버전 1.2를 사용할 때 SOAP 헤더 수신자의 URI를 설정합니다. |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
