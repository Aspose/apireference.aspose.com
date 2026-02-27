---
title: SVGBuilderExtensions.In
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions In method. Sets the in attribute for an SVG filter primitive
type: docs
weight: 1040
url: /net/aspose.svg.builder/svgbuilderextensions/in/
---
## In<TBuilder>(*this TBuilder, string*) {#in_1}

Sets the 'in' attribute for an SVG filter primitive.

```csharp
public static TBuilder In<TBuilder>(this TBuilder builder, string value)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveInAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The source graphic or filter primitive result to use as input. |

### Return Value

The builder instance for chaining.

### See Also

* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveInAttributeSetter](../../ifilterprimitiveinattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## In<TBuilder>(*this TBuilder, [FilterInput](../../filterinput/)*) {#in}

Sets the 'in' attribute for an SVG filter primitive using a predefined input source.

```csharp
public static TBuilder In<TBuilder>(this TBuilder builder, FilterInput input)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveInAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| input | The predefined input source (e.g., SourceGraphic, SourceAlpha). |

### Return Value

The builder instance for chaining.

### See Also

* enum [FilterInput](../../filterinput/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveInAttributeSetter](../../ifilterprimitiveinattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
