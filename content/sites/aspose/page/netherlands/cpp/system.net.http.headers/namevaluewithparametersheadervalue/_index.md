---
title: "System::Net::Http::Headers::NameValueWithParametersHeaderValue‑klasse"
linktitle: "NameValueWithParametersHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::NameValueWithParametersHeaderValue‑klasse. Vertegenwoordigt een sleutel/waarde‑paar met parameters voor gebruik in headers. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1500
url: /nl/cpp/system.net.http.headers/namevaluewithparametersheadervalue/
---
## NameValueWithParametersHeaderValue class


Vertegenwoordigt een sleutel/waarde‑paar met parameters voor gebruik in headers. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class NameValueWithParametersHeaderValue : public System::Net::Http::Headers::NameValueHeaderValue
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Parameters](./get_parameters/)() | RTTI-informatie. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetNameValueWithParametersLength](./getnamevaluewithparameterslength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Zet een opgegeven tekenreeks vanaf de gespecificeerde index om naar een instantie van de [NameValueWithParametersHeaderValue](./)‑klasse. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String) | Construeert een nieuw exemplaar. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String, String) | Construeert een nieuw exemplaar. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)() | Construeert een nieuw exemplaar. |
| static [Parse](./parse/)(String) | Zet een opgegeven tekenreeks om naar een instantie van de [NameValueWithParametersHeaderValue](./)‑klasse. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueWithParametersHeaderValue\>\&) | Probeert een opgegeven tekenreeks om te zetten naar een instantie van de [NameValueWithParametersHeaderValue](./)‑klasse. |
## Zie ook

* Class [NameValueHeaderValue](../namevalueheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
