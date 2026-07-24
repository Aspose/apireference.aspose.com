---
title: "System::IO::MemoryStream class"
linktitle: "MemoryStream"
second_title: "Aspose.Page voor C++"
description: "System::IO::MemoryStream class. Vertegenwoordigt een stream die van geheugen leest en ernaar schrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1800
url: /nl/cpp/system.io/memorystream/
---
## MemoryStream class


Vertegenwoordigt een stream die van geheugen leest en ernaar schrijft. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class MemoryStream : public System::IO::Stream
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Sluit de stream. |
| [Flush](./flush/)() override | Doet niets. |
| [get_CanRead](./get_canread/)() const override | Bepaalt of de stream leesbaar is. |
| [get_CanSeek](./get_canseek/)() const override | Bepaalt of de stroom zoeken ondersteunt. |
| [get_CanWrite](./get_canwrite/)() const override | Bepaalt of de stroom beschrijfbaar is. |
| [get_Capacity](./get_capacity/)() | Retourneert de huidige capaciteit van de onderliggende geheugenbuffer. |
| [get_Length](./get_length/)() const override | Retourneert de lengte van de stroom in bytes. |
| [get_Position](./get_position/)() const override | Retourneert de huidige positie van de stroom. |
| virtual [GetBuffer](./getbuffer/)() | Retourneert een pointer naar de onderliggende buffer. |
| [MemoryStream](./memorystream/)() | Construeert een nieuwe instantie van de [MemoryStream](./)-klasse met een initiële capaciteit gelijk aan 0. |
| [MemoryStream](./memorystream/)(int) | Construeert een nieuwe instantie van de [MemoryStream](./)-klasse die een stream vertegenwoordigt gebaseerd op een geheugenbuffer van de opgegeven grootte. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | Construeert een nieuwe instantie van de [MemoryStream](./)-klasse die een geheugenstream vertegenwoordigt die is verbonden met de opgegeven geheugenbuffer. Een parameter geeft aan of de stream schrijfbaar is. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | Construeert een nieuwe instantie van de [MemoryStream](./)-klasse die een geheugenstream vertegenwoordigt die is verbonden met een segment van de opgegeven geheugenbuffer, beginnend bij de opgegeven index en inclusief het opgegeven aantal elementen. Parameters geven aan of de stream schrijfbaar is en of de methode GetBytes() kan worden aangeroepen. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [ReadByte](./readbyte/)() override | Leest een enkel byte uit de stream en retourneert een 32‑bit geheel getalwaarde die gelijk is aan de waarde van het gelezen byte. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Stelt de positie in van de stream die wordt vertegenwoordigd door het huidige object. |
| [set_Capacity](./set_capacity/)(int) | Stelt de capaciteit van de onderliggende geheugenbuffer in. |
| [set_Position](./set_position/)(int64_t) override | Stelt de positie van de stream in. |
| [SetLength](./setlength/)(int64_t) override | Stelt de lengte in van de stream die wordt vertegenwoordigd door het huidige object. |
| virtual [ToArray](./toarray/)() | Retourneert een kopie van de onderliggende geheugenbuffer als een byte‑array. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | Retourneert de array van ongetekende bytes waaruit deze stream is gemaakt. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| [WriteByte](./writebyte/)(uint8_t) override | Schrijft de opgegeven onondertekende 8‑bit gehele getalwaarde naar de stream. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | Schrijft de inhoud van de onderliggende buffer naar de opgegeven stream. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Null](../stream/null/) | Een stream zonder onderliggende opslag. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een shared pointer naar zichzelf. |
## Zie ook

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
