---
title: Class Image
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Image klas. Een abstracte basisklasse die functionaliteit biedt voor de klasse Bitmap en Metafile.
type: docs
weight: 580
url: /nl/net/system.drawing/image/
---
## Image class

Een abstracte basisklasse die functionaliteit biedt voor de klasse Bitmap en Metafile.

```csharp
public abstract class Image : IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Image](image/)() | Initialiseert een nieuw exemplaar van het`Image` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Haalt het gehele getal op dat een bitsgewijze combinatie vertegenwoordigt van[`ImageFlags`](../../system.drawing.imaging/imageflags/) voor deze afbeelding. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist/) { get; } | Haalt een reeks GUID's op die de afmetingen van frames hierin vertegenwoordigenImage . |
| abstract [Height](../../system.drawing/image/height/) { get; } | Krijgt de hoogte, in pixels, hiervanImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Krijgt de horizontale resolutie, in pixels per inch, hiervanImage . |
| abstract [Palette](../../system.drawing/image/palette/) { get; set; } | Haalt of stelt het hiervoor gebruikte kleurenpalet inImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Krijgt de breedte en hoogte van deze afbeelding. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat/) { get; } | Krijgt het pixelformaat hiervoorImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist/) { get; } | Haalt ID's op van de eigendomsitems die hierin zijn opgeslagenImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems/) { get; } | Haalt alle eigendomsitems (stukjes metadata) op die hierin zijn opgeslagenImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat/) { get; } | Haalt het bestandsformaat hiervan opImage . |
| [Size](../../system.drawing/image/size/) { get; } | Krijgt de breedte en hoogte, in pixels, van deze afbeelding. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Haalt of stelt een object in dat aanvullende gegevens over de afbeelding levert. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Krijgt de verticale resolutie, in pixels per inch, hiervanImage . |
| abstract [Width](../../system.drawing/image/width/) { get; } | Krijgt de breedte, in pixels, hiervanImage . |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile/)(string) | Creëert eenImage uit het opgegeven bestand. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream)(Stream) | Creëert eenImageuit de opgegeven gegevensstroom. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream_1)(Stream, bool) | Creëert eenImage uit de gespecificeerde gegevensstroom, optioneel met behulp van ingesloten kleurbeheerinformatie in die stroom. |
| [Clone](../../system.drawing/image/clone/)() | Maakt hiervan een exacte kopieImage . |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Geeft alle bronnen vrij die door deze afbeelding worden gebruikt. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Haalt de grenzen van de afbeelding op in de opgegeven eenheid. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Retourneert het aantal frames van de opgegeven dimensie. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem/)(int) | Haalt hieruit het opgegeven eigenschapsitem opImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Retourneert hiervoor een miniatuurImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem/)(int) | Hiermee verwijdert u het opgegeven eigenschapsitemImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip/)(RotateFlipType) | Deze methode roteert, spiegelt, of roteert en draait deImage . |
| [Save](../../system.drawing/image/save/#save_2)(string) | Slaat dit opImagenaar het opgegeven bestand of stream. |
| [Save](../../system.drawing/image/save/#save_1)(Stream, ImageFormat) | Slaat deze afbeelding op in de opgegeven stream in de opgegeven indeling. |
| [Save](../../system.drawing/image/save/#save_4)(string, ImageFormat) | Slaat dit opImage naar het opgegeven bestand in het opgegeven formaat. |
| [Save](../../system.drawing/image/save/#save)(Stream, ImageCodecInfo, EncoderParameters) | Slaat deze afbeelding op in de opgegeven stream, met de opgegeven parameters voor encoder en afbeeldingsencoder. |
| [Save](../../system.drawing/image/save/#save_3)(string, ImageCodecInfo, EncoderParameters) | Slaat dit opImage naar het opgegeven bestand, met de opgegeven encoder- en image-encoder-parameters. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd_1)(EncoderParameters) | Voegt een frame toe aan het bestand of de stream die is opgegeven in een eerdere aanroep van een van de methoden Image.Save(...). Gebruik deze methode om geselecteerde frames van een afbeelding met meerdere frames op te slaan naar een andere afbeelding met meerdere frames. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd)(Image, EncoderParameters) | Voegt een frame toe aan het bestand of de stream die is opgegeven in een eerdere aanroep van een van de Image.Save(...)-methoden. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Selecteert het frame gespecificeerd door de dimensie en index. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem/)(PropertyItem) | Slaat hierin een eigenschapsitem (stukje metadata) opImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap/)(IntPtr) | Creëert eenBitmap van een handle naar een GDI-bitmap. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize/)(PixelFormat) | Retourneert de kleurdiepte, in aantal bits per pixel, van de opgegeven pixelindeling. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat/)(PixelFormat) | Retourneert een waarde die aangeeft of het pixelformaat hiervoor isImage bevat alfa-informatie. |

## Andere leden

| Naam | Beschrijving |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort/) | Biedt een callback-methode om te bepalen wanneer de[`GetThumbnailImage`](./getthumbnailimage/) methode moet de uitvoering voortijdig annuleren. |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


