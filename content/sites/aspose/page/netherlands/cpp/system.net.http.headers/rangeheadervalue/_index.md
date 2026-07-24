---
title: "System::Net::Http::Headers::RangeHeaderValue klasse"
linktitle: "RangeHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::RangeHeaderValue klasse. Stelt een waarde van de ''Range''-header voor. Objecten van deze klasse mogen alleen worden toegewezen met behulp van de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2000
url: /nl/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


Stelt een waarde van de 'Range'-header voor. Objecten van deze klasse mogen alleen worden toegewezen met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class RangeHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Ranges](./get_ranges/)() | Retourneert de verzameling van de bereiken. |
| [get_Unit](./get_unit/)() | RTTI-informatie. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converteert een meegegeven string vanaf de opgegeven index naar een instantie van de [RangeHeaderValue](./) klasse. |
| static [Parse](./parse/)(String) | Converteert een meegegeven string naar een instantie van de [RangeHeaderValue](./) klasse. |
| [RangeHeaderValue](./rangeheadervalue/)() | Construeert een nieuw exemplaar. |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Construeert een nieuw exemplaar. |
| [set_Unit](./set_unit/)(String) | Stelt een eenheid in. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | Probeert een meegegeven string te converteren naar een instantie van de [RangeHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
