---
title: "System::Xml::Schema::XmlSchemaAttribute class"
linktitle: "XmlSchemaAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAttribute 클래스. World Wide Web Consortium (W3C)에서 지정한 XML 스키마의 attribute 요소를 나타냅니다. 속성은 다른 문서 요소에 대한 추가 정보를 제공합니다. attribute 태그는 스키마를 위한 문서 요소의 태그 사이에 중첩됩니다. XML 문서는 C++에서 요소의 시작 태그에 이름이 지정된 항목으로 속성을 표시합니다."
type: docs
weight: 1100
url: /ko/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 **attribute** 요소를 나타냅니다. 속성은 다른 문서 요소에 대한 추가 정보를 제공합니다. attribute 태그는 스키마를 위한 문서 요소의 태그 사이에 중첩됩니다. XML 문서는 요소의 시작 태그에 이름이 지정된 항목으로 속성을 표시합니다.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | 속성의 [XmlSchemaAttribute::get_SchemaType](./get_schematype/) 또는 [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) 값을 기반으로 속성 유형을 나타내는 [XmlSchemaSimpleType](../xmlschemasimpletype/) 객체를 반환합니다. |
| [get_AttributeType](./get_attributetype/)() | [XmlSchemaAttribute::get_SchemaType](./get_schematype/) 또는 [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) 값을 기반으로, **AttributeType** 값의 컴파일 후 해석을 보유하는 객체를 반환합니다. |
| [get_DefaultValue](./get_defaultvalue/)() | 속성의 기본값을 반환합니다. |
| [get_FixedValue](./get_fixedvalue/)() | 속성의 고정값을 반환합니다. |
| [get_Form](./get_form/)() | 속성의 형태(form)를 반환합니다. |
| [get_Name](./get_name/)() | 속성의 이름을 반환합니다. |
| [get_QualifiedName](./get_qualifiedname/)() | 속성의 정규화된 이름을 반환합니다. |
| [get_RefName](./get_refname/)() | 이 스키마(또는 지정된 네임스페이스가 가리키는 다른 스키마)에서 선언된 속성의 이름을 반환합니다. |
| [get_SchemaType](./get_schematype/)() | 속성 유형을 단순 유형으로 반환합니다. |
| [get_SchemaTypeName](./get_schematypename/)() | 이 스키마에 정의된 단순 유형(또는 지정된 네임스페이스가 가리키는 다른 스키마)의 이름을 반환합니다. |
| [get_Use](./get_use/)() | 속성이 사용되는 방식에 대한 정보를 반환합니다. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | 속성의 기본값을 설정합니다. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | 속성의 고정 값을 설정합니다. |
| [set_Form](./set_form/)(XmlSchemaForm) | 속성의 형식을 설정합니다. |
| [set_Name](./set_name/)(const String\&) | 속성의 이름을 설정합니다. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | 이 스키마에 선언된 속성(또는 지정된 네임스페이스가 가리키는 다른 스키마)의 이름을 설정합니다. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 속성 유형을 단순 유형으로 설정합니다. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 이 스키마에 정의된 단순 유형(또는 지정된 네임스페이스가 가리키는 다른 스키마)의 이름을 설정합니다. |
| [set_Use](./set_use/)(XmlSchemaUse) | 속성이 사용되는 방식에 대한 정보를 설정합니다. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | 새로운 [XmlSchemaAttribute](./) 클래스 인스턴스를 초기화합니다. |
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
