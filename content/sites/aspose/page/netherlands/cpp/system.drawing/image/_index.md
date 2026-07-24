---
title: "System::Drawing::Image klasse"
linktitle: "Afbeelding"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Image klasse. Een basisklasse voor System::Drawing::Bitmap en System::Drawing::Metafile klassen die basisfunctionaliteit biedt. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Plaats deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1200
url: /nl/cpp/system.drawing/image/
---
## Image class


Een basisklasse voor [System::Drawing::Bitmap](../bitmap/) en System::Drawing::Metafile klassen die basisfunctionaliteit biedt. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Plaats deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class Image : public virtual System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Clone](./clone/)() | Maakt een kopie van het huidige object. |
| [Dispose](./dispose/)() override | Vrijgeeft alle resources die door het huidige object zijn verkregen. |
| static [FromFile](./fromfile/)(const String\&, bool) | Maakt een [Image](./) object aan vanuit het opgegeven bestand. |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | Construeert een [Bitmap](../bitmap/) object van de opgegeven GDI-bitmap. |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | Maakt een [Image](./) object van de opgegeven stream. |
| virtual [get_Flags](./get_flags/)() const | Retourneert een bitgewijze combinatie van ImageFlags enum-waarden die de attributen van de afbeelding vertegenwoordigen. |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | Retourneert een array van GUID's die de afmetingen van frames binnen de afbeelding vertegenwoordigen die door het huidige object wordt weergegeven. |
| virtual [get_Height](./get_height/)() const | Retourneert de hoogte van de afbeelding in pixels. |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | Retourneert de horizontale resolutie van de afbeelding die door het huidige object wordt weergegeven in pixels per inch. |
| virtual [get_Palette](./get_palette/)() const | Retourneert het kleurenpalet dat wordt gebruikt door de afbeelding die door het huidige object wordt weergegeven. |
| virtual [get_PixelFormat](./get_pixelformat/)() const | Retourneert het pixelformaat van de afbeelding die door het huidige object wordt weergegeven. |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | Haalt de ID's op van de eigenschapselementen die in deze afbeelding zijn opgeslagen. |
| virtual [get_PropertyItems](./get_propertyitems/)() const | Haalt alle eigenschapselementen (onderdelen van metadata) op die in deze afbeelding zijn opgeslagen. |
| virtual [get_RawFormat](./get_rawformat/)() const | Retourneert het bestandsformaat van de afbeelding die door het huidige object wordt weergegeven. |
| [get_Size](./get_size/)() const | Retourneert een [Size](../size/) object dat de breedte en hoogte van de afbeelding in pixels weergeeft. |
| virtual [get_Tag](./get_tag/)() const | Haalt een object op dat extra gegevens over de afbeelding levert. |
| [get_VerticalResolution](./get_verticalresolution/)() const | Retourneert de verticale resolutie van de afbeelding die door het huidige object wordt weergegeven in pixels per inch. |
| virtual [get_Width](./get_width/)() const | Retourneert de breedte van de afbeelding in pixels. |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | Retourneert de afbeeldingsgrenzen in de opgegeven meeteenheden. |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | Retourneert het aantal frames van de opgegeven frame-dimensie. |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | Retourneert het aantal bits dat wordt gebruikt om de kleurdiepte weer te geven in het opgegeven pixelformaat. |
| virtual [GetSkBitmap](./getskbitmap/)() const | Retourneert een onderliggend SkBitmap-object. |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | Haalt een miniatuur op voor dit [System::Drawing::Image](./) object. |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | Bepaalt of het opgegeven pixelformaat alfadeel bevat. |
| virtual [IsMultiImage](./ismultiimage/)() const | Retourneert of het oorspronkelijke formaat een multi-afbeelding is. |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | Draai de afbeelding naar een veelvoud van 90 graden en spiegel. |
| [Save](./save/)(const String\&) | Slaat de afbeelding die door het huidige object wordt weergegeven op in het opgegeven bestand in PNG-formaat. |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | Slaat de afbeelding die door het huidige object wordt weergegeven op in het opgegeven bestand in het opgegeven formaat. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | Slaat de afbeelding die door het huidige object wordt weergegeven op in de opgegeven stream in het opgegeven formaat. |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Slaat de afbeelding die door het huidige object wordt weergegeven op in het opgegeven bestand met behulp van de opgegeven encoder en encoderparameters. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Slaat de afbeelding die door het huidige object wordt weergegeven op in de opgegeven stream met behulp van de opgegeven encoder en encoderparameters. |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | Voegt een frame toe aan het bestand of de stream die in een eerdere aanroep van de [Save()](./save/) methode is opgegeven. |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | Voegt een frame toe aan het bestand of de stream die in een eerdere aanroep van de [Save()](./save/) methode is opgegeven. |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | Selecteert het opgegeven frame. |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | Stelt het kleurenpalet in dat wordt gebruikt door de afbeelding die door het huidige object wordt weergegeven. |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | Stelt een object in dat extra gegevens over de afbeelding levert. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | Een callback om de uitvoering van GetThumbnailImage te annuleren. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
