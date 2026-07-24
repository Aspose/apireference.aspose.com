---
title: "System::IO::FileStream class"
linktitle: "FileStream"
second_title: "Aspose.Page voor C++"
description: "System::IO::FileStream class. Vertegenwoordigt een bestandsstroom die synchronische en asynchrone lees- en schrijfoperaties ondersteunt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1500
url: /nl/cpp/system.io/filestream/
---
## FileStream class


Vertegenwoordigt een bestandsstroom die synchronische en asynchrone lees- en schrijfoperaties ondersteunt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class FileStream : public System::IO::Stream
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Sluit het huidige [FileStream](./) object. |
| [FileStream](./filestream/)(const String\&, FileMode) | Construeert een nieuwe instantie van de [FileStream](./) klasse en initialiseert deze met de opgegeven parameters. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | Construeert een nieuwe instantie van de [FileStream](./) klasse en initialiseert deze met de opgegeven parameters. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | Construeert een nieuwe instantie van de [FileStream](./) klasse en initialiseert deze met de opgegeven parameters. |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | Leegt de buffers van deze stroom en schrijft alle gebufferde gegevens naar het onderliggende bestand. |
| [Flush](./flush/)(bool) | Leegt de buffers van deze stroom en schrijft alle gebufferde gegevens naar het onderliggende bestand. Synoniem voor de methode [Flush()](./flush/). |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | Maakt asynchroon alle buffers voor deze stream leeg, zorgt ervoor dat alle gebufferde gegevens naar het onderliggende apparaat worden geschreven, en bewaakt annuleringsverzoeken. |
| [get_CanRead](./get_canread/)() const override | Bepaalt of de stream leesbaar is. |
| [get_CanSeek](./get_canseek/)() const override | Bepaalt of de stroom zoeken ondersteunt. |
| [get_CanWrite](./get_canwrite/)() const override | Bepaalt of de stroom beschrijfbaar is. |
| [get_Length](./get_length/)() const override | Retourneert de lengte van de stroom in bytes. |
| [get_Name](./get_name/)() const | Retourneert de naam van het bestand dat door het huidige [FileStream](./) object wordt ingekapseld. |
| [get_Position](./get_position/)() const override | Retourneert de huidige positie van de stroom. |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Leest asynchroon een reeks bytes van de huidige stream, verplaatst de positie binnen de stream met het aantal gelezen bytes, en bewaakt annuleringsverzoeken. |
| [ReadByte](./readbyte/)() override | Leest een enkel byte uit de stream en retourneert een 32‑bit geheel getalwaarde die gelijk is aan de waarde van het gelezen byte. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Stelt de positie in van de stream die wordt vertegenwoordigd door het huidige object. |
| [set_Position](./set_position/)(int64_t) override | Leegt de stream en stelt vervolgens de positie van de stream in. |
| [SetLength](./setlength/)(int64_t) override | Stelt de lengte in van de stream die wordt vertegenwoordigd door het huidige object. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Schrijft asynchroon een reeks bytes naar de huidige stream, verplaatst de huidige positie binnen deze stream met het aantal geschreven bytes, en bewaakt annuleringsverzoeken. |
| [WriteByte](./writebyte/)(uint8_t) override | Schrijft de opgegeven onondertekende 8‑bit gehele getalwaarde naar de stream. |
| [~FileStream](./~filestream/)() | Destructor. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | Standaardwaarde van het aantal bytes dat gebufferd wordt tijdens lees- en schrijfoperaties. |
| static [Null](../stream/null/) | Een stream zonder onderliggende opslag. |
## Zie ook

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
