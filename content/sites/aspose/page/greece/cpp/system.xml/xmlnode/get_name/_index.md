---
title: "System::Xml::XmlNode::get_Name μέθοδος"
linktitle: "get_Name"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNode::get_Name μέθοδος. Επιστρέφει το πλήρες όνομα του κόμβου, όταν αντικαθίσταται σε μια παράγωγη κλάση σε C++."
type: docs
weight: 1500
url: /el/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Επιστρέφει το πλήρες όνομα του κόμβου, όταν αντικατασταθεί σε μια κληρονομημένη κλάση.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

Το πλήρες όνομα του κόμβου.
## Παρατηρήσεις



Το επιστρεφόμενο όνομα εξαρτάται από το [XmlNode::get_NodeType](../get_nodetype/) του κόμβου: |||
|-|-|
| Type | Όνομα |
| Attribute | Το πλήρες όνομα του χαρακτηριστικού. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Το όνομα του τύπου εγγράφου. |
| Element | Το πλήρες όνομα του στοιχείου. |
| Entity | Το όνομα της οντότητας. |
| EntityReference | Το όνομα της οντότητας που αναφέρεται. |
| Σημείωση | Το όνομα της σημειογραφίας. |
| ProcessingInstruction | Ο προορισμός της οδηγίας επεξεργασίας. |
| Text | #text |
| Κενοί χαρακτήρες | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
