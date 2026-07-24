---
title: "System::Diagnostics::Stopwatch klasse"
linktitle: "Stopwatch"
second_title: "Aspose.Page voor C++"
description: "System::Diagnostics::Stopwatch klasse. Stelt tijdmeting mogelijk. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 700
url: /nl/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


Stelt tijdmeting mogelijk. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Stopwatch : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | Haalt de totale verstreken tijd op die door de huidige instantie is gemeten. |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | Haalt de totale verstreken tijd op die door de huidige instantie is gemeten, in milliseconden. |
| [get_ElapsedTicks](./get_elapsedticks/)() const | Haalt de totale verstreken tijd op die door de huidige instantie is gemeten, in timer‑ticks. |
| [get_IsRunning](./get_isrunning/)() const | Controleert of de stopwatch loopt. |
| [Reset](./reset/)() | Stopt de tijdmeting, stelt het gemeten interval in op nul. |
| [Restart](./restart/)() | Stelt het gemeten interval in op nul, en start vervolgens de tijdmeting. |
| [Start](./start/)() | Start de tijdmeting. |
| static [StartNew](./startnew/)() | Maakt een nieuw [Stopwatch](./) object aan en start de meting. |
| [Stop](./stop/)() | Stopt de tijdmeting. |
| [Stopwatch](./stopwatch/)() | RTTI-informatie. |
| virtual [~Stopwatch](./~stopwatch/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
