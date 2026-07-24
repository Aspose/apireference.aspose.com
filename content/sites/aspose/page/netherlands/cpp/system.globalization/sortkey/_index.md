---
title: "System::Globalization::SortKey class"
linktitle: "SortKey"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::SortKey class. Mapping van een tekenreeks naar zijn sorteersleutel. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2200
url: /nl/cpp/system.globalization/sortkey/
---
## SortKey class


Mapping van een tekenreeks naar zijn sorteersleutel. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class SortKey : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | Vergelijkt twee sorteersleutels. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Controleert of het opgegeven object gelijk is aan het huidige [SortKey](./) object. |
| virtual [get_KeyData](./get_keydata/)() | Haalt de byte‑array op die het huidige object vertegenwoordigt. |
| virtual [get_OriginalString](./get_originalstring/)() | Haalt de oorspronkelijke tekenreeks op die is gebruikt om dit object te maken. |
| [GetHashCode](./gethashcode/)() const override | Haalt de hash‑code op voor het huidige [SortKey](./) object. |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | Converteert het huidige object naar zijn tekenreeksrepresentatie. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
