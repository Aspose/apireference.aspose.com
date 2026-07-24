---
title: "System::Threading::Tasks::ResultTask::ContinueWith μέθοδος"
linktitle: "ContinueWith"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith μέθοδος. Δημιουργεί μια συνέχιση που εκτελείται όταν ολοκληρωθεί η εργασία αποτελέσματος σε C++."
type: docs
weight: 300
url: /el/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


Δημιουργεί μια συνέχεια που εκτελείται όταν ολοκληρώνεται το task αποτελέσματος.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) για εκτέλεση όταν αυτή η εργασία ολοκληρωθεί, λαμβάνοντας αυτήν την εργασία αποτελέσματος |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Παρατηρήσεις



Η ενέργεια συνέχισης λαμβάνει αυτό το [ResultTask](../) για πρόσβαση στην τιμή του αποτελέσματος

## Δείτε επίσης

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
