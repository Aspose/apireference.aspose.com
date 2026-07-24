---
title: "System::Xml::Schema::XmlSchemaCollection::Contains method"
linktitle: "Περιέχει"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaCollection::Contains method. Επιστρέφει μια τιμή που υποδεικνύει εάν το **targetNamespace** του καθορισμένου XmlSchema βρίσκεται στη συλλογή σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


Επιστρέφει μια τιμή που υποδεικνύει εάν το **targetNamespace** του καθορισμένου [XmlSchema](../../xmlschema/) βρίσκεται στη συλλογή.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Το αντικείμενο [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


Επιστρέφει μια τιμή που υποδεικνύει εάν ένα σχήμα με τον καθορισμένο χώρο ονομάτων βρίσκεται στη συλλογή.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ns | const String\& | Το URI του ονόματος χώρου που σχετίζεται με το σχήμα. Για XML Schemas, αυτό συνήθως είναι το όνομα χώρου-στόχος. |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
