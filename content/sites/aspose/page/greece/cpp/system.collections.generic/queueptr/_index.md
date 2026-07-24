---
title: "System::Collections::Generic::QueuePtr κλάση"
linktitle: "QueuePtr"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::QueuePtr κλάση. Δείκτης ουράς. Αυτός ο τύπος είναι δείκτης για τη διαχείριση της διαγραφής άλλων αντικειμένων''. Πρέπει να κατανεμηθεί στη στοίβα και να μεταβιβαστεί σε συναρτήσεις είτε ως τιμή είτε ως σταθερή αναφορά σε C++."
type: docs
weight: 3700
url: /el/cpp/system.collections.generic/queueptr/
---
## QueuePtr class


[Queue](../queue/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class QueuePtr : public System::SmartPtr<Queue<T>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [QueuePtr](./queueptr/)() | Δημιουργεί δείκτη null. |
| [QueuePtr](./queueptr/)(const SharedPtr\<Queue\<T\>\>\&) | Δημιουργεί δείκτη σε συγκεκριμένη ουρά. |

## Δείτε επίσης

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
