---
title: "Metodo System::Threading::Tasks::ResultValueTask::get_Result"
linktitle: "get_Result"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Tasks::ResultValueTask::get_Result. Restituisce il risultato dell'attività completata in C++."
type: docs
weight: 900
url: /it/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


Ottiene il risultato dell'attività completata.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result()
```


### ReturnValue

T Il valore del risultato.
## Osservazioni



Se l'attività è supportata da un [ResultTask<T>](../../resulttask/), questo metodo attenderà il risultato e lo memorizzerà nella cache. Le chiamate successive restituiranno il valore memorizzato senza attendere.

## Vedi anche

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
