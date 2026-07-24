---
title: "System::Xml::Schema::XmlSchemaExternal 클래스"
linktitle: "XmlSchemaExternal"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaExternal 클래스. C++에서 포함된 스키마에 대한 정보를 제공합니다."
type: docs
weight: 2800
url: /ko/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


포함된 스키마에 대한 정보를 제공합니다.

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Id](./get_id/)() | 문자열 ID를 반환합니다. |
| [get_Schema](./get_schema/)() | 참조된 스키마에 대한 [XmlSchema](../xmlschema/)를 반환합니다. |
| [get_SchemaLocation](./get_schemalocation/)() | 스키마에 대한 Uniform Resource Identifier (URI) 위치를 반환합니다. 이 위치는 스키마 프로세서에 스키마가 물리적으로 존재하는 위치를 알려줍니다. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | 스키마 대상 네임스페이스에 속하지 않는 한정된 속성을 반환합니다. |
| [set_Id](./set_id/)(const String\&) | 문자열 ID를 설정합니다. |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | 참조된 스키마에 대한 [XmlSchema](../xmlschema/)을 설정합니다. |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | 스키마에 대한 Uniform Resource Identifier (URI) 위치를 설정합니다. 이는 스키마 프로세서에 스키마가 물리적으로 어디에 있는지 알려줍니다. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | 스키마 대상 네임스페이스에 속하지 않는 한정된 속성을 설정합니다. |
| [XmlSchemaExternal](./xmlschemaexternal/)() | [XmlSchemaExternal](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
