---
title: Class LabelingRule
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Rendering.Labelings.LabelingRule klass. En användardefinierad regel förRuleBasedLabeling .
type: docs
weight: 1630
url: /sv/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

En användardefinierad regel för[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | Bestämmer om "filter-regel" ska tillämpa märkning på funktionen. If returnerar`true` märkning används; annars hoppas funktionen över. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | Får ett värde som indikerar om denna regel är "annan regel". |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | Får ett värde som indikerar om denna regel är "filter-regel". |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | Märkning som ska tillämpas på funktionen. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | Skapar en ny regel som tillämpar en märkning på funktion när den inte matchar någon filterregel. |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | Skapar en ny regel som tillämpar en märkning på funktion när den passerar filter. |

### Se även

* namnutrymme [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* hopsättning [Aspose.GIS](../../)


