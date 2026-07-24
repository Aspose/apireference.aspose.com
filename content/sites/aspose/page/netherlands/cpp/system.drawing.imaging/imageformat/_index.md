---
title: "System::Drawing::Imaging::ImageFormat klasse"
linktitle: "ImageFormat"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::ImageFormat klasse. Vertegenwoordigt het bestandsformaat van een afbeelding. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1100
url: /nl/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Vertegenwoordigt het bestandsformaat van een afbeelding. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ImageFormat : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Bepaalt of de afbeeldingsformaten die door het huidige en het opgegeven object worden vertegenwoordigd gelijk zijn. |
| static [get_Bmp](./get_bmp/)() | Retourneert een gedeelde pointer naar een [ImageFormat](./) object dat het bitmap‑afbeeldingsformaat vertegenwoordigt. |
| static [get_Emf](./get_emf/)() | Retourneert een gedeelde pointer naar een [ImageFormat](./) object dat het enhanced metafile‑formaat vertegenwoordigt. |
| static [get_Exif](./get_exif/)() | Retourneert een gedeelde pointer naar een [ImageFormat](./) object dat het Exchangeable [Image](../../system.drawing/image/) File (Exif)‑formaat vertegenwoordigt. |
| static [get_Gif](./get_gif/)() | Retourneert een gedeelde pointer naar een [ImageFormat](./) object dat het [Graphics](../../system.drawing/graphics/) Interchange Format (GIF)‑afbeeldingsformaat vertegenwoordigt. |
| [get_Guid](./get_guid/)() const | Retourneert de GUID die is gekoppeld aan het afbeeldingsformaat dat door het huidige object wordt vertegenwoordigd. |
| static [get_Icon](./get_icon/)() | Retourneert een gedeelde pointer naar een [ImageFormat](./) object dat het [Windows](../../system.windows/) pictogram‑afbeeldingsformaat vertegenwoordigt. |
| static [get_Jpeg](./get_jpeg/)() | Retourneert een gedeelde pointer naar een [ImageFormat](./) object dat het Joint Photographic Experts Group (JPEG)‑afbeeldingsformaat vertegenwoordigt. |
| static [get_MemoryBmp](./get_memorybmp/)() | Retourneert een gedeelde pointer naar een [ImageFormat](./) object dat het formaat van een bitmap in het geheugen vertegenwoordigt. |
| static [get_Png](./get_png/)() | Retourneert een gedeelde pointer naar een [ImageFormat](./) object dat het W3C Portable Network [Graphics](../../system.drawing/graphics/) (PNG)‑afbeeldingsformaat vertegenwoordigt. |
| static [get_Tiff](./get_tiff/)() | Retourneert een gedeelde pointer naar een [ImageFormat](./) object dat het Tagged [Image](../../system.drawing/image/) File Format (TIFF)‑afbeeldingsformaat vertegenwoordigt. |
| static [get_Wmf](./get_wmf/)() | Retourneert een gedeelde pointer naar een [ImageFormat](./) object dat het [Windows](../../system.windows/) metafile (WMF)‑afbeeldingsformaat vertegenwoordigt. |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Construeert een instantie van de [ImageFormat](./) klasse die een afbeeldingsformaat vertegenwoordigt dat is gekoppeld aan de opgegeven GUID. |
| virtual [ToString](./tostring/)() const | Converteert dit [ImageFormat](./) object naar een menselijk leesbare tekenreeks. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
