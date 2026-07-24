---
title: "System::Collections::Generic::ReverseEnumerator κλάση"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::ReverseEnumerator κλάση. Enumerator που επαναλαμβάνει ανάποδα μέσω του container. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() . Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3800
url: /el/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| Parameter | Περιγραφή |
| --- | --- |
| Κοντέινερ | Κοντέινερ για επανάληψη. |
| Element | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Current](./get_current/)() const override | Λαμβάνει το στοιχείο 'current'. |
| [IsValid](./isvalid/)() const | Ελέγχει εάν κλήθηκε το [MoveNext()](./movenext/) και δεν έχει φτάσει το τέλος. |
| [MoveNext](./movenext/)() override | Αύξηση σε στυλ enumerator. |
| [Reset](./reset/)() override | Επαναφέρει τον enumerator για να επιτρέψει την επανεξέταση των στοιχείων. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | Αρχικοποιεί τον iterator. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | Καταστροφέας. |

## Δείτε επίσης

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
