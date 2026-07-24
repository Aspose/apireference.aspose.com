---
title: "System::Drawing::Text::PrivateFontCollection κλάση"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Text::PrivateFontCollection κλάση. Αντιπροσωπεύει μια συλλογή από οικογένειες γραμματοσειρών που παρέχονται από την εφαρμογή-πελάτη. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


Αντιπροσωπεύει μια συλλογή από οικογένειες γραμματοσειρών που παρέχονται από την εφαρμογή-πελάτη. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | Προσθέτει τη συγκεκριμένη γραμματοσειρά στη συλλογή. |
| [AddFontFile](./addfontfile/)(const String\&) | Προσθέτει μια γραμματοσειρά από το καθορισμένο αρχείο στη συλλογή. |
| [get_Families](./get_families/)() override | Επιστρέφει έναν πίνακα από αντικείμενα [FontFamily](../../system.drawing/fontfamily/) που σχετίζονται με τη συλλογή γραμματοσειρών που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
## Δείτε επίσης

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
