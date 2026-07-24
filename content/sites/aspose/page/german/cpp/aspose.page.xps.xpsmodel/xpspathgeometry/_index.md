---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry Klasse"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry class. Klasse, die die Eigenschaften des PathGeometry-Elements kapselt. Dieses Element enthält eine Menge von Pfadfiguren, die entweder über das Attribut Figures oder über ein untergeordnetes PathFigure-Element in C++ angegeben werden."
type: docs
weight: 3200
url: /de/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


Klasse, die PathGeometry-Eigenschaftselementeigenschaften kapselt. Dieses Element enthält eine Menge von Pfadfiguren, die entweder mit dem Figures-Attribut oder mit einem untergeordneten PathFigure-Element angegeben werden.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Fügt ein Pfadsegment zur Liste der Kindsegmente der letzten Pfadfigur hinzu. |
| [Clone](./clone/)() | Klonen Sie diese Pfadgeometrie. |
| [get_FillRule](./get_fillrule/)() const | Gibt den Wert zurück/setzt ihn, der angibt, wie die sich überschneidenden Bereiche geometrischer Formen kombiniert werden, um eine Region zu bilden. |
| [get_PathFigures](./get_pathfigures/)() | Gibt die Liste der Kind-Pfadfiguren zurück. |
| [get_Transform](./get_transform/)() override | Gibt die affine Transformationsmatrix zurück/setzt sie, die die lokale Matrixtransformation festlegt, die auf alle Kind- und Nachfahren-Elemente der Pfadgeometrie angewendet wird, bevor sie zum Füllen, Beschneiden oder Konturieren verwendet wird. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | Fügt ein Pfadsegment an der Position *index* in die Liste der Kindsegmente der letzten Pfadfigur ein. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Entfernt ein Pfadsegment aus der Liste der Kindsegmente der letzten Pfadfigur. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | Entfernt ein Pfadsegment an der Position *index* aus der Liste der Kindsegmente der letzten Pfadfigur. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Gibt den Wert zurück/setzt ihn, der angibt, wie die sich überschneidenden Bereiche geometrischer Formen kombiniert werden, um eine Region zu bilden. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Gibt die affine Transformationsmatrix zurück/setzt sie, die die lokale Matrixtransformation festlegt, die auf alle Kind- und Nachfahren-Elemente der Pfadgeometrie angewendet wird, bevor sie zum Füllen, Beschneiden oder Konturieren verwendet wird. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Setzt das n‑te Vorlagenargument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den schwachen Modus. |
## Siehe auch

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
