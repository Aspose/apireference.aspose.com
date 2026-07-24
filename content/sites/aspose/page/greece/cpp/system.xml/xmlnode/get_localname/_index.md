---
title: "System::Xml::XmlNode::get_LocalName μέθοδος"
linktitle: "get_LocalName"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNode::get_LocalName μέθοδος. Επιστρέφει το τοπικό όνομα του κόμβου, όταν αντικαθίσταται σε μια παράγωγη κλάση σε C++."
type: docs
weight: 1400
url: /el/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


Επιστρέφει το τοπικό όνομα του κόμβου, όταν αντικατασταθεί σε μια κληρονομημένη κλάση.

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

Το όνομα του κόμβου χωρίς το πρόθεμα. Για παράδειγμα, **LocalName** είναι **book** για το στοιχείο **<bk:book>**.
## Παρατηρήσεις



Το επιστρεφόμενο όνομα εξαρτάται από το [XmlNode::get_NodeType](../get_nodetype/) του κόμβου: |||
|-|-|
| Type | Όνομα |
| Attribute | Το τοπικό όνομα του χαρακτηριστικού. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Το όνομα του τύπου εγγράφου. |
| Element | Το τοπικό όνομα του στοιχείου. |
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
