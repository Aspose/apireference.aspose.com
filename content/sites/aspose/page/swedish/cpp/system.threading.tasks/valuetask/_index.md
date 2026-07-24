---
title: "System::Threading::Tasks::ValueTask klass"
linktitle: "ValueTask"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::ValueTask klass. Tillhandahåller ett väntbart resultat av en asynkron operation i C++."
type: docs
weight: 500
url: /sv/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


Tillhandahåller ett väntbart resultat av en asynkron operation.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AsTask](./astask/)() const | Konverterar detta [ValueTask](./) till en delad pekare till [Task](../task/). |
| [ConfigureAwait](./configureawait/)(bool) const | Konfigurerar en väntare för detta task. |
| [Equals](./equals/)(ValueTask) override | Bestämmer om detta objekt är lika med ett annat [ValueTask](./)-objekt. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestämmer om detta objekt är lika med ett annat objekt. |
| [get_IsCanceled](./get_iscanceled/)() const | Hämtar ett värde som indikerar om tasken avslutades på grund av avbokning. |
| [get_IsCompleted](./get_iscompleted/)() const | Hämtar ett värde som indikerar om tasken har avslutats. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Hämtar ett värde som indikerar om tasken avslutades framgångsrikt. |
| [get_IsFaulted](./get_isfaulted/)() const | Hämtar ett värde som indikerar om tasken avslutades på grund av ett ohanterat undantag. |
| [GetAwaiter](./getawaiter/)() const | Hämtar en väntare för detta task för att stödja await-uttryck. |
| [operator!=](./operator!=/)(const ValueTask\&) const | Icke-likhetsoperator för [ValueTask](./). |
| [operator==](./operator==/)(const ValueTask\&) const | Likhetsoperator för [ValueTask](./). |
| [ValueTask](./valuetask/)() | Skapar en tom, oinitialiserad [ValueTask](./). |
| [ValueTask](./valuetask/)(const TaskPtr\&) | Skapar ett [ValueTask](./) från en delad pekare till en [Task](../task/). |
## Se även

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
