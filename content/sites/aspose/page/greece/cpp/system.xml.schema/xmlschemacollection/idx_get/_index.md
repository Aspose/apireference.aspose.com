---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get μέθοδος"
linktitle: "idx_get"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get μέθοδος. Επιστρέφει το XmlSchema που συσχετίζεται με το δοσμένο URI ονόματος χώρου σε C++."
type: docs
weight: 800
url: /el/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


Επιστρέφει το [XmlSchema](../../xmlschema/) που συσχετίζεται με το δοσμένο URI ονόματος χώρου.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ns | const String\& | Το URI ονόματος χώρου που συσχετίζεται με το σχήμα που θέλετε να επιστρέψετε. Αυτό συνήθως είναι το **targetNamespace** του σχήματος. |

### ReturnValue

Το [XmlSchema](../../xmlschema/) που συσχετίζεται με το URI ονόματος χώρου· **nullptr** εάν δεν υπάρχει φορτωμένο σχήμα που να συσχετίζεται με το δοσμένο όνομα χώρου ή εάν το όνομα χώρου συσχετίζεται με σχήμα XDR.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
