---
title: System.Drawing.Imaging
second_title: Aspose.Drawing för .NET API Referens
description: DenImaging namnutrymme ger avancerad GDIbildfunktionalitet. Grundläggande grafikfunktionalitet tillhandahålls avDrawing namnutrymme.
type: docs
weight: 40
url: /sv/net/system.drawing.imaging/
---
DenImaging namnutrymme ger avancerad GDI+-bildfunktionalitet. Grundläggande grafikfunktionalitet tillhandahålls avDrawing namnutrymme.

## Klasser

| Klass | Beskrivning |
| --- | --- |
| [BitmapData](./bitmapdata) | Anger attributen för en bitmappsbild. DeBitmapData klass används av the LockBits ochUnlockBits metoder förBitmap klass. Inte ärftligt. |
| [ColorMap](./colormap) | Definierar en karta för att konvertera färger. Flera metoder förImageAttributes class adjust bildfärger genom att använda en färgombildningstabell, som är en uppsättning avColorMap strukturer. Inte ärftlig. |
| [ColorMatrix](./colormatrix) | Definierar en 5 x 5 matris som innehåller koordinaterna för RGBA-utrymmet. Flera metoder förImageAttributes klass justera bildfärger med hjälp av en färgmatris. Denna klass kan inte ärvas. |
| [ColorPalette](./colorpalette) | Definierar en uppsättning färger som utgör en färgpalett. Färgerna är 32-bitars ARGB-färger. Inte ärftlig. |
| [Encoder](./encoder) | AnEncoder objekt kapslar in en globalt unik identifierare (GUID) som identifierar kategorin för en bildkodarparameter. |
| [EncoderParameter](./encoderparameter) | Används för att skicka ett värde, eller en matris med värden, till en bildkodare. |
| [EncoderParameters](./encoderparameters) | Kapslar in en array avEncoderParameter objekt. |
| [FrameDimension](./framedimension) | Ger egenskaper som får rammåtten för en bild. Inte ärftlig. |
| [ImageAttributes](./imageattributes) | Innehåller information om hur bitmapps- och metafilfärger manipuleras under rendering. |
| [ImageCodecInfo](./imagecodecinfo) | DenImageCodecInfo klass tillhandahåller de nödvändiga lagringsmedlemmarna och metoderna för att hämta all relevant information om de installerade bildkodarna och avkodarna (kallade codecs). Inte ärftlig. |
| [ImageFormat](./imageformat) | Anger filformatet för bilden. Inte ärftligt. |
| [Metafile](./metafile) | Definierar en grafisk metafil. En metafil innehåller poster som beskriver en sekvens av grafikoperationer som kan spelas in (konstrueras) och spelas upp (visas). Den här klassen är inte ärvbar. |
| [MetafileHeader](./metafileheader) | Innehåller attribut för en associeradMetafile . Inte ärftlig. |
| [MetaHeader](./metaheader) | Innehåller information om en metafil i Windows-format (WMF). |
| [NamespaceDoc](./namespacedoc) | DenImaging namnutrymme ger avancerad GDI+-bildfunktionalitet. Grundläggande grafikfunktionalitet tillhandahålls avDrawing namnutrymme. |
| [PlayRecordCallback](./playrecordcallback) | Denna delegat används inte. För ett exempel på att räkna upp posterna för en metafil, se[`EnumerateMetafile`](../system.drawing/graphics/enumeratemetafile) . |
| [PropertyItem](./propertyitem) | Kapslar in en metadataegenskap som ska inkluderas i en bildfil. Inte ärftligt. |
| [WmfPlaceableFileHeader](./wmfplaceablefileheader) | Definierar en platsbar metafil. Inte ärftlig. |
## Uppräkning

| Uppräkning | Beskrivning |
| --- | --- |
| [ColorAdjustType](./coloradjusttype) | Anger vilka GDI+-objekt som använder färgjusteringsinformation. |
| [ColorChannelFlag](./colorchannelflag) | Anger individuella kanaler i CMYK (cyan, magenta, gul, svart) färgrymden. Denna uppräkning används av[`SetOutputChannel`](../system.drawing.imaging/imageattributes/setoutputchannel) metoder. |
| [ColorMatrixFlag](./colormatrixflag) | Anger vilka typer av bilder och färger som kommer att påverkas av inställningarna för färg och gråskalejustering för enImageAttributes . |
| [EmfPlusRecordType](./emfplusrecordtype) | Anger de metoder som är tillgängliga för användning med en metafil för att läsa och skriva grafikkommandon. |
| [EmfType](./emftype) | Anger typen av poster som placeras i en Enhanced Metafile (EMF)-fil. Denna uppräkning används av flera konstruktörer iMetafile class. |
| [EncoderValue](./encodervalue) | Används för att specificera parametervärdet som skickas till en JPEG- eller TIFF-bildkodare när användsEncoderParameters) ellerEncoderParameters) metoder. |
| [ImageFlags](./imageflags) | Anger attributen för pixeldata som finns i en[`Image`](../system.drawing/image) objekt. Egenskapen Flags returnerar en medlem av denna uppräkning. Denna uppräkning har ett FlagsAttribute-attribut som tillåter en bitvis kombination av dess medlemsvärden. |
| [ImageLockMode](./imagelockmode) | Anger flaggor som skickas till flaggparametern för[`LockBits`](../system.drawing/bitmap/lockbits) metod. Den[`LockBits`](../system.drawing/bitmap/lockbits) metoden låser en del av en image så att du kan läsa eller skriva pixeldata. |
| [MetafileFrameUnit](./metafileframeunit) | Anger måttenheten för rektangeln som används för att dimensionera och placera en metafil. Detta specificeras under skapandet avMetafile objekt. |
| [MetafileType](./metafiletype) | Anger typer av metafiler. |
| [PixelFormat](./pixelformat) | Anger formatet för färgdata för varje pixel i bilden. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
