---
title: Class XpsPathGeometry
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry klas. Klasse die eigenschappen van het eigenschapselement PathGeometry inkapselt. Dit element bevat een set padcijfers die zijn gespecificeerd met het kenmerk Figures of met een onderliggend PathFigureelement.
type: docs
weight: 3280
url: /nl/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

Klasse die eigenschappen van het eigenschapselement PathGeometry inkapselt. Dit element bevat een set padcijfers die zijn gespecificeerd met het kenmerk Figures of met een onderliggend PathFigure-element.

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | Retourneert/stelt de waarde in die specificeert hoe de kruisende gebieden van geometrische vormen worden gecombineerd om een gebied te vormen. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | Retourneert een lijst met onderliggende padcijfers. |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | Retourneert/stelt de affiene transformatiematrix in die de lokale matrixtransformatie tot stand brengt die wordt toegepast op alle onderliggende en onderliggende elementen van de padgeometrie voordat deze wordt gebruikt voor vullen, knippen of strelen. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | Voegt een padsegment toe aan de lijst met onderliggende segmenten van de laatste pah-figuur. |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | Kloont deze padgeometrie. |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | Voegt een padsegment toe aan de lijst met onderliggende segmenten van het laatste padcijfer op*index* positie. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | Verwijdert een padsegment uit de lijst met onderliggende segmenten van de laatste padfiguur. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | Verwijdert een padsegment uit de lijst met onderliggende segmenten van het laatste padcijfer op*index* positie. |

### Zie ook

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* naamruimte [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* montage [Aspose.Page](../../)


