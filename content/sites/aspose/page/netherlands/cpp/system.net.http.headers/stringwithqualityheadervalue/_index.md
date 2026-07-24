---
title: "System::Net::Http::Headers::StringWithQualityHeaderValue klasse"
linktitle: "StringWithQualityHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::StringWithQualityHeaderValue klasse. Stelt een waarde met een extra kwaliteit van een string‑header voor. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2300
url: /nl/cpp/system.net.http.headers/stringwithqualityheadervalue/
---
## StringWithQualityHeaderValue class


Stelt een waarde met een extra kwaliteit van een string‑header voor. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class StringWithQualityHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Quality](./get_quality/)() | Retourneert een kwaliteit. |
| [get_Value](./get_value/)() | RTTI-informatie. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetStringWithQualityLength](./getstringwithqualitylength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converteert een opgegeven tekenreeks vanaf de opgegeven index naar een instantie van de [StringWithQualityHeaderValue](./) klasse. |
| static [Parse](./parse/)(String) | Converteert een opgegeven tekenreeks naar een instantie van de [StringWithQualityHeaderValue](./) klasse. |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String) | Construeert een nieuw exemplaar. |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String, double) | Construeert een nieuw exemplaar. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<StringWithQualityHeaderValue\>\&) | Probeert een opgegeven tekenreeks te converteren naar een instantie van de [StringWithQualityHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
