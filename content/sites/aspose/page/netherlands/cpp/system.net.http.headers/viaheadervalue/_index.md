---
title: "System::Net::Http::Headers::ViaHeaderValue klasse"
linktitle: "ViaHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::ViaHeaderValue klasse. Stelt een waarde voor van de ''Via'' header. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 2600
url: /nl/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


Stelt een waarde voor van de 'Via' header. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class ViaHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Comment](./get_comment/)() | Retourneert de opmerking uit de 'Via' headerwaarde. |
| [get_ProtocolName](./get_protocolname/)() | RTTI-informatie. |
| [get_ProtocolVersion](./get_protocolversion/)() | Retourneert de protocolversie uit de 'Via' headerwaarde. |
| [get_ReceivedBy](./get_receivedby/)() | Retourneert de host en poort waarop het verzoek of de respons werd ontvangen. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Converteert een meegegeven string vanaf de opgegeven index naar een instantie van de [ViaHeaderValue](./) klasse. |
| static [Parse](./parse/)(String) | Converteert een meegegeven string naar een instantie van de [ViaHeaderValue](./) klasse. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | Probeert een meegegeven string te converteren naar een instantie van de [ViaHeaderValue](./) klasse. |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | Construeert een nieuw exemplaar. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | Construeert een nieuw exemplaar. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | Construeert een nieuw exemplaar. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
