---
title: "System::Xml::Schema::XmlSchemaNotation κλάση"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaNotation κλάση. Αντιπροσωπεύει το στοιχείο notation από το XML Schema όπως ορίζεται από το World Wide Web Consortium (W3C). Μια δήλωση notation του XML Schema είναι μια ανακατασκευή των δηλώσεων NOTATION του XML 1.0. Ο σκοπός των notations είναι να περιγράφει τη μορφή των μη-XML δεδομένων μέσα σε ένα έγγραφο XML σε C++."
type: docs
weight: 4800
url: /el/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


Αντιπροσωπεύει το στοιχείο **notation** από το XML [Schema](../) όπως ορίζεται από το World Wide [Web](../../system.web/) Consortium (WCC). Μια δήλωση **notation** του XML [Schema](../) είναι μια ανακατασκευή των δηλώσεων **XML** 1.0 NOTATION. Ο σκοπός των notations είναι να περιγράφει τη μορφή των μη-XML δεδομένων μέσα σε ένα έγγραφο XML.

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Name](./get_name/)() | Επιστρέφει το όνομα του notation. |
| [get_Public](./get_public/)() | Επιστρέφει το αναγνωριστικό **public**. |
| [get_System](./get_system/)() | Επιστρέφει το αναγνωριστικό **system**. |
| [set_Name](./set_name/)(const String\&) | Ορίζει το όνομα του notation. |
| [set_Public](./set_public/)(const String\&) | Ορίζει το αναγνωριστικό **public**. |
| [set_System](./set_system/)(const String\&) | Ορίζει το αναγνωριστικό **system**. |
| [XmlSchemaNotation](./xmlschemanotation/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaNotation](./). |
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
