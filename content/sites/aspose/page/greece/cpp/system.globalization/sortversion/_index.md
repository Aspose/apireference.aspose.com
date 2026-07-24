---
title: "System::Globalization::SortVersion class"
linktitle: "SortVersion"
second_title: "Aspose.Page για C++"
description: "System::Globalization::SortVersion class. Παρέχει πληροφορίες σχετικά με την έκδοση Unicode που χρησιμοποιείται για τη σύγκριση και την ταξινόμηση συμβολοσειρών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2300
url: /el/cpp/system.globalization/sortversion/
---
## SortVersion class


Παρέχει πληροφορίες σχετικά με την έκδοση Unicode που χρησιμοποιείται για τη σύγκριση και την ταξινόμηση συμβολοσειρών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | Ελέγχει αν η τρέχουσα [SortVersion](./) αντίγραφο είναι ίση με ένα καθορισμένο [SortVersion](./) αντικείμενο. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Ελέγχει αν η τρέχουσα [SortVersion](./) αντίγραφο είναι ίση με ένα καθορισμένο [SortVersion](./) αντικείμενο. |
| [get_FullVersion](./get_fullversion/)() | Λαμβάνει τον πλήρη αριθμό έκδοσης. |
| [get_SortId](./get_sortid/)() | Λαμβάνει το μοναδικό αναγνωριστικό για αυτό το αντικείμενο. |
| [GetHashCode](./gethashcode/)() const override | Λαμβάνει τον κώδικα κατακερματισμού για το τρέχον αντικείμενο. |
| [operator!=](./operator!=/)(const SortVersion\&) | Ελέγχει αν η τρέχουσα παρουσία του [SortVersion](./) δεν είναι ίση με ένα καθορισμένο αντικείμενο [SortVersion](./). |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | Ελέγχει αν η τρέχουσα [SortVersion](./) αντίγραφο είναι ίση με ένα καθορισμένο [SortVersion](./) αντικείμενο. |
| [SortVersion](./sortversion/)(int, const Guid\&) | Πληροφορίες RTTI. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## Δείτε επίσης

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
