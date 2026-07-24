---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::BitmapData class. Vertegenwoordigt een reeks attributen van een bitmap‑afbeelding. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


Vertegenwoordigt een reeks attributen van een bitmap‑afbeelding. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class BitmapData : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Height](./get_height/)() const | Retourneert de hoogte van de afbeelding in pixels. |
| [get_PixelFormat](./get_pixelformat/)() const | Retourneert het pixelformaat van de bitmap‑afbeelding. |
| [get_Scan0](./get_scan0/)() const | Retourneert het adres van de eerste pixelgegevens in de bitmap. |
| [get_Stride](./get_stride/)() const | Retourneert de stride‑breedte van de afbeelding in bytes. |
| [get_Width](./get_width/)() const | Retourneert de breedte van de afbeelding in pixels. |
| [set_Height](./set_height/)(int) | Stelt de hoogte van de afbeelding in pixels in. |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | Stelt het pixelformaat van de bitmap‑afbeelding in. |
| [set_Scan0](./set_scan0/)(IntPtr) | Stelt het adres van de eerste pixelgegevens in de bitmap in. |
| [set_Stride](./set_stride/)(int) | Stelt de stride‑breedte van de afbeelding in bytes in. |
| [set_Width](./set_width/)(int) | Stelt de breedte van de afbeelding in pixels in. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
