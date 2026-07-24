---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive metod"
linktitle: "RemoveRecursive"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive metod. Tar bort det specificerade XML Schema definition language (XSD)-schemat och alla scheman som det importerar från XmlSchemaSet i C++."
type: docs
weight: 1400
url: /sv/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


Tar bort det specificerade XML [Schema](../../) definition language (XSD)-schemat och alla scheman som det importerar från [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | Det [XmlSchema](../../xmlschema/)-objektet att ta bort från [XmlSchemaSet](../). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
