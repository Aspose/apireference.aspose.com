---
title: "System::Collections::Generic::DefaultComparer κλάση"
linktitle: "DefaultComparer"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::DefaultComparer κλάση. Προεπιλεγμένη κλάση συγκριτή. Χρησιμοποιεί τον τελεστή < και τον τελεστή == για τη σύγκριση τιμών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


Προεπιλεγμένη κλάση συγκριτή. Χρησιμοποιεί τον τελεστή < και τον τελεστή == για τη σύγκριση τιμών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος που συγκρίνεται. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | Πληροφορίες RTTI. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [BaseType](./basetype/) | Υλοποιημένο interface. |
| [ThisType](./thistype/) | Τρέχων τύπος. |

## Δείτε επίσης

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
