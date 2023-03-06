---
title: Rule.CreateFilterRule
second_title: Aspose.GIS voor .NET API-referentie
description: Rule methode. Creëert een nieuwe regel die een symbolizer toepast op een object wanneer het filter passeert.
type: docs
weight: 20
url: /nl/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

Creëert een nieuwe regel die een symbolizer toepast op een object wanneer het filter passeert.

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filter | Func`2 | Bepaalt wanneer symbolizer moet worden gebruikt. |
| symbolizer | VectorSymbolizer | Symbolizer om toe te passen. |

### Winstwaarde

Nieuw regelobject.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Filteren is`null`. |

### Zie ook

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* naamruimte [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* montage [Aspose.GIS](../../../)


