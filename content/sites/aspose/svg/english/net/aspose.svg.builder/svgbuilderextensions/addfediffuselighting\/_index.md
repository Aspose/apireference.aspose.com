---
title: SVGBuilderExtensions.AddFeDiffuseLighting
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddFeDiffuseLighting method. Adds an feDiffuseLighting element configuration to the builder. This element provides a lighting effect on an image
type: docs
weight: 180
url: /net/aspose.svg.builder/svgbuilderextensions/addfediffuselighting/
---
## AddFeDiffuseLighting<TBuilder>(*this TBuilder, Action&lt;SVGFEDiffuseLightingElementBuilder&gt;*) {#addfediffuselighting}

Adds an 'feDiffuseLighting' element configuration to the builder. This element provides a lighting effect on an image.

```csharp
public static TBuilder AddFeDiffuseLighting<TBuilder>(this TBuilder builder, 
    Action<SVGFEDiffuseLightingElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'feDiffuseLighting' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGFEDiffuseLightingElementBuilder](../../svgfediffuselightingelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFeDiffuseLighting<TBuilder>(*this TBuilder, Action&lt;SVGFEDistantLightElementBuilder&gt;, Color?, double?, double?, OneOf&lt;string, FilterInput&gt;, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint, string&gt;, OneOf&lt;Color, Paint, string&gt;, string, Action&lt;SVGFEDiffuseLightingElementBuilder&gt;*) {#addfediffuselighting_1}

Adds an 'feDiffuseLighting' element to the SVG builder, applying a diffuse lighting effect using a specified light source.

```csharp
public static TBuilder AddFeDiffuseLighting<TBuilder>(this TBuilder builder, 
    Action<SVGFEDistantLightElementBuilder> lightSource, Color? lightingColor = default, 
    double? surfaceScale = null, double? diffuseConstant = null, 
    OneOf<string, FilterInput> @in = null, string result = null, 
    OneOf<double, (double, LengthType)> x = null, OneOf<double, (double, LengthType)> y = null, 
    OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint, string> fill = null, 
    OneOf<Color, Paint, string> stroke = null, string id = null, 
    Action<SVGFEDiffuseLightingElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'feDiffuseLighting' element will be added. |
| lightSource | An action to configure the light source for the diffuse lighting effect. |
| lightingColor | The color of the light. Optional parameter. |
| surfaceScale | The surface scale factor for the lighting effect. Optional parameter. |
| diffuseConstant | The constant used to determine the lighting effect. Optional parameter. |
| in | The input for the diffuse lighting effect. Can be a string or a FilterInput. Optional parameter. |
| result | The result identifier for this filter primitive. Optional parameter. |
| x | The x-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color, paint or paint server id for the element. Optional parameter. |
| stroke | The stroke color, paint or paint server id for the element. Optional parameter. |
| id | The unique identifier for the filter primitive element. Optional parameter. |
| extend | An optional action to further configure the SVGFEDiffuseLightingElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [SVGFEDistantLightElementBuilder](../../svgfedistantlightelementbuilder/)
* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [FilterInput](../../filterinput/)
* enum [LengthType](../../lengthtype/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGFEDiffuseLightingElementBuilder](../../svgfediffuselightingelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFeDiffuseLighting<TBuilder>(*this TBuilder, Action&lt;SVGFEPointLightElementBuilder&gt;, Color?, double?, double?, OneOf&lt;string, FilterInput&gt;, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint, string&gt;, OneOf&lt;Color, Paint, string&gt;, string, Action&lt;SVGFEDiffuseLightingElementBuilder&gt;*) {#addfediffuselighting_2}

Adds an 'feDiffuseLighting' element to the SVG builder, applying a diffuse lighting effect using a specified light source.

```csharp
public static TBuilder AddFeDiffuseLighting<TBuilder>(this TBuilder builder, 
    Action<SVGFEPointLightElementBuilder> lightSource, Color? lightingColor = default, 
    double? surfaceScale = null, double? diffuseConstant = null, 
    OneOf<string, FilterInput> @in = null, string result = null, 
    OneOf<double, (double, LengthType)> x = null, OneOf<double, (double, LengthType)> y = null, 
    OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint, string> fill = null, 
    OneOf<Color, Paint, string> stroke = null, string id = null, 
    Action<SVGFEDiffuseLightingElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'feDiffuseLighting' element will be added. |
| lightSource | An action to configure the light source for the diffuse lighting effect. |
| lightingColor | The color of the light. Optional parameter. |
| surfaceScale | The surface scale factor for the lighting effect. Optional parameter. |
| diffuseConstant | The constant used to determine the lighting effect. Optional parameter. |
| in | The input for the diffuse lighting effect. Can be a string or a FilterInput. Optional parameter. |
| result | The result identifier for this filter primitive. Optional parameter. |
| x | The x-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color, paint or paint server id for the element. Optional parameter. |
| stroke | The stroke color, paint or paint server id for the element. Optional parameter. |
| id | The unique identifier for the filter primitive element. Optional parameter. |
| extend | An optional action to further configure the SVGFEDiffuseLightingElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [SVGFEPointLightElementBuilder](../../svgfepointlightelementbuilder/)
* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [FilterInput](../../filterinput/)
* enum [LengthType](../../lengthtype/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGFEDiffuseLightingElementBuilder](../../svgfediffuselightingelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddFeDiffuseLighting<TBuilder>(*this TBuilder, Action&lt;SVGFESpotLightElementBuilder&gt;, Color?, double?, double?, OneOf&lt;string, FilterInput&gt;, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint, string&gt;, OneOf&lt;Color, Paint, string&gt;, string, Action&lt;SVGFEDiffuseLightingElementBuilder&gt;*) {#addfediffuselighting_3}

Adds an 'feDiffuseLighting' element to the SVG builder, applying a diffuse lighting effect using a specified light source.

```csharp
public static TBuilder AddFeDiffuseLighting<TBuilder>(this TBuilder builder, 
    Action<SVGFESpotLightElementBuilder> lightSource, Color? lightingColor = default, 
    double? surfaceScale = null, double? diffuseConstant = null, 
    OneOf<string, FilterInput> @in = null, string result = null, 
    OneOf<double, (double, LengthType)> x = null, OneOf<double, (double, LengthType)> y = null, 
    OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint, string> fill = null, 
    OneOf<Color, Paint, string> stroke = null, string id = null, 
    Action<SVGFEDiffuseLightingElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IFilterPrimitiveElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'feDiffuseLighting' element will be added. |
| lightSource | An action to configure the light source for the diffuse lighting effect. |
| lightingColor | The color of the light. Optional parameter. |
| surfaceScale | The surface scale factor for the lighting effect. Optional parameter. |
| diffuseConstant | The constant used to determine the lighting effect. Optional parameter. |
| in | The input for the diffuse lighting effect. Can be a string or a FilterInput. Optional parameter. |
| result | The result identifier for this filter primitive. Optional parameter. |
| x | The x-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the filter primitive subregion. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color, paint or paint server id for the element. Optional parameter. |
| stroke | The stroke color, paint or paint server id for the element. Optional parameter. |
| id | The unique identifier for the filter primitive element. Optional parameter. |
| extend | An optional action to further configure the SVGFEDiffuseLightingElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [SVGFESpotLightElementBuilder](../../svgfespotlightelementbuilder/)
* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [FilterInput](../../filterinput/)
* enum [LengthType](../../lengthtype/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGFEDiffuseLightingElementBuilder](../../svgfediffuselightingelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IFilterPrimitiveElementBuilder](../../ifilterprimitiveelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
