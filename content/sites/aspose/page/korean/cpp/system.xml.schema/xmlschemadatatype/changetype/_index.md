---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType method"
linktitle: "ChangeType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType 메서드. XmlSchemaDatatype이 나타내는 XML 스키마 유형의 유효한 표현 중 하나인 지정된 값을 C++에서 지정된 런타임 유형으로 변환합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


지정된 값을 변환합니다. 해당 값의 유형은 [XmlSchemaDatatype](../)이 나타내는 XML 스키마 유형의 유효한 표현 중 하나이며, 지정된 런타임 유형으로 변환됩니다.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | SharedPtr\<Object\> | 지정된 유형으로 변환할 입력 값. |
| targetType | const TypeInfo\& | 입력 값을 변환할 대상 유형. |

### ReturnValue

변환된 입력 값.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


지정된 값을 변환합니다. 해당 값의 유형은 [XmlSchemaDatatype](../)이 나타내는 XML 스키마 유형의 유효한 표현 중 하나이며, [XmlSchemaDatatype](../)이 **xs:QName** 유형 또는 그 파생 유형을 나타내는 경우 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)를 사용하여 지정된 런타임 유형으로 변환합니다.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | SharedPtr\<Object\> | 지정된 유형으로 변환할 입력 값. |
| targetType | const TypeInfo\& | 입력 값을 변환할 대상 유형. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)는 네임스페이스 접두사를 해결하는 데 사용됩니다. 이는 [XmlSchemaDatatype](../)이 **xs:QName** 유형 또는 그 파생 유형을 나타내는 경우에만 유용합니다. |

### ReturnValue

변환된 입력 값.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
