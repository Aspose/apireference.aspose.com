---
title: Interface IIgesDrawable
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Iges.Drawables.IIgesDrawable interface. Parent Interface for Simple geometric representation of an entity or its part
type: docs
weight: 33620
url: /net/aspose.cad.fileformats.iges.drawables/iigesdrawable/
---
## IIgesDrawable interface

Parent Interface for Simple geometric representation of an entity or its part

```csharp
public interface IIgesDrawable
```

## Properties

| Name | Description |
| --- | --- |
| [AllPoints](../../aspose.cad.fileformats.iges.drawables/iigesdrawable/allpoints/) { get; } | Array of all points defining geometry |
| [EntityUID](../../aspose.cad.fileformats.iges.drawables/iigesdrawable/entityuid/) { get; set; } | Unique identifier (line number) of entity that created this entity |
| [Properties](../../aspose.cad.fileformats.iges.drawables/iigesdrawable/properties/) { get; } | Non-geometric properties of geometric representation |

## Methods

| Name | Description |
| --- | --- |
| [GetNewPropsDrawable](../../aspose.cad.fileformats.iges.drawables/iigesdrawable/getnewpropsdrawable/)(IDrawableProperties) | Creates a new drawable using geometry of current drawable and provided non-geometric properties |
| [GetTransformedDrawable](../../aspose.cad.fileformats.iges.drawables/iigesdrawable/gettransformeddrawable/)(Point3D[]) | Creates a new drawable using provided points and non-geometric properties of current drawable |

### See Also

* namespace [Aspose.CAD.FileFormats.Iges.Drawables](../../aspose.cad.fileformats.iges.drawables/)
* assembly [Aspose.CAD](../../)


