---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess 메서드"
linktitle: "재처리"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess 메서드. C++에서 XmlSchemaSet에 이미 존재하는 XML 스키마 정의 언어 (XSD) 스키마를 재처리합니다."
type: docs
weight: 1500
url: /ko/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


이미 [XmlSchemaSet](../)에 존재하는 XML [Schema](../../) 정의 언어 (XSD) 스키마를 재처리합니다.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스키마 | SharedPtr\<XmlSchema\> | 재처리할 스키마입니다. |

### ReturnValue

스키마가 유효한 경우 [XmlSchema](../../xmlschema/) 객체를 반환합니다. 스키마가 유효하지 않고 [ValidationEventHandler](../../validationeventhandler/)가 지정된 경우, **nullptr**가 반환되고 적절한 검증 이벤트가 발생합니다. 그렇지 않으면 [XmlSchemaException](../../xmlschemaexception/)이 발생합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
