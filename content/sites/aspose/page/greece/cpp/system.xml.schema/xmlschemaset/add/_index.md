---
title: "μέθοδος System::Xml::Schema::XmlSchemaSet::Add"
linktitle: "Add"
second_title: "Aspose.Page για C++"
description: "μέθοδος System::Xml::Schema::XmlSchemaSet::Add. Προσθέτει το δεδομένο XmlSchema στο XmlSchemaSet σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


Προσθέτει το δεδομένο [XmlSchema](../../xmlschema/) στο [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Το αντικείμενο [XmlSchema](../../xmlschema/) για προσθήκη στο [XmlSchemaSet](../). |

### ReturnValue

Ένα αντικείμενο [XmlSchema](../../xmlschema/) εάν το σχήμα είναι έγκυρο. Εάν το σχήμα δεν είναι έγκυρο και έχει καθοριστεί ένας [ValidationEventHandler](../../validationeventhandler/), τότε επιστρέφεται **nullptr** και ενεργοποιείται το κατάλληλο γεγονός επικύρωσης. Διαφορετικά, ρίχνεται ένα [XmlSchemaException](../../xmlschemaexception/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


Προσθέτει όλα τα σχήματα XML [Schema](../../) definition language (XSD) που περιλαμβάνονται στο δεδομένο [XmlSchemaSet](../) στο [XmlSchemaSet](../).

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | Το αντικείμενο [XmlSchemaSet](../). |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


Προσθέτει το σχήμα XML [Schema](../../) definition language (XSD) που περιέχεται στο [XmlReader](../../../system.xml/xmlreader/) στο [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| targetNamespace | String | Η τιμή του σχήματος **targetNamespace**, ή **nullptr** για χρήση του **targetNamespace** που έχει καθοριστεί στο σχήμα. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | Το αντικείμενο [XmlReader](../../../system.xml/xmlreader/). |

### ReturnValue

Ένα αντικείμενο [XmlSchema](../../xmlschema/) εάν το σχήμα είναι έγκυρο. Εάν το σχήμα δεν είναι έγκυρο και έχει καθοριστεί ένας [ValidationEventHandler](../../validationeventhandler/), τότε επιστρέφεται **nullptr** και ενεργοποιείται το κατάλληλο γεγονός επικύρωσης. Διαφορετικά, ρίχνεται ένα [XmlSchemaException](../../xmlschemaexception/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


Προσθέτει το σχήμα XML [Schema](../../) definition language (XSD) στη διεύθυνση URL που έχει καθοριστεί στο [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| targetNamespace | String | Η τιμή του σχήματος **targetNamespace**, ή **nullptr** για χρήση του **targetNamespace** που έχει καθοριστεί στο σχήμα. |
| schemaUri | const String\& | Το URL που καθορίζει το σχήμα προς φόρτωση. |

### ReturnValue

Ένα αντικείμενο [XmlSchema](../../xmlschema/) εάν το σχήμα είναι έγκυρο. Εάν το σχήμα δεν είναι έγκυρο και έχει καθοριστεί ένας [ValidationEventHandler](../../validationeventhandler/), τότε επιστρέφεται **nullptr** και ενεργοποιείται το κατάλληλο γεγονός επικύρωσης. Διαφορετικά, ρίχνεται ένα [XmlSchemaException](../../xmlschemaexception/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
