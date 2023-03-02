---
title: Class LabelingRule
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Rendering.Labelings.LabelingRule klas. Een door de gebruiker gedefinieerde regel voorRuleBasedLabeling .
type: docs
weight: 1630
url: /nl/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

Een door de gebruiker gedefinieerde regel voor[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | Bepaalt of "filterregel" labeling moet toepassen op het object. If retourneert`true` etikettering wordt gebruikt; anders wordt de functie overgeslagen. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | Krijgt een waarde die aangeeft of deze regel "else-rule" is. |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | Krijgt een waarde die aangeeft of deze regel "filterregel" is. |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | Labeling om toe te passen op het element. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | Creëert een nieuwe regel die een label toepast op een object wanneer het niet overeenkomt met een filterregel. |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | Creëert een nieuwe regel die een label toepast op een object wanneer het filter passeert. |

### Zie ook

* naamruimte [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* montage [Aspose.GIS](../../)


