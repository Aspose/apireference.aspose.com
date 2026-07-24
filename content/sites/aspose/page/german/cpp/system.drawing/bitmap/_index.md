---
title: "System::Drawing::Bitmap class"
linktitle: "Bitmap"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Bitmap class. Stellt ein GDI+ Bitmap‑Bild dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.drawing/bitmap/
---
## Bitmap class


Stellt ein GDI+ Bitmap‑Bild dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Bitmap : public System::Drawing::Image
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | Aktiviert den Pixelverarbeitungsmodus. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | Erzeugt ein neues [Bitmap](./)-Objekt aus dem angegebenen vorhandenen Bild. |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | Erzeugt ein neues [Bitmap](./)-Objekt aus dem angegebenen Stream. |
| [Bitmap](./bitmap/)(const String\&) | Erzeugt ein neues [Bitmap](./)-Objekt aus der angegebenen Datei. |
| [Bitmap](./bitmap/)(const String\&, bool) | Erzeugt ein neues [Bitmap](./)-Objekt aus der angegebenen Datei. |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | Erzeugt ein neues [Bitmap](./)-Objekt, das ein Bitmap‑Bild mit der angegebenen Breite, Höhe, dem Pixel‑Format und den Pixeldaten darstellt. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | Erzeugt ein neues [Bitmap](./)-Objekt aus dem angegebenen vorhandenen Bild, skaliert auf die angegebene Größe. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | Erzeugt ein neues [Bitmap](./)-Objekt aus dem angegebenen vorhandenen Bild, wobei Breite und Höhe auf die angegebenen Werte skaliert werden. |
| [Clone](./clone/)() override | Erstellt eine Kopie des aktuellen Objekts. |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | Erstellt ein [Bitmap](./)-Objekt, das eine Kopie eines Bereichs des Bitmap‑Bildes darstellt, das vom aktuellen Objekt repräsentiert wird. |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | Erstellt ein [Bitmap](./)-Objekt, das eine Kopie eines Bereichs des Bitmap‑Bildes darstellt, das vom aktuellen Objekt repräsentiert wird. |
| [ComputeHash](./computehash/)() | Berechnet den SHA1‑Hashwert. |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | Erstellt eine Kopie des angegebenen Bitmap‑Bildes, wobei das Pixel‑Format zu Format32bppArgb geändert wird. |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | Deaktiviert den Pixelverarbeitungsmodus. |
| [get_Height](./get_height/)() const override | Gibt die Höhe des Bildes in Pixeln zurück. |
| [get_Palette](./get_palette/)() const override | Gibt die vom Bild, das vom aktuellen Objekt repräsentiert wird, verwendete Farbpalette zurück. |
| [get_PixelFormat](./get_pixelformat/)() const override | Gibt das Pixel-Format des Bildes zurück, das vom aktuellen Objekt repräsentiert wird. |
| [get_RawFormat](./get_rawformat/)() const override | Gibt das Dateiformat des Bildes zurück, das vom aktuellen Objekt repräsentiert wird. |
| [get_Width](./get_width/)() const override | Gibt die Breite des Bildes in Pixeln zurück. |
| [GetHbitmap](./gethbitmap/)() | Erstellt ein GDI‑Bitmap‑Objekt aus dem Bitmap, das vom aktuellen Objekt repräsentiert wird. |
| [GetPixel](./getpixel/)(int, int) | Gibt die Farbe des angegebenen Pixels zurück. |
| [GetSkBitmap](./getskbitmap/)() const override | Gibt einen rohen Zeiger auf das zugrunde liegende SkBitmap-Objekt zurück. |
| [IsMultiImage](./ismultiimage/)() const override | Gibt zurück, ob das Originalformat ein Mehrfachbild ist. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | Sperrt ein [Bitmap](./) im Systemspeicher. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | Sperrt ein [Bitmap](./) im Systemspeicher. |
| [MakeTransparent](./maketransparent/)(Color) | Ändert die Farbe aller Pixel mit der angegebenen Farbe zu transparent. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | Vormultipliziert die Farben der Pixel des Bildes, das vom aktuellen Objekt repräsentiert wird. |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | Dreht das Bild um ein Vielfaches von 90 Grad und spiegelt es. |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | Legt die vom aktuellen Objekt dargestellte Bild verwendete Farbpalette fest. |
| [SetPixel](./setpixel/)(int, int, Color) | Setzt die Farbe des angegebenen Pixels im Bitmap-Bild, das vom aktuellen Objekt repräsentiert wird. |
| [SetResolution](./setresolution/)(float, float) | Setzt die Auflösung des Bildes. |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | Entsperrt das angegebene Bitmap aus dem Systemspeicher. |
## Siehe auch

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
