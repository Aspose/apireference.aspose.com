---
title: Interface IDrawable
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Iges.Drawables.IDrawable interface. Parent Interface for Simple geometric represetation of an entity or its part
type: docs
weight: 33250
url: /net/aspose.cad.fileformats.iges.drawables/idrawable/
---
## IDrawable interface

Parent Interface for Simple geometric represetation of an entity or its part

```csharp
public interface IDrawable
```

## Properties

| Name | Description |
| --- | --- |
| [AllPoints](../../aspose.cad.fileformats.iges.drawables/idrawable/allpoints/) { get; } | Array of all points defining geometry |
| [EntityUID](../../aspose.cad.fileformats.iges.drawables/idrawable/entityuid/) { get; set; } | Unique identifier (line number) of entity that created this entity |
| [Properties](../../aspose.cad.fileformats.iges.drawables/idrawable/properties/) { get; } | Non-geometric properties of geometric representation |

## Methods

| Name | Description |
| --- | --- |
| [Accept](../../aspose.cad.fileformats.iges.drawables/idrawable/accept/)(IExporterVisitor) | Part of Visitor pattern with an |
| [GetNewPropsDrawable](../../aspose.cad.fileformats.iges.drawables/idrawable/getnewpropsdrawable/)(IDrawableProperties) | Creates a new drawable using geometry of current drawable and provided non-geometric properties |
| [GetTransformedDrawable](../../aspose.cad.fileformats.iges.drawables/idrawable/gettransformeddrawable/)(Point3D[]) | Creates a new drawable using provided points and non-geometric properties of current drawable |

### See Also

* namespace [Aspose.CAD.FileFormats.Iges.Drawables](../../aspose.cad.fileformats.iges.drawables/)
* assembly [Aspose.CAD](../../)


