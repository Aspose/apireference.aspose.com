---
title: "System::Threading::Tasks::ResultValueTask::get_Result μέθοδος"
linktitle: "get_Result"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::ResultValueTask::get_Result μέθοδος. Λαμβάνει το αποτέλεσμα της ολοκληρωμένης εργασίας σε C++."
type: docs
weight: 900
url: /el/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


Αποκτά το αποτέλεσμα της ολοκληρωμένης εργασίας.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T Η τιμή του αποτελέσματος.
## Παρατηρήσεις



Εάν η εργασία υποστηρίζεται από ένα [ResultTask<T>](../../resulttask/), αυτή η μέθοδος θα περιμένει το αποτέλεσμα και θα το αποθηκεύσει στην κρυφή μνήμη. Μετέπειτα κλήσεις θα επιστρέφουν την αποθηκευμένη τιμή χωρίς να περιμένουν.

## Δείτε επίσης

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
