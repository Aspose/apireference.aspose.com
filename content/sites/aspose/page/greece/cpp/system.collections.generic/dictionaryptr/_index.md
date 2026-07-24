---
title: "System::Collections::Generic::DictionaryPtr κλάση"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::DictionaryPtr κλάση. Κλάση δείκτη λεξικού με υπερφορτωμένες λειτουργίες. Αυτός ο τύπος είναι δείκτης για τη διαχείριση της διαγραφής άλλων αντικειμένων''. Θα πρέπει να εκχωρείται στο στοίβα και να περνιέται σε συναρτήσεις είτε με τιμή είτε με σταθερή αναφορά σε C++."
type: docs
weight: 1300
url: /el/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος κλειδιού. |
| V | Τύπος τιμής. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Αρχικοποιεί δείκτη null. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Μετατρέπει τύπο δείκτη. |
| [operator[]](./operator[]/)(const X\&) const | Τελεστής πρόσβασης για εργασία με μετατροπή τύπου κλειδιού. |
| [operator[]](./operator[]/)(const T\&) const | Τελεστής πρόσβασης. |

## Δείτε επίσης

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
