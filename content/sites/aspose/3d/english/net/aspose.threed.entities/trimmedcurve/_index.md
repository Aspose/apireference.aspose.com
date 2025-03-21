---
title: Class TrimmedCurve
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.TrimmedCurve class. A bounded curve that trimmed the basis curve at both ends
type: docs
weight: 780
url: /net/aspose.threed.entities/trimmedcurve/
---
## TrimmedCurve class

A bounded curve that trimmed the basis curve at both ends.

```csharp
public class TrimmedCurve : Curve
```

## Constructors

| Name | Description |
| --- | --- |
| [TrimmedCurve](trimmedcurve/)() | Constructor of `TrimmedCurve` |

## Properties

| Name | Description |
| --- | --- |
| [BasisCurve](../../aspose.threed.entities/trimmedcurve/basiscurve/) { get; set; } | The basis curve to be trimmed. |
| [Color](../../aspose.threed.entities/curve/color/) { get; set; } | Gets or sets the color of the line, default value is white(1, 1, 1) |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [First](../../aspose.threed.entities/trimmedcurve/first/) { get; set; } | The first end point to trim, can be a Cartesian point or a real parameter. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [SameDirection](../../aspose.threed.entities/trimmedcurve/samedirection/) { get; set; } | Gets or sets whether the trimmed result uses the same direction of the basis curve. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [Second](../../aspose.threed.entities/trimmedcurve/second/) { get; set; } | The second end point to trim, can be a Cartesian point or a real parameter. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [Curve](../curve/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


