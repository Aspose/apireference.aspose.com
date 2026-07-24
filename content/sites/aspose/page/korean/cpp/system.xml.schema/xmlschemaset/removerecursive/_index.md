---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive method"
linktitle: "RemoveRecursive"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive method. C++에서 지정된 XML 스키마 정의 언어(XSD) 스키마와 해당 스키마가 가져오는 모든 스키마를 XmlSchemaSet에서 제거합니다."
type: docs
weight: 1400
url: /ko/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


지정된 XML [Schema](../../) 정의 언어(XSD) 스키마와 해당 스키마가 가져오는 모든 스키마를 [XmlSchemaSet](../)에서 제거합니다.

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/)을 [XmlSchemaSet](../)에서 제거할 객체. |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
