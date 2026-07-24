---
title: "System::Threading::Tasks::ResultValueTask::get_Result metodo"
linktitle: "get_Result"
second_title: "Aspose.Page per C++"
description: "System::Threading::Tasks::ResultValueTask::get_Result metodo. Ottiene il risultato dell'attività completata in C++."
type: docs
weight: 900
url: /it/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


Ottiene il risultato del task completato.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T Il valore del risultato.
## Osservazioni



Se l'attività è supportata da un [ResultTask<T>](../../resulttask/), questo metodo attenderà il risultato e lo memorizzerà nella cache. Le chiamate successive restituiranno il valore memorizzato senza attendere.

## Vedi anche

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
