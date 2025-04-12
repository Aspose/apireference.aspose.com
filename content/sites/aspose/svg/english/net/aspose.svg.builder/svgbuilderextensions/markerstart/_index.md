---
title: SVGBuilderExtensions.MarkerStart
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions MarkerStart method. Sets the marker-start attribute for an SVG element specifying the marker at the start of a path
type: docs
weight: 1140
url: /net/aspose.svg.builder/svgbuilderextensions/markerstart/
---
## MarkerStart&lt;TBuilder&gt;(*this TBuilder, string*) {#markerstart_1}

Sets the 'marker-start' attribute for an SVG element, specifying the marker at the start of a path.

```csharp
public static TBuilder MarkerStart<TBuilder>(this TBuilder builder, string markerId)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| markerId | The ID of the marker to use. |

### Return Value

The builder instance for chaining.

### See Also

* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)

---

## MarkerStart&lt;TBuilder&gt;(*this TBuilder, [MarkerPos](../../markerpos/)*) {#markerstart}

Sets the 'marker-start' attribute for an SVG element using a predefined marker position.

```csharp
public static TBuilder MarkerStart<TBuilder>(this TBuilder builder, MarkerPos value)
    where TBuilder : IAttributeSetter, IPresentationAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| value | The marker position value to set. |

### Return Value

The builder instance for chaining.

### See Also

* enum [MarkerPos](../../markerpos/)
* interface [IAttributeSetter](../../iattributesetter/)
* interface [IPresentationAttributeSetter](../../ipresentationattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
