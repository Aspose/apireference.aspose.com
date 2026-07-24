---
title: "System::Xml::Schema::XmlSchemaGroup κλάση"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaGroup κλάση. Αντιπροσωπεύει το στοιχείο group από το XML Schema όπως καθορίζεται από το Παγκόσμιο Συμβούλιο Ιστού (W3C). Αυτή η κλάση ορίζει ομάδες σε επίπεδο σχήματος που αναφέρονται από τους σύνθετους τύπους. Ομαδοποιεί ένα σύνολο δηλώσεων στοιχείων ώστε να μπορούν να ενσωματωθούν ως ομάδα σε ορισμούς σύνθετων τύπων σε C++."
type: docs
weight: 3100
url: /el/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


Αντιπροσωπεύει το στοιχείο **group** από το XML [Schema](../) όπως καθορίζεται από το Παγκόσμιο [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση ορίζει ομάδες σε επίπεδο **schema** που αναφέρονται από τους σύνθετους τύπους. Ομαδοποιεί ένα σύνολο δηλώσεων στοιχείων ώστε να μπορούν να ενσωματωθούν ως ομάδα σε ορισμούς σύνθετων τύπων.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Name](./get_name/)() | Επιστρέφει το όνομα της ομάδας σχήματος. |
| [get_Particle](./get_particle/)() | Επιστρέφει μία από τις κλάσεις [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), ή [XmlSchemaSequence](../xmlschemasequence/). |
| [get_QualifiedName](./get_qualifiedname/)() | Επιστρέφει το πλήρες όνομα της ομάδας σχήματος. |
| [set_Name](./set_name/)(const String\&) | Ορίζει το όνομα της ομάδας σχήματος. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | Ορίζει μία από τις κlasses [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), ή [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaGroup](./xmlschemagroup/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaGroup](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
