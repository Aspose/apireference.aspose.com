---
title: Class XpsPathGeometry
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry klas. Klasse die PathGeometryEigenschaftselementfunktionen kapselt. Dieses Element enthält eine Reihe von Pfadfiguren die entweder mit dem FiguresAttribut oder mit einem untergeordneten PathFigureElement angegeben werden.
type: docs
weight: 3280
url: /de/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

Klasse, die PathGeometry-Eigenschaftselementfunktionen kapselt. Dieses Element enthält eine Reihe von Pfadfiguren, die entweder mit dem Figures-Attribut oder mit einem untergeordneten PathFigure-Element angegeben werden.

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | Gibt den Wert zurück/legt fest, der angibt, wie die sich schneidenden Bereiche geometrischer -Formen kombiniert werden, um eine Region zu bilden. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | Gibt eine Liste der untergeordneten Pfadzahlen zurück. |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | Gibt die affine Transformationsmatrix zurück/legt sie fest, die die lokale Matrixtransformation festlegt, die auf alle untergeordneten und untergeordneten Elemente der Pfadgeometrie angewendet wird, bevor sie zum Füllen, Abschneiden oder Streichen verwendet wird. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | Fügt der Liste der untergeordneten Segmente der letzten Pfadzahl ein Pfadsegment hinzu. |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | Klont diese Pfadgeometrie. |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | Fügt ein Pfadsegment in die Liste der untergeordneten Segmente von der letzten Pfadziffer ein*index* Position. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | Entfernt ein Pfadsegment aus der Liste der untergeordneten Segmente der letzten Pfadfigur. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | Entfernt ein Pfadsegment aus der Liste der untergeordneten Segmente von der letzten Pfadzahl bei*index* Position. |

### Siehe auch

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* namensraum [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* Montage [Aspose.Page](../../)


