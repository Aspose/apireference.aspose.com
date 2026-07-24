---
title: "System::Globalization::SortVersion klasse"
linktitle: "SortVersion"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::SortVersion klasse. Biedt informatie over de Unicode‑versie die wordt gebruikt om tekenreeksen te vergelijken en te ordenen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze aan functies door te geven als argument in C++."
type: docs
weight: 2300
url: /nl/cpp/system.globalization/sortversion/
---
## SortVersion class


Biedt informatie over de Unicode‑versie die wordt gebruikt om tekenreeksen te vergelijken en te ordenen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze aan functies door te geven als argument.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | Controleert of de huidige [SortVersion](./) instantie gelijk is aan een opgegeven [SortVersion](./) object. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Controleert of de huidige [SortVersion](./) instantie gelijk is aan een opgegeven [SortVersion](./) object. |
| [get_FullVersion](./get_fullversion/)() | Haalt het volledige versienummer op. |
| [get_SortId](./get_sortid/)() | Haalt de unieke identifier op voor dit object. |
| [GetHashCode](./gethashcode/)() const override | Haalt de hashcode op voor het huidige object. |
| [operator!=](./operator!=/)(const SortVersion\&) | Controleert of de huidige [SortVersion](./) instantie niet gelijk is aan een opgegeven [SortVersion](./) object. |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | Controleert of de huidige [SortVersion](./) instantie gelijk is aan een opgegeven [SortVersion](./) object. |
| [SortVersion](./sortversion/)(int, const Guid\&) | RTTI-informatie. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## Zie ook

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
