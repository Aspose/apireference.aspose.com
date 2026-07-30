---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess-Methode"
linktitle: "Reprocess"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess-Methode. Verarbeitet ein bereits im XmlSchemaSet vorhandenes XML Schema Definition Language (XSD)-Schema erneut in C++."
type: docs
weight: 1500
url: /de/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


Verarbeitet ein bereits im [XmlSchemaSet](../) vorhandenes XML [Schema](../../) Definition Language (XSD)-Schema erneut.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Schema | SharedPtr\<XmlSchema\> | Das Schema zum erneuten Verarbeiten. |

### ReturnValue

Ein [XmlSchema](../../xmlschema/)-Objekt, wenn das Schema ein gültiges Schema ist. Wenn das Schema nicht gültig ist und ein [ValidationEventHandler](../../validationeventhandler/) angegeben ist, wird **nullptr** zurückgegeben und das entsprechende Validierungsereignis ausgelöst. Andernfalls wird eine [XmlSchemaException](../../xmlschemaexception/) ausgelöst.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
