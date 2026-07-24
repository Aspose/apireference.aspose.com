---
title: "System::Array::Exists μέθοδος"
linktitle: "Exists"
second_title: "Aspose.Page για C++"
description: "System::Array::Exists μέθοδος. Καθορίζει εάν το καθορισμένο αντικείμενο Array περιέχει ένα στοιχείο που ικανοποιεί τις απαιτήσεις του καθορισμένου προδιαγραφέα σε C++."
type: docs
weight: 5000
url: /el/cpp/system/array/exists/
---
## Array::Exists method


Καθορίζει εάν το καθορισμένο αντικείμενο [Array](../) περιέχει ένα στοιχείο που ικανοποιεί τις απαιτήσεις του καθορισμένου προδιαγραφέα.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Ο πίνακας στο οποίο θα αναζητηθεί το στοιχείο |
| ταίριασμα | std::function\<bool(T)> | Αντικείμενο συνάρτησης που ορίζει απαιτήσεις και ελέγχει εάν ένα στοιχείο τις ικανοποιεί |

### ReturnValue

Αληθές εάν το **arr** περιέχει ένα στοιχείο που ικανοποιεί τις απαιτήσεις που ορίζονται από το **match**

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
