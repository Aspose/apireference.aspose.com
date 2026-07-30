---
title: "System::Threading::Tasks::ResultTask classe"
linktitle: "ResultTask"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::ResultTask classe. Una specializzazione di Task che restituisce un valore di risultato al completamento in C++."
type: docs
weight: 400
url: /it/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Una specializzazione di [Task](../task/) che restituisce un valore di risultato al completamento.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo del valore di risultato restituito dal task |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Complete](./complete/)(const T\&) | Imposta il valore di risultato per il task e lo completa. |
| [ConfigureAwait](./configureawait/)(bool) const | Configura come gli await su questo task di risultato devono comportarsi riguardo alla cattura del contesto. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Crea una continuazione che viene eseguita quando il task di risultato completa. |
| [ContinueWith](./continuewith/)(const Func\<RTaskPtr\<T\>, TNewResult\>\&) | Crea una continuazione che viene eseguita quando il task di risultato completa. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Crea una continuazione che viene eseguita quando il task completa. |
| [ContinueWith](./continuewith/)(const Func\<TaskPtr, TResult\>\&) | Crea una continuazione che viene eseguita quando il task completa. |
| [get_Result](./get_result/)() | Ottiene il risultato dell'operazione asincrona. |
| [GetAwaiter](./getawaiter/)() const | Ottiene un awaiter per questo task di risultato da utilizzare con Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Costruisce un [ResultTask](./) con una funzione che restituisce un valore. |
| [ResultTask](./resulttask/)() | Implementazione interna. Non per il codice utente. |
| [ResultTask](./resulttask/)(const T\&) | Costruttore interno per creare task di risultato con risultato specificato. |
| [set_Result](./set_result/)(const T\&) | Imposta il valore di risultato per il task. |
## Osservazioni



Rappresenta un'operazione asincrona che produce un risultato, simile a [System.Threading.Tasks.Task<TResult>](../task/) in .NET
## Vedi anche

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
