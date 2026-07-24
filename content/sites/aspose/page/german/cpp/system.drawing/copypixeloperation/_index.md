---
title: "System::Drawing::CopyPixelOperation‑Enum"
linktitle: "CopyPixelOperation"
second_title: "Aspose.Page für C++"
description: "System::Drawing::CopyPixelOperation‑Enum. Gibt an, wie die Quellfarbe bei einer Pixelkopieroperation mit der Ziel­farbe kombiniert wird, um in C++ eine Endfarbe zu erhalten."
type: docs
weight: 3000
url: /de/cpp/system.drawing/copypixeloperation/
---
## CopyPixelOperation enum


Gibt an, wie die Quellfarbe bei einer Pixelkopieroperation mit der Zielfarbe kombiniert wird, um eine Endfarbe zu erzeugen.

```cpp
enum class CopyPixelOperation
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| NoMirrorBitmap | n/a | Das Bitmap wird nicht gespiegelt. |
| Schwarzheit | 66 | Der Zielbereich wird mit der Farbe mit Index 0 in der physischen Palette gefüllt. |
| NotSourceErase | 1114278 | Die Quell‑ und Ziel­farben werden ODER‑verknüpft und die resultierende Farbe wird anschließend invertiert. |
| NotSourceCopy | 3342344 | Der Quellbereich wird invertiert und anschließend in das Ziel kopiert. |
| SourceErase | 4457256 | Die invertierten Farben des Zielbereichs werden mit den Farben des Quellbereichs UND-verknüpft. |
| DestinationInvert | 5570569 | Der Zielbereich wird invertiert. |
| PatInvert | 5898313 | Die Farben des aktuell im Zielgeräte-Kontext ausgewählten Pinsels werden mit den Farben des Ziels XOR-verknüpft. |
| SourceInvert | 6684742 | Die Farben der Quell- und Zielbereiche werden XOR-verknüpft. |
| SourceAnd | 8913094 | Die Farben der Quell- und Zielbereiche werden UND-verknüpft. |
| MergePaint | 12255782 | Die Farben des invertierten Quellbereichs werden mit den Farben des Zielbereichs ODER-verknüpft. |
| MergeCopy | 12583114 | Die Farben des Quellbereichs werden mit den Farben des im Zielgeräte-Kontext ausgewählten Pinsels UND-verknüpft. |
| SourceCopy | 13369376 | Der Quellbereich wird direkt in den Zielbereich kopiert. |
| SourcePaint | 15597702 | Die Farben der Quell- und Zielregionen werden ODER-verknüpft. |
| PatCopy | 15728673 | Der aktuell im Ziel-Geräte-Kontext ausgewählte Pinsel wird in das Ziel-Bitmap kopiert. |
| PatPaint | 16452105 | Die Farben des im Ziel-Geräte-Kontext aktuell ausgewählten Pinsels werden mit den Farben der invertierten Quellregion ODER-verknüpft. Das Ergebnis dieser Operation wird mit den Farben der Zielregion ODER-verknüpft. |
| Weißheit | 16711778 | Die Zielregion wird gefüllt, indem die Farbe mit Index 1 in der physischen Palette verwendet wird. |
| CaptureBlt | 1073741824 | [Windows](../../system.windows/) die über dem Anwendungsfenster geschichtet sind, werden in das resultierende Bild einbezogen. |

## Siehe auch

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
