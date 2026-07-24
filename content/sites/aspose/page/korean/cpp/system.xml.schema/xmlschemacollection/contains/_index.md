---
title: "System::Xml::Schema::XmlSchemaCollection::Contains 메서드"
linktitle: "Contains"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaCollection::Contains 메서드. 지정된 XmlSchema의 targetNamespace가 컬렉션에 포함되어 있는지 여부를 반환합니다 (C++)."
type: docs
weight: 300
url: /ko/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


지정된 [XmlSchema](../../xmlschema/)의 **targetNamespace**가 컬렉션에 포함되어 있는지 여부를 반환합니다.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) 객체입니다. |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


지정된 네임스페이스를 가진 스키마가 컬렉션에 있는지 여부를 나타내는 값을 반환합니다.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ns | const String\& | 스키마와 연결된 네임스페이스 URI입니다. XML 스키마의 경우 일반적으로 target namespace가 됩니다. |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
