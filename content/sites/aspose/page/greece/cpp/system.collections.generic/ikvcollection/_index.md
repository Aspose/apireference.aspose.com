---
title: "System::Collections::Generic::IKVCollection κλάση"
linktitle: "IKVCollection"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::IKVCollection κλάση. Διεπαφή υποδοχέα που περιέχει κλειδιά ή τιμές του υποδοχέα τύπου dictionary. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκύψουν σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2500
url: /el/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


Διεπαφή υποδοχέα που περιέχει κλειδιά ή τιμές του υποδοχέα τύπου dictionary. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκύψουν σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) τύπος. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const T\&) override | Προσθέτει στοιχείο στο container. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία από το container. |
| [Contains](./contains/)(const T\&) const override | Ελέγχει αν το στοιχείο υπάρχει στο δοχείο. |
| virtual [get_Count](./get_count/)() const | Λαμβάνει τον αριθμό των στοιχείων στο container. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Ελέγχει αν το container είναι μόνο για ανάγνωση. |
| virtual [GetEnumerator](./getenumerator/)() | Πληροφορίες RTTI. |
| virtual [idx_get](./idx_get/)(int) const | Συνάρτηση getter. |
| [idx_set](./idx_set/)(int, T) override | Συνάρτηση setter. |
| [IndexOf](./indexof/)(const T\&) const override | Λαμβάνει το δείκτη του στοιχείου στο container. |
| [Insert](./insert/)(int, const T\&) override | Εισάγει το αντικείμενο στην καθορισμένη θέση. |
| [Remove](./remove/)(const T\&) override | Αφαιρεί το στοιχείο από το container. |
| [RemoveAt](./removeat/)(int) override | Αφαιρεί το στοιχείο στη συγκεκριμένη θέση. |

## Δείτε επίσης

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
