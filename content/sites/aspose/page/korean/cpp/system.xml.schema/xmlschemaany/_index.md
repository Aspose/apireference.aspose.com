---
title: "System::Xml::Schema::XmlSchemaAny 클래스"
linktitle: "XmlSchemaAny"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAny 클래스. World Wide Web Consortium (W3C)의 any 요소를 C++에서 나타냅니다."
type: docs
weight: 800
url: /ko/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


World Wide [Web](../../system.web/) Consortium (W3C)의 **any** 요소를 나타냅니다.

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Namespace](./get_namespace/)() | 사용 가능한 요소를 포함하는 네임스페이스를 반환합니다. |
| [get_ProcessContents](./get_processcontents/)() | **any** 요소로 지정된 요소에 대한 XML 문서 검증을 애플리케이션이나 XML 프로세서가 어떻게 처리해야 하는지에 대한 정보를 반환합니다. |
| [set_Namespace](./set_namespace/)(const String\&) | 사용 가능한 요소를 포함하는 네임스페이스를 설정합니다. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | **any** 요소로 지정된 요소에 대한 XML 문서 검증을 애플리케이션이나 XML 프로세서가 어떻게 처리해야 하는지에 대한 정보를 설정합니다. |
| [XmlSchemaAny](./xmlschemaany/)() | [XmlSchemaAny](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
