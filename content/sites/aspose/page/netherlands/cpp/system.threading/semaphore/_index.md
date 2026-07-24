---
title: "System::Threading::Semaphore klasse"
linktitle: "Semaphore"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Semaphore klasse. Semaphore-implementatie. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 1000
url: /nl/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Release](./release/)() | Geeft de lock op de semaphore vrij. |
| [Release](./release/)(int) | Geeft meerdere locks op de semaphore vrij. |
| virtual [Reset](./reset/)() | Stelt de semaphore in op een niet-gesignaleerde toestand. Niet ondersteund. |
| [Semaphore](./semaphore/)(int, int) | RTTI-informatie. |
| [Semaphore](./semaphore/)(int, int, const String\&) | Maakt een benoemde semaphore aan. |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | Maakt een benoemde semaphore aan. |
| virtual [Set](./set/)() | Stelt de semaphore in op een gesignaleerde toestand. Niet ondersteund. |
| [WaitOne](./waitone/)() override | Vergrendelt semaphore. Voert onbeperkt wachten uit indien nodig. |
| [WaitOne](./waitone/)(int) override | Vergrendelt semaphore. Voert wachten uit indien nodig. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Speciale waarde die door de functie moet worden geretourneerd, anders wordt de index van het gesignaleerde object in de array geretourneerd, als de timeout wordt overschreden en er niets signaleert. |
## Zie ook

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
