---
title: "System::Xml::Schema::XmlSchemaDatatype 클래스"
linktitle: "XmlSchemaDatatype"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaDatatype 클래스. XmlSchemaDatatype 클래스는 XML Schema 정의 언어 (XSD) 유형을 C++의 런타임 유형에 매핑하기 위한 추상 클래스입니다."
type: docs
weight: 2400
url: /ko/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


[XmlSchemaDatatype](./) 클래스는 XML [Schema](../) 정의 언어 (XSD) 유형을 런타임 유형에 매핑하기 위한 추상 클래스입니다.

```cpp
class XmlSchemaDatatype : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | [XmlSchemaDatatype](./)이 나타내는 XML 스키마 유형의 유효한 표현 중 하나인 지정된 값을 지정된 런타임 유형으로 변환합니다. |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | [XmlSchemaDatatype](./)이 나타내는 XML 스키마 유형의 유효한 표현 중 하나인 지정된 값을, [XmlSchemaDatatype](./)이 **xs:QName** 유형 또는 그 파생 유형을 나타내는 경우 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)를 사용하여 지정된 런타임 유형으로 변환합니다. |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | 파생 클래스에서 재정의될 때, World Wide [Web](../../system.web/) Consortium (W3C) XML 1.0 사양에 지정된 **string** 유형을 가져옵니다. |
| virtual [get_TypeCode](./get_typecode/)() | 단순 유형에 대한 [XmlTypeCode](../xmltypecode/) 값을 반환합니다. |
| virtual [get_ValueType](./get_valuetype/)() | 파생 클래스에서 재정의될 때, 항목의 유형을 가져옵니다. |
| virtual [get_Variety](./get_variety/)() | 단순 유형에 대한 [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) 값을 반환합니다. |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | 이 메서드는 항상 **false**를 반환합니다. |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | 파생 클래스에서 재정의될 때, 지정된 **string**을 내장 또는 사용자 정의 단순 유형에 대해 검증합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
