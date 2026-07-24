---
title: "System::Net::CookieComparer klasse"
linktitle: "CookieComparer"
second_title: "Aspose.Page voor C++"
description: "System::Net::CookieComparer klasse. Gebruikt om de instanties van de Cookie‑klasse te vergelijken. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 300
url: /nl/cpp/system.net/cookiecomparer/
---
## CookieComparer class


Gebruikt om de instanties van de [Cookie](../cookie/) klasse te vergelijken. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Vergelijkt de opgegeven objecten. |
| static [get_Instance](./get_instance/)() | RTTI-informatie. |
## Zie ook

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
