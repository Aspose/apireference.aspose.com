---
title: "System::Xml::XmlTextReader::get_Name μέθοδος"
linktitle: "get_Name"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlTextReader::get_Name μέθοδος. Επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου σε C++."
type: docs
weight: 1900
url: /el/cpp/system.xml/xmltextreader/get_name/
---
## XmlTextReader::get_Name method


Επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου.

```cpp
String System::Xml::XmlTextReader::get_Name() override
```


### ReturnValue

Το πλήρες όνομα του τρέχοντος κόμβου. Για παράδειγμα, **Name** είναι **bk:book** για το στοιχείο **<bk:book>**.
## Παρατηρήσεις



Το επιστρεφόμενο όνομα εξαρτάται από την τιμή [XmlTextReader::get_NodeType](../get_nodetype/) του κόμβου. Οι παρακάτω τύποι κόμβων επιστρέφουν τις αναγραφόμενες τιμές. Όλοι οι άλλοι τύποι κόμβων επιστρέφουν κενή συμβολοσειρά. |||
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
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
