---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get 메서드"
linktitle: "idx_get"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get 메서드. C++에서 지정된 네임스페이스 URI와 연결된 XmlSchema를 반환합니다."
type: docs
weight: 800
url: /ko/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


지정된 네임스페이스 URI와 연결된 [XmlSchema](../../xmlschema/)를 반환합니다.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ns | const String\& | 반환하려는 스키마와 연결된 네임스페이스 URI입니다. 일반적으로 스키마의 **targetNamespace**가 됩니다. |

### ReturnValue

네임스페이스 URI와 연결된 [XmlSchema](../../xmlschema/); 지정된 네임스페이스와 연결된 로드된 스키마가 없거나 해당 네임스페이스가 XDR 스키마와 연결된 경우 **nullptr**입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
