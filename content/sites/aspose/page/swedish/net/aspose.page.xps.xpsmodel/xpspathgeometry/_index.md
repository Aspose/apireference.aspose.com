---
title: Class XpsPathGeometry
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry klass. Klass inkapslande PathGeometryegenskapselementegenskaper. Detta element innehåller en uppsättning sökvägsfigurer som anges antingen med attributet Figures eller med ett underordnat PathFigureelement.
type: docs
weight: 3270
url: /sv/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

Klass inkapslande PathGeometry-egenskapselementegenskaper. Detta element innehåller en uppsättning sökvägsfigurer som anges antingen med attributet Figures eller med ett underordnat PathFigure-element.

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | Returnerar/ställer in värdet som anger hur de skärande områdena av geometriska former kombineras för att bilda en region. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | Returnerar lista över underordnade sökvägssiffror. |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | Returnerar/ställer in den affina transformationsmatrisen som upprättar den lokala matristransformationen som tillämpas på alla underordnade och underordnade element i väggeometrin innan den används för att fylla, klippa eller stryka. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | Lägger till ett sökvägssegment i listan över underordnade segment av den sista pah-siffran. |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | Klonar denna väggeometri. |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | Infogar ett sökvägssegment i listan över underordnade segment av den sista sökvägssiffran vid*index* position. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | Tar bort ett sökvägssegment från listan över underordnade segment av den sista sökvägsfiguren. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | Tar bort ett sökvägssegment från listan över underordnade segment av den sista sökvägssiffran vid*index* position. |

### Se även

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* namnutrymme [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* hopsättning [Aspose.Page](../../)


