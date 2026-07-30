---
title: "System::Drawing::Imaging::PixelFormat enum"
linktitle: "PixelFormat"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::PixelFormat enum. Gibt das Farbformat eines Pixels in C++ an."
type: docs
weight: 2600
url: /de/cpp/system.drawing.imaging/pixelformat/
---
## PixelFormat enum


Gibt das Farbdatenformat eines Pixels an.

```cpp
enum class PixelFormat
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Indexed | 65536 | Gibt an, dass die Pixeldaten farbindizierte Werte enthalten, was bedeutet, dass sie ein Index zu Farben in der Systemfarbtabelle sind. |
| Gdi | 131072 | Gibt an, dass die Pixeldaten GDI-Farben enthalten. |
| Alpha | 262144 | Gibt an, dass die Pixeldaten Alphawerte enthalten, die nicht vorab multipliziert sind. |
| PAlpha | 524288 | Gibt an, dass die Pixeldaten vorab multiplizierte Alphawerte enthalten. |
| Erweitert | 1048576 | Reserviert. |
| Kanonisch | 2097152 | Gibt das Pixelformat von 32 Bit pro Pixel mit 24‑Bit Farbtiefe und einem 8‑Bit Alpha‑Kanal an. |
| Undefiniert | 0 | Gibt an, dass das Pixelformat undefiniert ist. |
| DontCare | 0 | Das Pixelformat ist nicht angegeben. |
| Format1bppIndexed | n/a | Gibt an, dass das Pixelformat 1 Bit pro Pixel indizierte Farbe ist. |
| Format4bppIndexed | n/a | Gibt an, dass das Pixelformat 4 Bit pro Pixel indizierte Farbe ist. |
| Format8bppIndexed | n/a | Gibt an, dass das Pixelformat 8 Bit pro Pixel indizierte Farbe ist. |
| Format16bppGrayScale | n/a | Gibt an, dass das Pixelformat 16 Bit pro Pixel beträgt. Die Farbinformation gibt 65536 Graustufen an. |
| Format16bppRgb555 | n/a | Gibt an, dass das Pixelformat 16 Bit pro Pixel mit je 5 Bit für Rot-, Grün- und Blau‑Komponenten hat und das verbleibende Bit nicht verwendet wird. |
| Format16bppRgb565 | n/a | Gibt an, dass das Pixelformat 16 Bit pro Pixel mit 5 Bit für Rot, 6 Bit für Grün und 5 Bit für Blau‑Komponenten hat. |
| Format16bppArgb1555 | n/a | Gibt an, dass das Pixelformat 16 Bit pro Pixel mit je 5 Bit für Rot-, Grün- und Blau‑Komponenten und 1 Bit für Alpha hat. |
| Format24bppRgb | n/a | Gibt an, dass das Pixelformat 24 Bit pro Pixel mit je 8 Bit für Rot-, Grün- und Blau‑Komponenten hat. |
| Format32bppRgb | n/a | Gibt an, dass das Pixel-Format 32 Bit pro Pixel mit je 8 Bit für die roten, grünen und blauen Komponenten beträgt und die verbleibenden 8 Bit nicht verwendet werden. |
| Format32bppArgb | n/a | Gibt an, dass das Pixel-Format 32 Bit pro Pixel mit je 8 Bit für die roten, grünen und blauen Komponenten und 8 Bit für Alpha beträgt. |
| Format32bppPArgb | n/a | Gibt an, dass das Pixel-Format 32 Bit pro Pixel mit je 8 Bit für die roten, grünen und blauen Komponenten und 8 Bit für Alpha beträgt. Die roten, grünen und blauen Komponenten sind gemäß dem Wert der Alpha-Komponente vor-multipliziert. |
| Format48bppRgb | n/a | Gibt an, dass das Pixel-Format 48 Bit pro Pixel mit je 16 Bit für die roten, grünen und blauen Komponenten beträgt. |
| Format64bppArgb | n/a | Gibt an, dass das Pixel-Format 64 Bit pro Pixel mit je 16 Bit für die roten, grünen und blauen Komponenten und 16 Bit für Alpha beträgt. |
| Format64bppPArgb | n/a | Gibt an, dass das Pixel-Format 64 Bit pro Pixel mit je 16 Bit für die roten, grünen und blauen Komponenten und 16 Bit für Alpha beträgt. Die roten, grünen und blauen Komponenten sind gemäß dem Wert der Alpha-Komponente vor-multipliziert. |
| Format32bppCMYK | n/a | Gibt an, dass das Pixel-Format 32 Bit pro Pixel mit je 8 Bit für die Cyan-, Magenta-, Gelb- und Schlüsselkomponenten beträgt. |
| Max | 16 | Der maximale Wert dieses Enums. |

## Siehe auch

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
