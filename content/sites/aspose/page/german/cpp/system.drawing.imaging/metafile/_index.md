---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Imaging::Metafile class. Stellt eine grafische Metadatei dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1200
url: /de/cpp/system.drawing.imaging/metafile/
---
## Metafile class


Stellt eine grafische Metadatei dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class Metafile : public System::Drawing::Image
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Gibt eine Kopie des aktuellen Objekts zurück. |
| [get_Height](./get_height/)() const override | Gibt die Höhe des Bildes in Pixeln zurück. |
| [get_PixelFormat](./get_pixelformat/)() const override | Gibt einen Wert zurück, der das Pixel-Format angibt. |
| [get_RawFormat](./get_rawformat/)() const override | Gibt einen Wert zurück, der das Bildformat angibt. |
| [get_Width](./get_width/)() const override | Gibt die Breite des Bildes in Pixeln zurück. |
| [GetHenhmetafile](./gethenhmetafile/)() | NICHT IMPLEMENTIERT. |
| [GetMetafileHeader](./getmetafileheader/)() | Gibt einen Header zurück, der dem aktuellen Objekt zugeordnet ist. |
| [Metafile](./metafile/)(const System::String\&) | NICHT IMPLEMENTIERT. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | NICHT IMPLEMENTIERT. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | NICHT IMPLEMENTIERT. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | NICHT IMPLEMENTIERT. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | NICHT IMPLEMENTIERT. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | NICHT IMPLEMENTIERT. |
| [Metafile](./metafile/)(IntPtr, EmfType) | NICHT IMPLEMENTIERT. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | NICHT IMPLEMENTIERT. |
| virtual [~Metafile](./~metafile/)() | Destruktor. |
## Siehe auch

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
