---
title: "System::Net::Http::Headers::ViaHeaderValue klass"
linktitle: "ViaHeaderValue"
second_title: "Aspose.Page för C++"
description: "System::Net::Http::Headers::ViaHeaderValue klass. Representerar ett värde för ''Via''-headern. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 2600
url: /sv/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


Representerar ett värde för 'Via'-headern. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/) pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class ViaHeaderValue : public System::ICloneable
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Jämför objekt med C# [Object.Equals](../../system/object/equals/) semantik. |
| [get_Comment](./get_comment/)() | Returnerar kommentaren från 'Via'-headervärdet. |
| [get_ProtocolName](./get_protocolname/)() | RTTI-information. |
| [get_ProtocolVersion](./get_protocolversion/)() | Returnerar protokollversionen från 'Via'-headervärdet. |
| [get_ReceivedBy](./get_receivedby/)() | Returnerar värdena för värd och port som begäran eller svaret mottogs av. |
| [GetHashCode](./gethashcode/)() const override | Analog till C# [Object.GetHashCode()](../../system/object/gethashcode/)-metoden. Möjliggör hashning av anpassade objekt. |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konverterar en given sträng från det angivna indexet till en instans av [ViaHeaderValue](./) klass. |
| static [Parse](./parse/)(String) | Konverterar en given sträng till en instans av [ViaHeaderValue](./) klass. |
| [ToString](./tostring/)() const override | Analog till C# [Object.ToString()](../../system/object/tostring/) metod. Gör det möjligt att konvertera anpassade objekt till sträng. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | Försöker konvertera en given sträng till en instans av [ViaHeaderValue](./) klass. |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | Skapar en ny instans. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | Skapar en ny instans. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | Skapar en ny instans. |
## Se även

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
