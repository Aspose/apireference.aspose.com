---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension 클래스"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension 클래스. XML 스키마에서 단순 콘텐츠에 대한 확장 요소를 World Wide Web Consortium (W3C)에서 지정한 대로 나타냅니다. 이 클래스는 확장을 통해 단순 유형을 파생하는 데 사용할 수 있습니다. 이러한 파생은 C++에서 속성을 추가하여 요소의 단순 유형 콘텐츠를 확장하는 데 사용됩니다."
type: docs
weight: 6000
url: /ko/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


XML [Schema](../)에서 단순 콘텐츠에 대한 **extension** 요소를 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 대로 나타냅니다. 이 클래스는 확장을 통해 단순 유형을 파생하는 데 사용할 수 있습니다. 이러한 파생은 속성을 추가하여 요소의 단순 유형 콘텐츠를 확장하는 데 사용됩니다.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 속성 값에 사용할 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)을 반환합니다. |
| [get_Attributes](./get_attributes/)() | [XmlSchemaAttribute](../xmlschemaattribute/) 및 [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 컬렉션을 반환합니다. |
| [get_BaseTypeName](./get_basetypename/)() | 이 유형이 확장된 내장 데이터 유형 또는 단순 유형의 이름을 반환합니다. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 속성 값에 사용할 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)을 설정합니다. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 이 유형이 확장된 내장 데이터 유형 또는 단순 유형의 이름을 설정합니다. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | [XmlSchemaSimpleContentExtension](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
