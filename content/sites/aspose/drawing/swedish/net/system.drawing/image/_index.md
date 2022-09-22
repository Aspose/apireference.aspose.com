---
title: Image
second_title: Aspose.Drawing för .NET API Referens
description: En abstrakt basklass som tillhandahåller funktionalitet för klasserna Bitmap och Metafile descended.
type: docs
weight: 580
url: /sv/net/system.drawing/image/
---
## Image class

En abstrakt basklass som tillhandahåller funktionalitet för klasserna Bitmap och Metafile descended.

```csharp
public abstract class Image : IDisposable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Image](image)() | Initierar en ny instans av[`Image`](../image) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Får heltal som representerar en bitvis kombination av[`ImageFlags`](../../system.drawing.imaging/imageflags) för denna bild. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist) { get; } | Får en uppsättning GUID:er som representerar dimensionerna på ramar inom dennaImage . |
| abstract [Height](../../system.drawing/image/height) { get; } | Hämtar höjden, i pixlar, av dettaImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Får den horisontella upplösningen, i pixlar per tum, av dettaImage . |
| abstract [Palette](../../system.drawing/image/palette) { get; set; } | Hämtar eller ställer in färgpalett som används för dettaImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Hämtar bredden och höjden på denna bild. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat) { get; } | Hämtar pixelformatet för dettaImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist) { get; } | Hämtar ID:n för egenskapsobjekten som lagras i dennaImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems) { get; } | Får alla egenskapsobjekt (bitar av metadata) lagrade i dettaImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat) { get; } | Hämtar filformatet för dennaImage . |
| [Size](../../system.drawing/image/size) { get; } | Hämtar bredd och höjd, i pixlar, för denna bild. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Hämtar eller ställer in ett objekt som ger ytterligare data om bilden. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Får den vertikala upplösningen, i pixlar per tum, av dettaImage . |
| abstract [Width](../../system.drawing/image/width) { get; } | Hämtar bredden, i pixlar, på dettaImage . |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile)(string) | Skapar enImage från den angivna filen. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream)(Stream) | Skapar enImagefrån den angivna dataströmmen. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream_1)(Stream, bool) | Skapar enImage från den angivna dataströmmen, valfritt genom att använda embedded färghanteringsinformation i den strömmen. |
| [Clone](../../system.drawing/image/clone)() | Skapar en exakt kopia av dettaImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Frigör alla resurser som används av denna bild. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Hämtar gränserna för bilden i den angivna enheten. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Returnerar antalet ramar för den angivna dimensionen. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem)(int) | Hämtar det angivna egenskapsobjektet från dettaImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Returnerar en miniatyrbild för dettaImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem)(int) | Tar bort det angivna egenskapsobjektet från dettaImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip)(RotateFlipType) | Denna metod roterar, vänder eller roterar och vänder påImage . |
| [Save](../../system.drawing/image/save#save_2)(string) | Sparar dettaImagetill den angivna filen eller strömmen. |
| [Save](../../system.drawing/image/save#save_1)(Stream, ImageFormat) | Sparar den här bilden till den angivna strömmen i det angivna formatet. |
| [Save](../../system.drawing/image/save#save_4)(string, ImageFormat) | Sparar dettaImage till den angivna filen i det angivna formatet. |
| [Save](../../system.drawing/image/save#save)(Stream, ImageCodecInfo, EncoderParameters) | Sparar den här bilden till den angivna strömmen, med de angivna kodnings- och bildkodarparametrarna. |
| [Save](../../system.drawing/image/save#save_3)(string, ImageCodecInfo, EncoderParameters) | Sparar dettaImage till den angivna filen, med de angivna kodnings- och bildkodarparametrarna. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd_1)(EncoderParameters) | Lägger till en ram till filen eller strömmen som specificerats i ett tidigare anrop till en av Image.Save(...)-metoderna. Använd den här metoden för att spara valda ramar från en bild med flera bildrutor till en annan bild med flera bildrutor. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd)(Image, EncoderParameters) | Lägger till en ram till filen eller strömmen som specificerats i ett tidigare anrop till en av Image.Save(...)-metoderna. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Väljer ramen som anges av dimensionen och indexet. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem)(PropertyItem) | Lagrar en egenskapspost (metadatabit) i dennaImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap)(IntPtr) | Skapar enBitmap från ett handtag till en GDI-bitmapp. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize)(PixelFormat) | Returnerar färgdjupet, i antal bitar per pixel, för det angivna pixelformatet. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat)(PixelFormat) | Returnerar ett värde som anger om pixelformatet för dettaImage innehåller alfainformation. |

## Andra medlemmar

| namn | Beskrivning |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort) | Tillhandahåller en återuppringningsmetod för att avgöra när[`GetThumbnailImage`](./getthumbnailimage) metoden bör avbryta körningen i förtid. |

### Se även

* namnutrymme [System.Drawing](../../system.drawing)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
