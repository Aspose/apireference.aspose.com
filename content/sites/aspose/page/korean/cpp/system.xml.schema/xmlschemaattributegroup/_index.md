---
title: "System::Xml::Schema::XmlSchemaAttributeGroup 클래스"
linktitle: "XmlSchemaAttributeGroup"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAttributeGroup 클래스. XML 스키마에서 attributeGroup 요소를 나타냅니다( World Wide Web Consortium (W3C) 지정). AttributesGroups는 속성 선언 집합을 그룹화하여 C++의 복합 형식 정의에 그룹으로 포함시킬 수 있는 메커니즘을 제공합니다."
type: docs
weight: 1200
url: /ko/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)이 지정한 **attributeGroup** 요소를 나타냅니다. AttributesGroups는 속성 선언 집합을 그룹화하여 복합 유형 정의에 그룹으로 포함시킬 수 있는 메커니즘을 제공합니다.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 속성 그룹의 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 구성 요소를 반환합니다. |
| [get_Attributes](./get_attributes/)() | 속성 그룹에 대한 속성 컬렉션을 반환합니다. 여기에는 [XmlSchemaAttribute](../xmlschemaattribute/) 및 [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 요소가 포함됩니다. |
| [get_Name](./get_name/)() | 속성 그룹의 이름을 반환합니다. |
| [get_QualifiedName](./get_qualifiedname/)() | 속성 그룹의 정규화된 이름을 반환합니다. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | XML [Schema](../)에서 재정의된 속성 그룹 속성을 반환합니다. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 속성 그룹의 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 구성 요소를 설정합니다. |
| [set_Name](./set_name/)(const String\&) | 속성 그룹의 이름을 설정합니다. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | [XmlSchemaAttributeGroup](./) 클래스의 새 인스턴스를 초기화합니다. |
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
