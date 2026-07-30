---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive метод"
linktitle: "RemoveRecursive"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive метод. Удаляет указанную схему XML Schema (XSD) и все схемы, которые она импортирует, из XmlSchemaSet в C++."
type: docs
weight: 1400
url: /ru/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


Удаляет указанную XML [Schema](../../) схему языка определения (XSD) и все схемы, которые она импортирует, из [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | Объект [XmlSchema](../../xmlschema/) для удаления из [XmlSchemaSet](../). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
