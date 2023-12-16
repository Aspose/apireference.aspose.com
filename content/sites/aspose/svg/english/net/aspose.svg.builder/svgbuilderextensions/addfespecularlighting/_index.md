---
title: SVGBuilderExtensions.AddFeSpecularLighting
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds an feSpecularLighting element to the SVG builder applying a specular lighting effect using a specified light source
type: docs
weight: 270
url: /net/aspose.svg.builder/svgbuilderextensions/addfespecularlighting/
---
## AddFeSpecularLighting&lt;TBuilder&gt;(this TBuilder, Action&lt;SVGFEDistantLightElementBuilder&gt;, Color?, double?, double?, double?, OneOf&lt;double, (double, double)&gt;, OneOf&lt;string, FilterInput&gt;, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint&gt;, OneOf&lt;Color, Paint&gt;, string, Action&lt;SVGFESpecularLightingElementBuilder&gt;) {#addfespecularlighting}

Adds an 'feSpecularLighting' element to the SVG builder, applying a specular lighting effect using a specified light source.

```csharp
public static TBuilder AddFeSpecularLighting<TBuilder>(this TBuilder builder, 
    Action<SVGFEDistantLightElementBuilder> lightSource, Color? lightingColor = default, 
    double? surfaceScale = null, double? specularConstant = null, double? specularExponent = null, 
    OneOf<double, (double, double)> kernelUnitLength = null, OneOf<string, FilterInput> @in = null, 
    string result = null, OneOf<double, (double, LengthType)> x = null, 
    OneOf<double, (double, LengthType)> y = null, OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint> fill = null, 
    OneOf<Color, Paint> stroke = null, string id = null, 
    Action<SVGFESpecularLightingElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'feSpecularLighting' element will be added. |
| lightSource | An action to configure the light source for the specular lighting effect. |
| lightingColor | The color of the light. Optional parameter. |
| surfaceScale | The surface scale factor for the lighting effect. Optional parameter. |
| specularConstant | The constant used to scale the specular term. Optional parameter. |
| specularExponent | The exponent for the specular term, controlling the focus of the specular highlight. Optional parameter. |
| kernelUnitLength | The kernel unit length for the convolution filter. Can be a double or a ValueTuple of two doubles. Optional parameter. |
| in | The input image to which the specular lighting effect will be applied. Can be a string or a FilterInput. Optional parameter. |
| result | The result identifier for this filter primitive. Optional parameter. |
| x | The x-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color or paint for the element. Optional parameter. |
| stroke | The stroke color or paint for the element. Optional parameter. |
| id | The unique identifier for the filter primitive element. Optional parameter. |
| extend | An optional action to further configure the SVGFESpecularLightingElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [SVGFEDistantLightElementBuilder](../../svgfedistantlightelementbuilder/)
* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [FilterInput](../../filterinput/)
* enum [LengthType](../../lengthtype/)
* enum [Paint](../../paint/)
* class [SVGFESpecularLightingElementBuilder](../../svgfespecularlightingelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFeSpecularLighting&lt;TBuilder&gt;(this TBuilder, Action&lt;SVGFEPointLightElementBuilder&gt;, Color?, double?, double?, double?, OneOf&lt;double, (double, double)&gt;, OneOf&lt;string, FilterInput&gt;, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint&gt;, OneOf&lt;Color, Paint&gt;, string, Action&lt;SVGFESpecularLightingElementBuilder&gt;) {#addfespecularlighting_1}

Adds an 'feSpecularLighting' element to the SVG builder, applying a specular lighting effect using a specified light source.

```csharp
public static TBuilder AddFeSpecularLighting<TBuilder>(this TBuilder builder, 
    Action<SVGFEPointLightElementBuilder> lightSource, Color? lightingColor = default, 
    double? surfaceScale = null, double? specularConstant = null, double? specularExponent = null, 
    OneOf<double, (double, double)> kernelUnitLength = null, OneOf<string, FilterInput> @in = null, 
    string result = null, OneOf<double, (double, LengthType)> x = null, 
    OneOf<double, (double, LengthType)> y = null, OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint> fill = null, 
    OneOf<Color, Paint> stroke = null, string id = null, 
    Action<SVGFESpecularLightingElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'feSpecularLighting' element will be added. |
| lightSource | An action to configure the light source for the specular lighting effect. |
| lightingColor | The color of the light. Optional parameter. |
| surfaceScale | The surface scale factor for the lighting effect. Optional parameter. |
| specularConstant | The constant used to scale the specular term. Optional parameter. |
| specularExponent | The exponent for the specular term, controlling the focus of the specular highlight. Optional parameter. |
| kernelUnitLength | The kernel unit length for the convolution filter. Can be a double or a ValueTuple of two doubles. Optional parameter. |
| in | The input image to which the specular lighting effect will be applied. Can be a string or a FilterInput. Optional parameter. |
| result | The result identifier for this filter primitive. Optional parameter. |
| x | The x-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color or paint for the element. Optional parameter. |
| stroke | The stroke color or paint for the element. Optional parameter. |
| id | The unique identifier for the filter primitive element. Optional parameter. |
| extend | An optional action to further configure the SVGFESpecularLightingElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [SVGFEPointLightElementBuilder](../../svgfepointlightelementbuilder/)
* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [FilterInput](../../filterinput/)
* enum [LengthType](../../lengthtype/)
* enum [Paint](../../paint/)
* class [SVGFESpecularLightingElementBuilder](../../svgfespecularlightingelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFeSpecularLighting&lt;TBuilder&gt;(this TBuilder, Action&lt;SVGFESpotLightElementBuilder&gt;, Color?, double?, double?, double?, OneOf&lt;double, (double, double)&gt;, OneOf&lt;string, FilterInput&gt;, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint&gt;, OneOf&lt;Color, Paint&gt;, string, Action&lt;SVGFESpecularLightingElementBuilder&gt;) {#addfespecularlighting_3}

Adds an 'feSpecularLighting' element to the SVG builder, applying a specular lighting effect using a specified light source.

```csharp
public static TBuilder AddFeSpecularLighting<TBuilder>(this TBuilder builder, 
    Action<SVGFESpotLightElementBuilder> lightSource, Color? lightingColor = default, 
    double? surfaceScale = null, double? specularConstant = null, double? specularExponent = null, 
    OneOf<double, (double, double)> kernelUnitLength = null, OneOf<string, FilterInput> @in = null, 
    string result = null, OneOf<double, (double, LengthType)> x = null, 
    OneOf<double, (double, LengthType)> y = null, OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint> fill = null, 
    OneOf<Color, Paint> stroke = null, string id = null, 
    Action<SVGFESpecularLightingElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'feSpecularLighting' element will be added. |
| lightSource | An action to configure the light source for the specular lighting effect. |
| lightingColor | The color of the light. Optional parameter. |
| surfaceScale | The surface scale factor for the lighting effect. Optional parameter. |
| specularConstant | The constant used to scale the specular term. Optional parameter. |
| specularExponent | The exponent for the specular term, controlling the focus of the specular highlight. Optional parameter. |
| kernelUnitLength | The kernel unit length for the convolution filter. Can be a double or a ValueTuple of two doubles. Optional parameter. |
| in | The input image to which the specular lighting effect will be applied. Can be a string or a FilterInput. Optional parameter. |
| result | The result identifier for this filter primitive. Optional parameter. |
| x | The x-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color or paint for the element. Optional parameter. |
| stroke | The stroke color or paint for the element. Optional parameter. |
| id | The unique identifier for the filter primitive element. Optional parameter. |
| extend | An optional action to further configure the SVGFESpecularLightingElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [SVGFESpotLightElementBuilder](../../svgfespotlightelementbuilder/)
* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [FilterInput](../../filterinput/)
* enum [LengthType](../../lengthtype/)
* enum [Paint](../../paint/)
* class [SVGFESpecularLightingElementBuilder](../../svgfespecularlightingelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFeSpecularLighting&lt;TBuilder&gt;(this TBuilder, Action&lt;SVGFESpecularLightingElementBuilder&gt;) {#addfespecularlighting_2}

Adds an 'feSpecularLighting' element configuration to the builder. This element applies a lighting effect to the image, simulating specular reflection.

```csharp
public static TBuilder AddFeSpecularLighting<TBuilder>(this TBuilder builder, 
    Action<SVGFESpecularLightingElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feSpecularLighting' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFESpecularLightingElementBuilder](../../svgfespecularlightingelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
