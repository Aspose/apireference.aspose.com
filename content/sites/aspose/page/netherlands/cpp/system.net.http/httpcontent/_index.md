---
title: "System::Net::Http::HttpContent klasse"
linktitle: "HttpContent"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::HttpContent klasse. Vertegenwoordigt de inhoud van een HTTP‑entity. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.net.http/httpcontent/
---
## HttpContent class


Vertegenwoordigt de inhoud van een HTTP‑entity. [Object](../../system/object/) van deze klasse mag alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class HttpContent : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Dispose](./dispose/)() override | Disposeert de huidige instantie. Deze methode disposeert ook de stream die wordt geretourneerd door 'ReadAsStream' en de geheugenbuffer als deze is aangemaakt. |
| [get_Headers](./get_headers/)() | Retourneert de HTTP-inhoudheaders. |
| [LoadIntoBuffer](./loadintobuffer/)() | Serialiseert inhoud naar een geheugenbuffer. |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | Serialiseert inhoud naar een geheugenbuffer. |
| [ReadAsByteArray](./readasbytearray/)() | Serialiseert inhoud en retourneert een byte‑array. |
| [ReadAsStream](./readasstream/)() | Serialiseert inhoud en retourneert een stream. |
| [ReadAsString](./readasstring/)() | Serialiseert inhoud en retourneert een string. |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | Probeert de inhoudsgrootte te berekenen. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | De standaardcodering. |
| static [MaxBufferSize](./maxbuffersize/) | Het maximum aantal bytes. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
