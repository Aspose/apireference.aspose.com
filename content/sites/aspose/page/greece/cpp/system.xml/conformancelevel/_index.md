---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page για C++"
description: "System::Xml::ConformanceLevel enum. Καθορίζει το επίπεδο ελέγχου εισόδου ή εξόδου που εκτελούν τα αντικείμενα XmlReader και XmlWriter σε C++."
type: docs
weight: 4600
url: /el/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Καθορίζει το επίπεδο ελέγχου εισόδου ή εξόδου που εκτελούν τα αντικείμενα [XmlReader](../xmlreader/) και [XmlWriter](../xmlwriter/).

```cpp
enum class ConformanceLevel
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Auto | 0 | Το αντικείμενο [XmlReader](../xmlreader/) ή [XmlWriter](../xmlwriter/) ανιχνεύει αυτόματα αν πρέπει να εκτελεστεί έλεγχος σε επίπεδο εγγράφου ή σε επίπεδο τμήματος και πραγματοποιεί τον κατάλληλο έλεγχο. Εάν τυλίγετε ένα άλλο αντικείμενο [XmlReader](../xmlreader/) ή [XmlWriter](../xmlwriter/), το εξωτερικό αντικείμενο δεν εκτελεί επιπλέον έλεγχο συμμόρφωσης. Ο έλεγχος συμμόρφωσης αφήνεται στο υποκείμενο αντικείμενο. |
| Fragment | 1 | Τα δεδομένα XML είναι ένα [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), όπως ορίζεται από το W3C. Αυτό το επίπεδο συμμόρφωσης αντιπροσωπεύει ένα έγγραφο XML που ενδέχεται να μην έχει στοιχείο ρίζας αλλά είναι κατά τα άλλα καλά δομημένο. Αυτό το επίπεδο ελέγχου εξασφαλίζει ότι η ροή που διαβάζεται ή γράφεται μπορεί να καταναλωθεί από οποιονδήποτε επεξεργαστή ως μια [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | Τα δεδομένα XML συμμορφώνονται με τους κανόνες για ένα καλά δομημένο [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), όπως ορίζεται από το W3C. Αυτό το επίπεδο ελέγχου εξασφαλίζει ότι η ροή που διαβάζεται ή γράφεται μπορεί να καταναλωθεί από οποιονδήποτε επεξεργαστή ως ένα [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## Δείτε επίσης

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
