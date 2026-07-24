---
title: "Κλάση System::Xml::NameTable"
linktitle: "NameTable"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Xml::NameTable. Υλοποιεί έναν μονονηματικό XmlNameTable σε C++."
type: docs
weight: 500
url: /el/cpp/system.xml/nametable/
---
## NameTable class


Υλοποιεί έναν μονονηματικό [XmlNameTable](../xmlnametable/).

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const String\&) override | Ατομικοποιεί τη συγκεκριμένη συμβολοσειρά και την προσθέτει στο [NameTable](./). |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Ατομικοποιεί τη συγκεκριμένη συμβολοσειρά και την προσθέτει στο [NameTable](./). |
| [Get](./get/)(const String\&) override | Επιστρέφει τη ατομικοποιημένη συμβολοσειρά με την καθορισμένη τιμή. |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Επιστρέφει τη ατομική συμβολοσειρά που περιέχει τους ίδιους χαρακτήρες όπως το καθορισμένο εύρος χαρακτήρων στον δεδομένο πίνακα. |
| [NameTable](./nametable/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [NameTable](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
