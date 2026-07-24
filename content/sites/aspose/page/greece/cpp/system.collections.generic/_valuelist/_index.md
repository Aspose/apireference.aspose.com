---
title: "System::Collections::Generic::_ValueList κλάση"
linktitle: "_ValueList"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::_ValueList κλάση. Υλοποιεί λίστα τιμών λεξικού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


Υλοποιεί λίστα τιμών λεξικού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| Parameter | Περιγραφή |
| --- | --- |
| Dict | [Dictionary](../dictionary/) τύπος. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | Αρχικοποιεί τη συλλογή που αναφέρεται στο συγκεκριμένο λεξικό. |
| virtual [idx_get](./idx_get/)(int) const | Λαμβάνει την τιμή στη συγκεκριμένη θέση. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [TValue](./tvalue/) | Τύπος τιμής. |

## Δείτε επίσης

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
