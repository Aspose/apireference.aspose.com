---
title: SVGStyleElementBuilder.AddRule
second_title: Aspose.SVG for .NET API Reference
description: SVGStyleElementBuilder method. Adds a CSS rule to the style element
type: docs
weight: 30
url: /net/aspose.svg.builder/svgstyleelementbuilder/addrule/
---
## AddRule(string, string) {#addrule_1}

Adds a CSS rule to the style element.

```csharp
public SVGStyleElementBuilder AddRule(string selector, string rules)
```

| Parameter | Type | Description |
| --- | --- | --- |
| selector | String | The CSS selector for the rule. |
| rules | String | The CSS rules as a string. |

### Return Value

The SVGStyleElementBuilder instance for chaining.

### See Also

* class [SVGStyleElementBuilder](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddRule(string, Action&lt;RuleBuilder&gt;) {#addrule}

Adds a CSS rule to the style element using a RuleBuilder.

```csharp
public SVGStyleElementBuilder AddRule(string selector, Action<RuleBuilder> configureRule)
```

| Parameter | Type | Description |
| --- | --- | --- |
| selector | String | The CSS selector for the rule. |
| configureRule | Action`1 | A delegate to configure the rule using a RuleBuilder. |

### Return Value

The SVGStyleElementBuilder instance for chaining.

### See Also

* class [RuleBuilder](../../rulebuilder/)
* class [SVGStyleElementBuilder](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
