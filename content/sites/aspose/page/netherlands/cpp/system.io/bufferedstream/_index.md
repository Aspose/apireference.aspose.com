---
title: "System::IO::BufferedStream klasse"
linktitle: "BufferedStream"
second_title: "Aspose.Page voor C++"
description: "System::IO::BufferedStream klasse. Voegt een bufferlaag toe bovenop een andere stream. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 1000
url: /nl/cpp/system.io/bufferedstream/
---
## BufferedStream class


Voegt een bufferlaag toe bovenop een andere stream. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class BufferedStream : public System::IO::Stream
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | Construeert een [BufferedStream](./) object dat de opgegeven stream omsluit en een buffer van 4096 bytes gebruikt. |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | Construeert een [BufferedStream](./) object dat de opgegeven stream omsluit en een buffer van de opgegeven grootte gebruikt. |
| [Flush](./flush/)() override | Schrijft de inhoud van de buffer naar de onderliggende stream. |
| [get_CanRead](./get_canread/)() const override | Bepaalt of de stream leesbaar is. |
| [get_CanSeek](./get_canseek/)() const override | Bepaalt of de stroom zoeken ondersteunt. |
| [get_CanWrite](./get_canwrite/)() const override | Bepaalt of de stroom beschrijfbaar is. |
| [get_Length](./get_length/)() const override | Retourneert de lengte van de stream. |
| [get_Position](./get_position/)() const override | Retourneert de huidige positie van de stroom. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de onderliggende stream en schrijft ze naar de opgegeven byte‑array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de onderliggende stream en schrijft ze naar de opgegeven byte‑array. |
| [ReadByte](./readbyte/)() override | Leest een enkele byte van de onderliggende stream en retourneert een 32‑bit geheel getal dat gelijk is aan de waarde van de gelezen byte. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Stelt de positie in van de stream die wordt vertegenwoordigd door het huidige object. |
| [set_Position](./set_position/)(int64_t) override | Leegt de buffer naar de onderliggende stream en stelt vervolgens de positie van de stream in. |
| [SetLength](./setlength/)(int64_t) override | Stelt de lengte in van de stream die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven deelbereik van bytes uit de opgegeven byte‑array naar de onderliggende stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven deelbereik van bytes uit de opgegeven byte‑array naar de onderliggende stream. |
| [WriteByte](./writebyte/)(uint8_t) override | Schrijft de opgegeven ongetekende 8‑bit integerwaarde naar de onderliggende stream. |
| virtual [~BufferedStream](./~bufferedstream/)() | Destructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Null](../stream/null/) | Een stream zonder onderliggende opslag. |
## Zie ook

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
