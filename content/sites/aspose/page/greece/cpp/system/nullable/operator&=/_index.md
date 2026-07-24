---
title: "System::Nullable::operator&= μέθοδος"
linktitle: "operator&="
second_title: "Aspose.Page για C++"
description: "System::Nullable::operator&= μέθοδος. Εφαρμόζει το operator&=() στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας την καθορισμένη τιμή ως δεξιό όρισμα σε C++."
type: docs
weight: 1100
url: /el/cpp/system/nullable/operator&=/
---
## Nullable::operator&= method


Εφαρμόζει το [operator&=()](./) στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας την καθορισμένη τιμή ως δεξιό όρισμα.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator&=(bool other)
```


| Parameter | Περιγραφή |
| --- | --- |
| T1 | Η παράμετρος προτύπου για να λειτουργήσει το SFINAE. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| other | bool | Μια λογική τιμή που χρησιμοποιείται ως δεξιά τιμή του [operator&=()](./) που εφαρμόζεται στην τιμή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |

### ReturnValue

Μια αναφορά στον εαυτό.

## Δείτε επίσης

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
