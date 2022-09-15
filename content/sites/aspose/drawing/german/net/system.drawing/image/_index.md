---
title: Image
second_title: Aspose.Drawing für .NET-API-Referenz
description: Eine abstrakte Basisklasse die Funktionalität für die abgeleiteten Klassen Bitmap und Metafile bereitstellt.
type: docs
weight: 580
url: /de/net/system.drawing/image/
---
## Image class

Eine abstrakte Basisklasse, die Funktionalität für die abgeleiteten Klassen Bitmap und Metafile bereitstellt.

```csharp
public abstract class Image : IDisposable
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Image](image)() | Initialisiert eine neue Instanz von[`Image`](../image) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Ruft die Ganzzahl ab, die eine bitweise Kombination von darstellt[`ImageFlags`](../../system.drawing.imaging/imageflags) für dieses Bild. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist) { get; } | Ruft ein Array von GUIDs ab, die die Abmessungen der Frames darin darstellenImage . |
| abstract [Height](../../system.drawing/image/height) { get; } | Ruft die Höhe davon in Pixel abImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Ruft die horizontale Auflösung davon in Pixel pro Zoll abImage . |
| abstract [Palette](../../system.drawing/image/palette) { get; set; } | Liest oder setzt die dafür verwendete FarbpaletteImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Ruft die Breite und Höhe dieses Bildes ab. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat) { get; } | Ruft das Pixelformat dafür abImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist) { get; } | Ruft IDs der darin gespeicherten Eigenschaftselemente abImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems) { get; } | Ruft alle darin gespeicherten Eigenschaftselemente (Teile von Metadaten) abImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat) { get; } | Ruft das Dateiformat davon abImage . |
| [Size](../../system.drawing/image/size) { get; } | Ruft die Breite und Höhe dieses Bildes in Pixel ab. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Ruft ein Objekt ab oder legt es fest, das zusätzliche Daten zum Bild bereitstellt. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Ruft die vertikale Auflösung davon in Pixel pro Zoll abImage . |
| abstract [Width](../../system.drawing/image/width) { get; } | Ruft die Breite davon in Pixel abImage . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile)(string) | Erstellt eineImage aus der angegebenen Datei. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream)(Stream) | Erstellt eineImageaus dem angegebenen Datenstrom. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream_1)(Stream, bool) | Erstellt eineImage aus dem angegebenen Datenstrom, optional unter Verwendung von eingebetteten Farbverwaltungsinformationen in diesem Strom. |
| [Clone](../../system.drawing/image/clone)() | Erstellt eine exakte Kopie davonImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Gibt alle von diesem Image verwendeten Ressourcen frei. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Ruft die Grenzen des Bildes in der angegebenen Einheit ab. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Gibt die Anzahl der Frames der angegebenen Dimension zurück. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem)(int) | Ruft das angegebene Eigenschaftselement daraus abImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Gibt ein Thumbnail dafür zurückImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem)(int) | Entfernt das angegebene Eigenschaftselement darausImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip)(RotateFlipType) | Diese Methode dreht, dreht oder dreht und dreht dieImage . |
| [Save](../../system.drawing/image/save#save_2)(string) | Speichert diesImagein die angegebene Datei oder den angegebenen Stream. |
| [Save](../../system.drawing/image/save#save_1)(Stream, ImageFormat) | Speichert dieses Bild im angegebenen Format im angegebenen Stream. |
| [Save](../../system.drawing/image/save#save_4)(string, ImageFormat) | Speichert diesImage in die angegebene Datei im angegebenen Format. |
| [Save](../../system.drawing/image/save#save)(Stream, ImageCodecInfo, EncoderParameters) | Speichert dieses Bild mit dem angegebenen Encoder und den Bild-Encoder-Parametern im angegebenen Stream. |
| [Save](../../system.drawing/image/save#save_3)(string, ImageCodecInfo, EncoderParameters) | Speichert diesImage in die angegebene Datei mit den angegebenen Encoder- und Bild-Encoder-Parametern. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd_1)(EncoderParameters) | Fügt einen Frame zu der Datei oder dem Stream hinzu, der in einem vorherigen Aufruf einer der Methoden Image.Save(...) angegeben wurde. Verwenden Sie diese Methode, um ausgewählte Frames aus einem Bild mit mehreren Frames in einem anderen Bild mit mehreren Frames zu speichern. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd)(Image, EncoderParameters) | Fügt einen Frame zu der Datei oder dem Stream hinzu, die/der in einem vorherigen Aufruf einer der Image.Save(...)-Methoden angegeben wurde. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Wählt den Rahmen aus, der durch die Dimension und den Index angegeben ist. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem)(PropertyItem) | Speichert darin ein Eigenschaftselement (Metadaten).Image . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap)(IntPtr) | Erstellt einBitmap von einem Handle zu einer GDI-Bitmap. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize)(PixelFormat) | Gibt die Farbtiefe des angegebenen Pixelformats in Bit pro Pixel zurück. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat)(PixelFormat) | Gibt einen Wert zurück, der angibt, ob das Pixelformat dafür istImage enthält Alpha-Informationen. |

## Andere Mitglieder

| Name | Beschreibung |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort) | Stellt eine Callback-Methode bereit, um festzustellen, wann die[`GetThumbnailImage`](./getthumbnailimage) Methode sollte die Ausführung vorzeitig abbrechen. |

### Siehe auch

* namensraum [System.Drawing](../../system.drawing)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
