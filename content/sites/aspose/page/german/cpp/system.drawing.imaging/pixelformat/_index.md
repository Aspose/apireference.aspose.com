---
title: "System::Drawing::Imaging::PixelFormat Enum"
linktitle: "PixelFormat"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Imaging::PixelFormat Enum. Gibt das Farb­datenformat eines Pixels in C++ an."
type: docs
weight: 2600
url: /de/cpp/system.drawing.imaging/pixelformat/
---
## PixelFormat enum


Gibt das Farbdatumsformat eines Pixels an.

```cpp
enum class PixelFormat
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Indexed | 65536 | Gibt an, dass die Pixeldaten farbindizierte Werte enthalten, was bedeutet, dass sie ein Index zu Farben in der Systemfarbtabelle sind. |
| Gdi | 131072 | Gibt an, dass die Pixeldaten GDI‑Farben enthalten. |
| Alpha | 262144 | Gibt an, dass die Pixeldaten Alphawerte enthalten, die nicht vor­multipliziert sind. |
| PAlpha | 524288 | Gibt an, dass die Pixeldaten vor­multiplizierte Alphawerte enthalten. |
| Erweitert | 1048576 | Reserviert. |
| Kanonisch | 2097152 | Gibt das Pixelformat von 32 Bit pro Pixel mit einer Farbtiefe von 24 Bit und einem 8‑Bit‑Alpha‑Kanal an. |
| Undefiniert | 0 | Gibt an, dass das Pixelformat undefiniert ist. |
| DontCare | 0 | Das Pixelformat ist nicht angegeben. |
| Format1bppIndexed | n/a | Gibt an, dass das Pixelformat 1 Bit pro Pixel indizierte Farbe ist. |
| Format4bppIndexed | n/a | Gibt an, dass das Pixelformat 4 Bit pro Pixel indizierte Farbe ist. |
| Format8bppIndexed | n/a | Gibt an, dass das Pixelformat 8 Bit pro Pixel indizierte Farbe ist. |
| Format16bppGrayScale | n/a | Gibt an, dass das Pixelformat 16 Bit pro Pixel beträgt. Die Farbinformation gibt 65536 Graustufen an. |
| Format16bppRgb555 | n/a | Gibt an, dass das Pixelformat 16 Bit pro Pixel mit je 5 Bit für Rot-, Grün- und Blaukomponenten hat und das verbleibende Bit nicht verwendet wird. |
| Format16bppRgb565 | n/a | Gibt an, dass das Pixelformat 16 Bit pro Pixel mit 5 Bit für Rot, 6 Bit für Grün und 5 Bit für Blaukomponenten hat. |
| Format16bppArgb1555 | n/a | Gibt an, dass das Pixelformat 16 Bit pro Pixel mit je 5 Bit für Rot-, Grün- und Blaukomponenten und 1 Bit für Alpha hat. |
| Format24bppRgb | n/a | Gibt an, dass das Pixelformat 24 Bit pro Pixel mit je 8 Bit für Rot-, Grün- und Blaukomponenten hat. |
| Format32bppRgb | n/a | Gibt an, dass das Pixelformat 32 Bit pro Pixel beträgt, mit 8 Bit für jede der roten, grünen und blauen Komponenten und die restlichen 8 Bit nicht verwendet werden. |
| Format32bppArgb | n/a | Gibt an, dass das Pixelformat 32 Bit pro Pixel beträgt, mit 8 Bit für jede der roten, grünen und blauen Komponenten und 8 Bit für Alpha. |
| Format32bppPArgb | n/a | Gibt an, dass das Pixelformat 32 Bit pro Pixel beträgt, mit 8 Bit für jede der roten, grünen und blauen Komponenten und 8 Bit für Alpha. Die roten, grünen und blauen Komponenten sind gemäß dem Wert der Alpha‑Komponente vor‑multipliziert. |
| Format48bppRgb | n/a | Gibt an, dass das Pixelformat 48 Bit pro Pixel beträgt, mit 16 Bit für jede der roten, grünen und blauen Komponenten. |
| Format64bppArgb | n/a | Gibt an, dass das Pixelformat 64 Bit pro Pixel beträgt, mit 16 Bit für jede der roten, grünen und blauen Komponenten und 16 Bit für Alpha. |
| Format64bppPArgb | n/a | Gibt an, dass das Pixelformat 64 Bit pro Pixel beträgt, mit 16 Bit für jede der roten, grünen und blauen Komponenten und 16 Bit für Alpha. Die roten, grünen und blauen Komponenten sind gemäß dem Wert der Alpha‑Komponente vor‑multipliziert. |
| Format32bppCMYK | n/a | Gibt an, dass das Pixelformat 32 Bit pro Pixel beträgt, mit 8 Bit für jede der Cyan-, Magenta-, Gelb- und Key‑Komponenten. |
| Max | 16 | Der maximale Wert dieses Enums. |

## Siehe auch

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
