---
title: "System::Xml::Schema::XmlSchemaAnnotated class"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaAnnotated class. Η βασική κλάση για οποιοδήποτε στοιχείο που μπορεί να περιέχει στοιχεία annotation στη C++."
type: docs
weight: 600
url: /el/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


Η βασική κλάση για οποιοδήποτε στοιχείο που μπορεί να περιέχει στοιχεία σχολιασμού.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Επιστρέφει την ιδιότητα **annotation**. |
| [get_Id](./get_id/)() | Επιστρέφει το αναγνωριστικό συμβολοσειράς. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Επιστρέφει τα πλήρως προσδιορισμένα χαρακτηριστικά που δεν ανήκουν στον τρέχοντα χώρο ονομάτων-στόχο του σχήματος. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Ορίζει την ιδιότητα **annotation**. |
| [set_Id](./set_id/)(const String\&) | Ορίζει το αναγνωριστικό συμβολοσειράς. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Ορίζει τα πλήρως προσδιορισμένα χαρακτηριστικά που δεν ανήκουν στον τρέχοντα χώρο ονομάτων-στόχο του σχήματος. |
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
