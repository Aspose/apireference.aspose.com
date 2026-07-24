---
title: "System::StringComparer class"
linktitle: "StringComparer"
second_title: "Aspose.Page voor C++"
description: "System::StringComparer class. Vergelijkt strings met verschillende vergelijkingsmodi. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 5900
url: /nl/cpp/system/stringcomparer/
---
## StringComparer class


Vergelijkt strings met verschillende vergelijkingsmodi. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../makeobject/) functie. Maak nooit een instantie van dit type op de stack of met de operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Vergelijkt twee strings met de huidige instellingen. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | Maakt een cultuur‑specifieke comparer aan. |
| [Equals](./equals/)(String, String) const override | Controleert of twee strings gelijk zijn met de huidige instellingen. |
| static [get_CurrentCulture](./get_currentculture/)() | Singleton van comparer voor de huidige cultuur. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | Singleton van comparer voor de huidige cultuur die hoofdletterongevoelig is. |
| static [get_InvariantCulture](./get_invariantculture/)() | Singleton van comparer voor de invariant-cultuur. |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | Singleton van comparer voor de invariant-cultuur die hoofdletterongevoelig is. |
| static [get_Ordinal](./get_ordinal/)() | Singleton van ordinal comparer. |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | Singleton van ordinal comparer die hoofdletterongevoelig is. |
| [GetHashCode](./gethashcode/)(String) const override | Haalt de hashcode van de string op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [args_type](./args_type/) | RTTI-informatie. |
## Zie ook

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
