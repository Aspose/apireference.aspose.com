---
title: "System::Drawing::Bitmap class"
linktitle: "Bitmap"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Bitmap‑klasse. Vertegenwoordigt een GDI+ bitmap‑afbeelding. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.drawing/bitmap/
---
## Bitmap class


Vertegenwoordigt een GDI+ bitmap‑afbeelding. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Bitmap : public System::Drawing::Image
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | Schakelt de pixelverwerkingsmodus in. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | Construeert een nieuw [Bitmap](./)‑object uit de opgegeven bestaande afbeelding. |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | Construeert een nieuw [Bitmap](./)‑object uit de opgegeven stream. |
| [Bitmap](./bitmap/)(const String\&) | Construeert een nieuw [Bitmap](./)‑object uit het opgegeven bestand. |
| [Bitmap](./bitmap/)(const String\&, bool) | Construeert een nieuw [Bitmap](./)‑object uit het opgegeven bestand. |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | Construeert een nieuw [Bitmap](./)‑object dat een bitmap‑afbeelding vertegenwoordigt met de opgegeven breedte, hoogte, pixelindeling en pixelgegevens. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | Construeert een nieuw [Bitmap](./)‑object uit de opgegeven bestaande afbeelding, geschaald naar de opgegeven grootte. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | Construeert een nieuw [Bitmap](./)‑object uit de opgegeven bestaande afbeelding met breedte en hoogte geschaald naar de opgegeven waarden. |
| [Clone](./clone/)() override | Maakt een kopie van het huidige object. |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | Maakt een [Bitmap](./)‑object dat een kopie vertegenwoordigt van een regio van de bitmap‑afbeelding die door het huidige object wordt vertegenwoordigd. |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | Maakt een [Bitmap](./)‑object dat een kopie vertegenwoordigt van een regio van de bitmap‑afbeelding die door het huidige object wordt vertegenwoordigd. |
| [ComputeHash](./computehash/)() | Berekent de SHA1‑hashwaarde. |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | Maakt een kopie van de opgegeven bitmap‑afbeelding met de pixelindeling gewijzigd naar Format32bppArgb. |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | Schakelt de pixelverwerkingsmodus uit. |
| [get_Height](./get_height/)() const override | Retourneert de hoogte van de afbeelding in pixels. |
| [get_Palette](./get_palette/)() const override | Retourneert het kleurenpalet dat wordt gebruikt door de afbeelding die door het huidige object wordt weergegeven. |
| [get_PixelFormat](./get_pixelformat/)() const override | Retourneert het pixelformaat van de afbeelding die door het huidige object wordt weergegeven. |
| [get_RawFormat](./get_rawformat/)() const override | Retourneert het bestandsformaat van de afbeelding die door het huidige object wordt weergegeven. |
| [get_Width](./get_width/)() const override | Retourneert de breedte van de afbeelding in pixels. |
| [GetHbitmap](./gethbitmap/)() | Maakt een GDI‑bitmap‑object van de bitmap die door het huidige object wordt vertegenwoordigd. |
| [GetPixel](./getpixel/)(int, int) | Retourneert de kleur van de opgegeven pixel. |
| [GetSkBitmap](./getskbitmap/)() const override | Retourneert een ruwe pointer naar het onderliggende SkBitmap-object. |
| [IsMultiImage](./ismultiimage/)() const override | Retourneert of het oorspronkelijke formaat een multi-afbeelding is. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | Vergrendelt een [Bitmap](./) in het systeemgeheugen. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | Vergrendelt een [Bitmap](./) in het systeemgeheugen. |
| [MakeTransparent](./maketransparent/)(Color) | Wijzigt de kleur van alle pixels met de opgegeven kleur naar transparant. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | Premultipliseert de kleuren van de pixels van de afbeelding die door het huidige object wordt vertegenwoordigd. |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | Roteert de afbeelding met een veelvoud van 90 graden en spiegelt. |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | Stelt het kleurenpalet in dat wordt gebruikt door de afbeelding die door het huidige object wordt weergegeven. |
| [SetPixel](./setpixel/)(int, int, Color) | Stelt de kleur in van de opgegeven pixel in de bitmapafbeelding die door het huidige object wordt vertegenwoordigd. |
| [SetResolution](./setresolution/)(float, float) | Stelt de resolutie van de afbeelding in. |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | Ontgrendelt de opgegeven bitmap uit het systeemgeheugen. |
## Zie ook

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
