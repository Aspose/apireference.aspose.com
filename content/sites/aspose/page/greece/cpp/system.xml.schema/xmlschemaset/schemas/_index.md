---
title: "System::Xml::Schema::XmlSchemaSet::Schemas μέθοδος"
linktitle: "Σχήματα"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Xml::Schema::XmlSchemaSet::Schemas. Επιστρέφει μια συλλογή όλων των σχημάτων XML Schema definition language (XSD) στο XmlSchemaSet σε C++."
type: docs
weight: 1600
url: /el/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Επιστρέφει μια συλλογή όλων των σχημάτων XML [Schema](../../) definition language (XSD) στο [XmlSchemaSet](../).

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

Ένα αντικείμενο IList που περιέχει όλα τα σχήματα που έχουν προστεθεί στο [XmlSchemaSet](../). Εάν δεν έχουν προστεθεί σχήματα στο [XmlSchemaSet](../), επιστρέφεται μια κενή συλλογή.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Επιστρέφει μια συλλογή όλων των σχημάτων XML [Schema](../../) definition language (XSD) στο [XmlSchemaSet](../) που ανήκουν στο δοσμένο namespace.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| targetNamespace | String | Η ιδιότητα **targetNamespace** του σχήματος. |

### ReturnValue

Ένα αντικείμενο IList που περιέχει όλα τα σχήματα που έχουν προστεθεί στο [XmlSchemaSet](../) και ανήκουν στο δοσμένο namespace. Εάν δεν έχουν προστεθεί σχήματα στο [XmlSchemaSet](../), επιστρέφεται μια κενή συλλογή.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
