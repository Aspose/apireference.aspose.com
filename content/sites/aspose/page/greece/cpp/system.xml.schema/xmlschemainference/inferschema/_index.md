---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema μέθοδος"
linktitle: "InferSchema"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema μέθοδος. Κατασκευάζει ένα XML Schema Definition Language (XSD) σχήμα από το έγγραφο XML που περιέχεται στο αντικείμενο XmlReader που έχει καθοριστεί σε C++."
type: docs
weight: 400
url: /el/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


Κατασκευάζει ένα XML [Schema](../../) Definition Language (XSD) σχήμα από το έγγραφο XML που περιέχεται στο αντικείμενο [XmlReader](../../../system.xml/xmlreader/) που έχει καθοριστεί.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Ένα αντικείμενο [XmlReader](../../../system.xml/xmlreader/) που περιέχει το έγγραφο XML για την εξαγωγή σχήματος. |

### ReturnValue

Ένα αντικείμενο [XmlSchemaSet](../../xmlschemaset/) που περιέχει τα εξαγόμενα σχήματα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


Κατασκευάζει ένα XML [Schema](../../) Definition Language (XSD) σχήμα από το έγγραφο XML που περιέχεται στο αντικείμενο [XmlReader](../../../system.xml/xmlreader/) που έχει καθοριστεί, και βελτιώνει το εξαγόμενο σχήμα χρησιμοποιώντας ένα υπάρχον σχήμα στο αντικείμενο [XmlSchemaSet](../../xmlschemaset/) που έχει καθοριστεί με τον ίδιο στόχο namespace.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | Ένα αντικείμενο [XmlReader](../../../system.xml/xmlreader/) που περιέχει το έγγραφο XML για την εξαγωγή σχήματος. |
| schemas | SharedPtr\<XmlSchemaSet\> | Ένα αντικείμενο [XmlSchemaSet](../../xmlschemaset/) που περιέχει ένα υπάρχον σχήμα που χρησιμοποιείται για τη βελτίωση του εξαγόμενου σχήματος. |

### ReturnValue

Ένα αντικείμενο [XmlSchemaSet](../../xmlschemaset/) που περιέχει τα εξαγόμενα σχήματα.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
