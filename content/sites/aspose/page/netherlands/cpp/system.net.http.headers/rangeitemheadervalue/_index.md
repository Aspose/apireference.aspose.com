---
title: "System::Net::Http::Headers::RangeItemHeaderValue klasse"
linktitle: "RangeItemHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::RangeItemHeaderValue klasse. Stelt een bereik van bytes in een waarde van de ''Range''-header voor. Objecten van deze klasse mogen alleen worden toegewezen met behulp van de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2100
url: /nl/cpp/system.net.http.headers/rangeitemheadervalue/
---
## RangeItemHeaderValue class


Stelt een bereik van bytes in een waarde van de 'Range'-header voor. Objecten van deze klasse mogen alleen worden toegewezen met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class RangeItemHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_From](./get_from/)() | RTTI-informatie. |
| [get_To](./get_to/)() | Retourneert een positie waarop het verzenden van gegevens moet stoppen. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetRangeItemLength](./getrangeitemlength/)(String, int32_t, System::SharedPtr\<RangeItemHeaderValue\>\&) | Converteert een meegegeven string vanaf de opgegeven index naar een instantie van de [RangeItemHeaderValue](./) klasse. |
| static [GetRangeItemListLength](./getrangeitemlistlength/)(String, int32_t, System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\>) | Converteert een meegegeven string vanaf de opgegeven positie naar de collectie van RangeItemHeaderValue-klasse‑instanties. |
| [RangeItemHeaderValue](./rangeitemheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Construeert een nieuw exemplaar. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
