---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get method"
linktitle: "idx_get"
second_title: "Aspose.Page для C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get method. Возвращает XmlSchema, связанный с указанным URI пространства имён, в C++."
type: docs
weight: 800
url: /ru/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


Возвращает [XmlSchema](../../xmlschema/), связанный с указанным URI пространства имён.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| ns | const String\& | URI пространства имён, связанный со схемой, которую вы хотите получить. Обычно это **targetNamespace** схемы. |

### ReturnValue

Эта [XmlSchema](../../xmlschema/) связана с URI пространства имён; **nullptr**, если для указанного пространства имён не загружена схема или если пространство имён связано со схемой XDR.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
