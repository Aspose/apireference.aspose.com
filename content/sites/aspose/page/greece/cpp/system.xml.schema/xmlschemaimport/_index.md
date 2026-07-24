---
title: "Κλάση System::Xml::Schema::XmlSchemaImport"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::Schema::XmlSchemaImport. Αντιπροσωπεύει το στοιχείο import από το XML Schema όπως ορίζεται από το Παγκόσμιο Συμβούλιο Ιστού (W3C). Αυτή η κλάση χρησιμοποιείται για την εισαγωγή στοιχείων σχήματος από άλλα σχήματα σε C++."
type: docs
weight: 3500
url: /el/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


Αντιπροσωπεύει το στοιχείο **import** από το XML [Schema](../) όπως ορίζεται από το Παγκόσμιο [Web](../../system.web/) Consortium (W3C). Αυτή η κλάση χρησιμοποιείται για την εισαγωγή στοιχείων σχήματος από άλλα σχήματα.

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Επιστρέφει την τιμή **annotation**. |
| [get_Namespace](./get_namespace/)() | Επιστρέφει το χώρο ονομάτων-στόχο για το εισαγόμενο σχήμα ως αναφορά Uniform Resource Identifier (URI). |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Ορίζει την τιμή **annotation**. |
| [set_Namespace](./set_namespace/)(const String\&) | Ορίζει το χώρο ονομάτων-στόχο για το εισαγόμενο σχήμα ως αναφορά Uniform Resource Identifier (URI). |
| [XmlSchemaImport](./xmlschemaimport/)() | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [XmlSchemaImport](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
