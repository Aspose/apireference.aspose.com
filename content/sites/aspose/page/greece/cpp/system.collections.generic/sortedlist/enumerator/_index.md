---
title: "System::Collections::Generic::SortedList::Enumerator κλάση"
linktitle: "Απαριθμητής"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::SortedList::Enumerator κλάση. Κλάση Enumerator για επανάληψη μέσω λίστας. Αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2600
url: /el/cpp/system.collections.generic/sortedlist/enumerator/
---
## Enumerator class


[Enumerator](./) class to iterate through list. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Δημιουργεί enumerator που επαναλαμβάνει μέσω συγκεκριμένου λεξικού. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) ψευδώνυμο τύπου. |
## Δείτε επίσης

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
