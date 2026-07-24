---
title: "System::Threading::Tasks::ResultValueTask::get_Result methode"
linktitle: "get_Result"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ResultValueTask::get_Result methode. Haalt het resultaat op van de voltooide taak in C++."
type: docs
weight: 900
url: /nl/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


Haalt het resultaat op van de voltooide taak.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T De resultaatwaarde.
## Opmerkingen



Als de taak wordt ondersteund door een [ResultTask<T>](../../resulttask/), zal deze methode het resultaat afwachten en cachen. Volgende oproepen zullen de gecachte waarde retourneren zonder af te wachten.

## Zie ook

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
