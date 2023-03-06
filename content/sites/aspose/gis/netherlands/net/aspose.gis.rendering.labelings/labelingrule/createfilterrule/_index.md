---
title: LabelingRule.CreateFilterRule
second_title: Aspose.GIS voor .NET API-referentie
description: LabelingRule methode. Creëert een nieuwe regel die een label toepast op een object wanneer het filter passeert.
type: docs
weight: 20
url: /nl/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

Creëert een nieuwe regel die een label toepast op een object wanneer het filter passeert.

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filter | Func`2 | Bepaalt wanneer labeling moet worden gebruikt. |
| labeling | Labeling | Etikettering om toe te passen. |

### Winstwaarde

Nieuw LabelingRule-object.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Filteren is`null`. |

### Zie ook

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* naamruimte [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* montage [Aspose.GIS](../../../)


