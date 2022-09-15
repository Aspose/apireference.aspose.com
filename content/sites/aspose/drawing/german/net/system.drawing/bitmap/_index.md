---
title: Bitmap
second_title: Aspose.Drawing für .NET-API-Referenz
description: Kapselt eine Bitmap die aus den Pixeldaten für ein Grafikbild und seinen Attributen besteht. ABitmap./bitmap ist ein Objekt das verwendet wird um mit Bildern zu arbeiten die durch Pixeldaten definiert sind.
type: docs
weight: 40
url: /de/net/system.drawing/bitmap/
---
## Bitmap class

Kapselt eine Bitmap, die aus den Pixeldaten für ein Grafikbild und seinen Attributen besteht. A[`Bitmap`](../bitmap) ist ein Objekt, das verwendet wird, um mit Bildern zu arbeiten, die durch Pixeldaten definiert sind.

```csharp
public class Bitmap : Image
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [Bitmap](bitmap#constructor_3)(Image) | Initialisiert eine neue Instanz von[`Bitmap`](../bitmap) Klasse aus dem angegebenen vorhandenen Image. |
| [Bitmap](bitmap#constructor_6)(Stream) | Initialisiert eine neue Instanz von[`Bitmap`](../bitmap) Klasse aus dem angegebenen Datenstrom. |
| [Bitmap](bitmap#constructor_8)(string) | Initialisiert eine neue Instanz von[`Bitmap`](../bitmap) Klasse aus der angegebenen Datei. |
| [Bitmap](bitmap#constructor_5)(Image, Size) | Initialisiert eine neue Instanz von[`Bitmap`](../bitmap)Klasse aus dem angegebenen vorhandenen Bild, skaliert auf die angegebene Größe. |
| [Bitmap](bitmap#constructor)(int, int) | Initialisiert eine neue Instanz von[`Bitmap`](../bitmap) Klasse mit der angegebenen Größe. |
| [Bitmap](bitmap#constructor_7)(Stream, bool) | Initialisiert eine neue Instanz von[`Bitmap`](../bitmap) Klasse aus dem angegebenen Datenstrom. |
| [Bitmap](bitmap#constructor_9)(string, bool) | Initialisiert eine neue Instanz von[`Bitmap`](../bitmap) Klasse aus der angegebenen Datei. |
| [Bitmap](bitmap#constructor_4)(Image, int, int) | Initialisiert eine neue Instanz von[`Bitmap`](../bitmap) Klasse aus dem angegebenen vorhandenen Bild, auf die angegebene Größe skaliert. |
| [Bitmap](bitmap#constructor_2)(int, int, PixelFormat) | Initialisiert eine neue Instanz von[`Bitmap`](../bitmap) Klasse mit der angegebenen Größe und dem angegebenen Format. |
| [Bitmap](bitmap#constructor_1)(int, int, int, PixelFormat, int[]) | Initialisiert eine neue Instanz von[`Bitmap`](../bitmap) Klasse mit der angegebenen Größe und Pixeldaten. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Ruft die Ganzzahl ab, die eine bitweise Kombination von darstellt[`ImageFlags`](../../system.drawing.imaging/imageflags) für dieses Bild. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist) { get; } | Ruft ein Array von GUIDs ab, die die Abmessungen der Frames darin darstellenImage . |
| override [Height](../../system.drawing/bitmap/height) { get; } | Ruft die Höhe dieser Bitmap in Pixel ab. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Ruft die horizontale Auflösung davon in Pixel pro Zoll abImage . |
| override [Palette](../../system.drawing/bitmap/palette) { get; set; } | Liest oder setzt die dafür verwendete FarbpaletteImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Ruft die Breite und Höhe dieses Bildes ab. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat) { get; } | Ruft das Pixelformat dafür abImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist) { get; } | Ruft IDs der darin gespeicherten Eigenschaftselemente abImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems) { get; } | Ruft alle darin gespeicherten Eigenschaftselemente (Teile von Metadaten) abImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat) { get; } | Ruft das Dateiformat davon abImage . |
| [Size](../../system.drawing/image/size) { get; } | Ruft die Breite und Höhe dieses Bildes in Pixel ab. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Ruft ein Objekt ab oder legt es fest, das zusätzliche Daten zum Bild bereitstellt. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Ruft die vertikale Auflösung davon in Pixel pro Zoll abImage . |
| override [Width](../../system.drawing/bitmap/width) { get; } | Ruft die Breite dieser Bitmap in Pixel ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Erstellt eine exakte Kopie davonImage . |
| [Clone](../../system.drawing/bitmap/clone#clone)(Rectangle, PixelFormat) | Erstellt eine Kopie des Abschnitts von diesemBitmap definiert vonRectangle structure und mit einer angegebenenPixelFormat Aufzählung. |
| [Clone](../../system.drawing/bitmap/clone#clone_1)(RectangleF, PixelFormat) | Erstellt eine Kopie des Abschnitts von diesemBitmap definiert mit einem angegebenenPixelFormat Aufzählung. |
| virtual [Dispose](../../system.drawing/image/dispose)() | Gibt alle von diesem Image verwendeten Ressourcen frei. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Ruft die Grenzen des Bildes in der angegebenen Einheit ab. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Gibt die Anzahl der Frames der angegebenen Dimension zurück. |
| [GetPixel](../../system.drawing/bitmap/getpixel)(int, int) | Ruft die Farbe des angegebenen Pixels in diesem abBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem)(int) | Ruft das angegebene Eigenschaftselement daraus abImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Gibt ein Thumbnail dafür zurückImage . |
| [LockBits](../../system.drawing/bitmap/lockbits)(Rectangle, ImageLockMode, PixelFormat) | Sperren aBitmap in den Systemspeicher. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent)() | Macht dafür die angegebene Farbe transparentBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent_1)(Color) | Macht dafür die angegebene Farbe transparentBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels)(int[]) | Liest Bitmap-Pixel im ARGB32-Format in das angegebene Array. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem)(int) | Entfernt das angegebene Eigenschaftselement darausImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip)(RotateFlipType) | Diese Methode dreht, dreht oder dreht und dreht dieImage . |
| [Save](../../system.drawing/image/save)(string) | Speichert diesImagein die angegebene Datei oder den angegebenen Stream. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Speichert dieses Bild im angegebenen Format im angegebenen Stream. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Speichert diesImage in die angegebene Datei im angegebenen Format. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Speichert dieses Bild mit dem angegebenen Encoder und den Bild-Encoder-Parametern im angegebenen Stream. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Speichert diesImage in die angegebene Datei mit den angegebenen Encoder- und Bild-Encoder-Parametern. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Fügt einen Frame zu der Datei oder dem Stream hinzu, der in einem vorherigen Aufruf einer der Methoden Image.Save(...) angegeben wurde. Verwenden Sie diese Methode, um ausgewählte Frames aus einem Bild mit mehreren Frames in einem anderen Bild mit mehreren Frames zu speichern. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Fügt einen Frame zu der Datei oder dem Stream hinzu, die/der in einem vorherigen Aufruf einer der Image.Save(...)-Methoden angegeben wurde. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Wählt den Rahmen aus, der durch die Dimension und den Index angegeben ist. |
| [SetPixel](../../system.drawing/bitmap/setpixel)(int, int, Color) | Legt die Farbe des angegebenen Pixels in diesem festBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem)(PropertyItem) | Speichert darin ein Eigenschaftselement (Metadaten).Image . |
| [SetResolution](../../system.drawing/bitmap/setresolution)(float, float) | Legt die Auflösung dafür festBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits)(BitmapData) | Schaltet dies freiBitmap aus dem Systemspeicher. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels)(int[]) | Schreibt Pixel in die Bitmap. |

### Siehe auch

* class [Image](../image)
* namensraum [System.Drawing](../../system.drawing)
* Montage [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
