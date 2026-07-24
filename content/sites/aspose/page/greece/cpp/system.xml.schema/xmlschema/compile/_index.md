---
title: "System::Xml::Schema::XmlSchema::Compile μέθοδος"
linktitle: "Compile"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchema::Compile μέθοδος. Συγκεντρώνει το XML SchemaObject Model (SOM) σε πληροφορίες σχήματος για επικύρωση. Χρησιμοποιείται για τον έλεγχο της συντακτικής και σημασιολογικής δομής του προγραμματιστικά δημιουργημένου SOM. Ο έλεγχος σημασιολογικής επικύρωσης εκτελείται κατά τη μεταγλώττιση σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


Συγκεντρώνει το XML [Schema](../../)[Object](../../../system/object/) Model (SOM) σε πληροφορίες σχήματος για επικύρωση. Χρησιμοποιείται για τον έλεγχο της συντακτικής και σημασιολογικής δομής του προγραμματιστικά δημιουργημένου SOM. Ο έλεγχος σημασιολογικής επικύρωσης εκτελείται κατά τη μεταγλώττιση.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Ο διαχειριστής συμβάντος επικύρωσης που λαμβάνει πληροφορίες σχετικά με σφάλματα επικύρωσης του XML [Schema](../../). |

## Δείτε επίσης

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


Συγκεντρώνει το XML [Schema](../../)[Object](../../../system/object/) Model (SOM) σε πληροφορίες σχήματος για επικύρωση. Χρησιμοποιείται για τον έλεγχο της συντακτικής και σημασιολογικής δομής του προγραμματιστικά δημιουργημένου SOM. Ο έλεγχος σημασιολογικής επικύρωσης εκτελείται κατά τη μεταγλώττιση.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Ο διαχειριστής συμβάντος επικύρωσης που λαμβάνει πληροφορίες σχετικά με τα σφάλματα επικύρωσης του XML [Schema](../../). |
| resolver | const SharedPtr\<XmlResolver\>\& | Ο [XmlResolver](../../../system.xml/xmlresolver/) που χρησιμοποιείται για την επίλυση των namespaces που αναφέρονται στα στοιχεία **include** και **import**. |

## Δείτε επίσης

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
