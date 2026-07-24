---
title: "System::Globalization::RegionInfo klasse"
linktitle: "RegionInfo"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::RegionInfo klasse. Biedt informatie over de regio. Objecten van deze klasse mogen alleen worden toegewezen met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2100
url: /nl/cpp/system.globalization/regioninfo/
---
## RegionInfo class


Biedt informatie over de regio. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class RegionInfo : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | Haalt de Engelse naam van de valuta op. |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | Haalt de lokale naam van de valuta op. |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | Haalt het valutateken op. |
| static [get_CurrentRegion](./get_currentregion/)() | Haalt de in het systeem ingestelde regio op. |
| virtual [get_DisplayName](./get_displayname/)() const | Haalt de volledige regionaam op. |
| virtual [get_EnglishName](./get_englishname/)() const | Haalt de Engelse regionaam op. |
| virtual [get_GeoId](./get_geoid/)() const | Haalt de unieke identificator voor een regio op. |
| virtual [get_IsMetric](./get_ismetric/)() const | Controleert of de regio het metrische stelsel gebruikt. |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | Haalt het ISO-valutasymbool op. |
| virtual [get_Name](./get_name/)() const | Haalt de regionaam op. |
| virtual [get_NativeName](./get_nativename/)() const | Haalt de lokale regionaam op. |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | Haalt de 3‑letterige ISO-regiocode op. |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | Haalt de 3‑letterige [Windows](../../system.windows/) regiocode op. |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | Haalt de 2‑letterige ISO-regiocode op. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | RTTI-informatie. |
| [RegionInfo](./regioninfo/)(int) | Constructor. |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
