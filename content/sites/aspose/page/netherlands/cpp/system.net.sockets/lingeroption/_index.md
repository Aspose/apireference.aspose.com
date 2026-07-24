---
title: "System::Net::Sockets::LingerOption klasse"
linktitle: "LingerOption"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::LingerOption klasse. Geeft aan of een socket verbonden blijft na een oproep naar de Close() of Close() methoden. Het specificeert ook de periode waarin de socket verbonden blijft als het verzenden van de gegevens doorgaat. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


Geeft aan of een socket verbonden blijft na een oproep naar de Close() of Close() methoden. Het specificeert ook de periode waarin de socket verbonden blijft als het verzenden van de gegevens doorgaat. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class LingerOption : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Enabled](./get_enabled/)() | RTTI-informatie. |
| [get_LingerTime](./get_lingertime/)() | Haalt een vertragingstimeout op in seconden. |
| [LingerOption](./lingeroption/)(bool, int32_t) | Construeert een nieuw exemplaar. |
| [set_Enabled](./set_enabled/)(bool) | Stelt een waarde in die aangeeft of de socket het sluiten vertraagt in een poging alle wachtende gegevens te verzenden. |
| [set_LingerTime](./set_lingertime/)(int32_t) | Stelt een vertragingstimeout in seconden in. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
