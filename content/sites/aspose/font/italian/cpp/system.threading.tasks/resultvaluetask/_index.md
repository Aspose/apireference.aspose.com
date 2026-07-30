---
title: "Classe System::Threading::Tasks::ResultValueTask"
linktitle: "ResultValueTask"
second_title: "Aspose.Font per C++"
description: "Classe System::Threading::Tasks::ResultValueTask. Rappresenta un tipo ibrido simile a un task che può avvolgere sia un valore di risultato diretto sia un ResultTask<T> in C++."
type: docs
weight: 500
url: /it/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


Rappresenta un tipo ibrido simile a un task che può avvolgere sia un valore di risultato diretto sia un [ResultTask<T>](../resulttask/).

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo del risultato prodotto dal task. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AsTask](./astask/)() const | Converte questo [ResultValueTask](./) in un puntatore condiviso a [ResultTask<T>](../resulttask/). |
| [ConfigureAwait](./configureawait/)(bool) const | Configura un awaiter per questo task. |
| [Equals](./equals/)(ResultValueTask) override | Determina se questa istanza è uguale a un'altra istanza di [ResultValueTask](./). |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determina se questa istanza è uguale a un altro oggetto. |
| [get_IsCanceled](./get_iscanceled/)() const | Ottiene un valore che indica se il task è terminato a causa di una cancellazione. |
| [get_IsCompleted](./get_iscompleted/)() const | Ottiene un valore che indica se il task è completato. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Ottiene un valore che indica se il task è completato con successo. |
| [get_IsFaulted](./get_isfaulted/)() const | Ottiene un valore che indica se il task è terminato a causa di un'eccezione non gestita. |
| [get_Result](./get_result/)() | Ottiene il risultato dell'attività completata. |
| [GetAwaiter](./getawaiter/)() const | Ottiene un awaiter per questo task per supportare le espressioni await. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | Operatore di disuguaglianza per [ResultValueTask](./). |
| [operator==](./operator==/)(const ResultValueTask\&) const | Operatore di uguaglianza per [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)() | Costruisce un [ResultValueTask](./) vuoto e non inizializzato. |
| [ResultValueTask](./resultvaluetask/)(const T\&) | Costruisce un [ResultValueTask](./) completato con il risultato specificato. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | Costruisce un [ResultValueTask](./) da un puntatore condiviso a un [ResultTask<T>](../resulttask/). |
## Osservazioni


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## Vedi anche

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
