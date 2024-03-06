---
title: SVGBuilderExtensions.AddUse
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a use element configuration to the builder
type: docs
weight: 550
url: /net/aspose.svg.builder/svgbuilderextensions/adduse/
---
## AddUse&lt;TBuilder&gt;(this TBuilder, Action&lt;SVGUseElementBuilder&gt;) {#adduse}

Adds a 'use' element configuration to the builder.

```csharp
public static TBuilder AddUse<TBuilder>(this TBuilder builder, 
    Action<SVGUseElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IStructuralElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'use' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGUseElementBuilder](../../svguseelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IStructuralElementBuilder](../../istructuralelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddUse&lt;TBuilder&gt;(this TBuilder, string, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;double, (double, LengthType)&gt;, OneOf&lt;Color, Paint, string&gt;, OneOf&lt;Color, Paint, string&gt;, string, Action&lt;SVGUseElementBuilder&gt;) {#adduse_1}

Adds a 'use' element to the SVG builder, allowing for the reuse of an existing element defined elsewhere in the SVG.

```csharp
public static TBuilder AddUse<TBuilder>(this TBuilder builder, string href = null, 
    OneOf<double, (double, LengthType)> x = null, OneOf<double, (double, LengthType)> y = null, 
    OneOf<double, (double, LengthType)> width = null, 
    OneOf<double, (double, LengthType)> height = null, OneOf<Color, Paint, string> fill = null, 
    OneOf<Color, Paint, string> stroke = null, string id = null, 
    Action<SVGUseElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'use' element will be added. |
| href | The reference to the existing element to be reused. Optional parameter. |
| x | The x-coordinate where the reused element is placed. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| y | The y-coordinate where the reused element is placed. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| width | The width of the reused element. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| height | The height of the reused element. Can be a double or a ValueTuple with LengthType. Optional parameter. |
| fill | The fill color, paint or paint server id for the element. Optional parameter. |
| stroke | The stroke color, paint or paint server id for the element. Optional parameter. |
| id | The unique identifier for the element. Optional parameter. |
| extend | An optional action to further configure the SVGUseElementBuilder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* enum [LengthType](../../lengthtype/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGUseElementBuilder](../../svguseelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
