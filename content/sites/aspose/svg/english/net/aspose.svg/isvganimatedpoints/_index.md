---
title: ISVGAnimatedPoints Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.ISVGAnimatedPoints interface. The SVGAnimatedPoints interface supports elements which have a points attribute which holds a list of coordinate values and which support the ability to animate that attribute. Additionally the points attribute on the original element accessed via the XML DOMe.g. using the getAttribute method call will reflect any changes made to points
type: docs
weight: 2020
url: /net/aspose.svg/isvganimatedpoints/
---
## ISVGAnimatedPoints interface

The SVGAnimatedPoints interface supports elements which have a ‘points’ attribute which holds a list of coordinate values and which support the ability to animate that attribute. Additionally, the ‘points’ attribute on the original element accessed via the XML DOM(e.g., using the getAttribute() method call) will reflect any changes made to points.

```csharp
public interface ISVGAnimatedPoints
```

## Properties

| Name | Description |
| --- | --- |
| [AnimatedPoints](../../aspose.svg/isvganimatedpoints/animatedpoints/) { get; } | Provides access to the current animated contents of the ‘points’ attribute. If the given attribute or property is being animated, contains the current animated value of the attribute or property. If the given attribute or property is not currently being animated, contains the same value as points. |
| [Points](../../aspose.svg/isvganimatedpoints/points/) { get; } | Provides access to the base (i.e., static) contents of the ‘points’ attribute. |

### See Also

* namespace [Aspose.Svg](../../aspose.svg/)
* assembly [Aspose.SVG](../../)
