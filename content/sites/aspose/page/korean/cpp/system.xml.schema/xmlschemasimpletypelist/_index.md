---
title: "System::Xml::Schema::XmlSchemaSimpleTypeList 클래스"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleTypeList 클래스. World Wide Web Consortium (W3C)에서 지정한 XML Schema의 list 요소를 나타냅니다. 이 클래스는 C++에서 지정된 데이터 유형의 값 목록으로 simpleType 요소를 정의하는 데 사용할 수 있습니다."
type: docs
weight: 6400
url: /ko/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 **list** 요소를 나타냅니다. 이 클래스는 지정된 데이터 유형의 값 목록으로 **simpleType** 요소를 정의하는 데 사용할 수 있습니다.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | [XmlSchemaSimpleType](../xmlschemasimpletype/)을 반환합니다. 이 반환값은 **simpleType** 요소의 유형을 나타내며, [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) 및 [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) 값에 기반합니다. |
| [get_ItemType](./get_itemtype/)() | 기본 값으로 지정된 유형에서 파생된 **simpleType** 요소를 반환합니다. |
| [get_ItemTypeName](./get_itemtypename/)() | 이 스키마(또는 지정된 네임스페이스에 의해 표시된 다른 스키마)에서 정의된 내장 데이터 유형 또는 **simpleType** 요소의 이름을 반환합니다. |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | [XmlSchemaSimpleType](../xmlschemasimpletype/)을 설정합니다. 이 값은 **simpleType** 요소의 유형을 나타내며, simple type의 [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) 및 [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) 값에 기반합니다. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | **simpleType** 요소를 설정합니다. 이 요소는 기본 값으로 지정된 유형에서 파생됩니다. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 이 스키마(또는 지정된 네임스페이스에 의해 표시된 다른 스키마)에서 정의된 내장 데이터 유형 또는 **simpleType** 요소의 이름을 설정합니다. |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | 새 인스턴스를 초기화합니다. [XmlSchemaSimpleTypeList](./) 클래스. |
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
