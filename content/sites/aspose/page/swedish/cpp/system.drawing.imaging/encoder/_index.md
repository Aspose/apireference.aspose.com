---
title: "System::Drawing::Imaging::Encoder class"
linktitle: "Encoder"
second_title: "Aspose.Page för C++"
description: "System::Drawing::Imaging::Encoder-klass. Representerar en GUID som är associerad med en uppsättning bildkodarparametrar. Objekt av denna klass bör endast allokeras med System::MakeObject()‑funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 500
url: /sv/cpp/system.drawing.imaging/encoder/
---
## Encoder class


Representerar en GUID som är associerad med en uppsättning bildkodarparametrar. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class Encoder : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Encoder](./encoder/)(const Guid\&) | Skapar en ny instans av [Encoder](./)-klassen. |
| [get_Guid](./get_guid/)() const | Returnerar en GUID som specificerar en uppsättning bildkodarparametrar som det aktuella objektet representerar. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [ChrominanceTable](./chrominancetable/) | En instans av [Encoder](./)-klassen som representerar krominans‑tabellens parameterkategori. |
| static [ColorDepth](./colordepth/) | En instans av [Encoder](./)-klassen som representerar färgdjupparameterkategorin. |
| static [Compression](./compression/) | En instans av [Encoder](./)-klassen som representerar komprimeringsparameterkategorin. |
| static [LuminanceTable](./luminancetable/) | En instans av [Encoder](./)-klassen som representerar luminanstabellparameterkategorin. |
| static [Quality](./quality/) | En instans av [Encoder](./)-klassen som representerar kvalitetsparameterkategorin. |
| static [RenderMethod](./rendermethod/) | En instans av [Encoder](./)-klassen som representerar renderingsmetodparameterkategorin. |
| static [SaveFlag](./saveflag/) | En instans av [Encoder](./)-klassen som representerar sparaflaggparameterkategorin. |
| static [ScanMethod](./scanmethod/) | En instans av [Encoder](./)-klassen som representerar skanningsmetodparameterkategorin. |
| static [Transformation](./transformation/) | En instans av [Encoder](./)-klassen som representerar transformationsparameterkategorin. |
| static [Version](./version/) | En instans av [Encoder](./)-klassen som representerar versionsparameterkategorin. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
