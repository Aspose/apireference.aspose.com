---
title: "Costruttore System::Threading::Tasks::ResultValueTask::ResultValueTask"
linktitle: "ResultValueTask"
second_title: "Aspose.Font per C++"
description: "Costruttore System::Threading::Tasks::ResultValueTask::ResultValueTask. Costruisce un ResultValueTask vuoto e non inizializzato in C++."
type: docs
weight: 100
url: /it/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


Costruisce un [ResultValueTask](../) vuoto e non inizializzato.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## Osservazioni



L'attività non è completata e non contiene alcun risultato. Tentare di ottenere il risultato genererà un'eccezione.

## Vedi anche

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


Costruisce un [ResultValueTask](../) da un puntatore condiviso a un [ResultTask<T>](../../resulttask/).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const RTaskPtr\<T\>\& | L'attività da avvolgere. Può essere null per un'attività vuota. |
## Osservazioni



Il [ResultValueTask](../) rappresenterà lo stato e il risultato dell'attività fornita.

## Vedi anche

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


Costruisce un [ResultValueTask](../) completato con il risultato specificato.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| risultato | const T\& | Il valore di risultato da avvolgere in un'attività completata. |
## Osservazioni



Questo crea un'attività completata con successo che restituisce immediatamente il valore.

## Vedi anche

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
