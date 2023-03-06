---
title: LabelingRule.CreateFilterRule
second_title: Aspose.GIS för .NET API Referens
description: LabelingRule metod. Skapar en ny regel som tillämpar en märkning på funktion när den passerar filter.
type: docs
weight: 20
url: /sv/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

Skapar en ny regel som tillämpar en märkning på funktion när den passerar filter.

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| filter | Func`2 | Bestämmer när märkning ska användas. |
| labeling | Labeling | Märkning att applicera. |

### Returvärde

Nytt LabelingRule-objekt.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Filter är`null`. |

### Se även

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* namnutrymme [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* hopsättning [Aspose.GIS](../../../)


