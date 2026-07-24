---
title: "System::Net::Http::Headers::ProductInfoHeaderValue klasse"
linktitle: "ProductInfoHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::ProductInfoHeaderValue klasse. Stelt een product of een opmerking voor in een waarde van de ''User-Agent'' header. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1800
url: /nl/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


Stelt een product of een opmerking voor in een waarde van de 'User-Agent' header. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Comment](./get_comment/)() | Retourneert een opmerking. |
| [get_Product](./get_product/)() | RTTI-informatie. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Converteert een meegegeven string vanaf de opgegeven index naar een instantie van de [ProductInfoHeaderValue](./) klasse. |
| static [Parse](./parse/)(String) | Converteert een meegegeven string naar een instantie van de [ProductInfoHeaderValue](./) klasse. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | Construeert een nieuw exemplaar. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | Construeert een nieuw exemplaar. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | Construeert een nieuw exemplaar. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Probeert een meegegeven string te converteren naar een instantie van de [ProductInfoHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
