---
title: "Κλάση System::Xml::Schema::XmlSchemaExternal"
linktitle: "XmlSchemaExternal"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::Schema::XmlSchemaExternal. Παρέχει πληροφορίες σχετικά με το περιλαμβανόμενο σχήμα σε C++."
type: docs
weight: 2800
url: /el/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


Παρέχει πληροφορίες σχετικά με το περιλαμβανόμενο σχήμα.

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Id](./get_id/)() | Επιστρέφει το αναγνωριστικό συμβολοσειράς. |
| [get_Schema](./get_schema/)() | Επιστρέφει το [XmlSchema](../xmlschema/) για το αναφερόμενο σχήμα. |
| [get_SchemaLocation](./get_schemalocation/)() | Επιστρέφει τη θέση Uniform Resource Identifier (URI) για το σχήμα, η οποία ενημερώνει τον επεξεργαστή σχήματος πού βρίσκεται φυσικά το σχήμα. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Επιστρέφει τα προσδιορισμένα χαρακτηριστικά, τα οποία δεν ανήκουν στο χώρο ονομάτων-στόχο του σχήματος. |
| [set_Id](./set_id/)(const String\&) | Ορίζει το αναγνωριστικό συμβολοσειράς. |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | Ορίζει το [XmlSchema](../xmlschema/) για το αναφερόμενο σχήμα. |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | Ορίζει τη θέση του Uniform Resource Identifier (URI) για το σχήμα, η οποία ενημερώνει τον επεξεργαστή σχήματος πού βρίσκεται φυσικά το σχήμα. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Ορίζει τα προσδιορισμένα attributes, που δεν ανήκουν στο namespace-στόχο του σχήματος. |
| [XmlSchemaExternal](./xmlschemaexternal/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaExternal](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
