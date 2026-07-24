---
title: "System::Xml::Schema::XmlSchemaKeyref class"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaKeyref κλάση. Αυτή η κλάση αντιπροσωπεύει το στοιχείο keyref από το XMLSchema όπως καθορίζεται από το Παγκόσμιο Συμβούλιο Ιστού (W3C) σε C++."
type: docs
weight: 4000
url: /el/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


Αυτή η κλάση αντιπροσωπεύει το **keyref** στοιχείο από το XMLSchema όπως καθορίζεται από το Παγκόσμιο [Web](../../system.web/) Συμβούλιο (W3C).

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Refer](./get_refer/)() | Επιστρέφει το όνομα του κλειδιού που αυτή η περιοριστική συνθήκη αναφέρεται σε έναν άλλο απλό ή σύνθετο τύπο. |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | Ορίζει το όνομα του κλειδιού που αυτή η περιοριστική συνθήκη αναφέρεται σε έναν άλλο απλό ή σύνθετο τύπο. |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlSchemaKeyref](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
