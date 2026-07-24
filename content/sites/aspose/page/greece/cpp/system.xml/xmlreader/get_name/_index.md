---
title: "System::Xml::XmlReader::get_Name μέθοδος"
linktitle: "get_Name"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::get_Name μέθοδος. Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, λαμβάνει το πλήρες όνομα του τρέχοντος κόμβου σε C++."
type: docs
weight: 1500
url: /el/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου.

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

Το πλήρες όνομα του τρέχοντος κόμβου. Για παράδειγμα, **Name** είναι **bk:book** για το στοιχείο **<bk:book>**.
## Παρατηρήσεις



Το επιστρεφόμενο όνομα εξαρτάται από την τιμή [XmlReader::get_NodeType](../get_nodetype/) του κόμβου. Οι παρακάτω τύποι κόμβων επιστρέφουν τις αναγραφόμενες τιμές. Όλοι οι άλλοι τύποι κόμβων επιστρέφουν κενή συμβολοσειρά. |||
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
