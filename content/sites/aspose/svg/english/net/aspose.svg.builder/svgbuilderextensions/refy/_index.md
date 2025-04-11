---
title: SVGBuilderExtensions.RefY
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions RefY method. Sets the refY attribute for an SVG element
type: docs
weight: 1940
url: /net/aspose.svg.builder/svgbuilderextensions/refy/
---
## RefY&lt;TBuilder&gt;(*this TBuilder, double, [LengthType](../../lengthtype/)*) {#refy_1}

Sets the 'refY' attribute for an SVG element.

```csharp
public static TBuilder RefY<TBuilder>(this TBuilder builder, double value, 
    LengthType type = LengthType.Px)
    where TBuilder : ISVGElementBuilder, IRefCoordinatesAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The reference Y coordinate. |
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

## RefY&lt;TBuilder&gt;(*this TBuilder, [VerticalPosition](../../verticalposition/)*) {#refy}

Sets the 'refY' attribute for an SVG element using a predefined vertical position.

```csharp
public static TBuilder RefY<TBuilder>(this TBuilder builder, VerticalPosition value)
    where TBuilder : ISVGElementBuilder, IRefCoordinatesAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The predefined vertical position. |

### Return Value

The builder instance for chaining.

### See Also

* enum [VerticalPosition](../../verticalposition/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IRefCoordinatesAttributeSetter](../../irefcoordinatesattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
