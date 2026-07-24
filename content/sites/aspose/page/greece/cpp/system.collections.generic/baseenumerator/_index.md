---
title: "System::Collections::Generic::BaseEnumerator κλάση"
linktitle: "BaseEnumerator"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::BaseEnumerator κλάση. Ορισμός Enumerator για να τυλίγει τύπους τύπου STL για χρήση τύπου C#. Δεν κάνει καμία υπόθεση για τη δομή του container εκτός από την ύπαρξη διαδοχικού iterator. Χρησιμοποιεί τις συναρτήσεις begin() και end(). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα υποβολής. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| Parameter | Περιγραφή |
| --- | --- |
| Κοντέινερ | Τύπος container τύπου STL. |
| Element | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | Αρχικοποιεί τον iterator. |
| [IsValid](./isvalid/)() const | Ελέγχει εάν κλήθηκε το [MoveNext()](./movenext/) και δεν έχει φτάσει το τέλος. |
| [MoveNext](./movenext/)() override | Αύξηση σε στυλ enumerator. |
| [Reset](./reset/)() override | Επαναφέρει τον enumerator για να επιτρέψει την επανεξέταση των στοιχείων. |

## Δείτε επίσης

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
