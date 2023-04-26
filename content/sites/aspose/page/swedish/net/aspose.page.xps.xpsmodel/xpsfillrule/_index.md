---
title: Enum XpsFillRule
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsModel.XpsFillRule uppräkning. Giltiga värden för PathGeometryelementets FillRuleegenskap.
type: docs
weight: 3080
url: /sv/net/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enumeration

Giltiga värden för PathGeometry-elementets FillRule-egenskap.

```csharp
public enum XpsFillRule
```

### Värderingar

| namn | Värde | Beskrivning |
| --- | --- | --- |
| EvenOdd | `0` | Denna regel bestämmer "insidan" av en punkt på duken genom att rita en ray från punkten till oändligheten i valfri riktning och räkna antalet segment från den givna formen som strålen korsar. Om detta nummer är udda, är punkten inuti; om det är jämnt är punkten utanför. |
| NonZero | `1` | Denna regel bestämmer "insidan" av en punkt på duken genom att rita en ray från punkten till oändligheten i valfri riktning och sedan undersöka de platser där ett segment av formen korsar strålen. Börja med noll, lägg till one varje gång ett segment korsar strålen från vänster till höger och subtrahera ett varje gång ett bansegment korsar strålen från höger till vänster. Efter att ha räknat korsningarna, om resultatet är noll så är punkten utanför banan; annars är det inuti. |

### Se även

* namnutrymme [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* hopsättning [Aspose.Page](../../)


