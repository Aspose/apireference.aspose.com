---
title: "System::Net::Http::Headers::RetryConditionHeaderValue klasse"
linktitle: "RetryConditionHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::RetryConditionHeaderValue klasse. Vertegenwoordigt een waarde van de ''Retry-After'' header. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2200
url: /nl/cpp/system.net.http.headers/retryconditionheadervalue/
---
## RetryConditionHeaderValue class


Vertegenwoordigt een waarde van de 'Retry-After' header. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class RetryConditionHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Date](./get_date/)() | RTTI-informatie. |
| [get_Delta](./get_delta/)() | Retourneert de delta‑waarde. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetRetryConditionLength](./getretryconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converteert een meegegeven tekenreeks vanaf de opgegeven index naar een instantie van de [RetryConditionHeaderValue](./) klasse. |
| static [Parse](./parse/)(String) | Converteert een meegegeven tekenreeks naar een instantie van de [RetryConditionHeaderValue](./) klasse. |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(DateTimeOffset) | Construeert een nieuw exemplaar. |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(TimeSpan) | Construeert een nieuw exemplaar. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RetryConditionHeaderValue\>\&) | Probeert een meegegeven tekenreeks te converteren naar een instantie van de [RetryConditionHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
