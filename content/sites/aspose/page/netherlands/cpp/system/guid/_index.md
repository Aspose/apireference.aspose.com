---
title: "System::Guid klasse"
linktitle: "Guid"
second_title: "Aspose.Page voor C++"
description: "System::Guid klasse. Vertegenwoordigt een Globaal Unieke Identifier. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr klasse om objecten van dit type te beheren in C++."
type: docs
weight: 3000
url: /nl/cpp/system/guid/
---
## Guid class


Vertegenwoordigt een Globaal Unieke Identifier. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/) klasse om objecten van dit type te beheren.

```cpp
class Guid
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | Voert een rekenkundige vergelijking uit van de GUID's die worden vertegenwoordigd door het huidige en het opgegeven object. |
| [Equals](./equals/)(const Guid\&) const | Bepaalt of de GUID's die worden vertegenwoordigd door het huidige en het opgegeven object gelijk zijn. |
| [GetHashCode](./gethashcode/)() const | Retourneert een hashcode voor het huidige object. |
| [Guid](./guid/)() | Construeert een object dat een GUID vertegenwoordigt die uit uitsluitend nullen bestaat. |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | Construeert een object dat een GUID vertegenwoordigt gespecificeerd als een array van ongetekende 8-bit gehele getallen. |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | Construeert een object dat een GUID vertegenwoordigt gespecificeerd als een array‑view van ongetekende 8-bit gehele getallen. |
| [Guid](./guid/)(const String\&) | Construeert een object dat een GUID vertegenwoordigt gespecificeerd als een tekenreeks. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | Construeert een instantie van de [Guid](./) klasse vanuit de opgegeven GUID‑componenten. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | Construeert een instantie van de [Guid](./) klasse vanuit de opgegeven GUID‑componenten. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Construeert een instantie van de [Guid](./) klasse vanuit de opgegeven ongetekende gehele getallen en bytes. |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Construeert een instantie van de [Guid](./) klasse vanuit de opgegeven ongetekende gehele getallen en bytes. |
| [Guid](./guid/)(const Guid\&) | Construeert een object dat dezelfde GUID vertegenwoordigt als het opgegeven object. |
| static [NewGuid](./newguid/)() | Genereert een nieuwe GUID en retourneert een [Guid](./) object dat deze vertegenwoordigt. |
| [operator!=](./operator!=/)(const Guid\&) const | Bepaalt of de GUID's die worden vertegenwoordigd door het huidige en het opgegeven object niet gelijk zijn. |
| [operator=](./operator=/)(const Guid\&) | Wijst aan het huidige object de GUID‑waarde toe die wordt vertegenwoordigd door het opgegeven [Guid](./) object. |
| [operator==](./operator==/)(const Guid\&) const | Bepaalt of de GUID's die worden vertegenwoordigd door het huidige en het opgegeven object gelijk zijn. |
| static [Parse](./parse/)(const String\&) | Converteert de opgegeven tekenreeksrepresentatie van een GUID naar een gelijkwaardig [Guid](./) object. |
| [ToByteArray](./tobytearray/)() const | Converteert de GUID die wordt vertegenwoordigd door het huidige object naar een array van bytes. |
| [ToString](./tostring/)() const | Converteert de GUID die wordt vertegenwoordigd door het huidige object naar zijn tekenreeksrepresentatie. |
| [ToString](./tostring/)(const String\&) const | Converteert de GUID die wordt vertegenwoordigd door het huidige object naar zijn tekenreeksrepresentatie met behulp van het opgegeven tekenreeksformaat. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | Converteert de GUID die wordt vertegenwoordigd door het huidige object naar zijn tekenreeksrepresentatie met behulp van het opgegeven tekenreeksformaat en cultuur. |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | Probeert de opgegeven tekenreeks te converteren naar een [Guid](./) object. |
| [~Guid](./~guid/)() | Destructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Stelt een GUID voor die de waarde 0 heeft. |
## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
