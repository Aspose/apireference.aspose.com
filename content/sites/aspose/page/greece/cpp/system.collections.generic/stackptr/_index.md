---
title: "System::Collections::Generic::StackPtr κλάση"
linktitle: "StackPtr"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::StackPtr κλάση. Δείκτης στοίβας. Αυτός ο τύπος είναι ένας δείκτης για τη διαχείριση της διαγραφής άλλων object''s. Πρέπει να εκχωρείται στη στοίβα και να περνιέται σε συναρτήσεις είτε με τιμή είτε με const αναφορά σε C++."
type: docs
weight: 4700
url: /el/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [StackPtr](./stackptr/)() | Δημιουργεί δείκτη null. |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | Δημιουργεί δείκτη που αναφέρεται σε συγκεκριμένη στοίβα. |

## Δείτε επίσης

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
