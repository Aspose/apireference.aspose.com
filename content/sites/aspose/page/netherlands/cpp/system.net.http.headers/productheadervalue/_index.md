---
title: "System::Net::Http::Headers::ProductHeaderValue klasse"
linktitle: "ProductHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::ProductHeaderValue klasse. Stelt een producttoken in een waarde van de ''User-Agent'' header voor. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1700
url: /nl/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


Stelt een producttoken in een waarde van de 'User-Agent' header voor. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class ProductHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Name](./get_name/)() | RTTI-informatie. |
| [get_Version](./get_version/)() | Retourneert de producttoken‑versie. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | Converteert een meegegeven tekenreeks vanaf de opgegeven index naar een instantie van de [ProductHeaderValue](./) klasse. |
| static [Parse](./parse/)(String) | Converteert een meegegeven tekenreeks naar een instantie van de [ProductHeaderValue](./) klasse. |
| [ProductHeaderValue](./productheadervalue/)(String) | Construeert een nieuw exemplaar. |
| [ProductHeaderValue](./productheadervalue/)(String, String) | Construeert een nieuw exemplaar. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | Probeert een meegegeven tekenreeks te converteren naar een instantie van de [ProductHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
