---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::BitmapData class. Stellt einen Satz von Attributen eines Bitmap‑Bildes dar. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Pointer ein und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


Stellt einen Satz von Attributen eines Bitmap‑Bildes dar. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Pointer ein und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

```cpp
class BitmapData : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Height](./get_height/)() const | Gibt die Höhe des Bildes in Pixeln zurück. |
| [get_PixelFormat](./get_pixelformat/)() const | Gibt das Pixel‑Format des Bitmap‑Bildes zurück. |
| [get_Scan0](./get_scan0/)() const | Gibt die Adresse der ersten Pixeldaten im Bitmap zurück. |
| [get_Stride](./get_stride/)() const | Gibt die Stride‑Breite des Bildes in Bytes zurück. |
| [get_Width](./get_width/)() const | Gibt die Breite des Bildes in Pixeln zurück. |
| [set_Height](./set_height/)(int) | Setzt die Höhe des Bildes in Pixeln. |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | Setzt das Pixel‑Format des Bitmap‑Bildes. |
| [set_Scan0](./set_scan0/)(IntPtr) | Setzt die Adresse der ersten Pixeldaten im Bitmap. |
| [set_Stride](./set_stride/)(int) | Setzt die Stride‑Breite des Bildes in Bytes. |
| [set_Width](./set_width/)(int) | Setzt die Breite des Bildes in Pixeln. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
