---
title: ISVGPropertyResolvingContext Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.Styles.ISVGPropertyResolvingContext interface. Represents a context for resolving SVG properties extending the percent resolving context and property context
type: docs
weight: 4510
url: /net/aspose.svg.rendering.styles/isvgpropertyresolvingcontext/
---
## ISVGPropertyResolvingContext interface

Represents a context for resolving SVG properties, extending the percent resolving context and property context.

```csharp
public interface ISVGPropertyResolvingContext : IPercentResolvingContext
```

## Properties

| Name | Description |
| --- | --- |
| [Document](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/document/) { get; } | Gets the document associated with the context. See [`Document`](./document/). |
| [DrFactory](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/drfactory/) { get; } | Gets the drawing factory associated with the context. See [`IDrawingFactory`](../../aspose.svg.drawing/idrawingfactory/). |
| [Element](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/element/) { get; } | Gets the SVG element associated with the context. See [`Element`](./element/). |
| [HorizontalResolution](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/horizontalresolution/) { get; } | Gets the horizontal resolution of the context. See [`Resolution`](../../aspose.svg.drawing/resolution/). |
| [InTextElement](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/intextelement/) { get; set; } | Gets or sets a value indicating whether the context is within a text element. |
| [IsFilterBrush](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/isfilterbrush/) { get; set; } | Gets or sets a value indicating whether the context is using a filter brush. |
| [ParentContext](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/parentcontext/) { get; } | Gets the parent property resolving context. See `ISVGPropertyResolvingContext`. |
| [Style](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/style/) { get; } | Gets the resolved style declaration associated with the element. See [`IResolvedStyleDeclaration`](../../aspose.svg.dom.css/iresolvedstyledeclaration/). |
| [StyleDeclaration](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/styledeclaration/) { get; } | Gets the CSS style declaration associated with the element. See [`ICSSStyleDeclaration`](../../aspose.svg.dom.css/icssstyledeclaration/). |
| [VerticalResolution](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/verticalresolution/) { get; } | Gets the vertical resolution of the context. See [`Resolution`](../../aspose.svg.drawing/resolution/). |
| [ViewCSS](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/viewcss/) { get; } | Gets the CSS view associated with the context. See [`IViewCSS`](../../aspose.svg.dom.css/iviewcss/). |

## Methods

| Name | Description |
| --- | --- |
| [GetAbsoluteBoundingBox](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/getabsoluteboundingbox/)(bool) | Gets the absolute bounding box of the element, optionally ignoring element transformations. |
| [GetBoundingBox](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/getboundingbox/)() | Gets the bounding box of the element. |
| [GetStrokeBoundingBox](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/getstrokeboundingbox/)() | Gets the bounding box of the element's stroke. |
| [TryGetHrefAsByteArray](../../aspose.svg.rendering.styles/isvgpropertyresolvingcontext/trygethrefasbytearray/)(Url, Size, out byte[], out WebImageFormat, CancellationToken) | Tries to get the HREF as a byte array, with the specified size, format, and cancellation token. |

### See Also

* interface [IPercentResolvingContext](../../aspose.svg.dom.css/ipercentresolvingcontext/)
* namespace [Aspose.Svg.Rendering.Styles](../../aspose.svg.rendering.styles/)
* assembly [Aspose.SVG](../../)
