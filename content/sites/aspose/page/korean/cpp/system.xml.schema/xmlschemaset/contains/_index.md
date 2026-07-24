---
title: "System::Xml::Schema::XmlSchemaSet::Contains 메서드"
linktitle: "Contains"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet::Contains 메서드. 지정된 XML 스키마 정의 언어 (XSD) XmlSchema 객체가 C++의 XmlSchemaSet에 포함되어 있는지 여부를 나타냅니다."
type: docs
weight: 400
url: /ko/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


지정된 XML [Schema](../../) 정의 언어 (XSD) [XmlSchema](../../xmlschema/) 객체가 [XmlSchemaSet](../)에 포함되어 있는지 여부를 나타냅니다.

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) 객체입니다. |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Contains(String) method


지정된 대상 네임스페이스 URI를 가진 XML [Schema](../../) 정의 언어 (XSD) 스키마가 [XmlSchemaSet](../)에 포함되어 있는지 여부를 나타냅니다.

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| targetNamespace | String | 스키마 **targetNamespace** 속성입니다. |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
