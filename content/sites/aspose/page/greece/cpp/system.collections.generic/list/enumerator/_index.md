---
title: "System::Collections::Generic::List::Enumerator κλάση"
linktitle: "Απαριθμητής"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::List::Enumerator κλάση. Απαριθμητής για επανάληψη μέσω των στοιχείων της λίστας. Αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 6100
url: /el/cpp/system.collections.generic/list/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through list elements. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<vector_t>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | Δημιουργεί απαριθμητή που επαναλαμβάνει μέσω συγκεκριμένης λίστας. |
## Δείτε επίσης

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
