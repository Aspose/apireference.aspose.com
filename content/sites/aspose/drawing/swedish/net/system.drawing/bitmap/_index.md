---
title: Bitmap
second_title: Aspose.Drawing för .NET API Referens
description: Kapslar in en bitmapp som består av pixeldata för en grafikbild och dess attribut. ABitmap./bitmap är ett objekt som används för att arbeta med bilder definierade av pixeldata.
type: docs
weight: 40
url: /sv/net/system.drawing/bitmap/
---
## Bitmap class

Kapslar in en bitmapp, som består av pixeldata för en grafikbild och dess attribut. A[`Bitmap`](../bitmap) är ett objekt som används för att arbeta med bilder definierade av pixeldata.

```csharp
public class Bitmap : Image
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Bitmap](bitmap#constructor_3)(Image) | Initierar en ny instans av[`Bitmap`](../bitmap) klass från den angivna befintliga bilden. |
| [Bitmap](bitmap#constructor_6)(Stream) | Initierar en ny instans av[`Bitmap`](../bitmap) klass från den angivna dataströmmen. |
| [Bitmap](bitmap#constructor_8)(string) | Initierar en ny instans av[`Bitmap`](../bitmap) klass från den angivna filen. |
| [Bitmap](bitmap#constructor_5)(Image, Size) | Initierar en ny instans av[`Bitmap`](../bitmap)klass från den angivna befintliga bilden, skalad till den angivna storleken. |
| [Bitmap](bitmap#constructor)(int, int) | Initierar en ny instans av[`Bitmap`](../bitmap) klass med angiven storlek. |
| [Bitmap](bitmap#constructor_7)(Stream, bool) | Initierar en ny instans av[`Bitmap`](../bitmap) klass från den angivna dataströmmen. |
| [Bitmap](bitmap#constructor_9)(string, bool) | Initierar en ny instans av[`Bitmap`](../bitmap) klass från den angivna filen. |
| [Bitmap](bitmap#constructor_4)(Image, int, int) | Initierar en ny instans av[`Bitmap`](../bitmap) klass från den angivna befintliga bilden, skalad till den angivna storleken. |
| [Bitmap](bitmap#constructor_2)(int, int, PixelFormat) | Initierar en ny instans av[`Bitmap`](../bitmap) klass med angiven storlek och format. |
| [Bitmap](bitmap#constructor_1)(int, int, int, PixelFormat, int[]) | Initierar en ny instans av[`Bitmap`](../bitmap) klass med angiven storlek och pixeldata. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Får heltal som representerar en bitvis kombination av[`ImageFlags`](../../system.drawing.imaging/imageflags) för denna bild. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist) { get; } | Får en uppsättning GUID:er som representerar dimensionerna på ramar inom dennaImage . |
| override [Height](../../system.drawing/bitmap/height) { get; } | Hämtar höjden, i pixlar, för denna bitmapp. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Får den horisontella upplösningen, i pixlar per tum, av dettaImage . |
| override [Palette](../../system.drawing/bitmap/palette) { get; set; } | Hämtar eller ställer in färgpalett som används för dettaImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Hämtar bredden och höjden på denna bild. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat) { get; } | Hämtar pixelformatet för dettaImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist) { get; } | Hämtar ID:n för egenskapsobjekten som lagras i dennaImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems) { get; } | Får alla egenskapsobjekt (bitar av metadata) lagrade i dettaImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat) { get; } | Hämtar filformatet för dennaImage . |
| [Size](../../system.drawing/image/size) { get; } | Hämtar bredd och höjd, i pixlar, för denna bild. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Hämtar eller ställer in ett objekt som ger ytterligare data om bilden. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Får den vertikala upplösningen, i pixlar per tum, av dettaImage . |
| override [Width](../../system.drawing/bitmap/width) { get; } | Hämtar bredden, i pixlar, på denna bitmapp. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Skapar en exakt kopia av dettaImage . |
| [Clone](../../system.drawing/bitmap/clone#clone)(Rectangle, PixelFormat) | Skapar en kopia av avsnittet av dettaBitmap definieras avRectangle structure och med en specificeradPixelFormat uppräkning. |
| [Clone](../../system.drawing/bitmap/clone#clone_1)(RectangleF, PixelFormat) | Skapar en kopia av avsnittet av dettaBitmap definieras med en specificeradPixelFormat uppräkning. |
| virtual [Dispose](../../system.drawing/image/dispose)() | Frigör alla resurser som används av denna bild. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Hämtar gränserna för bilden i den angivna enheten. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Returnerar antalet ramar för den angivna dimensionen. |
| [GetPixel](../../system.drawing/bitmap/getpixel)(int, int) | Får färgen på den angivna pixeln i dennaBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem)(int) | Hämtar det angivna egenskapsobjektet från dettaImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Returnerar en miniatyrbild för dettaImage . |
| [LockBits](../../system.drawing/bitmap/lockbits)(Rectangle, ImageLockMode, PixelFormat) | Låser aBitmap i systemminnet. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent)() | Gör den angivna färgen transparent för dettaBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent_1)(Color) | Gör den angivna färgen transparent för dettaBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels)(int[]) | Läser bitmappspixlar i ARGB32-format i en given array. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem)(int) | Tar bort det angivna egenskapsobjektet från dettaImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip)(RotateFlipType) | Denna metod roterar, vänder eller roterar och vänder påImage . |
| [Save](../../system.drawing/image/save)(string) | Sparar dettaImagetill den angivna filen eller strömmen. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Sparar den här bilden till den angivna strömmen i det angivna formatet. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Sparar dettaImage till den angivna filen i det angivna formatet. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Sparar den här bilden till den angivna strömmen, med de angivna kodnings- och bildkodarparametrarna. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Sparar dettaImage till den angivna filen, med de angivna kodnings- och bildkodarparametrarna. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Lägger till en ram till filen eller strömmen som specificerats i ett tidigare anrop till en av Image.Save(...)-metoderna. Använd den här metoden för att spara valda ramar från en bild med flera bildrutor till en annan bild med flera bildrutor. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Lägger till en ram till filen eller strömmen som specificerats i ett tidigare anrop till en av Image.Save(...)-metoderna. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Väljer ramen som anges av dimensionen och indexet. |
| [SetPixel](../../system.drawing/bitmap/setpixel)(int, int, Color) | Ställer in färgen på den angivna pixeln i dennaBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem)(PropertyItem) | Lagrar en egenskapspost (metadatabit) i dennaImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution)(float, float) | Ställer in upplösningen för dettaBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits)(BitmapData) | Låser upp dettaBitmap från systemminnet. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels)(int[]) | Skriver pixlar till bitmappen. |

### Se även

* class [Image](../image)
* namnutrymme [System.Drawing](../../system.drawing)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
