---
title: "System::Xml::Schema::XmlSchema 클래스"
linktitle: "XmlSchema"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchema 클래스. World Wide Web Consortium (W3C) 및 C++에서 지정한 XML 스키마의 메모리 내 표현입니다."
type: docs
weight: 400
url: /ko/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


XML [Schema](../)의 메모리 내 표현으로, World Wide [Web](../../system.web/) Consortium (W3C) [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) 및 [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/)에 지정되어 있습니다.

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | XML [Schema](../)[Object](../../system/object/) 모델(SOM)을 검증을 위한 스키마 정보로 컴파일합니다. 프로그래밍으로 구축된 SOM의 구문 및 의미 구조를 확인하는 데 사용됩니다. 의미 검증은 컴파일 중에 수행됩니다. |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | XML [Schema](../)[Object](../../system/object/) 모델(SOM)을 검증을 위한 스키마 정보로 컴파일합니다. 프로그래밍으로 구축된 SOM의 구문 및 의미 구조를 확인하는 데 사용됩니다. 의미 검증은 컴파일 중에 수행됩니다. |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | 스키마의 대상 네임스페이스에 선언된 속성의 형식을 반환합니다. |
| [get_AttributeGroups](./get_attributegroups/)() | 스키마에 있는 모든 전역 속성 그룹의 스키마 컴파일 후 값을 반환합니다. |
| [get_Attributes](./get_attributes/)() | 스키마에 있는 모든 속성의 스키마 컴파일 후 값을 반환합니다. |
| [get_BlockDefault](./get_blockdefault/)() | 스키마의 **targetNamespace**에 있는 요소 및 복합 유형에 대한 **block** 속성의 기본값을 설정하는 **blockDefault** 속성을 반환합니다. |
| [get_ElementFormDefault](./get_elementformdefault/)() | 스키마의 대상 네임스페이스에 선언된 요소의 형식을 반환합니다. |
| [get_Elements](./get_elements/)() | 스키마에 있는 모든 요소의 스키마 컴파일 후 값을 반환합니다. |
| [get_FinalDefault](./get_finaldefault/)() | 스키마의 대상 네임스페이스에 있는 요소 및 복합 유형에 대한 **final** 속성의 기본값을 설정하는 **finalDefault** 속성을 반환합니다. |
| [get_Groups](./get_groups/)() | 스키마의 모든 그룹에 대한 스키마 컴파일 후 값을 반환합니다. |
| [get_Id](./get_id/)() | 문자열 ID를 반환합니다. |
| [get_Includes](./get_includes/)() | 포함 및 가져온 스키마 컬렉션을 반환합니다. |
| [get_IsCompiled](./get_iscompiled/)() | 스키마가 컴파일되었는지 여부를 나타냅니다. |
| [get_Items](./get_items/)() | 스키마의 스키마 요소 컬렉션을 반환하며, **schema** 요소 수준에서 새로운 요소 유형을 추가하는 데 사용됩니다. |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | **schema** 요소가 참조하는 파일의 행 번호를 반환합니다. |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | **schema** 요소가 참조하는 파일의 열 위치를 반환합니다. |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | 이 스키마 객체와 함께 사용할 XmlSerializerNamespaces를 반환합니다. |
| [get_Notations](./get_notations/)() | 스키마의 모든 표기법에 대한 스키마 컴파일 후 값을 반환합니다. |
| [get_Parent](../xmlschemaobject/get_parent/)() | 이 [XmlSchemaObject](../xmlschemaobject/)의 부모를 반환합니다. |
| [get_SchemaTypes](./get_schematypes/)() | 스키마의 모든 스키마 유형에 대한 스키마 컴파일 후 값을 반환합니다. |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | 스키마를 로드한 파일의 소스 위치를 반환합니다. |
| [get_TargetNamespace](./get_targetnamespace/)() | 스키마 대상 네임스페이스의 Uniform Resource Identifier(URI)를 반환합니다. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | 스키마 대상 네임스페이스에 속하지 않는 한정된 속성을 반환합니다. |
| [get_Version](./get_version/)() | 스키마의 버전을 반환합니다. |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | 제공된 [IO::TextReader](../../system.io/textreader/)에서 XML [Schema](../)을 읽습니다. |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | 제공된 스트림에서 XML [Schema](../)을 읽습니다. |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | 제공된 [XmlReader](../../system.xml/xmlreader/)에서 XML [Schema](../)을 읽습니다. |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | 스키마의 대상 네임스페이스에 선언된 속성의 형식을 설정합니다. |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | **blockDefault** 속성을 설정하여 스키마의 **targetNamespace**에 있는 요소 및 복합 유형의 **block** 속성 기본값을 지정합니다. |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | 스키마의 대상 네임스페이스에 선언된 요소의 형식을 설정합니다. |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | **finalDefault** 속성을 설정하여 스키마의 대상 네임스페이스에 있는 요소 및 복합 유형의 **final** 속성 기본값을 지정합니다. |
| [set_Id](./set_id/)(const String\&) | 문자열 ID를 설정합니다. |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | **schema** 요소가 참조하는 파일의 행 번호를 설정합니다. |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | **schema** 요소가 참조하는 파일의 열 위치를 설정합니다. |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | 이 스키마 객체와 함께 사용할 XmlSerializerNamespaces를 설정합니다. |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | 이 [XmlSchemaObject](../xmlschemaobject/)의 부모를 설정합니다. |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | 스키마를 로드한 파일의 소스 위치를 설정합니다. |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | 스키마 대상 네임스페이스의 Uniform Resource Identifier (URI)를 설정합니다. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | 스키마 대상 네임스페이스에 속하지 않는 한정된 속성을 설정합니다. |
| [set_Version](./set_version/)(const String\&) | 스키마의 버전을 설정합니다. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | 제공된 데이터 스트림에 XML [Schema](../)을 씁니다. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | 지정된 [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)를 사용하여 제공된 스트림에 XML [Schema](../)을 씁니다. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | 제공된 [IO::TextWriter](../../system.io/textwriter/)에 XML [Schema](../)을 씁니다. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | 제공된 TextWriter에 XML [Schema](../)을 씁니다. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | 제공된 [XmlWriter](../../system.xml/xmlwriter/)에 XML [Schema](../)을 씁니다. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | 제공된 [XmlWriter](../../system.xml/xmlwriter/)에 XML [Schema](../)을 씁니다. |
| [XmlSchema](./xmlschema/)() | [XmlSchema](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | [XmlSchemaObject](../xmlschemaobject/) 클래스의 새 인스턴스를 초기화합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | XML 스키마 인스턴스 네임스페이스입니다. 이 필드는 상수입니다. |
| static [Namespace](./namespace/) | XML 스키마 네임스페이스입니다. 이 필드는 상수입니다. |
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
