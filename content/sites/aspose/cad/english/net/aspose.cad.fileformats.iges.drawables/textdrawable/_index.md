---
title: Class TextDrawable
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Iges.Drawables.TextDrawable class. Provides intermediate Drawable representation of a text in a drawing
type: docs
weight: 33680
url: /net/aspose.cad.fileformats.iges.drawables/textdrawable/
---
## TextDrawable class

Provides intermediate Drawable representation of a text in a drawing

```csharp
public class TextDrawable : IgesDrawableBase
```

## Constructors

| Name | Description |
| --- | --- |
| [TextDrawable](textdrawable/)(string, Point3D, double, double, double, IDrawableProperties) | Creates text Drawable and determines its text boundaries |

## Properties

| Name | Description |
| --- | --- |
| [AllPoints](../../aspose.cad.fileformats.iges.drawables/igesdrawablebase/allpoints/) { get; } | Array of all points defining geometry |
| [Childs](../../aspose.cad.fileformats.iges.drawables/igesdrawablebase/childs/) { get; } |  |
| [EndBottomLine](../../aspose.cad.fileformats.iges.drawables/textdrawable/endbottomline/) { get; } | Right bottom point of text boundary, maps to AllPoints[3] |
| [EntityUID](../../aspose.cad.fileformats.iges.drawables/igesdrawablebase/entityuid/) { get; set; } |  |
| [Id](../../aspose.cad.fileformats.iges.drawables/igesdrawablebase/id/) { get; } |  |
| [Mirrioring](../../aspose.cad.fileformats.iges.drawables/textdrawable/mirrioring/) { get; } | Mirroring of text |
| [Orientation](../../aspose.cad.fileformats.iges.drawables/textdrawable/orientation/) { get; } | Horizontal or vertical text |
| [Origin](../../aspose.cad.fileformats.iges.drawables/textdrawable/origin/) { get; } | Left bottom point of text boundary, used as origin point of primitive,maps to AllPoints[0] |
| [Properties](../../aspose.cad.fileformats.iges.drawables/igesdrawablebase/properties/) { get; } | Non-geometric properties for geometry |
| [Text](../../aspose.cad.fileformats.iges.drawables/textdrawable/text/) { get; } | Text |
| [UpperLeft](../../aspose.cad.fileformats.iges.drawables/textdrawable/upperleft/) { get; } | Left upper point of text boundary, maps to AllPoints[1] |
| [UpperRight](../../aspose.cad.fileformats.iges.drawables/textdrawable/upperright/) { get; } | Right upper point of text boundary, maps to AllPoints[2] |

## Methods

| Name | Description |
| --- | --- |
| override [GetNewPropsDrawable](../../aspose.cad.fileformats.iges.drawables/textdrawable/getnewpropsdrawable/)(IDrawableProperties) | Creates a new Text drawable using geometry of current Text drawable and provided non-geometric properties |
| override [GetTransformedDrawable](../../aspose.cad.fileformats.iges.drawables/textdrawable/gettransformeddrawable/)(Point3D[]) | Creates a new Text drawable using provided points and non-geometric properties of current Text drawable |

### See Also

* class [IgesDrawableBase](../igesdrawablebase/)
* namespace [Aspose.CAD.FileFormats.Iges.Drawables](../../aspose.cad.fileformats.iges.drawables/)
* assembly [Aspose.CAD](../../)


