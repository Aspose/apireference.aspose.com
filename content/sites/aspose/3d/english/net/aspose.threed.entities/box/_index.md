---
title: Class Box
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Box class. Box
type: docs
weight: 2240
url: /net/aspose.threed.entities/box/
---
## Box class

Box.

```csharp
public class Box : Primitive
```

## Constructors

| Name | Description |
| --- | --- |
| [Box](box/#constructor)() | Initializes a new instance of the `Box` class. |
| [Box](box/#constructor_1)(double, double, double) | Initializes a new instance of the `Box` class. |
| [Box](box/#constructor_2)(string, double, double, double, int, int, int) | Initializes a new instance of the `Box` class. |

## Properties

| Name | Description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow(Inherited from [`Primitive`](../primitive/).) |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Height](../../aspose.threed.entities/box/height/) { get; set; } | Gets or sets the height of the box aligned in y-axis. |
| [HeightSegments](../../aspose.threed.entities/box/heightsegments/) { get; set; } | gets or sets the height segments. |
| [Length](../../aspose.threed.entities/box/length/) { get; set; } | Gets or sets the length of the box aligned in z-axis. |
| [LengthSegments](../../aspose.threed.entities/box/lengthsegments/) { get; set; } | Gets or sets the length segments. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow.(Inherited from [`Primitive`](../primitive/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [Width](../../aspose.threed.entities/box/width/) { get; set; } | Gets or sets the width of the box aligned in x-axis. |
| [WidthSegments](../../aspose.threed.entities/box/widthsegments/) { get; set; } | Gets or sets the width segments |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| override [ToMesh](../../aspose.threed.entities/box/tomesh/)() | Convert current object to mesh |

### See Also

* class [Primitive](../primitive/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


