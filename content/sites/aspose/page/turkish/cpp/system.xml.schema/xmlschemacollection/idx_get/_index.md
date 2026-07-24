---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get metodu"
linktitle: "idx_get"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get metodu. C++'ta verilen ad alanı URI'siyle ilişkili XmlSchema'ı döndürür."
type: docs
weight: 800
url: /tr/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


Verilen ad alanı URI'siyle ilişkili [XmlSchema](../../xmlschema/) döndürür.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ns | const String\& | Döndürmek istediğiniz şema ile ilişkili ad alanı URI'si. Bu genellikle şemanın **targetNamespace**'i olur. |

### ReturnValue

Ad alanı URI'siyle ilişkili [XmlSchema](../../xmlschema/); verilen ad alanı ile ilişkili yüklenmiş bir şema yoksa veya ad alanı bir XDR şemasıyla ilişkiliyse **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
