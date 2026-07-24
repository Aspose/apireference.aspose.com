---
title: "System::Net::CookieParser class"
linktitle: "CookieParser"
second_title: "Aspose.Page voor C++"
description: "System::Net::CookieParser class. Gebruikt om een cookie-header te parseren en een instantie van de Cookie class te maken. Objecten van deze class mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze class altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 500
url: /nl/cpp/system.net/cookieparser/
---
## CookieParser class


Gebruikt om een cookie-header te parseren en een instantie van de [Cookie](../cookie/) class te maken. Objecten van deze class mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze class altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class CookieParser : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [CheckQuoted](./checkquoted/)(String) | Controleert of de opgegeven string tussen aanhalingstekens staat. |
| [CookieParser](./cookieparser/)(String) | RTTI-informatie. |
| [Get](./get/)() | Retourneert een instantie gebaseerd op de opgegeven string. |
| [GetServer](./getserver/)() | Haalt de server-cookie op. |
| [GetString](./getstring/)() | Retourneert de tekenreeksrepresentatie van een cookie‑header. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
