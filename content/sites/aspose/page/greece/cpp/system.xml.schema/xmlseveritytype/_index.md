---
title: "System::Xml::Schema::XmlSeverityType enum"
linktitle: "XmlSeverityType"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSeverityType enum. Αντιπροσωπεύει τη σοβαρότητα του γεγονότος επικύρωσης σε C++."
type: docs
weight: 8100
url: /el/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


Αντιπροσωπεύει τη σοβαρότητα του γεγονότος επικύρωσης.

```cpp
enum class XmlSeverityType
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Error | 0 | Δείχνει ότι προέκυψε σφάλμα επικύρωσης κατά την επικύρωση του εγγράφου στιγμιότυπου. Αυτό ισχύει για ορισμούς τύπων εγγράφων (DTDs) και σχήματα XML [Schema](../) γλώσσας ορισμού (XSD). Οι περιορισμοί εγκυρότητας του World Wide [Web](../../system.web/) Consortium (W3C) θεωρούνται σφάλματα. Εάν δεν έχει δημιουργηθεί χειριστής γεγονότος επικύρωσης, τα σφάλματα προκαλούν εξαίρεση. |
| Warning | 1 | Δείχνει ότι συνέβη γεγονός επικύρωσης που δεν είναι σφάλμα. Συνήθως εκδίδεται μια προειδοποίηση όταν δεν υπάρχει DTD ή XML [Schema](../) για την επικύρωση ενός συγκεκριμένου στοιχείου ή χαρακτηριστικού. Σε αντίθεση με τα σφάλματα, οι προειδοποιήσεις δεν προκαλούν εξαίρεση εάν δεν υπάρχει χειριστής γεγονότος επικύρωσης. |

## Δείτε επίσης

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
