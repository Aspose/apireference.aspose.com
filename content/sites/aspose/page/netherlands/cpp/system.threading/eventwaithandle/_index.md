---
title: "System::Threading::EventWaitHandle class"
linktitle: "EventWaitHandle"
second_title: "Aspose.Page voor C++"
description: "System::Threading::EventWaitHandle class. Event dat naar een wachtende thread kan worden gestuurd. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 500
url: /nl/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | RTTI-informatie. |
| virtual [Reset](./reset/)() | Stelt het event in op een niet‑signalerende status. |
| virtual [Set](./set/)() | Stelt het event in op een signalerende status. |
| [~EventWaitHandle](./~eventwaithandle/)() | Destructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Speciale waarde die door de functie moet worden geretourneerd, anders wordt de index van het gesignaleerde object in de array geretourneerd, als de timeout wordt overschreden en er niets signaleert. |
## Zie ook

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
