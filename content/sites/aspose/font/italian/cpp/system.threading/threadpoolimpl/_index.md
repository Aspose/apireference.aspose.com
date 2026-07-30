---
title: "System::Threading::ThreadPoolImpl class"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Font per C++"
description: "System::Threading::ThreadPoolImpl class. Dati interni del pool di thread. Questo è un tipo singleton con la gestione della memoria effettuata tramite funzione(i) di accesso. Non dovresti mai creare istanze direttamente in C++."
type: docs
weight: 1400
url: /it/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Ottiene il numero di thread disponibili. |
| static [GetInitialized](./getinitialized/)() | Ottiene il singleton dello stato di inizializzazione. |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Ottiene il numero massimo di thread concorrenti. |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | Ottiene il numero minimo di thread creati dal pool. |
| [JoinAll](./joinall/)() | Unisce tutti i thread posseduti. Attende indefinitamente. |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Aggiunge un elemento di lavoro alla coda. |
| [SetMaxThreads](./setmaxthreads/)(int, int) | Imposta il numero di thread posseduti dal pool. |
| [SetMinThreads](./setminthreads/)(int, int) | Imposta il numero minimo di thread posseduti dal pool. |
| [ThreadPoolImpl](./threadpoolimpl/)() | Costruttore. |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | Distruttore. Unisce tutti i thread se non sono ancora stati terminati. |
## Vedi anche

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
