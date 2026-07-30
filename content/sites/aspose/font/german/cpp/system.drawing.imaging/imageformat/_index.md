---
title: "System::Drawing::Imaging::ImageFormat Klasse"
linktitle: "ImageFormat"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::ImageFormat Klasse. Stellt das Dateiformat eines Bildes dar. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1100
url: /de/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Stellt das Dateiformat eines Bildes dar. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/) Funktion zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ImageFormat : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Bestimmt, ob die von den aktuellen und angegebenen Objekten dargestellten Bildformate gleich sind. |
| static [get_Bmp](./get_bmp/)() | Gibt einen Shared‑Pointer auf ein [ImageFormat](./)-Objekt zurück, das das Bitmap‑Bildformat darstellt. |
| static [get_Emf](./get_emf/)() | Gibt einen Shared‑Pointer auf ein [ImageFormat](./)-Objekt zurück, das das erweiterte Metafile‑Format darstellt. |
| static [get_Exif](./get_exif/)() | Gibt einen Shared‑Pointer auf ein [ImageFormat](./)-Objekt zurück, das das austauschbare [Image](../../system.drawing/image/)-Dateiformat (Exif) darstellt. |
| static [get_Gif](./get_gif/)() | Gibt einen Shared‑Pointer auf ein [ImageFormat](./)-Objekt zurück, das das [Graphics](../../system.drawing/graphics/)-Interchange‑Format (GIF) Bildformat darstellt. |
| [get_Guid](./get_guid/)() const | Gibt die GUID zurück, die dem von dem aktuellen Objekt dargestellten Bildformat zugeordnet ist. |
| static [get_Icon](./get_icon/)() | Gibt einen Shared‑Pointer auf ein [ImageFormat](./)-Objekt zurück, das das [Windows](../../system.windows/) Icon‑Bildformat darstellt. |
| static [get_Jpeg](./get_jpeg/)() | Gibt einen Shared‑Pointer auf ein [ImageFormat](./)-Objekt zurück, das das Joint Photographic Experts Group (JPEG)-Bildformat darstellt. |
| static [get_MemoryBmp](./get_memorybmp/)() | Gibt einen Shared‑Pointer auf ein [ImageFormat](./)-Objekt zurück, das das Format eines Bitmaps im Speicher darstellt. |
| static [get_Png](./get_png/)() | Gibt einen Shared‑Pointer auf ein [ImageFormat](./)-Objekt zurück, das das W3C Portable Network [Graphics](../../system.drawing/graphics/)-Format (PNG) Bildformat darstellt. |
| static [get_Tiff](./get_tiff/)() | Gibt einen Shared‑Pointer auf ein [ImageFormat](./)-Objekt zurück, das das Tagged [Image](../../system.drawing/image/)-Dateiformat (TIFF) Bildformat darstellt. |
| static [get_Wmf](./get_wmf/)() | Gibt einen Shared‑Pointer auf ein [ImageFormat](./)-Objekt zurück, das das [Windows](../../system.windows/) Metafile (WMF) Bildformat darstellt. |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Konstruiert eine Instanz der [ImageFormat](./)-Klasse, die ein mit der angegebenen GUID verknüpftes Bildformat darstellt. |
| virtual [ToString](./tostring/)() const | Konvertiert dieses [ImageFormat](./)-Objekt in eine menschenlesbare Zeichenkette. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
