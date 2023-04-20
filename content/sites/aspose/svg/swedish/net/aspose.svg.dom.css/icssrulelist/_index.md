---
title: Interface ICSSRuleList
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.Dom.Css.ICSSRuleList gränssnitt. CSSRuleListgränssnittet tillhandahåller abstraktionen av en ordnad samling av CSSregler.
type: docs
weight: 630
url: /sv/net/aspose.svg.dom.css/icssrulelist/
---
## ICSSRuleList interface

CSSRuleList-gränssnittet tillhandahåller abstraktionen av en ordnad samling av CSS-regler.

```csharp
public interface ICSSRuleList : IEnumerable<ICSSRule>
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Item](../../aspose.svg.dom.css/icssrulelist/item/) { get; } | Används för att hämta en CSS-regel efter metod item() (http://www.w3.org/TR/DOM-Level-2-Style/css.html#CSS-CSSRuleList). Ordningen i den här samlingen representerar ordningen för reglerna i CSS-formatmallen. Om index är större än eller lika med antalet regler i listan, returnerar detta null. |
| [Length](../../aspose.svg.dom.css/icssrulelist/length/) { get; } | Antalet CSSRules i listan. Intervallet för giltiga underordnade regelindex är 0 till och med längd-1. |

### Se även

* interface [ICSSRule](../icssrule/)
* namnutrymme [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* hopsättning [Aspose.SVG](../../)


