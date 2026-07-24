---
title: "System::Threading::Tasks::ResultTask-klass"
linktitle: "ResultTask"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::ResultTask-klass. En Task-specialisering som returnerar ett resultatvärde vid slutförandet i C++."
type: docs
weight: 100
url: /sv/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


En [Task](../task/)-specialisering som returnerar ett resultatvärde vid slutförandet.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av resultatvärdet som returneras av tasken |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | Konfigurerar hur await-operationer på denna resultattask ska bete sig avseende kontextfångst. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Skapar en fortsättning som körs när resultattasken slutförs. |
| [get_Result](./get_result/)() const | Hämtar resultatet av den asynkrona operationen. |
| [GetAwaiter](./getawaiter/)() const | Hämtar en awaiter för denna resultattask för användning med Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Skapar en [ResultTask](./) med en funktion som returnerar ett värde. |
| [ResultTask](./resulttask/)() | Intern implementation. Inte för användarkod. |
| [ResultTask](./resulttask/)(const T\&) | Intern konstruktor för att skapa resultattasks med angivet resultat. |
| [set_Result](./set_result/)(const T\&) | Sätter resultatvärdet för tasken. |
## Anmärkningar



Representerar en asynkron operation som producerar ett resultat, liknande [System.Threading.Tasks.Task<TResult>](../task/) i .NET.
## Se även

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
