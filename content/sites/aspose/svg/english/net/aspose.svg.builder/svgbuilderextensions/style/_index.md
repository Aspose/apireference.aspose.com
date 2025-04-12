---
title: SVGBuilderExtensions.Style
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Style method. Sets the style attribute using a rule builder to define CSS styles
type: docs
weight: 2160
url: /net/aspose.svg.builder/svgbuilderextensions/style/
---
## Style&lt;TBuilder&gt;(*this TBuilder, Action&amp;lt;RuleBuilder&amp;gt;*) {#style}

Sets the 'style' attribute using a rule builder to define CSS styles.

```csharp
public static TBuilder Style<TBuilder>(this TBuilder builder, Action<RuleBuilder> configureRule)
    where TBuilder : ISVGElementBuilder, ICoreAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| configureRule | The action to configure the CSS rule. |

### Return Value

The builder instance for chaining.

### See Also

* class [RuleBuilder](../../rulebuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICoreAttributeSetter](../../icoreattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## Style&lt;TBuilder&gt;(*this TBuilder, string*) {#style_1}

Sets the 'style' attribute, defining inline CSS styles for the SVG element.

```csharp
public static TBuilder Style<TBuilder>(this TBuilder builder, string rules)
    where TBuilder : ISVGElementBuilder, ICoreAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The SVG element builder. |
| rules | The CSS rules as a string. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICoreAttributeSetter](../../icoreattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
