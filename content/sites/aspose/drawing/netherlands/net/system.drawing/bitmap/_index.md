---
title: Class Bitmap
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Bitmap klas. Bevat een bitmap die bestaat uit de pixelgegevens voor een grafische afbeelding en de bijbehorende attributen. ABitmap is een object dat wordt gebruikt om te werken met afbeeldingen die zijn gedefinieerd door pixelgegevens.
type: docs
weight: 40
url: /nl/net/system.drawing/bitmap/
---
## Bitmap class

Bevat een bitmap, die bestaat uit de pixelgegevens voor een grafische afbeelding en de bijbehorende attributen. A`Bitmap` is een object dat wordt gebruikt om te werken met afbeeldingen die zijn gedefinieerd door pixelgegevens.

```csharp
public class Bitmap : Image
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Bitmap](bitmap/#constructor_3)(Image) | Initialiseert een nieuw exemplaar van het`Bitmap` klasse van de opgegeven bestaande afbeelding. |
| [Bitmap](bitmap/#constructor_6)(Stream) | Initialiseert een nieuw exemplaar van het`Bitmap` klasse uit de opgegeven gegevensstroom. |
| [Bitmap](bitmap/#constructor_8)(string) | Initialiseert een nieuw exemplaar van het`Bitmap` klasse uit het opgegeven bestand. |
| [Bitmap](bitmap/#constructor_5)(Image, Size) | Initialiseert een nieuw exemplaar van het`Bitmap`klasse van de opgegeven bestaande afbeelding, geschaald naar de opgegeven grootte. |
| [Bitmap](bitmap/#constructor)(int, int) | Initialiseert een nieuw exemplaar van het`Bitmap` klasse met de opgegeven grootte. |
| [Bitmap](bitmap/#constructor_7)(Stream, bool) | Initialiseert een nieuw exemplaar van het`Bitmap` klasse uit de opgegeven gegevensstroom. |
| [Bitmap](bitmap/#constructor_9)(string, bool) | Initialiseert een nieuw exemplaar van het`Bitmap` klasse uit het opgegeven bestand. |
| [Bitmap](bitmap/#constructor_4)(Image, int, int) | Initialiseert een nieuw exemplaar van het`Bitmap` klasse van de opgegeven bestaande afbeelding, geschaald naar de opgegeven grootte. |
| [Bitmap](bitmap/#constructor_2)(int, int, PixelFormat) | Initialiseert een nieuw exemplaar van het`Bitmap` klasse met de opgegeven grootte en indeling. |
| [Bitmap](bitmap/#constructor_1)(int, int, int, PixelFormat, int[]) | Initialiseert een nieuw exemplaar van het`Bitmap` klasse met de opgegeven grootte en pixelgegevens. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Haalt het gehele getal op dat een bitsgewijze combinatie vertegenwoordigt van[`ImageFlags`](../../system.drawing.imaging/imageflags/) voor deze afbeelding. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist/) { get; } | Haalt een reeks GUID's op die de afmetingen van frames hierin vertegenwoordigenImage . |
| override [Height](../../system.drawing/bitmap/height/) { get; } | Krijgt de hoogte, in pixels, van deze bitmap. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Krijgt de horizontale resolutie, in pixels per inch, hiervanImage . |
| override [Palette](../../system.drawing/bitmap/palette/) { get; set; } | Haalt of stelt het hiervoor gebruikte kleurenpalet inImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Krijgt de breedte en hoogte van deze afbeelding. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat/) { get; } | Krijgt het pixelformaat hiervoorImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist/) { get; } | Haalt ID's op van de eigendomsitems die hierin zijn opgeslagenImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems/) { get; } | Haalt alle eigendomsitems (stukjes metadata) op die hierin zijn opgeslagenImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat/) { get; } | Haalt het bestandsformaat hiervan opImage . |
| [Size](../../system.drawing/image/size/) { get; } | Krijgt de breedte en hoogte, in pixels, van deze afbeelding. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Haalt of stelt een object in dat aanvullende gegevens over de afbeelding levert. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Krijgt de verticale resolutie, in pixels per inch, hiervanImage . |
| override [Width](../../system.drawing/bitmap/width/) { get; } | Krijgt de breedte, in pixels, van deze bitmap. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | Maakt hiervan een exacte kopieImage . |
| [Clone](../../system.drawing/bitmap/clone/#clone)(Rectangle, PixelFormat) | Maakt een kopie van de sectie hiervanBitmap gedefinieerd doorRectangle structure en met een opgegevenPixelFormat opsomming. |
| [Clone](../../system.drawing/bitmap/clone/#clone_1)(RectangleF, PixelFormat) | Maakt een kopie van de sectie hiervanBitmap gedefinieerd met een opgegevenPixelFormat opsomming. |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Geeft alle bronnen vrij die door deze afbeelding worden gebruikt. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Haalt de grenzen van de afbeelding op in de opgegeven eenheid. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Retourneert het aantal frames van de opgegeven dimensie. |
| [GetPixel](../../system.drawing/bitmap/getpixel/)(int, int) | Krijgt hierin de kleur van de gespecificeerde pixelBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem/)(int) | Haalt hieruit het opgegeven eigenschapsitem opImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Retourneert hiervoor een miniatuurImage . |
| [LockBits](../../system.drawing/bitmap/lockbits/)(Rectangle, ImageLockMode, PixelFormat) | Sloten aBitmap in het systeemgeheugen. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent)() | Maakt hiervoor de opgegeven kleur transparantBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent_1)(Color) | Maakt hiervoor de opgegeven kleur transparantBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels/)(int[]) | Leest bitmappixels in ARGB32-formaat in gegeven array. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem/)(int) | Hiermee verwijdert u het opgegeven eigenschapsitemImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip/)(RotateFlipType) | Deze methode roteert, spiegelt, of roteert en draait deImage . |
| [Save](../../system.drawing/image/save/)(string) | Slaat dit opImagenaar het opgegeven bestand of stream. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | Slaat deze afbeelding op in de opgegeven stream in de opgegeven indeling. |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | Slaat dit opImage naar het opgegeven bestand in het opgegeven formaat. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | Slaat deze afbeelding op in de opgegeven stream, met de opgegeven parameters voor encoder en afbeeldingsencoder. |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | Slaat dit opImage naar het opgegeven bestand, met de opgegeven encoder- en image-encoder-parameters. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Voegt een frame toe aan het bestand of de stream die is opgegeven in een eerdere aanroep van een van de methoden Image.Save(...). Gebruik deze methode om geselecteerde frames van een afbeelding met meerdere frames op te slaan naar een andere afbeelding met meerdere frames. |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Voegt een frame toe aan het bestand of de stream die is opgegeven in een eerdere aanroep van een van de Image.Save(...)-methoden. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Selecteert het frame gespecificeerd door de dimensie en index. |
| [SetPixel](../../system.drawing/bitmap/setpixel/)(int, int, Color) | Hiermee stelt u de kleur in van de opgegeven pixelBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem/)(PropertyItem) | Slaat hierin een eigenschapsitem (stukje metadata) opImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution/)(float, float) | Stelt de resolutie hiervoor inBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits/)(BitmapData) | Ontgrendelt ditBitmap uit het systeemgeheugen. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels/)(int[]) | Schrijft pixels naar de bitmap. |

### Zie ook

* class [Image](../image/)
* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


