---
title: ISVGAnimatedPathData Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Paths.ISVGAnimatedPathData interface. he SVGAnimatedPathData interface supports elements which have a d attribute which holds SVG path data and supports the ability to animate that attribute
type: docs
weight: 4680
url: /net/aspose.svg.paths/isvganimatedpathdata/
---
## ISVGAnimatedPathData interface

he SVGAnimatedPathData interface supports elements which have a ‘d’ attribute which holds SVG path data, and supports the ability to animate that attribute.

```csharp
public interface ISVGAnimatedPathData
```

## Properties

| Name | Description |
| --- | --- |
| [AnimatedPathSegList](../../aspose.svg.paths/isvganimatedpathdata/animatedpathseglist/) { get; } | Provides access to the current animated contents of the ‘d’ attribute in a form which matches one-for-one with SVG's syntax. If the given attribute or property is being animated, contains the current animated value of the attribute or property, and both the object itself and its contents are read only. If the given attribute or property is not currently being animated, contains the same value as pathSegList. |
| [PathSegList](../../aspose.svg.paths/isvganimatedpathdata/pathseglist/) { get; } | Provides access to the base (i.e., static) contents of the ‘d’ attribute in a form which matches one-for-one with SVG's syntax. Thus, if the ‘d’ attribute has an "absolute moveto (M)" and an "absolute arcto (A)" command, then pathSegList will have two entries: a SVG_PATHSEG_MOVETO_ABS and a SVG_PATHSEG_ARC_ABS. |

### See Also

* namespace [Aspose.Svg.Paths](../../aspose.svg.paths/)
* assembly [Aspose.SVG](../../)
