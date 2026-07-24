---
title: "System::Threading::Tasks::ResultTask klasse"
linktitle: "ResultTask"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ResultTask klasse. Een Task-specialisatie die een resultaatwaarde retourneert bij voltooiing in C++."
type: docs
weight: 100
url: /nl/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Een [Task](../task/) specialisatie die een resultaatwaarde retourneert bij voltooiing.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de resultaatwaarde die door de taak wordt geretourneerd |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | Configureert hoe wachtoperaties op deze resultaattaak zich moeten gedragen met betrekking tot contextvastlegging. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Maakt een voortzetting aan die wordt uitgevoerd wanneer de resultaattaak voltooid is. |
| [get_Result](./get_result/)() const | Haalt het resultaat op van de asynchrone bewerking. |
| [GetAwaiter](./getawaiter/)() const | Haalt een awaiter op voor deze resultaattaak voor gebruik met Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Construeert een [ResultTask](./) met een functie die een waarde retourneert. |
| [ResultTask](./resulttask/)() | Interne implementatie. Niet voor gebruikerscode. |
| [ResultTask](./resulttask/)(const T\&) | Interne constructor voor het maken van resultaattaken met een gespecificeerd resultaat. |
| [set_Result](./set_result/)(const T\&) | Stelt de resultaatwaarde in voor de taak. |
## Opmerkingen



Stelt een asynchrone bewerking voor die een resultaat oplevert, vergelijkbaar met [System.Threading.Tasks.Task<TResult>](../task/) in .NET.
## Zie ook

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
