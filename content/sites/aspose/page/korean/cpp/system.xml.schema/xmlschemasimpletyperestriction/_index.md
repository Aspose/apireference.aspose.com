---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction 클래스"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction 클래스. World Wide Web Consortium (W3C)에서 지정한 XML Schema의 simple type에 대한 restriction 요소를 나타냅니다. 이 클래스는 C++에서 simpleType 요소를 제한하는 데 사용할 수 있습니다."
type: docs
weight: 6500
url: /ko/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 simple type에 대한 **restriction** 요소를 나타냅니다. 이 클래스는 **simpleType** 요소를 제한하는 데 사용할 수 있습니다.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_BaseType](./get_basetype/)() | 기본 타입에 대한 정보를 반환합니다. |
| [get_BaseTypeName](./get_basetypename/)() | 자격이 부여된 기본 타입의 이름을 반환합니다. |
| [get_Facets](./get_facets/)() | 반환합니다 [Xml](../../system.xml/)[Schema](../) 페싯을. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 기본 타입에 대한 정보를 설정합니다. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 자격이 부여된 기본 타입의 이름을 설정합니다. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | [XmlSchemaSimpleTypeRestriction](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
