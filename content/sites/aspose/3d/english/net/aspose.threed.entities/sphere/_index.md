---
title: Class Sphere
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Sphere class. Parameterized sphere
type: docs
weight: 700
url: /net/aspose.threed.entities/sphere/
---
## Sphere class

Parameterized sphere.

```csharp
public class Sphere : Primitive
```

## Constructors

| Name | Description |
| --- | --- |
| [Sphere](sphere/#constructor)() | Initializes a new instance of the `Sphere` with default radius 1. |
| [Sphere](sphere/#constructor_1)(double) | Initializes a new instance of the `Sphere` class with specified radius. |
| [Sphere](sphere/#constructor_2)(double, int, int) | Initializes a new instance of the `Sphere` class with specified radius, width segments and height segments. |
| [Sphere](sphere/#constructor_3)(string, double, int, int, double, double, double, double) | Initializes a new instance of the `Sphere` class. |

## Properties

| Name | Description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [HeightSegments](../../aspose.threed.entities/sphere/heightsegments/) { get; set; } | Gets or sets the height segments. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [PhiLength](../../aspose.threed.entities/sphere/philength/) { get; set; } | Gets or sets the length of the phi. |
| [PhiStart](../../aspose.threed.entities/sphere/phistart/) { get; set; } | Gets or sets the phi start. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Radius](../../aspose.threed.entities/sphere/radius/) { get; set; } | Gets or sets the radius of the sphere. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [ThetaLength](../../aspose.threed.entities/sphere/thetalength/) { get; set; } | Gets or sets the length of the theta. |
| [ThetaStart](../../aspose.threed.entities/sphere/thetastart/) { get; set; } | Gets or sets the theta start. |
| [WidthSegments](../../aspose.threed.entities/sphere/widthsegments/) { get; set; } | Gets or sets the width segments. |

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
| override [ToMesh](../../aspose.threed.entities/sphere/tomesh/)() | Convert current object to mesh |

### See Also

* class [Primitive](../primitive/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


