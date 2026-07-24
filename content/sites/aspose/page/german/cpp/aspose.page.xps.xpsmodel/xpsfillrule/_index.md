---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule Enum"
linktitle: "XpsFillRule"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule Enum. Gültige Werte der FillRule‑Eigenschaft des PathGeometry‑Elements in C++."
type: docs
weight: 4900
url: /de/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


Gültige Werte der FillRule-Eigenschaft des PathGeometry-Elements.

```cpp
enum class XpsFillRule
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| EvenOdd | 0 | Diese Regel bestimmt die „Innenlage“ eines Punktes auf der Zeichenfläche, indem ein Strahl vom Punkt aus in beliebiger Richtung bis ins Unendliche gezeichnet wird und die Anzahl der Segmente der gegebenen Form gezählt wird, die der Strahl schneidet. Ist diese Zahl ungerade, liegt der Punkt innerhalb; ist sie gerade, liegt der Punkt außerhalb. |
| NonZero | 1 | Diese Regel bestimmt die „Innenlage“ eines Punktes auf der Leinwand, indem ein Strahl vom Punkt ins Unendliche in beliebiger Richtung gezeichnet wird und dann die Stellen untersucht werden, an denen ein Segment der Form den Strahl schneidet. Beginnend mit einem Zähler von null, wird jedes Mal eins addiert, wenn ein Segment den Strahl von links nach rechts schneidet, und jedes Mal eins subtrahiert, wenn ein Pfadsegment den Strahl von rechts nach links schneidet. Nach dem Zählen der Schnittpunkte, ist der Punkt außerhalb des Pfades, wenn das Ergebnis null ist; andernfalls liegt er innerhalb. |

## Siehe auch

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
