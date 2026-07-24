---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess-methode"
linktitle: "Herprocessen"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess-methode. Herprocessen van een XML Schema-definitietaal (XSD) schema dat al bestaat in de XmlSchemaSet in C++."
type: docs
weight: 1500
url: /nl/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


Herprocessen van een XML [Schema](../../) definitietaal (XSD) schema dat al bestaat in de [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schema | SharedPtr\<XmlSchema\> | Het schema om te herprocessen. |

### ReturnValue

Een [XmlSchema](../../xmlschema/) object als het schema een geldig schema is. Als het schema niet geldig is en een [ValidationEventHandler](../../validationeventhandler/) is opgegeven, wordt **nullptr** geretourneerd en wordt het juiste validatie-event geactiveerd. Anders wordt een [XmlSchemaException](../../xmlschemaexception/) gegooid.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
