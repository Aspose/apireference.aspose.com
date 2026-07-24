---
title: "System::Threading::WaitHandle klasse"
linktitle: "WaitHandle"
second_title: "Aspose.Page voor C++"
description: "System::Threading::WaitHandle klasse. Wacht‑primitive basisklasse. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1700
url: /nl/cpp/system.threading/waithandle/
---
## WaitHandle class


Wacht‑primitive basisklasse. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class WaitHandle : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Close](./close/)() | Geeft elke bron vrij die aan de handle is gekoppeld. |
| [get_Handle](./get_handle/)() | Haalt handle op. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | RTTI-informatie. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Wacht tot alle handles afgevuurd zijn. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Wacht tot alle handles afgevuurd zijn. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Wacht tot een van de handles afgevuurd is. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Wacht tot een van de handles afgevuurd is. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Wacht tot een van de handles afgevuurd is. |
| virtual [WaitOne](./waitone/)() | Wacht tot de handle wordt geactiveerd voor een onbeperkte periode. |
| virtual [WaitOne](./waitone/)(int) | Wacht tot de handle wordt geactiveerd. |
| virtual [WaitOne](./waitone/)(TimeSpan) | Wacht tot de handle wordt geactiveerd. |
| virtual [WaitOne](./waitone/)(int, bool) | Wacht tot de handle wordt geactiveerd. |
| virtual [~WaitHandle](./~waithandle/)() | Destructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | Speciale waarde die door de functie moet worden geretourneerd, anders wordt de index van het gesignaleerde object in de array geretourneerd, als de timeout wordt overschreden en er niets signaleert. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
