---
title: Class Rule
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Rendering.Symbolizers.Rule klas. Een door de gebruiker gedefinieerde regel voorRuleBasedSymbolizer .
type: docs
weight: 1920
url: /nl/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

Een door de gebruiker gedefinieerde regel voor[`RuleBasedSymbolizer`](../rulebasedsymbolizer/) .

```csharp
public class Rule
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | Bepaalt of "filterregel" symbolizer moet toepassen op het object. If retourneert`true` symbolizer wordt gebruikt; anders wordt de functie overgeslagen. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | Krijgt een waarde die aangeeft of deze regel "else-rule" is. |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | Krijgt een waarde die aangeeft of deze regel "filterregel" is. |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | Symbolizer om toe te passen op het object. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | Creëert een nieuwe regel die een symbolizer toepast op een object wanneer het niet overeenkomt met een filterregel. |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Creëert een nieuwe regel die een symbolizer toepast op een object wanneer het filter passeert. |

### Zie ook

* naamruimte [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* montage [Aspose.GIS](../../)


