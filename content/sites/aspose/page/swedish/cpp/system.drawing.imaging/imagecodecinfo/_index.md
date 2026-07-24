---
title: "System::Drawing::Imaging::ImageCodecInfo-klass"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Page för C++"
description: "System::Drawing::Imaging::ImageCodecInfo-klass. Tillhandahåller information om en bildkodare. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 1000
url: /sv/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


Tillhandahåller information om en bildkodare. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class ImageCodecInfo : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | Returnerar en GUID som är associerad med formatet för den kodare som representeras av det aktuella objektet. |
| [get_MimeType](./get_mimetype/)() | Returnerar Multipurpose Internet Mail Extensions (MIME)-typen för den kodare som representeras av det aktuella objektet. |
| static [GetImageDecoders](./getimagedecoders/)() | Returnerar en array av [ImageCodecInfo](./)-objekt som representerar stödda bildavkodare. |
| static [GetImageEncoders](./getimageencoders/)() | Returnerar en array av [ImageCodecInfo](./)-objekt som representerar stödda bildkodare. |
| [set_FormatID](./set_formatid/)(const Guid\&) | Ställer in en GUID som är associerad med formatet för den kodare som representeras av det aktuella objektet. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
