---
title: "System::Net::Http::Headers::NameValueHeaderValue class"
linktitle: "NameValueHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::NameValueHeaderValue class. Vertegenwoordigt een sleutel/waarde‑paar dat in headers kan worden gebruikt. Objecten van deze klasse mogen alleen worden toegewezen met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1400
url: /nl/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


Vertegenwoordigt een sleutel/waarde‑paar dat in headers kan worden gebruikt. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | Zoekt de NameValueHeaderValue‑klasse‑instantie in een collectie op basis van de opgegeven naam. |
| [get_Name](./get_name/)() | Retourneert een naam van de huidige instantie. |
| [get_Value](./get_value/)() | Haalt een waarde op van de huidige instantie. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Retourneert een hashcode van alle items in de collectie. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | Converteert een meegegeven string vanaf de opgegeven index naar een instantie van de [NameValueHeaderValue](./) klasse. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | Converteert een meegegeven string vanaf de opgegeven index naar een instantie van de [NameValueHeaderValue](./) klasse. |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Converteert een meegegeven string vanaf de opgegeven index naar de collectie van NameValueHeaderValue‑klasse‑instanties en retourneert de lengte van de geparseerde sub‑string. |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | Retourneert de lengte van een waarde vanaf de opgegeven index. |
| [NameValueHeaderValue](./namevalueheadervalue/)() | Construeert een nieuw exemplaar. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | Construeert een nieuw exemplaar. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | Construeert een nieuw exemplaar. |
| static [Parse](./parse/)(String) | Converteert een meegegeven string naar een instantie van de [NameValueHeaderValue](./) klasse. |
| [set_Value](./set_value/)(String) | Stelt een waarde in van de huidige instantie. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | Retourneert een tekenreeksrepresentatie van de collectie van NameValueHeaderValue‑klasse‑instanties. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | Retourneert een tekenreeksrepresentatie van de collectie van NameValueHeaderValue‑klasse‑instanties. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | Probeert een meegegeven string te converteren naar een instantie van de [NameValueHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
