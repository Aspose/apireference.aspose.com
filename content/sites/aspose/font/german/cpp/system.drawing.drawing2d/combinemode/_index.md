---
title: "System::Drawing::Drawing2D::CombineMode enum"
linktitle: "CombineMode"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Drawing2D::CombineMode enum. Gibt an, wie Beschneidungsregionen in C++ kombiniert werden."
type: docs
weight: 1400
url: /de/cpp/system.drawing.drawing2d/combinemode/
---
## CombineMode enum


Gibt an, wie Beschnittregionen kombiniert werden.

```cpp
enum class CombineMode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Ersetzen | 0 | Eine Beschneidungsregion wird durch eine andere ersetzt. |
| Intersect | 1 | Die beiden Beschneidungsregionen werden durch Bilden ihrer Schnittmenge kombiniert. |
| Union | 2 | Die beiden Beschneidungsregionen werden durch Bilden ihrer Vereinigung kombiniert. |
| Xor | 3 | Die beiden Beschneidungsregionen werden kombiniert, indem nur der von einer der beiden Regionen eingeschlossene Bereich genommen wird, jedoch nicht beide. |
| Ausschließen | 4 | Zwei Beschneidungsregionen werden kombiniert, indem der Bereich der ersten Region genommen wird, der nicht mit der zweiten überlappt. |
| Komplement | 5 | Zwei Beschneidungsregionen werden kombiniert, indem der Bereich der zweiten Region genommen wird, der nicht mit der ersten überlappt. |

## Siehe auch

* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
