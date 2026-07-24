---
title: "System::Xml::Schema::XmlSchemaComplexContent κλάση"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaComplexContent κλάση. Αντιπροσωπεύει το στοιχείο complexContent από το XML Schema όπως ορίζεται από το World Wide Web Consortium (W3C). Αυτή η κλάση αντιπροσωπεύει το μοντέλο σύνθετου περιεχομένου για σύνθετους τύπους. Περιέχει επεκτάσεις ή περιορισμούς σε έναν σύνθετο τύπο που έχει είτε μόνο στοιχεία είτε μικτό περιεχόμενο στη C++."
type: docs
weight: 1800
url: /el/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


Αντιπροσωπεύει το στοιχείο **complexContent** από το XML [Schema](../) όπως ορίζεται από το World Wide [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση αντιπροσωπεύει το μοντέλο σύνθετου περιεχομένου για σύνθετους τύπους. Περιέχει επεκτάσεις ή περιορισμούς σε έναν σύνθετο τύπο που έχει είτε μόνο στοιχεία είτε μικτό περιεχόμενο.

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Content](./get_content/)() override | Επιστρέφει το περιεχόμενο. |
| [get_IsMixed](./get_ismixed/)() | Επιστρέφει πληροφορίες που καθορίζουν αν ο τύπος έχει μοντέλο μικτού περιεχομένου. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Ορίζει το περιεχόμενο. |
| [set_IsMixed](./set_ismixed/)(bool) | Ορίζει πληροφορίες που καθορίζουν αν ο τύπος έχει μοντέλο μικτού περιεχομένου. |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlSchemaComplexContent](./) class. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
