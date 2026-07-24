---
title: "System::Drawing::Imaging::ImageCodecInfo klasse"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::ImageCodecInfo klasse. Biedt informatie over een afbeeldingscodec. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1000
url: /nl/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


Biedt informatie over een afbeeldingscodec. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ImageCodecInfo : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | Retourneert een GUID die is gekoppeld aan het formaat van de codec die door het huidige object wordt vertegenwoordigd. |
| [get_MimeType](./get_mimetype/)() | Retourneert het Multipurpose Internet Mail Extensions (MIME)-type van de codec die door het huidige object wordt vertegenwoordigd. |
| static [GetImageDecoders](./getimagedecoders/)() | Retourneert een array van [ImageCodecInfo](./)-objecten die ondersteunde afbeeldingsdecoders vertegenwoordigen. |
| static [GetImageEncoders](./getimageencoders/)() | Retourneert een array van [ImageCodecInfo](./)-objecten die ondersteunde afbeeldingsencoders vertegenwoordigen. |
| [set_FormatID](./set_formatid/)(const Guid\&) | Stelt een GUID in die is gekoppeld aan het formaat van de codec die door het huidige object wordt vertegenwoordigd. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
