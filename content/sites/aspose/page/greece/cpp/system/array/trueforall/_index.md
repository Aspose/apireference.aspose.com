---
title: "System::Array::TrueForAll μέθοδος"
linktitle: "TrueForAll"
second_title: "Aspose.Page για C++"
description: "System::Array::TrueForAll μέθοδος. Καθορίζει αν όλα τα στοιχεία στον καθορισμένο πίνακα ικανοποιούν τις προϋποθέσεις που ορίζονται από το καθορισμένο predicate σε C++."
type: docs
weight: 5900
url: /el/cpp/system/array/trueforall/
---
## Array::TrueForAll method


Καθορίζει εάν όλα τα στοιχεία στον καθορισμένο πίνακα ικανοποιούν τις συνθήκες που ορίζονται από το καθορισμένο κατηγόρημα.

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Στοιχεία του [Array](../) που πρέπει να ταιριάζουν με τις προϋποθέσεις |
| ταίριασμα | System::Predicate\<T\> | Μια προδιαγραφή που ορίζει τις συνθήκες για την αντιστοίχιση στοιχείων του πίνακα |

### ReturnValue

αληθές εάν όλα τα στοιχεία του πίνακα arr ικανοποιούν τις προϋποθέσεις που ορίζονται από το predicate match, διαφορετικά ψευδές

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
