---
title: Class Metafile
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Imaging.Metafile klas. Definieert een grafisch metabestand. Een metabestand bevat records die een reeks grafische bewerkingen beschrijven die kunnen worden opgenomen geconstrueerd en afgespeeld weergegeven. Deze klasse is niet overerfbaar.
type: docs
weight: 800
url: /nl/net/system.drawing.imaging/metafile/
---
## Metafile class

Definieert een grafisch metabestand. Een metabestand bevat records die een reeks grafische bewerkingen beschrijven die kunnen worden opgenomen (geconstrueerd) en afgespeeld (weergegeven). Deze klasse is niet overerfbaar.

```csharp
public sealed class Metafile : Image
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Metafile](metafile/#constructor_2)(Stream) | Initialiseert een nieuw exemplaar van het`Metafile` klasse uit de opgegeven gegevensstroom. |
| [Metafile](metafile/#constructor_6)(string) | Initialiseert een nieuw exemplaar van het`Metafile` klasse van de opgegeven bestandsnaam. |
| [Metafile](metafile/#constructor)(IntPtr, bool) | Initialiseert een nieuw exemplaar van het`Metafile` klasse van de opgegeven handle. |
| [Metafile](metafile/#constructor_1)(IntPtr, EmfType) | Initialiseert een nieuw exemplaar van het`Metafile` klasse van de opgegeven ingang naar een apparaatcontext en eenEmfTypeopsomming die het formaat van deMetafile . |
| [Metafile](metafile/#constructor_3)(Stream, IntPtr) | Initialiseert een nieuw exemplaar van het`Metafile` class van de gegevensstroom specific en een Windows-handle naar een apparaatcontext. /&gt;. |
| [Metafile](metafile/#constructor_7)(string, IntPtr) | Initialiseert een nieuw exemplaar van het`Metafile` klasse van de opgegeven bestandsnaam. |
| [Metafile](metafile/#constructor_4)(Stream, IntPtr, EmfType) | Initialiseert een nieuw exemplaar van het`Metafile` class van de gegevensstroom specific , een Windows-handle naar een apparaatcontext en eenEmfType enumeration die het formaat specificeert van hetMetafile . |
| [Metafile](metafile/#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Initialiseert een nieuw exemplaar van het`Metafile` class van de gegevensstroom specific , een Windows-handle naar een apparaatcontext en eenEmfType enumeration die het formaat specificeert van hetMetafile . |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Haalt het gehele getal op dat een bitsgewijze combinatie vertegenwoordigt van[`ImageFlags`](../imageflags/) voor deze afbeelding. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist/) { get; } | Haalt een reeks GUID's op die de afmetingen van frames hierin vertegenwoordigenImage . |
| override [Height](../../system.drawing.imaging/metafile/height/) { get; } | Krijgt de hoogte, in pixels, hiervanMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Krijgt de horizontale resolutie, in pixels per inch, hiervanImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette/) { get; set; } | Haalt of stelt het hiervoor gebruikte kleurenpalet inImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Krijgt de breedte en hoogte van deze afbeelding. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat/) { get; } | Krijgt het pixelformaat hiervoorImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist/) { get; } | Haalt ID's op van de eigendomsitems die hierin zijn opgeslagenImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems/) { get; } | Haalt alle eigendomsitems (stukjes metadata) op die hierin zijn opgeslagenImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat/) { get; } | Haalt het bestandsformaat hiervan opImage . |
| [Size](../../system.drawing/image/size/) { get; } | Krijgt de breedte en hoogte, in pixels, van deze afbeelding. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Haalt of stelt een object in dat aanvullende gegevens over de afbeelding levert. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Krijgt de verticale resolutie, in pixels per inch, hiervanImage . |
| override [Width](../../system.drawing.imaging/metafile/width/) { get; } | Krijgt de breedte, in pixels, hiervanMetafile . |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | Maakt hiervan een exacte kopieImage . |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Geeft alle bronnen vrij die door deze afbeelding worden gebruikt. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Haalt de grenzen van de afbeelding op in de opgegeven eenheid. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Retourneert het aantal frames van de opgegeven dimensie. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile/)() | Retourneert een Windows-handle naar een uitgebreidMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/)() | Retourneert deMetafileHeader hiermee in verband gebrachtMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem/)(int) | Haalt hieruit het opgegeven eigenschapsitem opImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Retourneert hiervoor een miniatuurImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord/)(EmfPlusRecordType, int, int, byte[]) | Speelt een individueel metabestandrecord af. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem/)(int) | Hiermee verwijdert u het opgegeven eigenschapsitemImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip/)(RotateFlipType) | Deze methode roteert, spiegelt, of roteert en draait deImage . |
| [Save](../../system.drawing/image/save/)(string) | Slaat dit opImagenaar het opgegeven bestand of stream. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | Slaat deze afbeelding op in de opgegeven stream in de opgegeven indeling. |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | Slaat dit opImage naar het opgegeven bestand in het opgegeven formaat. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | Slaat deze afbeelding op in de opgegeven stream, met de opgegeven parameters voor encoder en afbeeldingsencoder. |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | Slaat dit opImage naar het opgegeven bestand, met de opgegeven encoder- en image-encoder-parameters. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Voegt een frame toe aan het bestand of de stream die is opgegeven in een eerdere aanroep van een van de methoden Image.Save(...). Gebruik deze methode om geselecteerde frames van een afbeelding met meerdere frames op te slaan naar een andere afbeelding met meerdere frames. |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Voegt een frame toe aan het bestand of de stream die is opgegeven in een eerdere aanroep van een van de Image.Save(...)-methoden. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Selecteert het frame gespecificeerd door de dimensie en index. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem/)(PropertyItem) | Slaat hierin een eigenschapsitem (stukje metadata) opImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader)(Stream) | Retourneert deMetafileHeader gekoppeld aan het gespecificeerdeMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader_1)(string) | Retourneert deMetafileHeader gekoppeld aan het gespecificeerdeMetafile . |

### Zie ook

* class [Image](../../system.drawing/image/)
* naamruimte [System.Drawing.Imaging](../../system.drawing.imaging/)
* montage [Aspose.Drawing](../../)


