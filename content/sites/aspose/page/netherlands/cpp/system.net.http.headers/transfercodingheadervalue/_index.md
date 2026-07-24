---
title: "System::Net::Http::Headers::TransferCodingHeaderValue klasse"
linktitle: "TransferCodingHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue klasse. Vertegenwoordigt een waarde van de ''Accept-Encoding'' header. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om het als argument door te geven aan functies in C++."
type: docs
weight: 2400
url: /nl/cpp/system.net.http.headers/transfercodingheadervalue/
---
## TransferCodingHeaderValue class


Vertegenwoordigt een waarde van de 'Accept-Encoding' header. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om het als argument door te geven aan functies.

```cpp
class TransferCodingHeaderValue : public virtual System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Parameters](./get_parameters/)() | Retourneert de parameters. |
| [get_Value](./get_value/)() | RTTI-informatie. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetTransferCodingLength](./gettransfercodinglength/)(String, int32_t, const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\&, System::SharedPtr\<TransferCodingHeaderValue\>\&) | Converteert een meegegeven tekenreeks vanaf de opgegeven index naar een instantie van de [TransferCodingHeaderValue](./) klasse. |
| static [Parse](./parse/)(String) | Converteert een meegegeven tekenreeks naar een instantie van de [TransferCodingHeaderValue](./) klasse. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)() | Construeert een nieuw exemplaar. |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)(String) | Construeert een nieuw exemplaar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingHeaderValue\>\&) | Probeert een meegegeven tekenreeks te converteren naar een instantie van de [TransferCodingHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
