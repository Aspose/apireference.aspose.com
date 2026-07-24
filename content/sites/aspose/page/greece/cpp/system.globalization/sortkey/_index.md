---
title: "System::Globalization::SortKey class"
linktitle: "SortKey"
second_title: "Aspose.Page για C++"
description: "System::Globalization::SortKey class. Αντιστοίχιση μιας συμβολοσειράς με το κλειδί ταξινόμησής της. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2200
url: /el/cpp/system.globalization/sortkey/
---
## SortKey class


Αντιστοίχιση μιας συμβολοσειράς με το κλειδί ταξινόμησής της. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class SortKey : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | Συγκρίνει δύο κλειδιά ταξινόμησης. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Ελέγχει αν το καθορισμένο αντικείμενο είναι ίσο με το τρέχον αντικείμενο [SortKey](./). |
| virtual [get_KeyData](./get_keydata/)() | Λαμβάνει τον πίνακα byte που αντιπροσωπεύει το τρέχον αντικείμενο. |
| virtual [get_OriginalString](./get_originalstring/)() | Λαμβάνει την αρχική συμβολοσειρά που χρησιμοποιήθηκε για τη δημιουργία αυτού του αντικειμένου. |
| [GetHashCode](./gethashcode/)() const override | Λαμβάνει τον κώδικα κατακερματισμού για το τρέχον αντικείμενο [SortKey](./). |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | Μετατρέπει το τρέχον αντικείμενο στην συμβολοσειρά του. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
