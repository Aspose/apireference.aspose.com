---
title: GraphicsPathIterator.NextMarker
second_title: Aspose.Drawing voor .NET API-referentie
description: GraphicsPathIterator methode. Verhoogt deGraphicsPathIteratornaar de volgende markering in het pad en retourneert de start en stopindexen via de outparameters.
type: docs
weight: 80
url: /nl/net/system.drawing.drawing2d/graphicspathiterator/nextmarker/
---
## NextMarker(out int, out int) {#nextmarker}

Verhoogt de[`GraphicsPathIterator`](../)naar de volgende markering in het pad en retourneert de start- en stopindexen via de [out]-parameters.

```csharp
public int NextMarker(out int startIndex, out int endIndex)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startIndex | Int32& | [uit] De integerreferentie die aan deze parameter wordt geleverd, ontvangt de index van het punt dat een subpad start. |
| endIndex | Int32& | [uit] De integerreferentie die aan deze parameter wordt geleverd, ontvangt de index van het punt dat het subpad beëindigt waarnaar startIndex verwijst. |

### Winstwaarde

Het aantal punten tussen deze markering en de volgende.

### Zie ook

* class [GraphicsPathIterator](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspathiterator/)
* montage [Aspose.Drawing](../../../)

---

## NextMarker(GraphicsPath) {#nextmarker_1}

Dit[`GraphicsPathIterator`](../) voorwerp heeft een[`GraphicsPath`](../../graphicspath/) object dat eraan is gekoppeld. Deze methode verhoogt het bijbehorende[`GraphicsPath`](../../graphicspath/) naar de volgende markering in zijn pad en kopieert alle punten tussen de huidige markering en de volgende markering (of einde van pad) naar een tweede[`GraphicsPath`](../../graphicspath/) object doorgegeven aan de parameter.

```csharp
public int NextMarker(GraphicsPath path)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | GraphicsPath | De[`GraphicsPath`](../../graphicspath/) object waarnaar de punten worden gekopieerd. |

### Winstwaarde

Het aantal punten tussen deze markering en de volgende.

### Zie ook

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspathiterator/)
* montage [Aspose.Drawing](../../../)


