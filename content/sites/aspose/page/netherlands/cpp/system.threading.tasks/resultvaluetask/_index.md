---
title: "System::Threading::Tasks::ResultValueTask klasse"
linktitle: "ResultValueTask"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ResultValueTask klasse. Vertegenwoordigt een hybride taakachtig type dat of een directe resultaatwaarde of een ResultTask<T> in C++ kan omsluiten."
type: docs
weight: 200
url: /nl/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


Vertegenwoordigt een hybride taakachtig type dat of een directe resultaatwaarde of een [ResultTask<T>](../resulttask/) kan omsluiten.

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van het resultaat dat door de taak wordt geproduceerd. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AsTask](./astask/)() const | Converteert deze [ResultValueTask](./) naar een gedeelde pointer naar [ResultTask<T>](../resulttask/). |
| [ConfigureAwait](./configureawait/)(bool) const | Configureert een awaiter voor deze taak. |
| [Equals](./equals/)(ResultValueTask) override | Bepaalt of deze instantie gelijk is aan een andere [ResultValueTask](./) instantie. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bepaalt of deze instantie gelijk is aan een ander object. |
| [get_IsCanceled](./get_iscanceled/)() const | Haalt een waarde op die aangeeft of de taak is voltooid vanwege annulering. |
| [get_IsCompleted](./get_iscompleted/)() const | Haalt een waarde op die aangeeft of de taak is voltooid. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Haalt een waarde op die aangeeft of de taak succesvol is voltooid. |
| [get_IsFaulted](./get_isfaulted/)() const | Haalt een waarde op die aangeeft of de taak is voltooid vanwege een niet-afgehandelde uitzondering. |
| [get_Result](./get_result/)() const | Haalt het resultaat op van de voltooide taak. |
| [GetAwaiter](./getawaiter/)() const | Haalt een awaiter op voor deze taak om await-expressies te ondersteunen. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | Ongelijkheidsoperator voor [ResultValueTask](./). |
| [operator==](./operator==/)(const ResultValueTask\&) const | Gelijkheidsoperator voor [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)() | Construeert een lege, niet-geïnitieerde [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)(const T\&) | Construeert een voltooide [ResultValueTask](./) met het opgegeven resultaat. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | Construeert een [ResultValueTask](./) vanuit een gedeelde pointer naar een [ResultTask<T>](../resulttask/). |
## Opmerkingen


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## Zie ook

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
