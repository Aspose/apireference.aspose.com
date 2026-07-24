---
title: "Aspose::Page::XPS::XpsModel::XpsTileMode Aufzählung"
linktitle: "XpsTileMode"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsModel::XpsTileMode Aufzählung. Gültige Werte der TileMode‑Eigenschaft von Kachelpinsel in C++."
type: docs
weight: 5500
url: /de/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


Gültige Werte der TileMode-Eigenschaft von Kachelpinseln.

```cpp
enum class XpsTileMode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| None | 0 | In diesem Modus wird nur die einzelne Basis‑Kachel gezeichnet. Der verbleibende Bereich bleibt transparent. |
| Tile | 1 | In diesem Modus wird die Basis‑Kachel gezeichnet und der verbleibende Bereich wird durch Wiederholen der Basis‑Kachel gefüllt, sodass die rechte Kante jeder Kachel an die linke Kante der nächsten anstößt und die untere Kante jeder Kachel an die obere Kante der nächsten anstößt. |
| FlipX | 2 | Die Kachelanordnung ist ähnlich zum Tile‑Modus, jedoch werden alternierende Spalten von Kacheln horizontal gespiegelt. Die Basis‑Kachel wird wie vom Ansichtsfenster angegeben positioniert. Kacheln in den Spalten links und rechts von dieser Kachel werden horizontal gespiegelt. |
| FlipY | 3 | Die Kachelanordnung ist ähnlich zum Tile‑Modus, jedoch werden alternierende Reihen von Kacheln vertikal gespiegelt. Die Basis‑Kachel wird wie vom Ansichtsfenster angegeben positioniert. Reihen oberhalb und unterhalb werden vertikal gespiegelt. |
| FlipXY | 4 | Die Kachelanordnung ist ähnlich zum Tile tile mode, aber alternierende Spalten von Kacheln werden horizontal gespiegelt und alternierende Zeilen von Kacheln vertikal gespiegelt. Die Basis‑Kachel wird wie im viewport angegeben positioniert. |

## Siehe auch

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
