---
title: "System::Collections::Generic::IList κλάση"
linktitle: "IList"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::IList κλάση. Διεπαφή ενός ευρετηριασμένου δοχείου στοιχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assertion. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2600
url: /el/cpp/system.collections.generic/ilist/
---
## IList class


Διεπαφή ενός ευρετηριασμένου δοχείου στοιχείων. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assertion. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | Ελέγχει αν η συλλογή είναι σταθερού μεγέθους. |
| virtual [idx_get](./idx_get/)(int) const | Λαμβάνει το στοιχείο στο καθορισμένο δείκτη. |
| virtual [idx_set](./idx_set/)(int, T) | Ορίζει το στοιχείο στο καθορισμένο δείκτη. |
| virtual [IndexOf](./indexof/)(const T\&) const | Λαμβάνει το δείκτη της πρώτης εμφάνισης του στοιχείου στο δοχείο. |
| virtual [Insert](./insert/)(int, const T\&) | Εισάγει στοιχείο στη συγκεκριμένη θέση, μετακινώντας τα άλλα στοιχεία. |
| virtual [RemoveAt](./removeat/)(int) | Αφαιρεί το στοιχείο στο καθορισμένο δείκτη. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) | Πληροφορίες RTTI. |
| [ThisType](./thistype/) | Αυτός ο τύπος. |
| [ValueType](./valuetype/) | Τύπος τιμής. |

## Δείτε επίσης

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
