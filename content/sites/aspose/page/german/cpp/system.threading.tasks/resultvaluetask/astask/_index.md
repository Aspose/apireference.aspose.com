---
title: "System::Threading::Tasks::ResultValueTask::AsTask Methode"
linktitle: "AsTask"
second_title: "Aspose.Page für C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask Methode. Konvertiert dieses ResultValueTask in einen gemeinsamen Zeiger zu ResultTask<T> in C++."
type: docs
weight: 200
url: /de/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


Konvertiert dieses [ResultValueTask](../) in einen gemeinsamen Zeiger zu [ResultTask<T>](../../resulttask/).

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## Hinweise



Wenn das [ResultValueTask](../) ein direktes Ergebnis enthält, erstellt es eine abgeschlossene Aufgabe mit diesem Ergebnis. Wenn es eine Aufgabe enthält, gibt es einen gemeinsamen Zeiger zu dieser Aufgabe zurück.

## Siehe auch

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
