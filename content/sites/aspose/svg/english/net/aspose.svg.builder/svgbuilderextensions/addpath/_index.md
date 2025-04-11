---
title: SVGBuilderExtensions.AddPath
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions AddPath method. Adds a path element to the SVG builder specifying its path data and styles
type: docs
weight: 400
url: /net/aspose.svg.builder/svgbuilderextensions/addpath/
---
## AddPath&lt;TBuilder&gt;(*this TBuilder, OneOf&amp;lt;string, Action&amp;lt;PathBuilder&amp;gt;&amp;gt;, OneOf&amp;lt;Color, Paint, string&amp;gt;, OneOf&amp;lt;Color, Paint, string&amp;gt;, string, Action&amp;lt;SVGPathElementBuilder&amp;gt;*) {#addpath}

Adds a 'path' element to the SVG builder, specifying its path data and styles.

```csharp
public static TBuilder AddPath<TBuilder>(this TBuilder builder, 
    OneOf<string, Action<PathBuilder>> d, OneOf<Color, Paint, string> fill = null, 
    OneOf<Color, Paint, string> stroke = null, string id = null, 
    Action<SVGPathElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'path' element will be added. |
| d | A OneOf type that can either be a string representing the path data or an action that configures a PathBuilder. |
| fill | The fill color or paint style for the path. Can be a Color or a Paint enum value or paint server ID. Optional parameter. |
| stroke | The stroke color or paint style for the path. Can be a Color or a Paint enum value or paint server ID. Optional parameter. |
| id | The unique identifier for the path element. Optional parameter. |
| extend | An optional action to further configure the path element builder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [OneOf&lt;T1,T2&gt;](../../oneof-2/)
* class [PathBuilder](../../pathbuilder/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGPathElementBuilder](../../svgpathelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddPath&lt;TBuilder&gt;(*this TBuilder, Action&amp;lt;PathBuilder&amp;gt;, OneOf&amp;lt;Color, Paint, string&amp;gt;, OneOf&amp;lt;Color, Paint, string&amp;gt;, string, Action&amp;lt;SVGPathElementBuilder&amp;gt;*) {#addpath_1}

Overload of AddPath that takes an action to configure a PathBuilder directly.

```csharp
public static TBuilder AddPath<TBuilder>(this TBuilder builder, Action<PathBuilder> d, 
    OneOf<Color, Paint, string> fill = null, OneOf<Color, Paint, string> stroke = null, 
    string id = null, Action<SVGPathElementBuilder> extend = null)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder, facilitating fluent API usage. |
| builder | The SVG builder instance to which the 'path' element will be added. |
| d | An action that configures a PathBuilder to define the path data. |
| fill | The fill color or paint style for the path. Can be a Color or a Paint enum value or paint server ID. Optional parameter. |
| stroke | The stroke color or paint style for the path. Can be a Color or a Paint enum value or paint server ID. Optional parameter. |
| id | The unique identifier for the path element. Optional parameter. |
| extend | An optional action to further configure the path element builder. |

### Return Value

The builder instance, allowing for method chaining.

### See Also

* class [PathBuilder](../../pathbuilder/)
* class [OneOf&lt;T1,T2,T3&gt;](../../oneof-3/)
* enum [Paint](../../paint/)
* class [SVGPathElementBuilder](../../svgpathelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## AddPath&lt;TBuilder&gt;(*this TBuilder, Action&amp;lt;SVGPathElementBuilder&amp;gt;*) {#addpath_2}

Adds a 'path' element configuration to the builder.

```csharp
public static TBuilder AddPath<TBuilder>(this TBuilder builder, 
    Action<SVGPathElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'path' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGPathElementBuilder](../../svgpathelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeElementBuilder](../../ishapeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
