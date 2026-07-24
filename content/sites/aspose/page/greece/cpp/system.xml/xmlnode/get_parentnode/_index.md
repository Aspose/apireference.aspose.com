---
title: "System::Xml::XmlNode::get_ParentNode μέθοδος"
linktitle: "get_ParentNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNode::get_ParentNode μέθοδος. Επιστρέφει τον γονέα αυτού του κόμβου (για κόμβους που μπορούν να έχουν γονείς) σε C++."
type: docs
weight: 2100
url: /el/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


Επιστρέφει τον γονέα αυτού του κόμβου (για κόμβους που μπορούν να έχουν γονείς).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

Το [XmlNode](../) που είναι ο γονέας του τρέχοντος κόμβου.
## Παρατηρήσεις



Εάν ένας κόμβος μόλις δημιουργήθηκε και δεν έχει προστεθεί ακόμη στο δέντρο, ή εάν έχει αφαιρεθεί από το δέντρο, ο γονέας είναι **nullptr**. Για όλους τους άλλους κόμβους, η επιστρεφόμενη τιμή εξαρτάται από το [XmlNode::get_NodeType](../get_nodetype/) του κόμβου. Ο παρακάτω πίνακας περιγράφει τις πιθανές τιμές επιστροφής για τη **get_NodeType** μέθοδο. |||
|-|-|
| NodeType | Τιμή Επιστροφής του ParentNode |
| Attribute, Document, DocumentFragment, Entity, Notation | Επιστρέφει **nullptr**· αυτοί οι κόμβοι δεν έχουν γονείς. |
| CDATA | Επιστρέφει το στοιχείο ή την αναφορά οντότητας που περιέχει την ενότητα CDATA. |
| Comment | Επιστρέφει το στοιχείο, την αναφορά οντότητας, τον τύπο εγγράφου ή το έγγραφο που περιέχει το σχόλιο. |
| DocumentType | Επιστρέφει τον κόμβο εγγράφου. |
| Element | Επιστρέφει τον γονικό κόμβο του στοιχείου. Εάν το στοιχείο είναι ο ριζικός κόμβος στο δέντρο, ο γονέας είναι ο κόμβος εγγράφου. |
| EntityReference | Επιστρέφει το στοιχείο, το χαρακτηριστικό ή την αναφορά οντότητας που περιέχει την αναφορά οντότητας. |
| ProcessingInstruction | Επιστρέφει το έγγραφο, το στοιχείο, τον τύπο εγγράφου ή την αναφορά οντότητας που περιέχει την εντολή επεξεργασίας. |
| Text | Επιστρέφει το γονικό στοιχείο, το χαρακτηριστικό ή την αναφορά οντότητας που περιέχει τον κόμβο κειμένου. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
