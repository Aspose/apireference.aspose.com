---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule enum"
linktitle: "XpsFillRule"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule enum. Giltiga värden för PathGeometry‑elementets FillRule‑egenskap i C++."
type: docs
weight: 4900
url: /sv/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


Giltiga värden för PathGeometry-elementets egenskap FillRule.

```cpp
enum class XpsFillRule
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| EvenOdd | 0 | Denna regel bestämmer ”insideness” för en punkt på duken genom att rita en stråle från punkten till oändligheten i någon riktning och räkna antalet segment från den givna formen som strålen korsar. Om detta antal är udda är punkten innanför; om det är jämnt är punkten utanför. |
| NonZero | 1 | Denna regel bestämmer en punkts “insideness” på duken genom att rita en stråle från punkten till oändligheten i någon riktning och sedan undersöka de ställen där ett segment av formen korsar strålen. Med en starträkning på noll, lägg till ett varje gång ett segment korsar strålen från vänster till höger och subtrahera ett varje gång ett bansegment korsar strålen från höger till vänster. Efter att ha räknat korsningarna, om resultatet är noll så är punkten utanför banan; annars är den innanför. |

## Se även

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
