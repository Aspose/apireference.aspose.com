---
title: "System::Threading::ManualResetEvent klasse"
linktitle: "ManualResetEvent"
second_title: "Aspose.Page voor C++"
description: "System::Threading::ManualResetEvent klasse. Evenement om wachtende thread te informeren dat niet automatisch wordt gereset. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 700
url: /nl/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | RTTI-informatie. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Speciale waarde die door de functie moet worden geretourneerd, anders wordt de index van het gesignaleerde object in de array geretourneerd, als de timeout wordt overschreden en er niets signaleert. |
## Zie ook

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
