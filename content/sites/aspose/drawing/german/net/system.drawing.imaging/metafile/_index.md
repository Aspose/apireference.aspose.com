---
title: Metafile
second_title: Aspose.Drawing für .NET-API-Referenz
description: Definiert eine GrafikMetadatei. Eine Metadatei enthält Datensätze die eine Folge von Grafikoperationen beschreiben  die aufgezeichnet konstruiert und wiedergegeben angezeigt werden können. Diese Klasse ist nicht vererbbar.
type: docs
weight: 800
url: /de/net/system.drawing.imaging/metafile/
---
## Metafile class

Definiert eine Grafik-Metadatei. Eine Metadatei enthält Datensätze, die eine Folge von Grafikoperationen beschreiben , die aufgezeichnet (konstruiert) und wiedergegeben (angezeigt) werden können. Diese Klasse ist nicht vererbbar.

```csharp
public sealed class Metafile : Image
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Metafile](metafile#constructor_2)(Stream) | Initialisiert eine neue Instanz von[`Metafile`](../metafile) Klasse aus dem angegebenen Datenstrom. |
| [Metafile](metafile#constructor_6)(string) | Initialisiert eine neue Instanz von[`Metafile`](../metafile) Klasse aus dem angegebenen Dateinamen. |
| [Metafile](metafile#constructor)(IntPtr, bool) | Initialisiert eine neue Instanz von[`Metafile`](../metafile) Klasse aus dem angegebenen Handle. |
| [Metafile](metafile#constructor_1)(IntPtr, EmfType) | Initialisiert eine neue Instanz von[`Metafile`](../metafile) Klasse vom angegebenen Handle zu einem Gerätekontext und einerEmfTypeEnumeration, die das Format der angibtMetafile . |
| [Metafile](metafile#constructor_3)(Stream, IntPtr) | Initialisiert eine neue Instanz von[`Metafile`](../metafile) -Klasse aus dem spezifizierten -Datenstrom und einem Windows-Handle zu einem Gerätekontext. /&gt;. |
| [Metafile](metafile#constructor_7)(string, IntPtr) | Initialisiert eine neue Instanz von[`Metafile`](../metafile) Klasse aus dem angegebenen Dateinamen. |
| [Metafile](metafile#constructor_4)(Stream, IntPtr, EmfType) | Initialisiert eine neue Instanz von[`Metafile`](../metafile) Klasse aus dem spezifizierten -Datenstrom, ein Windows-Handle zu einem Gerätekontext und eineEmfType enumeration , die das Format derMetafile . |
| [Metafile](metafile#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Initialisiert eine neue Instanz von[`Metafile`](../metafile) Klasse aus dem spezifizierten -Datenstrom, ein Windows-Handle zu einem Gerätekontext und eineEmfType enumeration , die das Format derMetafile . |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Ruft die Ganzzahl ab, die eine bitweise Kombination von darstellt[`ImageFlags`](../imageflags) für dieses Bild. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist) { get; } | Ruft ein Array von GUIDs ab, die die Abmessungen der Frames darin darstellenImage . |
| override [Height](../../system.drawing.imaging/metafile/height) { get; } | Ruft die Höhe davon in Pixel abMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Ruft die horizontale Auflösung davon in Pixel pro Zoll abImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette) { get; set; } | Liest oder setzt die dafür verwendete FarbpaletteImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Ruft die Breite und Höhe dieses Bildes ab. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat) { get; } | Ruft das Pixelformat dafür abImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist) { get; } | Ruft IDs der darin gespeicherten Eigenschaftselemente abImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems) { get; } | Ruft alle darin gespeicherten Eigenschaftselemente (Teile von Metadaten) abImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat) { get; } | Ruft das Dateiformat davon abImage . |
| [Size](../../system.drawing/image/size) { get; } | Ruft die Breite und Höhe dieses Bildes in Pixel ab. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Ruft ein Objekt ab oder legt es fest, das zusätzliche Daten zum Bild bereitstellt. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Ruft die vertikale Auflösung davon in Pixel pro Zoll abImage . |
| override [Width](../../system.drawing.imaging/metafile/width) { get; } | Ruft die Breite davon in Pixel abMetafile . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Erstellt eine exakte Kopie davonImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Gibt alle von diesem Image verwendeten Ressourcen frei. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Ruft die Grenzen des Bildes in der angegebenen Einheit ab. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Gibt die Anzahl der Frames der angegebenen Dimension zurück. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile)() | Gibt ein Windows-Handle an ein Enhanced zurückMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader)() | Gibt die zurückMetafileHeader damit verbundenMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem)(int) | Ruft das angegebene Eigenschaftselement daraus abImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Gibt ein Thumbnail dafür zurückImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord)(EmfPlusRecordType, int, int, byte[]) | Spielt einen einzelnen Metadatei-Datensatz ab. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem)(int) | Entfernt das angegebene Eigenschaftselement darausImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip)(RotateFlipType) | Diese Methode dreht, dreht oder dreht und dreht dieImage . |
| [Save](../../system.drawing/image/save)(string) | Speichert diesImagein die angegebene Datei oder den angegebenen Stream. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Speichert dieses Bild im angegebenen Format im angegebenen Stream. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Speichert diesImage in die angegebene Datei im angegebenen Format. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Speichert dieses Bild mit dem angegebenen Encoder und den Bild-Encoder-Parametern im angegebenen Stream. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Speichert diesImage in die angegebene Datei mit den angegebenen Encoder- und Bild-Encoder-Parametern. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Fügt einen Frame zu der Datei oder dem Stream hinzu, der in einem vorherigen Aufruf einer der Methoden Image.Save(...) angegeben wurde. Verwenden Sie diese Methode, um ausgewählte Frames aus einem Bild mit mehreren Frames in einem anderen Bild mit mehreren Frames zu speichern. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Fügt einen Frame zu der Datei oder dem Stream hinzu, die/der in einem vorherigen Aufruf einer der Image.Save(...)-Methoden angegeben wurde. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Wählt den Rahmen aus, der durch die Dimension und den Index angegeben ist. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem)(PropertyItem) | Speichert darin ein Eigenschaftselement (Metadaten).Image . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader)(Stream) | Gibt die zurückMetafileHeader dem angegebenen zugeordnetMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader_1)(string) | Gibt die zurückMetafileHeader dem angegebenen zugeordnetMetafile . |

### Siehe auch

* class [Image](../../system.drawing/image)
* namensraum [System.Drawing.Imaging](../../system.drawing.imaging)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
