---
title: "System::Threading::Tasks::ResultValueTask::AsTask μέθοδος"
linktitle: "AsTask"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask μέθοδος. Μετατρέπει αυτό το ResultValueTask σε έναν κοινό δείκτη προς ResultTask<T> σε C++."
type: docs
weight: 200
url: /el/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


Μετατρέπει αυτό το [ResultValueTask](../) σε έναν κοινό δείκτη προς [ResultTask<T>](../../resulttask/).

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## Παρατηρήσεις



Εάν το [ResultValueTask](../) περιέχει άμεσο αποτέλεσμα, δημιουργεί μια ολοκληρωμένη εργασία με αυτό το αποτέλεσμα. Εάν περιέχει εργασία, επιστρέφει έναν κοινό δείκτη προς αυτήν την εργασία.

## Δείτε επίσης

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
