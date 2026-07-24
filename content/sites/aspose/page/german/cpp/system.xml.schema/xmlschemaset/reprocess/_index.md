---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess-Methode"
linktitle: "Neu verarbeiten"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess-Methode. Verarbeitet ein bereits im XmlSchemaSet vorhandenes XML Schema-Definitionssprache (XSD)-Schema in C++ neu."
type: docs
weight: 1500
url: /de/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


Verarbeitet ein bereits im [XmlSchemaSet](../) vorhandenes XML [Schema](../../)-Definitionssprache (XSD)-Schema neu.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Schema | SharedPtr\<XmlSchema\> | Das zu verarbeitende Schema. |

### ReturnValue

Ein [XmlSchema](../../xmlschema/)-Objekt, wenn das Schema gültig ist. Wenn das Schema nicht gültig ist und ein [ValidationEventHandler](../../validationeventhandler/) angegeben wird, wird **nullptr** zurückgegeben und das entsprechende Validierungsereignis ausgelöst. Andernfalls wird eine [XmlSchemaException](../../xmlschemaexception/) ausgelöst.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
