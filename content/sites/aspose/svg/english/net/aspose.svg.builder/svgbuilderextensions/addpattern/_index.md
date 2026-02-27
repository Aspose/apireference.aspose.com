---
title: SVGBuilderExtensions.AddPattern
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddPattern method. Adds a pattern element configuration to the builder
type: docs
weight: 410
url: /net/aspose.svg.builder/svgbuilderextensions/addpattern/
---
## AddPattern<TBuilder>(*this TBuilder, Action&lt;SVGPatternElementBuilder&gt;*) {#addpattern}

Adds a 'pattern' element configuration to the builder.

```csharp
public static TBuilder AddPattern<TBuilder>(this TBuilder builder, 
    Action<SVGPatternElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IPaintServerElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'pattern' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGPatternElementBuilder](../../svgpatternelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IPaintServerElementBuilder](../../ipaintserverelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddPattern<TBuilder>(*this TBuilder, CoordinateUnits?, CoordinateUnits?, string, string, Action&lt;SVGPatternElementBuilder&gt;*) {#addpattern_1}

Adds a 'pattern' element to the SVG builder, specifying the coordinate system and units for the pattern's content.

```csharp
public static TBuilder AddPattern<TBuilder>(this TBuilder builder, CoordinateUnits? patternUnits, 
    CoordinateUnits? patternContentUnits, string href = null, string id = null, 
    Action<SVGPatternElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'pattern' element will be added. |
| patternUnits | Specifies the coordinate system for the pattern. Optional parameter. |
| patternContentUnits | Specifies the coordinate system for the content within the pattern. Optional parameter. |
| href | The reference to another pattern, if applicable. Optional parameter. |
| id | The unique identifier for the pattern element. Optional parameter. |
| extend | An optional action to further configure the pattern element builder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* enum [CoordinateUnits](../../coordinateunits/)
* class [SVGPatternElementBuilder](../../svgpatternelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
