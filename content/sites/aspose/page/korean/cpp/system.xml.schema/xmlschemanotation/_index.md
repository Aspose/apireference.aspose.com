---
title: "System::Xml::Schema::XmlSchemaNotation 클래스"
linktitle: "XmlSchemaNotation"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaNotation 클래스. XML 스키마에서 notation 요소를 World Wide Web Consortium (W3C)에서 지정한 대로 나타냅니다. XML 스키마 notation 선언은 XML 1.0 NOTATION 선언을 재구성한 것입니다. notation의 목적은 XML 문서 내에서 비 XML 데이터의 형식을 C++로 설명하는 것입니다."
type: docs
weight: 4800
url: /ko/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


XML [Schema](../)에서 **notation** 요소를 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 대로 나타냅니다. XML [Schema](../)**notation** 선언은 **XML** 1.0 NOTATION 선언을 재구성한 것입니다. notation의 목적은 XML 문서 내에서 비 XML 데이터의 형식을 설명하는 것입니다.

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Name](./get_name/)() | notation의 이름을 반환합니다. |
| [get_Public](./get_public/)() | **public** 식별자를 반환합니다. |
| [get_System](./get_system/)() | **system** 식별자를 반환합니다. |
| [set_Name](./set_name/)(const String\&) | notation의 이름을 설정합니다. |
| [set_Public](./set_public/)(const String\&) | **public** 식별자를 설정합니다. |
| [set_System](./set_system/)(const String\&) | **system** 식별자를 설정합니다. |
| [XmlSchemaNotation](./xmlschemanotation/)() | 새로운 [XmlSchemaNotation](./) 클래스 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
