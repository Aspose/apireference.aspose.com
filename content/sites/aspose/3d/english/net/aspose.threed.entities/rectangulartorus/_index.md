---
title: Class RectangularTorus
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.RectangularTorus class. Parameterized rectangular torus
type: docs
weight: 630
url: /net/aspose.threed.entities/rectangulartorus/
---
## RectangularTorus class

Parameterized rectangular torus.

```csharp
public class RectangularTorus : Primitive
```

## Constructors

| Name | Description |
| --- | --- |
| [RectangularTorus](rectangulartorus/#constructor)() | Constructor of `RectangularTorus` |
| [RectangularTorus](rectangulartorus/#constructor_1)(string) | Constructor of `RectangularTorus` |

## Properties

| Name | Description |
| --- | --- |
| [AngleStart](../../aspose.threed.entities/rectangulartorus/anglestart/) { get; set; } | The start angle of the arc, measured in radian. Default value is 0 |
| [Arc](../../aspose.threed.entities/rectangulartorus/arc/) { get; set; } | The total angle of the arc, measured in radian. Default value is PI |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [Height](../../aspose.threed.entities/rectangulartorus/height/) { get; set; } | The height of the rectangular torus. Default value is 20 |
| [InnerRadius](../../aspose.threed.entities/rectangulartorus/innerradius/) { get; set; } | The inner radius of the rectangular torus Default value is 17 |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [OuterRadius](../../aspose.threed.entities/rectangulartorus/outerradius/) { get; set; } | The outer radius of the rectangular torus Default value is 20 |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [RadialSegments](../../aspose.threed.entities/rectangulartorus/radialsegments/) { get; set; } | The radial segments, default value is 10 |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |

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
| override [ToMesh](../../aspose.threed.entities/rectangulartorus/tomesh/)() | Convert this primitive to [`Mesh`](../mesh/) |

### See Also

* class [Primitive](../primitive/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


