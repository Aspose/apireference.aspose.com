---
title: "System::Threading::Tasks::ValueTask-klasse"
linktitle: "ValueTask"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ValueTask-klasse. Biedt een wachtbaar resultaat van een asynchrone bewerking in C++."
type: docs
weight: 500
url: /nl/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


Biedt een afwachtbaar resultaat van een asynchrone bewerking.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AsTask](./astask/)() const | Converteert deze [ValueTask](./) naar een gedeelde pointer naar [Task](../task/). |
| [ConfigureAwait](./configureawait/)(bool) const | Configureert een awaiter voor deze taak. |
| [Equals](./equals/)(ValueTask) override | Bepaalt of deze instantie gelijk is aan een andere [ValueTask](./)-instantie. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bepaalt of deze instantie gelijk is aan een ander object. |
| [get_IsCanceled](./get_iscanceled/)() const | Haalt een waarde op die aangeeft of de taak is voltooid vanwege annulering. |
| [get_IsCompleted](./get_iscompleted/)() const | Haalt een waarde op die aangeeft of de taak is voltooid. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Haalt een waarde op die aangeeft of de taak succesvol is voltooid. |
| [get_IsFaulted](./get_isfaulted/)() const | Haalt een waarde op die aangeeft of de taak is voltooid vanwege een niet-afgehandelde uitzondering. |
| [GetAwaiter](./getawaiter/)() const | Haalt een awaiter op voor deze taak om await-expressies te ondersteunen. |
| [operator!=](./operator!=/)(const ValueTask\&) const | Ongelijkheidsoperator voor [ValueTask](./). |
| [operator==](./operator==/)(const ValueTask\&) const | Gelijkheidsoperator voor [ValueTask](./). |
| [ValueTask](./valuetask/)() | Construeert een lege, niet-geïnitieerde [ValueTask](./). |
| [ValueTask](./valuetask/)(const TaskPtr\&) | Construeert een [ValueTask](./) vanuit een gedeelde pointer naar een [Task](../task/). |
## Zie ook

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
