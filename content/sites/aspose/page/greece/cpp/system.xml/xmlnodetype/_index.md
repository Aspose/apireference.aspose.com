---
title: "System::Xml::XmlNodeType enum"
linktitle: "XmlNodeType"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeType enum. Καθορίζει τον τύπο του κόμβου σε C++."
type: docs
weight: 6200
url: /el/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


Καθορίζει τον τύπο του κόμβου.

```cpp
enum class XmlNodeType
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| None | 0 | Αυτό επιστρέφεται από το [XmlReader](../xmlreader/) εάν δεν έχει κληθεί η μέθοδος **Read**. |
| Element | 1 | Ένα στοιχείο (για παράδειγμα, **<item>**). |
| Attribute | 2 | Ένα χαρακτηριστικό (για παράδειγμα, **id='123'**). |
| Text | 3 | Το κείμενο περιεχόμενο ενός κόμβου. Ένας κόμβος [XmlNodeType::Text](./) δεν μπορεί να έχει υποκόμβους. Μπορεί να εμφανιστεί ως υποκόμβος των κόμβων [XmlNodeType::Attribute](./), [XmlNodeType::DocumentFragment](./), [XmlNodeType::Element](./) και [XmlNodeType::EntityReference](./). |
| CDATA | 4 | Μια ενότητα CDATA (για παράδειγμα, **my escaped text**). |
| EntityReference | 5 | Μια αναφορά σε οντότητα (για παράδειγμα, **&num;**). |
| Entity | 6 | Μια δήλωση οντότητας (για παράδειγμα, **<!ENTITY...>**). |
| ProcessingInstruction | 7 | Μια οδηγία επεξεργασίας (για παράδειγμα, **<?pi test?>**). |
| Comment | 8 | Ένα σχόλιο (για παράδειγμα, ****). |
| Document | 9 | Ένα αντικείμενο εγγράφου που, ως ρίζα του δέντρου εγγράφου, παρέχει πρόσβαση σε ολόκληρο το XML έγγραφο. |
| DocumentType | 10 | Η δήλωση τύπου εγγράφου, η οποία υποδεικνύεται από την ακόλουθη ετικέτα (για παράδειγμα, **<!DOCTYPE...>**). |
| DocumentFragment | 11 | Ένα τμήμα εγγράφου. |
| Σημείωση | 12 | Μια σημείωση στη δήλωση τύπου εγγράφου (για παράδειγμα, **<!NOTATION...>**). |
| Κενοί χαρακτήρες | 13 | Κενό διάστημα μεταξύ σήμανσης. |
| SignificantWhitespace | 14 | Κενό διάστημα μεταξύ σήμανσης σε ένα μοντέλο μικτής περιεχομένου ή κενό διάστημα εντός του πεδίου **xml:space=\"preserve\"**. |
| EndElement | 15 | Μια ετικέτα τέλους στοιχείου (για παράδειγμα, ****). |
| EndEntity | 16 | Επιστρέφεται όταν ο [XmlReader](../xmlreader/) φτάνει στο τέλος της αντικατάστασης οντότητας ως αποτέλεσμα κλήσης του [XmlReader::ResolveEntity](../xmlreader/resolveentity/). |
| XmlDeclaration | 17 | Η δήλωση XML (για παράδειγμα, **<?xml version='1.0'?>**). Ο κόμβος [XmlNodeType::XmlDeclaration](./) πρέπει να είναι ο πρώτος κόμβος στο έγγραφο. Δεν μπορεί να έχει παιδιά. Είναι παιδί του κόμβου [XmlNodeType::Document](./). Μπορεί να έχει χαρακτηριστικά που παρέχουν πληροφορίες έκδοσης και κωδικοποίησης. |

## Δείτε επίσης

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
