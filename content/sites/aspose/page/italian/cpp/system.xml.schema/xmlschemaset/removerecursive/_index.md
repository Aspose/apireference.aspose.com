---
title: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive metodo"
linktitle: "RemoveRecursive"
second_title: "Aspose.Page per C++"
description: "System::Xml::Schema::XmlSchemaSet::RemoveRecursive metodo. Rimuove lo schema XML Schema definition language (XSD) specificato e tutti gli schemi che esso importa dall'XmlSchemaSet in C++."
type: docs
weight: 1400
url: /it/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


Rimuove lo schema XML [Schema](../../) di definizione (XSD) specificato e tutti gli schemi che esso importa dal [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | L'oggetto [XmlSchema](../../xmlschema/) da rimuovere dal [XmlSchemaSet](../). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
