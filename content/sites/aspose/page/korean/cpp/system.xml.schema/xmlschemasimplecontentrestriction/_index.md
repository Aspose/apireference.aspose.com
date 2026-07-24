---
title: "System::Xml::Schema::XmlSchemaSimpleContentRestriction 클래스"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleContentRestriction 클래스. World Wide Web Consortium (W3C)이 지정한 XML Schema의 단순 콘텐츠에 대한 제한 요소를 나타냅니다. 이 클래스는 제한을 통해 단순 유형을 파생시키는 데 사용할 수 있습니다. 이러한 파생은 상속된 단순 유형에 지정된 값 범위의 하위 집합으로 요소의 값 범위를 제한하는 데 사용할 수 있습니다. C++에서."
type: docs
weight: 6100
url: /ko/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


World Wide [Web](../../system.web/) Consortium (W3C)이 지정한 XML [Schema](../)의 단순 콘텐츠에 대한 **restriction** 요소를 나타냅니다. 이 클래스는 제한을 통해 단순 유형을 파생시키는 데 사용할 수 있습니다. 이러한 파생은 상속된 단순 유형에 지정된 값 범위의 하위 집합으로 요소의 값 범위를 제한하는 데 사용할 수 있습니다.

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 속성 값에 사용할 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)을 반환합니다. |
| [get_Attributes](./get_attributes/)() | 단순 유형에 대한 [XmlSchemaAttribute](../xmlschemaattribute/) 및 [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 속성 컬렉션을 반환합니다. |
| [get_BaseType](./get_basetype/)() | 단순 형식 기본 값을 반환합니다. |
| [get_BaseTypeName](./get_basetypename/)() | 이 형식이 파생된 내장 데이터 형식 또는 단순 형식의 이름을 반환합니다. |
| [get_Facets](./get_facets/)() | 반환합니다 [Xml](../../system.xml/)[Schema](../) 페싯을. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 속성 값에 사용할 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)을 설정합니다. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 단순 형식 기본 값을 설정합니다. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 이 형식이 파생된 내장 데이터 형식 또는 단순 형식의 이름을 설정합니다. |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | [XmlSchemaSimpleContentRestriction](./) 클래스의 새 인스턴스를 초기화합니다. |
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
