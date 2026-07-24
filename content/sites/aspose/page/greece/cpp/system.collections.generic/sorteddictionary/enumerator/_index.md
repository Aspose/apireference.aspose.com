---
title: "System::Collections::Generic::SortedDictionary::Enumerator κλάση"
linktitle: "Απαριθμητής"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::SortedDictionary::Enumerator κλάση. Τύπος επαναλήπτη για την επανάληψη μέσω του λεξικού. Αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2100
url: /el/cpp/system.collections.generic/sorteddictionary/enumerator/
---
## Enumerator class


[Enumerator](./) type to iterate through dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Δημιουργεί επαναλήπτη πάνω σε συγκεκριμένο λεξικό. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) ψευδώνυμο τύπου. |
## Δείτε επίσης

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
