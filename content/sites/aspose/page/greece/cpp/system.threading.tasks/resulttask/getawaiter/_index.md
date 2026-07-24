---
title: "System::Threading::Tasks::ResultTask::GetAwaiter μέθοδος"
linktitle: "GetAwaiter"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::ResultTask::GetAwaiter μέθοδος. Λαμβάνει έναν awaiter για αυτήν την εργασία αποτελέσματος για χρήση με Await σε C++."
type: docs
weight: 500
url: /el/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


Αποκτά έναν awaiter για αυτό το task αποτελέσματος για χρήση με Await.

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## Παρατηρήσεις



Όταν περιμένει, η coroutine θα συνεχίσει με τη διαθέσιμη τιμή αποτελέσματος

## Δείτε επίσης

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
