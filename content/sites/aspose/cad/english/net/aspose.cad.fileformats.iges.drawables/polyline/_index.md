---
title: Class Polyline
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Iges.Drawables.Polyline class. Provides intermediate Drawable representation in form of segmented line
type: docs
weight: 33650
url: /net/aspose.cad.fileformats.iges.drawables/polyline/
---
## Polyline class

Provides intermediate Drawable representation in form of segmented line

```csharp
public class Polyline : IgesDrawableBase
```

## Constructors

| Name | Description |
| --- | --- |
| [Polyline](polyline/)(IDrawableProperties, Point3D[]) | Creates new Miltisegment line geometric representation from geometry points and non-geometry properties |

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
| override [GetNewPropsDrawable](../../aspose.cad.fileformats.iges.drawables/polyline/getnewpropsdrawable/)(IDrawableProperties) | Creates a new drawable using geometry of current drawable and provided non-geometric properties |
| override [GetTransformedDrawable](../../aspose.cad.fileformats.iges.drawables/polyline/gettransformeddrawable/)(Point3D[]) | Creates a new drawable using provided points and non-geometric properties of current drawable |

### See Also

* class [IgesDrawableBase](../igesdrawablebase/)
* namespace [Aspose.CAD.FileFormats.Iges.Drawables](../../aspose.cad.fileformats.iges.drawables/)
* assembly [Aspose.CAD](../../)


