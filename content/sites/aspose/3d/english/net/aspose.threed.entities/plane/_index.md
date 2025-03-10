---
title: Class Plane
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Plane class. Parameterized plane
type: docs
weight: 560
url: /net/aspose.threed.entities/plane/
---
## Plane class

Parameterized plane.

```csharp
public class Plane : Primitive
```

## Constructors

| Name | Description |
| --- | --- |
| [Plane](plane/#constructor)() | Initializes a new instance of the `Plane` with default size 1x1. |
| [Plane](plane/#constructor_1)(double, double) | Initializes a new instance of the `Plane`. |
| [Plane](plane/#constructor_2)(string, double, double, int, int) | Initializes a new instance of the `Plane`. |

## Properties

| Name | Description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [Length](../../aspose.threed.entities/plane/length/) { get; set; } | Gets or sets the length of the plane. |
| [LengthSegments](../../aspose.threed.entities/plane/lengthsegments/) { get; set; } | Gets or sets the length segments. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [Up](../../aspose.threed.entities/plane/up/) { get; set; } | Gets or sets the up vector of the plane, default value is (0, 1, 0), this affects the generation of the plane |
| [Width](../../aspose.threed.entities/plane/width/) { get; set; } | Gets or sets the width of the plane. |
| [WidthSegments](../../aspose.threed.entities/plane/widthsegments/) { get; set; } | Gets or sets the width segments. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |
| override [ToMesh](../../aspose.threed.entities/plane/tomesh/)() | Convert current object to mesh |

### See Also

* class [Primitive](../primitive/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


