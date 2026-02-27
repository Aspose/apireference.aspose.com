---
title: SVGBuilderExtensions.RefX
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions RefX method. Sets the refX attribute for an SVG element
type: docs
weight: 1930
url: /net/aspose.svg.builder/svgbuilderextensions/refx/
---
## RefX<TBuilder>(*this TBuilder, double, [LengthType](../../lengthtype/)*) {#refx_1}

Sets the 'refX' attribute for an SVG element.

```csharp
public static TBuilder RefX<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, IRefCoordinatesAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The reference X coordinate. |
| type | The type of length unit (default is pixels). |

### Return Value

The builder instance for chaining.

### See Also

* enum [LengthType](../../lengthtype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IRefCoordinatesAttributeSetter](../../irefcoordinatesattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## RefX<TBuilder>(*this TBuilder, [HorizontalPosition](../../horizontalposition/)*) {#refx}

Sets the 'refX' attribute for an SVG element using a predefined horizontal position.

```csharp
public static TBuilder RefX<TBuilder>(this TBuilder builder, HorizontalPosition value)
    where TBuilder : ISVGElementBuilder, IRefCoordinatesAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The predefined horizontal position. |

### Return Value

The builder instance for chaining.

### See Also

* enum [HorizontalPosition](../../horizontalposition/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IRefCoordinatesAttributeSetter](../../irefcoordinatesattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
