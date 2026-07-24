---
title: "System::Xml::Schema::XmlSchemaChoice class"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaChoice class. Αναπαριστά το στοιχείο choice (συνθέτης) από το XML Schema όπως ορίζεται από το Παγκόσμιο Ιστό Συμβούλιο (W3C). Το choice επιτρέπει μόνο ένα από τα παιδιά του να εμφανιστεί σε μια παρουσία σε C++."
type: docs
weight: 1400
url: /el/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


Αναπαριστά το **choice** στοιχείο (συνθέτης) από το XML [Schema](../) όπως ορίζεται από το Παγκόσμιο [Web](../../system.web/) Συμβούλιο (W3C). Το **choice** επιτρέπει μόνο ένα από τα παιδιά του να εμφανιστεί σε μια παρουσία.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Items](./get_items/)() override | Επιστρέφει τη συλλογή των στοιχείων που περιέχονται με τον συνθέτη (**choice**): [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), ή [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaChoice](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
