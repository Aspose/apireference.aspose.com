---
title: "System::Net::Http::Headers::EntityTagHeaderValue klasse"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::EntityTagHeaderValue klasse. Vertegenwoordigt een waarde van de ''Entity-Tag'' header. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 500
url: /nl/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


Vertegenwoordigt een waarde van de 'Entity-Tag' header. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | Construeert een nieuw exemplaar. |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | Construeert een nieuw exemplaar. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| static [get_Any](./get_any/)() | Haalt een waarde op van de 'ETag' header. |
| [get_IsWeak](./get_isweak/)() | Haalt een waarde op die aangeeft of de huidige instantie een zwakke validator is. |
| [get_Tag](./get_tag/)() | RTTI-informatie. |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | Converteert een meegegeven string vanaf de opgegeven index naar een instantie van de [EntityTagHeaderValue](./) klasse. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [Parse](./parse/)(String) | Converteert een meegegeven string naar een instantie van de [EntityTagHeaderValue](./) klasse. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | Probeert een meegegeven string te converteren naar een instantie van de [EntityTagHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
