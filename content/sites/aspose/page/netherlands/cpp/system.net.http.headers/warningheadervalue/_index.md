---
title: "System::Net::Http::Headers::WarningHeaderValue klasse"
linktitle: "WarningHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::WarningHeaderValue klasse. Vertegenwoordigt een waarde van de ''Warning'' header. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2700
url: /nl/cpp/system.net.http.headers/warningheadervalue/
---
## WarningHeaderValue class


Vertegenwoordigt een waarde van de 'Warning' header. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class WarningHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Agent](./get_agent/)() | Retourneert de host die aan de waarschuwing is gekoppeld. |
| [get_Code](./get_code/)() | RTTI-informatie. |
| [get_Date](./get_date/)() | Retourneert de datum‑tijd van de waarschuwing. |
| [get_Text](./get_text/)() | Retourneert de waarschuwingstekst. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetWarningLength](./getwarninglength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converteert een meegegeven string vanaf de opgegeven index naar een instantie van de [WarningHeaderValue](./) klasse. |
| static [Parse](./parse/)(String) | Converteert een meegegeven string naar een instantie van de [WarningHeaderValue](./) klasse. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<WarningHeaderValue\>\&) | Probeert een meegegeven string om te zetten naar een instantie van de [WarningHeaderValue](./) klasse. |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String) | Construeert een nieuw exemplaar. |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String, DateTimeOffset) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
