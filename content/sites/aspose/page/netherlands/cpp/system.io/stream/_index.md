---
title: "System::IO::Stream klasse"
linktitle: "Stream"
second_title: "Aspose.Page voor C++"
description: "System::IO::Stream klasse. Een basisklasse voor verschillende stream‑implementaties. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2100
url: /nl/cpp/system.io/stream/
---
## Stream class


Een basisklasse voor verschillende stream‑implementaties. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Stream : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Initieert een asynchrone leesbewerking. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Initieert een asynchrone schrijfbewerking. |
| virtual [Close](./close/)() | Sluit de stream. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | Kopieert bytes naar de opgegeven stream. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | Kopieert bytes naar de opgegeven stream, met gebruik van de opgegeven buffergrootte. |
| [Dispose](./dispose/)() override | Vrijgeeft alle resources die door het huidige object worden gebruikt en sluit de stream. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | Wacht tot de opgegeven asynchrone leesbewerking is voltooid. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | Beëindigt een asynchrone schrijfbewerking. Wacht tot de opgegeven asynchrone schrijfbewerking is voltooid. |
| virtual [Flush](./flush/)() | Leegt de buffers van deze stroom en schrijft alle gebufferde gegevens naar de onderliggende opslag. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | Maakt asynchroon alle buffers voor deze stream leeg, zorgt ervoor dat alle gebufferde gegevens naar het onderliggende apparaat worden geschreven, en bewaakt annuleringsverzoeken. |
| [FlushAsync](./flushasync/)() | Maakt asynchroon alle buffers voor deze stream leeg, zorgt ervoor dat alle gebufferde gegevens naar het onderliggende apparaat worden geschreven, en bewaakt annuleringsverzoeken. |
| virtual [get_CanRead](./get_canread/)() const | Bepaalt of de stream leesbaar is. |
| virtual [get_CanSeek](./get_canseek/)() const | Bepaalt of de stroom zoeken ondersteunt. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | Haalt een waarde op die bepaalt of de huidige stroom kan time-out gaan. |
| virtual [get_CanWrite](./get_canwrite/)() const | Bepaalt of de stroom beschrijfbaar is. |
| virtual [get_Length](./get_length/)() const | Retourneert de lengte van de stroom in bytes. |
| virtual [get_Position](./get_position/)() const | Retourneert de huidige positie van de stroom. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | Haalt een waarde op, in milliseconden, die bepaalt hoe lang de stroom zal proberen te lezen voordat er een time-out optreedt. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | Haalt een waarde op, in milliseconden, die bepaalt hoe lang de stream zal proberen te schrijven voordat er een time‑out optreedt. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Leest asynchroon een reeks bytes van de huidige stream, verplaatst de positie binnen de stream met het aantal gelezen bytes, en bewaakt annuleringsverzoeken. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Leest asynchroon een reeks bytes van de huidige stream, verplaatst de positie binnen de stream met het aantal gelezen bytes, en bewaakt annuleringsverzoeken. |
| virtual [ReadByte](./readbyte/)() | Leest een enkel byte uit de stream en retourneert een 32‑bit geheel getalwaarde die gelijk is aan de waarde van het gelezen byte. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | Stelt de positie in van de stream die wordt vertegenwoordigd door het huidige object. |
| virtual [set_Position](./set_position/)(int64_t) | Stelt de positie van de stream in. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | Stelt een waarde in die bepaalt of de huidige stream kan time‑out gaan. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | Stelt een waarde in, in milliseconden, die bepaalt hoe lang de stream zal proberen te lezen voordat er een time‑out optreedt. |
| virtual [SetLength](./setlength/)(int64_t) | Stelt de lengte in van de stream die wordt vertegenwoordigd door het huidige object. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Schrijft asynchroon een reeks bytes naar de huidige stream, verplaatst de huidige positie binnen deze stream met het aantal geschreven bytes, en bewaakt annuleringsverzoeken. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Schrijft asynchroon een reeks bytes naar de huidige stream, verplaatst de huidige positie binnen deze stream met het aantal geschreven bytes, en bewaakt annuleringsverzoeken. |
| virtual [WriteByte](./writebyte/)(uint8_t) | Schrijft de opgegeven onondertekende 8‑bit gehele getalwaarde naar de stream. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Null](./null/) | Een stream zonder onderliggende opslag. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een shared pointer naar deze klasse. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
