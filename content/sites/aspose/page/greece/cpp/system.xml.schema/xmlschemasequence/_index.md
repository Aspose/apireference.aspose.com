---
title: "System::Xml::Schema::XmlSchemaSequence κλάση"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaSequence κλάση. Αντιπροσωπεύει το στοιχείο ακολουθίας (συνθέτης) από το XML Schema όπως ορίζεται από το World Wide Web Consortium (W3C). Η ακολουθία απαιτεί τα στοιχεία στην ομάδα να εμφανίζονται στη καθορισμένη σειρά μέσα στο περιέχον στοιχείο σε C++."
type: docs
weight: 5700
url: /el/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


Αντιπροσωπεύει το στοιχείο **sequence** (συνθέτης) από το XML [Schema](../) όπως ορίζεται από το World Wide [Web](../../system.web/) Consortium (W3C). Το **sequence** απαιτεί τα στοιχεία στην ομάδα να εμφανίζονται στη καθορισμένη σειρά μέσα στο περιέχον στοιχείο.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Items](./get_items/)() override | Τα στοιχεία που περιέχονται μέσα στον συνθέτη. Συλλογή των [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaSequence](./) ή [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaSequence](./xmlschemasequence/)() | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlSchemaSequence](./). |
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
