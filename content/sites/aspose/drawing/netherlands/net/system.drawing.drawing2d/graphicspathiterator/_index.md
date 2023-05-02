---
title: Class GraphicsPathIterator
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.Drawing2D.GraphicsPathIterator klas. Biedt de mogelijkheid om door subpaden in eenGraphicsPath en test de soorten vormen in elk subpad. Deze klasse kan niet worden geërfd.
type: docs
weight: 270
url: /nl/net/system.drawing.drawing2d/graphicspathiterator/
---
## GraphicsPathIterator class

Biedt de mogelijkheid om door subpaden in eenGraphicsPath en test de soorten vormen in elk subpad. Deze klasse kan niet worden geërfd.

```csharp
public sealed class GraphicsPathIterator : IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [GraphicsPathIterator](graphicspathiterator/)(GraphicsPath) | Initialiseert een nieuw exemplaar van het`GraphicsPathIterator` klasse. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Count](../../system.drawing.drawing2d/graphicspathiterator/count/) { get; } | Krijgt het aantal punten in het pad. |
| [SubpathCount](../../system.drawing.drawing2d/graphicspathiterator/subpathcount/) { get; } | Krijgt het aantal subpaden in het pad. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [CopyData](../../system.drawing.drawing2d/graphicspathiterator/copydata/)(ref PointF[], ref byte[], int, int) | Kopieert de eigenschap GraphicsPath.PathPoints en de eigenschap arrays GraphicsPath.PathTypes van de bijbehorende[`GraphicsPath`](../graphicspath/) in de twee gespecificeerde arrays. |
| [Dispose](../../system.drawing.drawing2d/graphicspathiterator/dispose/)() | Voert door de toepassing gedefinieerde taken uit die verband houden met het vrijmaken, vrijgeven of resetten van onbeheerde bronnen. |
| [Enumerate](../../system.drawing.drawing2d/graphicspathiterator/enumerate/)(ref PointF[], ref byte[]) | Kopieert de eigenschap GraphicsPath.PathPoints en de eigenschap arrays GraphicsPath.PathTypes van de bijbehorende[`GraphicsPath`](../graphicspath/) in de twee gespecificeerde arrays. |
| [HasCurve](../../system.drawing.drawing2d/graphicspathiterator/hascurve/)() | Geeft aan of het pad dat hieraan is gekoppeld`GraphicsPathIterator` bevat een curve. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker_1)(GraphicsPath) | Dit`GraphicsPathIterator` voorwerp heeft een[`GraphicsPath`](../graphicspath/) object dat eraan is gekoppeld. Deze methode verhoogt het bijbehorende[`GraphicsPath`](../graphicspath/) naar de volgende markering in zijn pad en kopieert alle punten tussen de huidige markering en de volgende markering (of einde van pad) naar een tweede[`GraphicsPath`](../graphicspath/) object doorgegeven aan de parameter. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker)(out int, out int) | Verhoogt de`GraphicsPathIterator`naar de volgende markering in het pad en retourneert de start- en stopindexen via de [out]-parameters. |
| [NextPathType](../../system.drawing.drawing2d/graphicspathiterator/nextpathtype/)(out byte, out int, out int) | Haalt de beginindex en de eindindex op van de volgende groep gegevenspunten die allemaal hetzelfde type hebben. |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath_1)(GraphicsPath, out bool) | Haalt het volgende cijfer (subpad) uit het bijbehorende pad hiervan`GraphicsPathIterator` . |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath)(out int, out int, out bool) | Verplaatst de`GraphicsPathIterator` naar het volgende subpad in het pad. De startindex en eindindex van het volgende subpad zijn opgenomen in de [out] parameters. |
| [Rewind](../../system.drawing.drawing2d/graphicspathiterator/rewind/)() | Spoelt dit terug`GraphicsPathIterator` naar het begin van het bijbehorende pad. |

### Zie ook

* naamruimte [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* montage [Aspose.Drawing](../../)


