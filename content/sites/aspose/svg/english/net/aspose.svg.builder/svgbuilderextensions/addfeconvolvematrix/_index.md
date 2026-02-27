---
title: SVGBuilderExtensions.AddFeConvolveMatrix
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddFeConvolveMatrix method. Adds an feConvolveMatrix element configuration to the builder. This element applies a matrix convolution filter effect
type: docs
weight: 170
url: /net/aspose.svg.builder/svgbuilderextensions/addfeconvolvematrix/
---
## AddFeConvolveMatrix<TBuilder>(*this TBuilder, Action&lt;SVGFEConvolveMatrixElementBuilder&gt;*) {#addfeconvolvematrix_1}

Adds an 'feConvolveMatrix' element configuration to the builder. This element applies a matrix convolution filter effect.

```csharp
public static TBuilder AddFeConvolveMatrix<TBuilder>(this TBuilder builder, 
    Action<SVGFEConvolveMatrixElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feConvolveMatrix' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEConvolveMatrixElementBuilder](../../svgfeconvolvematrixelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFeConvolveMatrix<TBuilder>(*this TBuilder, double[], double?, double?, int?, int?, EdgeMode?, bool?, OneOf&lt;int, (int, int)&gt;, OneOf&lt;string, FilterInput&gt;, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint, string&gt;, OneOf&lt;Color, Paint, string&gt;, string, Action&lt;SVGFEConvolveMatrixElementBuilder&gt;*) {#addfeconvolvematrix}

Adds an 'feConvolveMatrix' element to the SVG builder, applying a matrix convolution filter effect.

```csharp
public static TBuilder AddFeConvolveMatrix<TBuilder>(this TBuilder builder, 
    double[] kernelMatrix = null, double? divisor = null, double? bias = null, int? targetX = null, 
    int? targetY = null, EdgeMode? edgeMode = default, bool? preserveAlpha = null, 
    OneOf<int, (int, int)> order = null, OneOf<string, FilterInput> @in = null, 
    string result = null, OneOf<double, (double, LengthType)> x = null, 
    OneOf<double, (double, LengthType)> y = null, OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint, string> fill = null, 
    OneOf<Color, Paint, string> stroke = null, string id = null, 
    Action<SVGFEConvolveMatrixElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'feConvolveMatrix' element will be added. |
| kernelMatrix | The matrix of values for the convolution. Optional parameter. |
| divisor | The divisor for the convolution. Optional parameter. |
| bias | The bias to be added to the result of the convolution. Optional parameter. |
| targetX | The x-coordinate of the target pixel in the kernel matrix. Optional parameter. |
| targetY | The y-coordinate of the target pixel in the kernel matrix. Optional parameter. |
| edgeMode | Defines how to handle edge pixels in the convolution. Optional parameter. |
| preserveAlpha | Indicates whether to preserve the alpha channel. Optional parameter. |
| order | The order of the kernel matrix. Can be an int or a ValueTuple of two ints. Optional parameter. |
| in | The input for the convolution effect. Can be a string or a FilterInput. Optional parameter. |
| result | The result identifier for this filter primitive. Optional parameter. |
| x | The x-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color, paint or paint server id for the element. Optional parameter. |
| stroke | The stroke color, paint or paint server id for the element. Optional parameter. |
| id | The unique identifier for the filter primitive element. Optional parameter. |
| extend | An optional action to further configure the SVGFEConvolveMatrixElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* enum [EdgeMode](../../edgemode/)
* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [FilterInput](../../filterinput/)
* enum [LengthType](../../lengthtype/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGFEConvolveMatrixElementBuilder](../../svgfeconvolvematrixelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
