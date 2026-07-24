---
title: "System::Net::Http::Headers::MediaTypeHeaderValue‑klasse"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue‑klasse. Vertegenwoordigt een MIME‑type in de waarde van de ''Content-Type''‑header. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1200
url: /nl/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


Vertegenwoordigt een MIME‑type in de waarde van de 'Content-Type'‑header. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_CharSet](./get_charset/)() | RTTI-informatie. |
| [get_MediaType](./get_mediatype/)() | Haalt een waarde op van de media‑type‑header. |
| [get_Parameters](./get_parameters/)() | Retourneert de waardeparemeters van de media‑type‑header. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Zet een opgegeven tekenreeks vanaf de gespecificeerde index om naar een instantie van de [MediaTypeHeaderValue](./)‑klasse. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | Construeert een nieuw exemplaar. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | Construeert een nieuw exemplaar. |
| static [Parse](./parse/)(String) | Zet een opgegeven tekenreeks om naar een instantie van de [MediaTypeHeaderValue](./)‑klasse. |
| [set_CharSet](./set_charset/)(String) | Stelt een tekenset in. |
| [set_MediaType](./set_mediatype/)(String) | Stelt een waarde van de media-type header in. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Probeert een doorgegeven string om te zetten naar een instantie van de [MediaTypeHeaderValue](./) klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
