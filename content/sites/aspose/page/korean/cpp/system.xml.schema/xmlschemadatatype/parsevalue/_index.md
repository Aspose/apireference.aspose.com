---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue method"
linktitle: "ParseValue"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue 메서드. 파생 클래스에서 재정의될 때, C++에서 지정된 문자열을 내장 또는 사용자 정의 단순 유형에 대해 검증합니다."
type: docs
weight: 700
url: /ko/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


파생 클래스에서 재정의될 때, 지정된 **string**을 내장 또는 사용자 정의 단순 유형에 대해 검증합니다.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | String | 단순 유형에 대해 검증할 **string**. |
| nameTable | SharedPtr\<XmlNameTable\> | 이 [XmlSchemaDatatype](../) 객체가 **xs:NCName** 유형을 나타내는 경우, **string**을 구문 분석하는 동안 원자화를 위해 사용할 [XmlNameTable](../../../system.xml/xmlnametable/)입니다. |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | 이 [XmlSchemaDatatype](../) 객체가 **xs:QName** 유형을 나타내는 경우, **string**을 구문 분석하는 동안 사용할 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체입니다. |

### ReturnValue

[XmlSchemaDatatype::get_ValueType](../get_valuetype/) 호출이 반환하는 유형으로 안전하게 캐스팅할 수 있는 [Object](../../../system/object/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
