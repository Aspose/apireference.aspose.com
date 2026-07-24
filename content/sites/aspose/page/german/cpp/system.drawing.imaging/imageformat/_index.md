---
title: "System::Drawing::Imaging::ImageFormat Klasse"
linktitle: "ImageFormat"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Imaging::ImageFormat Klasse. Stellt das Dateiformat eines Bildes dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 1100
url: /de/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Stellt das Dateiformat eines Bildes dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ImageFormat : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Bestimmt, ob die von den aktuellen und den angegebenen Objekten dargestellten Bildformate gleich sind. |
| static [get_Bmp](./get_bmp/)() | Gibt einen Shared Pointer auf ein [ImageFormat](./) Objekt zurück, das das Bitmap-Bildformat darstellt. |
| static [get_Emf](./get_emf/)() | Gibt einen Shared Pointer auf ein [ImageFormat](./) Objekt zurück, das das erweiterte Metadatei-Format darstellt. |
| static [get_Exif](./get_exif/)() | Gibt einen Shared Pointer auf ein [ImageFormat](./) Objekt zurück, das das Exchangeable [Image](../../system.drawing/image/) File (Exif)-Format darstellt. |
| static [get_Gif](./get_gif/)() | Gibt einen Shared Pointer auf ein [ImageFormat](./) Objekt zurück, das das [Graphics](../../system.drawing/graphics/) Interchange Format (GIF)-Bildformat darstellt. |
| [get_Guid](./get_guid/)() const | Gibt die GUID zurück, die dem von dem aktuellen Objekt dargestellten Bildformat zugeordnet ist. |
| static [get_Icon](./get_icon/)() | Gibt einen Shared Pointer auf ein [ImageFormat](./) Objekt zurück, das das [Windows](../../system.windows/) Icon-Bildformat darstellt. |
| static [get_Jpeg](./get_jpeg/)() | Gibt einen Shared Pointer auf ein [ImageFormat](./) Objekt zurück, das das Joint Photographic Experts Group (JPEG)-Bildformat darstellt. |
| static [get_MemoryBmp](./get_memorybmp/)() | Gibt einen Shared Pointer auf ein [ImageFormat](./) Objekt zurück, das das Format eines Bitmaps im Speicher darstellt. |
| static [get_Png](./get_png/)() | Gibt einen Shared Pointer auf ein [ImageFormat](./) Objekt zurück, das das W3C Portable Network [Graphics](../../system.drawing/graphics/) (PNG)-Bildformat darstellt. |
| static [get_Tiff](./get_tiff/)() | Gibt einen Shared Pointer auf ein [ImageFormat](./) Objekt zurück, das das Tagged [Image](../../system.drawing/image/) File Format (TIFF)-Bildformat darstellt. |
| static [get_Wmf](./get_wmf/)() | Gibt einen Shared Pointer auf ein [ImageFormat](./) Objekt zurück, das das [Windows](../../system.windows/) Metadatei (WMF)-Bildformat darstellt. |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Konstruiert eine Instanz der Klasse [ImageFormat](./), die ein Bildformat darstellt, das mit der angegebenen GUID verknüpft ist. |
| virtual [ToString](./tostring/)() const | Konvertiert dieses [ImageFormat](./) Objekt in eine menschenlesbare Zeichenkette. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
