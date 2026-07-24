---
title: "System::Net::Http::Headers::RangeConditionHeaderValue klasse"
linktitle: "RangeConditionHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::RangeConditionHeaderValue klasse. Stelt een waarde van de ''If-Range''-header voor. Objecten van deze klasse mogen alleen worden toegewezen met behulp van de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1900
url: /nl/cpp/system.net.http.headers/rangeconditionheadervalue/
---
## RangeConditionHeaderValue class


Stelt een waarde van de 'If-Range'-header voor. Objecten van deze klasse mogen alleen worden toegewezen met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class RangeConditionHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Date](./get_date/)() | RTTI-informatie. |
| [get_EntityTag](./get_entitytag/)() | Retourneert een 'ETag'-headerwaarde. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetRangeConditionLength](./getrangeconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converteert een meegegeven string vanaf de opgegeven index naar een instantie van de [RangeConditionHeaderValue](./) klasse. |
| static [Parse](./parse/)(String) | Converteert een meegegeven string naar een instantie van de [RangeConditionHeaderValue](./) klasse. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(DateTimeOffset) | Construeert een nieuw exemplaar. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(System::SharedPtr\<EntityTagHeaderValue\>) | Construeert een nieuw exemplaar. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(String) | Construeert een nieuw exemplaar. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeConditionHeaderValue\>\&) | Probeert een meegegeven string te converteren naar een instantie van de [RangeConditionHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
