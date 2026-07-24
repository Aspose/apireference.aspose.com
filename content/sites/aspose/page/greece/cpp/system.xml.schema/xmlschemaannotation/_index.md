---
title: "Κλάση System::Xml::Schema::XmlSchemaAnnotation"
linktitle: "XmlSchemaAnnotation"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::Schema::XmlSchemaAnnotation. Αντιπροσωπεύει το στοιχείο **annotation** του World Wide Web Consortium (W3C) σε C++."
type: docs
weight: 700
url: /el/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


Αντιπροσωπεύει το στοιχείο **annotation** του World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Id](./get_id/)() | Επιστρέφει το αναγνωριστικό συμβολοσειράς. |
| [get_Items](./get_items/)() | Επιστρέφει τη συλλογή **Items** που χρησιμοποιείται για την αποθήκευση των θυγατρικών στοιχείων **appinfo** και **documentation**. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Επιστρέφει τα πλήρη χαρακτηριστικά που δεν ανήκουν στον προορισμένο χώρο ονομάτων του σχήματος. |
| [set_Id](./set_id/)(const String\&) | Ορίζει το αναγνωριστικό συμβολοσειράς. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Ορίζει τα πλήρη χαρακτηριστικά που δεν ανήκουν στον προορισμένο χώρο ονομάτων του σχήματος. |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlSchemaAnnotation](./). |
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
