---
title: "System::Xml::Schema::XmlSchemaObjectTable 클래스"
linktitle: "XmlSchemaObjectTable"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaObjectTable 클래스. C++에서 XmlSchema 클래스에 포함된 요소(예: Attributes, AttributeGroups, Elements 등)를 위한 컬렉션을 제공합니다."
type: docs
weight: 5300
url: /ko/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


[XmlSchema](../xmlschema/) 클래스에 포함된 요소(예: Attributes, AttributeGroups, Elements 등)를 위한 컬렉션을 제공합니다.

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | 지정된 정규화된 이름이 컬렉션에 존재하는지 확인합니다. |
| [get_Count](./get_count/)() | [XmlSchemaObjectTable](./)에 포함된 항목 수를 반환합니다. |
| [get_Names](./get_names/)() | [XmlSchemaObjectTable](./)에 있는 모든 명명된 요소의 컬렉션을 반환합니다. |
| [get_Values](./get_values/)() | [XmlSchemaObjectTable](./)에 있는 모든 요소의 모든 값의 컬렉션을 반환합니다. |
| [GetEnumerator](./getenumerator/)() override | [XmlSchemaObjectTable](./)을 순회할 수 있는 열거자를 반환합니다. |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | 정규화된 이름으로 지정된 [XmlSchemaObjectTable](./)의 요소를 반환합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
