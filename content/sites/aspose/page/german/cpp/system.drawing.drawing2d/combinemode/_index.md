---
title: "System::Drawing::Drawing2D::CombineMode enum"
linktitle: "CombineMode"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Drawing2D::CombineMode‑Enum. Gibt an, wie Beschneidungsbereiche in C++ kombiniert werden."
type: docs
weight: 1400
url: /de/cpp/system.drawing.drawing2d/combinemode/
---
## CombineMode enum


Gibt an, wie Clipping-Regionen kombiniert werden.

```cpp
enum class CombineMode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Ersetzen | 0 | Ein Beschneidungsbereich wird durch einen anderen ersetzt. |
| Schnitt | 1 | Die beiden Beschneidungsbereiche werden durch Bilden ihrer Schnittmenge kombiniert. |
| Vereinigung | 2 | Die beiden Beschneidungsbereiche werden durch Bilden ihrer Vereinigung kombiniert. |
| Xor | 3 | Die beiden Beschneidungsbereiche werden kombiniert, indem nur das von einem der beiden Bereiche umschlossene Gebiet, jedoch nicht von beiden, genommen wird. |
| Ausschließen | 4 | Zwei Beschneidungsbereiche werden kombiniert, indem das Gebiet des ersten Bereichs genommen wird, das nicht mit dem zweiten überschneidet. |
| Komplement | 5 | Zwei Beschneidungsbereiche werden kombiniert, indem das Gebiet des zweiten Bereichs genommen wird, das nicht mit dem ersten überschneidet. |

## Siehe auch

* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
