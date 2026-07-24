---
title: "System::Xml::Schema::XmlSchemaInfo class"
linktitle: "XmlSchemaInfo"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaInfo 클래스. C++에서 검증된 XML 노드의 스키마 검증 후 정보 집합을 나타냅니다."
type: docs
weight: 3800
url: /ko/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


검증된 XML 노드의 스키마 검증 후 인포셋을 나타냅니다.

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | 이 검증된 XML 노드의 콘텐츠 유형에 해당하는 [XmlSchemaContentType](../xmlschemacontenttype/) 객체를 반환합니다. |
| [get_IsDefault](./get_isdefault/)() override | XML [Schema](../) 정의 언어 (XSD) 스키마 검증 중 기본값이 적용되어 이 검증된 XML 노드가 설정되었는지 여부를 나타내는 값을 반환합니다. |
| [get_IsNil](./get_isnil/)() override | 이 검증된 XML 노드의 값이 **nil**인지 여부를 나타내는 값을 반환합니다. |
| [get_MemberType](./get_membertype/)() override | 이 검증된 XML 노드에 대한 동적 스키마 유형을 반환합니다. |
| [get_SchemaAttribute](./get_schemaattribute/)() override | 이 검증된 XML 노드에 해당하는 컴파일된 [XmlSchemaAttribute](../xmlschemaattribute/) 객체를 반환합니다. |
| [get_SchemaElement](./get_schemaelement/)() override | 이 검증된 XML 노드에 해당하는 컴파일된 [XmlSchemaElement](../xmlschemaelement/) 객체를 반환합니다. |
| [get_SchemaType](./get_schematype/)() override | 이 검증된 XML 노드의 정적 XML [Schema](../) 정의 언어 (XSD) 스키마 유형을 반환합니다. |
| [get_Validity](./get_validity/)() override | 이 검증된 XML 노드의 [XmlSchemaValidity](../xmlschemavalidity/) 값을 반환합니다. |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | 이 검증된 XML 노드의 콘텐츠 유형에 해당하는 [XmlSchemaContentType](../xmlschemacontenttype/) 객체를 설정합니다. |
| [set_IsDefault](./set_isdefault/)(bool) | XML [Schema](../) 정의 언어 (XSD) 스키마 검증 중 기본값이 적용된 결과로 이 검증된 XML 노드가 설정되었는지 여부를 나타내는 값을 설정합니다. |
| [set_IsNil](./set_isnil/)(bool) | 이 검증된 XML 노드의 값이 **nil**인지 여부를 나타내는 값을 설정합니다. |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | 이 검증된 XML 노드에 대한 동적 스키마 유형을 설정합니다. |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | 이 검증된 XML 노드에 해당하는 컴파일된 [XmlSchemaAttribute](../xmlschemaattribute/) 객체를 설정합니다. |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | 이 검증된 XML 노드에 해당하는 컴파일된 [XmlSchemaElement](../xmlschemaelement/) 객체를 설정합니다. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | 이 검증된 XML 노드의 정적 XML [Schema](../) 정의 언어 (XSD) 스키마 유형을 설정합니다. |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | 이 검증된 XML 노드의 [XmlSchemaValidity](../xmlschemavalidity/) 값을 설정합니다. |
| [XmlSchemaInfo](./xmlschemainfo/)() | [XmlSchemaInfo](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
