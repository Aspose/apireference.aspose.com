---
title: "System::Net::Http::Headers::ContentRangeHeaderValue klasse"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::ContentRangeHeaderValue klasse. Vertegenwoordigt een waarde van de ''Content-Range'' header. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


Vertegenwoordigt een waarde van de 'Content-Range' header. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | Construeert een nieuw exemplaar. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | Construeert een nieuw exemplaar. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | Construeert een nieuw exemplaar. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_From](./get_from/)() | Haalt een positie op waarop het verzenden van gegevens moet beginnen. |
| [get_HasLength](./get_haslength/)() const | Haalt een waarde op die aangeeft of de lengte is gespecificeerd voor de huidige header. |
| [get_HasRange](./get_hasrange/)() const | Haalt een waarde op die aangeeft of het bereik is gespecificeerd voor de huidige header. |
| [get_Length](./get_length/)() | Haalt de lengte op van een entiteitslichaam. |
| [get_To](./get_to/)() | Haalt een positie op waarop het verzenden van gegevens moet stoppen. |
| [get_Unit](./get_unit/)() | RTTI-informatie. |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converteert een meegegeven string vanaf de opgegeven positie naar een instantie van de [ContentRangeHeaderValue](./) klasse. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [Parse](./parse/)(String) | Converteert een meegegeven string naar een instantie van de [ContentRangeHeaderValue](./) klasse. |
| [set_Unit](./set_unit/)(String) | Stelt de eenheden in die worden gebruikt in het bereik. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | Probeert een meegegeven string te converteren naar een instantie van de [ContentRangeHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
