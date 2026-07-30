---
title: "System::Threading::Tasks::ResultValueTask::AsTask Methode"
linktitle: "AsTask"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask Methode. Konvertiert dieses ResultValueTask in einen Shared Pointer zu ResultTask<T> in C++."
type: docs
weight: 200
url: /de/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


Konvertiert dieses [ResultValueTask](../) in einen Shared Pointer zu [ResultTask<T>](../../resulttask/).

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## Hinweise



Wenn das [ResultValueTask](../) einen direkten Ergebniswert enthält, wird eine abgeschlossene Aufgabe mit diesem Ergebnis erstellt. Wenn es eine Aufgabe enthält, wird ein Shared Pointer zu dieser Aufgabe zurückgegeben.

## Siehe auch

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
