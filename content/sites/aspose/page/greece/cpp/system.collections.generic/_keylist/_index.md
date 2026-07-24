---
title: "System::Collections::Generic::_KeyList κλάση"
linktitle: "_KeyList"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::_KeyList κλάση. Υλοποιεί λίστα κλειδιών λεξικού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.collections.generic/_keylist/
---
## _KeyList class


Υλοποιεί λίστα κλειδιών λεξικού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| Parameter | Περιγραφή |
| --- | --- |
| Dict | [Dictionary](../dictionary/) τύπος. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | Αρχικοποιεί τη συλλογή που αναφέρεται στο συγκεκριμένο λεξικό. |
| [Contains](./contains/)(const TKey\&) const override | Ελέγχει αν το συγκεκριμένο κλειδί υπάρχει στη συλλογή. |
| [idx_get](./idx_get/)(int) const override | Λαμβάνει το κλειδί στη συγκεκριμένη θέση. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [TKey](./tkey/) | Τύπος κλειδιού. |

## Δείτε επίσης

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
