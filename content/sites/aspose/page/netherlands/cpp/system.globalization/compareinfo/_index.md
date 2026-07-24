---
title: "System::Globalization::CompareInfo class"
linktitle: "CompareInfo"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::CompareInfo class. Voert cultuurgevoelige tekenreeksvergelijking uit. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.globalization/compareinfo/
---
## CompareInfo class


Voert cultuurgevoelige tekenreeksvergelijking uit. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class CompareInfo : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | Vergelijkt tekenreeksen. Niet geïmplementeerd. |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | Vergelijkt tekenreeksen. Alleen de modi Ordinal en OrdinalIgnoreCase worden ondersteund. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | Vergelijkt een gedeelte van één tekenreeks met een gedeelte van een tweede tekenreeks. Niet geïmplementeerd. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | Vergelijkt het eindgedeelte van één tekenreeks met het eindgedeelte van een tweede tekenreeks met behulp van tekenreeksvergelijkingsmethoden. Niet geïmplementeerd. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | Vergelijkt het eindgedeelte van één tekenreeks met het eindgedeelte van een tweede tekenreeks. Niet geïmplementeerd. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | Vergelijkt een gedeelte van één tekenreeks met een gedeelte van een tweede tekenreeks met behulp van tekenreeksvergelijkingsmethoden. Niet geïmplementeerd. |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | RTTI-informatie. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | Haalt LCID op van de cultuur die bij de comparer hoort. |
| virtual [get_Name](./get_name/)() const | Haalt de naam op van de cultuur die bij de comparer hoort. |
| [get_Version](./get_version/)() const | Haalt informatie op over de sorteer‑versie. |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | Haalt [CompareInfo](./) op die bij de opgegeven cultuur hoort en gebruikt stringvergelijkingsmethoden in de opgegeven assembly. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Haalt [CompareInfo](./) op die bij de opgegeven cultuur hoort en gebruikt stringvergelijkingsmethoden in de opgegeven assembly. |
| static [GetCompareInfo](./getcompareinfo/)(int) | Haalt [CompareInfo](./) op die bij de opgegeven cultuur hoort. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | Haalt [CompareInfo](./) op die bij de opgegeven cultuur hoort. |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | Haalt de hashcode van de string op op basis van de opgegeven vergelijkingsopties. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | Haalt het [SortKey](../sortkey/) object op voor de opgegeven string met de opgegeven vergelijkingsopties. |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | Haalt het [SortKey](../sortkey/) object op voor de opgegeven string. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | Zoekt naar een subreeks. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | Zoekt naar een subreeks. Alleen de Ordinal-modus wordt ondersteund. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | Zoekt naar een subreeks. Alleen de Ordinal-modus wordt ondersteund. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | Zoekt naar het opgegeven teken. Alleen de Ordinal-modus wordt ondersteund. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | Zoekt naar een subreeks. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | Zoekt naar het opgegeven teken. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | Zoekt naar een subreeks. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | Zoekt naar het opgegeven teken. Alleen de Ordinal-modus wordt ondersteund. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | Zoekt naar het opgegeven teken. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | Zoekt naar het opgegeven teken. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | Zoekt naar een subreeks. Alleen de Ordinal-modus wordt ondersteund. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | Zoekt naar het opgegeven teken. Alleen de Ordinal-modus wordt ondersteund. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | Controleert of de opgegeven string begint met het opgegeven voorvoegsel met behulp van de opgegeven vergelijkingsopties. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | Controleert of de opgegeven string begint met het opgegeven voorvoegsel. |
| static [IsSortable](./issortable/)(char16_t) | Controleert of een opgegeven teken sorteerbaar is. |
| static [IsSortable](./issortable/)(const String\&) | Controleert of een opgegeven string sorteerbaar is. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | Controleert of de opgegeven string eindigt met het opgegeven achtervoegsel met behulp van de opgegeven vergelijkingsopties. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | Controleert of de opgegeven string eindigt met het opgegeven achtervoegsel. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | Zoekt het laatste voorkomen van de opgegeven subreeks. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | Zoekt het laatste voorkomen van de opgegeven subreeks met behulp van de opgegeven vergelijkingsopties. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | Zoekt het laatste voorkomen van het opgegeven teken met behulp van de opgegeven vergelijkingsopties. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | Zoekt het laatste voorkomen van de opgegeven string. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | Zoekt het laatste voorkomen van de opgegeven string met behulp van de opgegeven vergelijkingsopties. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | Zoekt het laatste voorkomen van het opgegeven teken met behulp van de opgegeven vergelijkingsopties. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | Zoekt het laatste voorkomen van de opgegeven string. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | Zoekt het laatste voorkomen van het opgegeven teken. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | Zoekt het laatste voorkomen van de opgegeven string met behulp van de opgegeven vergelijkingsopties. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | Zoekt het laatste voorkomen van het opgegeven teken met behulp van de opgegeven vergelijkingsopties. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | Zoekt het laatste voorkomen van het opgegeven teken. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | Zoekt het laatste voorkomen van het opgegeven teken. |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
