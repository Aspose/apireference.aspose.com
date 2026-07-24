---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure Klasse"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure Klasse. Klasse, die die Eigenschaften des PathFigure-Elements kapselt. Dieses Element besteht aus einer Menge von einem oder mehreren Geraden- oder Kurvensegmenten in C++."
type: docs
weight: 3100
url: /de/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


Klasse, die PathFigure-Elementeigenschaften kapselt. Dieses Element besteht aus einer Menge von einem oder mehreren Linien- oder Kurvensegmenten.

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Klont diese Pfadfigur. |
| [get_IsClosed](./get_isclosed/)() const | Gibt zurück/setzt den Wert, der angibt, ob die Pfadfigur geschlossen ist. |
| [get_IsFilled](./get_isfilled/)() const | Gibt zurück/setzt den Wert, der angibt, ob die Pfadfigur bei der Berechnung der Fläche der enthaltenden Pfadgeometrie verwendet wird. |
| [get_Segments](./get_segments/)() | Gibt die Liste der untergeordneten Pfadsegmente zurück. |
| [get_StartPoint](./get_startpoint/)() const | Gibt zurück/setzt den Startpunkt für das erste Segment der Pfadfigur. |
| [set_IsClosed](./set_isclosed/)(bool) | Gibt zurück/setzt den Wert, der angibt, ob die Pfadfigur geschlossen ist. |
| [set_IsFilled](./set_isfilled/)(bool) | Gibt zurück/setzt den Wert, der angibt, ob die Pfadfigur bei der Berechnung der Fläche der enthaltenden Pfadgeometrie verwendet wird. |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | Gibt zurück/setzt den Startpunkt für das erste Segment der Pfadfigur. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Setzt das n‑te Vorlagenargument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den schwachen Modus. |
## Siehe auch

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
