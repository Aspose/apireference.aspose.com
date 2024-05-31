---
title: Class BezierCurve
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Iges.Drawables.BezierCurve class. Provides intermediate Drawable representation in form of cubic Bezier curve
type: docs
weight: 33610
url: /net/aspose.cad.fileformats.iges.drawables/beziercurve/
---
## BezierCurve class

Provides intermediate Drawable representation in form of cubic Bezier curve

```csharp
public class BezierCurve : IgesDrawableBase
```

## Constructors

| Name | Description |
| --- | --- |
| [BezierCurve](beziercurve/)(IDrawableProperties, Point3D[]) | Creates new Bezier curve geometric representation from geometry points and non-geometry properties |

## Properties

| Name | Description |
| --- | --- |
| [AllPoints](../../aspose.cad.fileformats.iges.drawables/igesdrawablebase/allpoints/) { get; } | Array of all points defining geometry |
| [Childs](../../aspose.cad.fileformats.iges.drawables/igesdrawablebase/childs/) { get; } |  |
| [EntityUID](../../aspose.cad.fileformats.iges.drawables/igesdrawablebase/entityuid/) { get; set; } |  |
| [Id](../../aspose.cad.fileformats.iges.drawables/igesdrawablebase/id/) { get; } |  |
| [Properties](../../aspose.cad.fileformats.iges.drawables/igesdrawablebase/properties/) { get; } | Non-geometric properties for geometry |

## Methods

| Name | Description |
| --- | --- |
| override [GetNewPropsDrawable](../../aspose.cad.fileformats.iges.drawables/beziercurve/getnewpropsdrawable/)(IDrawableProperties) | Creates a new Bezier curve using geometry of current BEzier curve and provided non-geometric properties |
| override [GetTransformedDrawable](../../aspose.cad.fileformats.iges.drawables/beziercurve/gettransformeddrawable/)(Point3D[]) | Creates a new Bezier curve using provided points and non-geometric properties of current Bezier curve |

### See Also

* class [IgesDrawableBase](../igesdrawablebase/)
* namespace [Aspose.CAD.FileFormats.Iges.Drawables](../../aspose.cad.fileformats.iges.drawables/)
* assembly [Aspose.CAD](../../)


