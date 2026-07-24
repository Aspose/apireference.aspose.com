---
title: "Klassen System::Threading::Tasks::ResultValueTask"
linktitle: "ResultValueTask"
second_title: "Aspose.Page för C++"
description: "Klassen System::Threading::Tasks::ResultValueTask. Representerar en hybriduppgiftliknande typ som kan omsluta antingen ett direkt resultatvärde eller en ResultTask<T> i C++."
type: docs
weight: 200
url: /sv/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


Representerar en hybriduppgiftliknande typ som kan omsluta antingen ett direkt resultatvärde eller en [ResultTask<T>](../resulttask/).

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen av resultatet som produceras av uppgiften. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AsTask](./astask/)() const | Konverterar detta [ResultValueTask](./) till en delad pekare till [ResultTask<T>](../resulttask/). |
| [ConfigureAwait](./configureawait/)(bool) const | Konfigurerar en väntare för detta task. |
| [Equals](./equals/)(ResultValueTask) override | Bestämmer om detta objekt är lika med ett annat [ResultValueTask](./)-objekt. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestämmer om detta objekt är lika med ett annat objekt. |
| [get_IsCanceled](./get_iscanceled/)() const | Hämtar ett värde som indikerar om tasken avslutades på grund av avbokning. |
| [get_IsCompleted](./get_iscompleted/)() const | Hämtar ett värde som indikerar om tasken har avslutats. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Hämtar ett värde som indikerar om tasken avslutades framgångsrikt. |
| [get_IsFaulted](./get_isfaulted/)() const | Hämtar ett värde som indikerar om tasken avslutades på grund av ett ohanterat undantag. |
| [get_Result](./get_result/)() const | Hämtar resultatet av den slutförda uppgiften. |
| [GetAwaiter](./getawaiter/)() const | Hämtar en väntare för detta task för att stödja await-uttryck. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | Icke‑likhetsoperator för [ResultValueTask](./). |
| [operator==](./operator==/)(const ResultValueTask\&) const | Likhetsoperator för [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)() | Skapar ett tomt, oinitierat [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)(const T\&) | Skapar ett slutfört [ResultValueTask](./) med det angivna resultatet. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | Skapar ett [ResultValueTask](./) från en delad pekare till en [ResultTask<T>](../resulttask/). |
## Anmärkningar


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## Se även

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
