---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive method"
linktitle: "RemoveRecursive"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive method. Verwijdert het opgegeven XML Schema definitietaal (XSD)-schema en alle schema's die het importeert uit de XmlSchemaSet in C++."
type: docs
weight: 1400
url: /nl/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


Verwijdert het opgegeven XML [Schema](../../) definitietaal (XSD)-schema en alle schema's die het importeert uit de [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | Het [XmlSchema](../../xmlschema/) object om te verwijderen uit de [XmlSchemaSet](../). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
