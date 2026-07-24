---
title: "System::Xml::XmlValidatingReader::get_Name method"
linktitle: "get_Name"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlValidatingReader::get_Name method. Επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου σε C++."
type: docs
weight: 1700
url: /el/cpp/system.xml/xmlvalidatingreader/get_name/
---
## XmlValidatingReader::get_Name method


Επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου.

```cpp
String System::Xml::XmlValidatingReader::get_Name() override
```


### ReturnValue

Το πλήρες όνομα του τρέχοντος κόμβου. Για παράδειγμα, **Name** είναι **bk:book** για το στοιχείο **<bk:book>**.
## Παρατηρήσεις



Το όνομα που επιστρέφεται εξαρτάται από το XmlValidatingReader::NodeType του κόμβου. Οι ακόλουθοι τύποι κόμβων επιστρέφουν τις αναγραφόμενες τιμές. Όλοι οι άλλοι τύποι κόμβων επιστρέφουν ένα κενό string. |||
|-|-|
| Τύπος κόμβου | Όνομα |
| Attribute | Το όνομα του χαρακτηριστικού. |
| DocumentType | Το όνομα του τύπου εγγράφου. |
| Element | Το όνομα της ετικέτας. |
| EntityReference | Το όνομα της οντότητας που αναφέρεται. |
| ProcessingInstruction | Ο προορισμός της οδηγίας επεξεργασίας. |
| XmlDeclaration | Η κυριολεκτική συμβολοσειρά xml. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
