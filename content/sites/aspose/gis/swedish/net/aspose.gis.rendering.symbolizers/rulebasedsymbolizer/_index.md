---
title: Class RuleBasedSymbolizer
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Rendering.Symbolizers.RuleBasedSymbolizer klass. Tillämpar en symboliserare för funktionsgeometrier enligt användardefinierade regler.
type: docs
weight: 1930
url: /sv/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/
---
## RuleBasedSymbolizer class

Tillämpar en symboliserare för funktionsgeometrier enligt användardefinierade regler.

```csharp
public class RuleBasedSymbolizer : VectorSymbolizer, IReadOnlyList<Rule>
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [RuleBasedSymbolizer](rulebasedsymbolizer/)() | Default_Constructor |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/count/) { get; } | Får antalet regler. |
| [Item](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/item/) { get; } | Hämtar regeln vid det angivna indexet. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add)(Rule) | Lägger till en regel. |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add_1)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Lägger till nytt[`Rule`](../rule/) . |
| [AddElseRule](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/addelserule/)(VectorSymbolizer) | Lägger till en symboliserare som kommer att tillämpas på funktioner som inte matchar någon filtreringsregel. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/getenumerator/)() | Returnerar en uppräkning som itererar genom regler. |

### Se även

* class [VectorSymbolizer](../vectorsymbolizer/)
* class [Rule](../rule/)
* namnutrymme [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* hopsättning [Aspose.GIS](../../)


