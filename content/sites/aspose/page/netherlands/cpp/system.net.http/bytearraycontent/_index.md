---
title: "System::Net::Http::ByteArrayContent class"
linktitle: "ByteArrayContent"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::ByteArrayContent class. Vertegenwoordigt HTTP-inhoud als een byte-array. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime-fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


Vertegenwoordigt HTTP-inhoud als een byte-array. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime-fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | RTTI-informatie. |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Construeert een nieuw exemplaar. |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | Probeert de lengte van de byte-array te berekenen. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | De standaardcodering. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Het maximum aantal bytes. |
## Zie ook

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
