---
title: SVGAnimatedValueT Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Svg.DataTypes.SVGAnimatedValue1T class. Used for attributes of types which can be animated
type: docs
weight: 1360
url: /net/aspose.html.dom.svg.datatypes/svganimatedvalue-1/
---
## SVGAnimatedValue<T> class

Used for attributes of types which can be animated.

```csharp
public abstract class SVGAnimatedValue<T> : SVGValueType
```

| Parameter | Description |
| --- | --- |
| T | The SVG Value object. |

## Properties

| Name | Description |
| --- | --- |
| virtual [AnimVal](../../aspose.html.dom.svg.datatypes/svganimatedvalue-1/animval/) { get; } | If the given attribute or property is being animated, contains the current animated value of the attribute or property. If the given attribute or property is not currently being animated, contains the same value as baseVal. |
| [BaseVal](../../aspose.html.dom.svg.datatypes/svganimatedvalue-1/baseval/) { get; set; } | The base value of the given attribute before applying any animations. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../aspose.html.dom.svg.datatypes/svgvaluetype/dispose/)() | Releases unmanaged and - optionally - managed resources. |
| virtual [GetPlatformType](../../aspose.html.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |

### See Also

* class [SVGValueType](../svgvaluetype/)
* namespace [Aspose.Html.Dom.Svg.DataTypes](../../aspose.html.dom.svg.datatypes/)
* assembly [Aspose.HTML](../../)
