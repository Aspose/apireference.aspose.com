---
title: "System::Xml::Schema::XmlSchemaRedefine 클래스"
linktitle: "XmlSchemaRedefine"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaRedefine 클래스. World Wide Web Consortium (W3C)에서 지정한 XML 스키마의 redefine 요소를 나타냅니다. 이 클래스는 외부 스키마 파일의 단순 및 복합 유형, 그룹 및 속성 그룹을 현재 스키마에서 재정의하도록 사용할 수 있습니다. 또한 이 클래스는 C++에서 스키마 요소에 대한 버전 관리를 제공하는 데 사용할 수 있습니다."
type: docs
weight: 5600
url: /ko/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


XML [Schema](../)에서 **redefine** 요소를 World Wide [Web](../../system.web/) Consortium (W3C)이 지정한 대로 나타냅니다. 이 클래스는 외부 스키마 파일의 단순 및 복합 유형, 그룹 및 속성 그룹을 현재 스키마에서 다시 정의하도록 사용할 수 있습니다. 또한 스키마 요소에 대한 버전 관리를 제공하는 데 사용할 수 있습니다.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | 스키마의 모든 속성에 대한 [XmlSchemaObjectTable](../xmlschemaobjecttable/)을 반환하며, 이는 **AttributeGroups** 값의 컴파일 후 해석을 보유합니다. |
| [get_Groups](./get_groups/)() | 스키마의 모든 그룹에 대한 [XmlSchemaObjectTable](../xmlschemaobjecttable/)을 반환하며, 이는 **Groups** 값의 컴파일 후 해석을 보유합니다. |
| [get_Items](./get_items/)() | 다음 클래스들의 컬렉션을 반환합니다: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), 및 [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | 스키마의 모든 단순 및 복합 유형에 대한 [XmlSchemaObjectTable](../xmlschemaobjecttable/)을 반환하며, 이는 **SchemaTypes** 값의 컴파일 후 해석을 보유합니다. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | [XmlSchemaRedefine](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
