---
title: "Μέθοδος System::Xml::Schema::XmlSchemaSet::Reprocess"
linktitle: "Επεξεργασία εκ νέου"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Xml::Schema::XmlSchemaSet::Reprocess. Επεξεργάζεται εκ νέου ένα σχήμα XML Schema definition language (XSD) που υπάρχει ήδη στο XmlSchemaSet σε C++."
type: docs
weight: 1500
url: /el/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


Επεξεργάζεται εκ νέου ένα σχήμα XML [Schema](../../) definition language (XSD) που υπάρχει ήδη στο [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| σχήμα | SharedPtr\<XmlSchema\> | Το σχήμα προς επεξεργασία εκ νέου. |

### ReturnValue

Ένα αντικείμενο [XmlSchema](../../xmlschema/) εάν το σχήμα είναι έγκυρο. Εάν το σχήμα δεν είναι έγκυρο και έχει οριστεί ένας [ValidationEventHandler](../../validationeventhandler/), επιστρέφεται **nullptr** και προκαλείται το αντίστοιχο γεγονός επικύρωσης. Διαφορετικά, ρίχνεται ένα [XmlSchemaException](../../xmlschemaexception/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
