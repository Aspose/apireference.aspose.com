---
title: "System::Xml::Serialization::IXmlSerializable κλάση"
linktitle: "IXmlSerializable"
second_title: "Aspose.Page για C++"
description: "System::Xml::Serialization::IXmlSerializable κλάση. Παρέχει προσαρμοσμένη μορφοποίηση για τη σειριοποίηση και αποσειριοποίηση XML. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε στις συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


Παρέχει προσαρμοσμένη μορφοποίηση για τη σειριοποίηση και αποσειριοποίηση XML. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε στις συναρτήσεις ως όρισμα.

```cpp
class IXmlSerializable : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [GetSchema](./getschema/)() | Ένα αντικείμενο XmlSchema που περιγράφει την XML αναπαράσταση του αντικειμένου που επιστρέφεται από τη μέθοδο [WriteXml()](./writexml/) και γίνεται αποδεκτό από τη μέθοδο [ReadXml()](./readxml/). |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | Αποσειριοποιεί το αντικείμενο από την XML αναπαράστασή του. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | Σειριοποιεί το τρέχον αντικείμενο σε XML αναπαράσταση. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
