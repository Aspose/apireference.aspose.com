---
title: "System::Threading::Tasks::ResultValueTask::AsTask metod"
linktitle: "AsTask"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask metod. Konverterar detta ResultValueTask till en delad pekare till ResultTask<T> i C++."
type: docs
weight: 200
url: /sv/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


Konverterar detta [ResultValueTask](../) till en delad pekare till [ResultTask<T>](../../resulttask/).

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## Anmärkningar



Om [ResultValueTask](../) innehåller ett direkt resultat, skapar den en slutförd uppgift med det resultatet. Om den innehåller en uppgift, returnerar den en delad pekare till den uppgiften.

## Se även

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
