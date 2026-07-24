---
title: "System::Xml::Schema::XmlSchemaFacet κλάση"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Page για C++"
description: "System::Xml::Schema::XmlSchemaFacet κλάση. Μια βασική κλάση για όλες τις πλευρές που χρησιμοποιούνται όταν απλοί τύποι παράγονται με περιορισμό σε C++."
type: docs
weight: 2900
url: /el/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


Μια βασική κλάση για όλα τα χαρακτηριστικά που χρησιμοποιούνται όταν απλοί τύποι παράγονται με περιορισμό.

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | Επιστρέφει πληροφορίες που υποδεικνύουν ότι αυτή η πλευρά είναι σταθερή. |
| [get_Value](./get_value/)() | Επιστρέφει το χαρακτηριστικό **value** της πλευράς. |
| virtual [set_IsFixed](./set_isfixed/)(bool) | Ορίζει πληροφορίες που υποδεικνύουν ότι αυτή η πλευρά είναι σταθερή. |
| [set_Value](./set_value/)(const String\&) | Ορίζει το χαρακτηριστικό **value** της πλευράς. |
| [XmlSchemaFacet](./xmlschemafacet/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSchemaFacet](./) class. |
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
