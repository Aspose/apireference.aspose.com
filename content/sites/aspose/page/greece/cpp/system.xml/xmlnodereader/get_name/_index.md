---
title: "System::Xml::XmlNodeReader::get_Name μέθοδος"
linktitle: "get_Name"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeReader::get_Name μέθοδος. Επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου σε C++."
type: docs
weight: 1400
url: /el/cpp/system.xml/xmlnodereader/get_name/
---
## XmlNodeReader::get_Name method


Επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου.

```cpp
String System::Xml::XmlNodeReader::get_Name() override
```


### ReturnValue

Το πλήρες όνομα του τρέχοντος κόμβου. Για παράδειγμα, **Name** είναι **bk:book** για το στοιχείο **<bk:book>**.
## Παρατηρήσεις



Το όνομα που επιστρέφεται εξαρτάται από την τιμή [XmlNodeReader::get_NodeType](../get_nodetype/) του κόμβου. Οι παρακάτω τύποι κόμβων επιστρέφουν τις αναγραφόμενες τιμές. Όλοι οι άλλοι τύποι κόμβων επιστρέφουν μια κενή συμβολοσειρά. |||
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
