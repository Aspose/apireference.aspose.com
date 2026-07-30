---
title: "System::Drawing::Imaging::ImageCodecInfo-Klasse"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::ImageCodecInfo Klasse. Stellt Informationen über einen Bildcodec bereit. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


Stellt Informationen über einen Bildcodec bereit. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ImageCodecInfo : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | Gibt eine GUID zurück, die mit dem Format des vom aktuellen Objekt dargestellten Codecs verknüpft ist. |
| [get_MimeType](./get_mimetype/)() | Gibt den Multipurpose Internet Mail Extensions (MIME)-Typ des vom aktuellen Objekt dargestellten Codecs zurück. |
| static [GetImageDecoders](./getimagedecoders/)() | Gibt ein Array von [ImageCodecInfo](./)-Objekten zurück, die unterstützte Bilddecoder darstellen. |
| static [GetImageEncoders](./getimageencoders/)() | Gibt ein Array von [ImageCodecInfo](./)-Objekten zurück, die unterstützte Bildencoder darstellen. |
| [set_FormatID](./set_formatid/)(const Guid\&) | Setzt eine GUID, die mit dem Format des vom aktuellen Objekt dargestellten Codecs verknüpft ist. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
