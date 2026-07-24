---
title: "System::Collections::Generic::ListPtr κλάση"
linktitle: "ListPtr"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::ListPtr κλάση. Δείκτης λίστας με τελεστές πρόσβασης. Αυτός ο τύπος είναι ένας δείκτης για τη διαχείριση της διαγραφής άλλων object''s. Πρέπει να εκχωρείται στη στοίβα και να περνιέται σε συναρτήσεις είτε με τιμή είτε με const αναφορά σε C++."
type: docs
weight: 3500
url: /el/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<List<T>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | Αρχικοποιεί δείκτη null. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | Αρχικοποιεί δείκτη σε καθορισμένη λίστα. |
| [operator==](./operator==/)(std::nullptr_t) const | Ελέγχει αν ο δείκτης [List](../list/) είναι null. |
| [operator[]](./operator[]/)(int) | Πρόσβαση. |
| [operator[]](./operator[]/)(int) const | Πρόσβαση. |
## Δείτε επίσης

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
