---
title: "System::Threading::Tasks::ResultValueTask::AsTask methode"
linktitle: "AsTask"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask methode. Converteert deze ResultValueTask naar een gedeelde pointer naar ResultTask<T> in C++."
type: docs
weight: 200
url: /nl/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


Converteert deze [ResultValueTask](../) naar een gedeelde pointer naar [ResultTask<T>](../../resulttask/).

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## Opmerkingen



Als de [ResultValueTask](../) een direct resultaat bevat, maakt een voltooide taak met dat resultaat. Als het een taak bevat, retourneert een gedeelde pointer naar die taak.

## Zie ook

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
