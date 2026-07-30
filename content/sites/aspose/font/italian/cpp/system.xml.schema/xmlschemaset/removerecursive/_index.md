---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive method"
linktitle: "RemoveRecursive"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive method. Rimuove lo schema specificato del linguaggio di definizione XML Schema (XSD) e tutti gli schemi che esso importa dall'XmlSchemaSet in C++."
type: docs
weight: 1400
url: /it/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


Rimuove lo schema specificato del linguaggio di definizione XML [Schema](../../) (XSD) e tutti gli schemi che esso importa dall'[XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | L'oggetto [XmlSchema](../../xmlschema/) da rimuovere dall'[XmlSchemaSet](../). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
