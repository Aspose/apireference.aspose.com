---
title: SVGBuilderExtensions.AddImage
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddImage method. Adds an image element to the SVG builder embedding an external image into the SVG document
type: docs
weight: 330
url: /net/aspose.svg.builder/svgbuilderextensions/addimage/
---
## AddImage&lt;TBuilder&gt;(*this TBuilder, string, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, OneOf&amp;lt;double, (double, LengthType)&amp;gt;, string, Action&amp;lt;SVGImageElementBuilder&amp;gt;*) {#addimage_1}

Adds an 'image' element to the SVG builder, embedding an external image into the SVG document.

```csharp
public static TBuilder AddImage<TBuilder>(this TBuilder builder, string href = null, 
    OneOf<double, (double, LengthType)> x = null, OneOf<double, (double, LengthType)> y = null, 
    OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, string id = null, 
    Action<SVGImageElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'image' element will be added. |
| href | The URL or reference to the external image. Optional parameter. |
| x | The x-coordinate where the image is placed. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate where the image is placed. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the image. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the image. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| id | The unique identifier for the image element. Optional parameter. |
| extend | An optional action to further configure the SVGImageElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [LengthType](../../lengthtype/)
* class [SVGImageElementBuilder](../../svgimageelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddImage&lt;TBuilder&gt;(*this TBuilder, Action&amp;lt;SVGImageElementBuilder&amp;gt;*) {#addimage}

Adds an 'image' element configuration to the builder.

```csharp
public static TBuilder AddImage<TBuilder>(this TBuilder builder, 
    Action<SVGImageElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'image' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGImageElementBuilder](../../svgimageelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
