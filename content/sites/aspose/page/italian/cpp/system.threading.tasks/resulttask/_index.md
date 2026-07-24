---
title: "Classe System::Threading::Tasks::ResultTask"
linktitle: "ResultTask"
second_title: "Aspose.Page per C++"
description: "Classe System::Threading::Tasks::ResultTask. Una specializzazione di Task che restituisce un valore di risultato al completamento in C++."
type: docs
weight: 100
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
| [ConfigureAwait](./configureawait/)(bool) const | Configura come gli await su questo result task devono comportarsi riguardo alla cattura del contesto. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Crea una continuazione che viene eseguita quando il result task completa. |
| [get_Result](./get_result/)() const | Ottiene il risultato dell'operazione asincrona. |
| [GetAwaiter](./getawaiter/)() const | Ottiene un awaiter per questo result task da utilizzare con Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Costruisce un [ResultTask](./) con una funzione che restituisce un valore. |
| [ResultTask](./resulttask/)() | Implementazione interna. Non per il codice utente. |
| [ResultTask](./resulttask/)(const T\&) | Costruttore interno per creare result task con risultato specificato. |
| [set_Result](./set_result/)(const T\&) | Imposta il valore di risultato per il task. |
## Osservazioni



Rappresenta un'operazione asincrona che produce un risultato, simile a [System.Threading.Tasks.Task<TResult>](../task/) in .NET.
## Vedi anche

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
