---
title: "System::Web::Services::WebServiceBindingAttribute 클래스"
linktitle: "WebServiceBindingAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::WebServiceBindingAttribute 클래스. XML 웹 서비스의 하나 이상의 메서드를 정의하는 바인딩을 선언하는 데 사용됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 400
url: /ko/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


XML [Web](../../system.web/) 서비스의 하나 이상의 메서드를 정의하는 바인딩을 선언하는 데 사용됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | WSI 사양을 가져옵니다. |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | 바인딩이 적합성 주장을 내보내는지 여부를 나타내는 값을 가져옵니다. |
| [get_Location](./get_location/)() | RTTI 정보. |
| [get_Name](./get_name/)() | 바인딩의 이름을 가져옵니다. |
| [get_Namespace](./get_namespace/)() | 바인딩과 연결된 네임스페이스를 가져옵니다. |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | WSI 사양을 설정합니다. |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | 바인딩이 적합성 주장을 내보내는지 여부를 나타내는 값을 설정합니다. |
| [set_Location](./set_location/)(String) | 바인딩이 정의된 위치를 설정합니다. |
| [set_Name](./set_name/)(String) | 바인딩의 이름을 설정합니다. |
| [set_Namespace](./set_namespace/)(String) | 바인딩과 연결된 네임스페이스를 설정합니다. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | 새 인스턴스를 생성합니다. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | 새 인스턴스를 생성합니다. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | 새 인스턴스를 생성합니다. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Page for C++](../../)
