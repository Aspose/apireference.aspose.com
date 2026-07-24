---
title: "System::Xml::XmlDocument::CreateDocumentType μέθοδος"
linktitle: "CreateDocumentType"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDocument::CreateDocumentType μέθοδος. Επιστρέφει ένα νέο αντικείμενο XmlDocumentType σε C++."
type: docs
weight: 700
url: /el/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


Επιστρέφει ένα νέο αντικείμενο [XmlDocumentType](../../xmldocumenttype/).

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | const String\& | Όνομα του τύπου εγγράφου. |
| publicId | const String\& | Το δημόσιο αναγνωριστικό του τύπου εγγράφου ή **nullptr**. Μπορείτε να καθορίσετε ένα δημόσιο URI και επίσης ένα αναγνωριστικό συστήματος για να προσδιορίσετε τη θέση του εξωτερικού υποσυνόλου DTD. |
| systemId | const String\& | Το αναγνωριστικό συστήματος του τύπου εγγράφου ή **nullptr**. Καθορίζει το URL της θέσης του αρχείου για το εξωτερικό υποσύνολο DTD. |
| internalSubset | const String\& | Το εσωτερικό υποσύνολο DTD του τύπου εγγράφου ή **nullptr**. |

### ReturnValue

Το νέο [XmlDocumentType](../../xmldocumenttype/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
