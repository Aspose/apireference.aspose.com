---
title: Metafile
second_title: Aspose.Drawing för .NET API Referens
description: Definierar en grafisk metafil. En metafil innehåller poster som beskriver en sekvens av grafikoperationer som kan spelas in konstrueras och spelas upp visas. Den här klassen är inte ärvbar.
type: docs
weight: 800
url: /sv/net/system.drawing.imaging/metafile/
---
## Metafile class

Definierar en grafisk metafil. En metafil innehåller poster som beskriver en sekvens av grafikoperationer som kan spelas in (konstrueras) och spelas upp (visas). Den här klassen är inte ärvbar.

```csharp
public sealed class Metafile : Image
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [Metafile](metafile#constructor_2)(Stream) | Initierar en ny instans av[`Metafile`](../metafile) klass från den angivna dataströmmen. |
| [Metafile](metafile#constructor_6)(string) | Initierar en ny instans av[`Metafile`](../metafile) klass från det angivna filnamnet. |
| [Metafile](metafile#constructor)(IntPtr, bool) | Initierar en ny instans av[`Metafile`](../metafile) klass från det angivna handtaget. |
| [Metafile](metafile#constructor_1)(IntPtr, EmfType) | Initierar en ny instans av[`Metafile`](../metafile) klass från det angivna handtaget till en enhetskontext och enEmfTypeuppräkning som anger formatet förMetafile . |
| [Metafile](metafile#constructor_3)(Stream, IntPtr) | Initierar en ny instans av[`Metafile`](../metafile) klass från den specificerade dataströmmen och ett Windows-handtag till en enhetskontext. /&gt;. |
| [Metafile](metafile#constructor_7)(string, IntPtr) | Initierar en ny instans av[`Metafile`](../metafile) klass från det angivna filnamnet. |
| [Metafile](metafile#constructor_4)(Stream, IntPtr, EmfType) | Initierar en ny instans av[`Metafile`](../metafile) klass från den specificerade dataströmmen, ett Windows-handtag till en enhetskontext och enEmfType enumeration som anger formatet förMetafile . |
| [Metafile](metafile#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Initierar en ny instans av[`Metafile`](../metafile) klass från den specificerade dataströmmen, ett Windows-handtag till en enhetskontext och enEmfType enumeration som anger formatet förMetafile . |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Får heltal som representerar en bitvis kombination av[`ImageFlags`](../imageflags) för denna bild. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist) { get; } | Får en uppsättning GUID:er som representerar dimensionerna på ramar inom dennaImage . |
| override [Height](../../system.drawing.imaging/metafile/height) { get; } | Hämtar höjden, i pixlar, av dettaMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Får den horisontella upplösningen, i pixlar per tum, av dettaImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette) { get; set; } | Hämtar eller ställer in färgpalett som används för dettaImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Hämtar bredden och höjden på denna bild. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat) { get; } | Hämtar pixelformatet för dettaImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist) { get; } | Hämtar ID:n för egenskapsobjekten som lagras i dennaImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems) { get; } | Får alla egenskapsobjekt (bitar av metadata) lagrade i dettaImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat) { get; } | Hämtar filformatet för dennaImage . |
| [Size](../../system.drawing/image/size) { get; } | Hämtar bredd och höjd, i pixlar, för denna bild. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Hämtar eller ställer in ett objekt som ger ytterligare data om bilden. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Får den vertikala upplösningen, i pixlar per tum, av dettaImage . |
| override [Width](../../system.drawing.imaging/metafile/width) { get; } | Hämtar bredden, i pixlar, på dettaMetafile . |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Skapar en exakt kopia av dettaImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Frigör alla resurser som används av denna bild. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Hämtar gränserna för bilden i den angivna enheten. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Returnerar antalet ramar för den angivna dimensionen. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile)() | Återställer ett Windows-handtag till ett förbättratMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader)() | ReturnerarMetafileHeader i samband med dettaMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem)(int) | Hämtar det angivna egenskapsobjektet från dettaImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Returnerar en miniatyrbild för dettaImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord)(EmfPlusRecordType, int, int, byte[]) | Spelar en individuell metafilpost. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem)(int) | Tar bort det angivna egenskapsobjektet från dettaImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip)(RotateFlipType) | Denna metod roterar, vänder eller roterar och vänder påImage . |
| [Save](../../system.drawing/image/save)(string) | Sparar dettaImagetill den angivna filen eller strömmen. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Sparar den här bilden till den angivna strömmen i det angivna formatet. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Sparar dettaImage till den angivna filen i det angivna formatet. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Sparar den här bilden till den angivna strömmen, med de angivna kodnings- och bildkodarparametrarna. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Sparar dettaImage till den angivna filen, med de angivna kodnings- och bildkodarparametrarna. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Lägger till en ram till filen eller strömmen som specificerats i ett tidigare anrop till en av Image.Save(...)-metoderna. Använd den här metoden för att spara valda ramar från en bild med flera bildrutor till en annan bild med flera bildrutor. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Lägger till en ram till filen eller strömmen som specificerats i ett tidigare anrop till en av Image.Save(...)-metoderna. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Väljer ramen som anges av dimensionen och indexet. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem)(PropertyItem) | Lagrar en egenskapspost (metadatabit) i dennaImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader)(Stream) | ReturnerarMetafileHeader associerad med den angivnaMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader_1)(string) | ReturnerarMetafileHeader associerad med den angivnaMetafile . |

### Se även

* class [Image](../../system.drawing/image)
* namnutrymme [System.Drawing.Imaging](../../system.drawing.imaging)
* hopsättning [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
