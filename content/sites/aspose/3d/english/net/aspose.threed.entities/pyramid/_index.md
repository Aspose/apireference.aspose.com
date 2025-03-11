---
title: Class Pyramid
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Pyramid class. Parameterized pyramid
type: docs
weight: 620
url: /net/aspose.threed.entities/pyramid/
---
## Pyramid class

Parameterized pyramid.

```csharp
public class Pyramid : Primitive
```

## Constructors

| Name | Description |
| --- | --- |
| [Pyramid](pyramid/#constructor)() | Construct a new pyramid instance with default bottom area(10, 10) and default height(5) |
| [Pyramid](pyramid/#constructor_1)(double, double, double) | Construct a new pyramid instance with specified bottom area |
| [Pyramid](pyramid/#constructor_2)(double, double, double, double, double) | Construct a new pyramid instance with specified bottom area and top area and height. |
| [Pyramid](pyramid/#constructor_3)(string, double, double, double, double, double) | Construct a new pyramid instance with specified bottom area and top area and height. |

## Properties

| Name | Description |
| --- | --- |
| [BottomArea](../../aspose.threed.entities/pyramid/bottomarea/) { get; set; } | Area of the bottom cap |
| [BottomOffset](../../aspose.threed.entities/pyramid/bottomoffset/) { get; set; } | Offset for bottom vertices |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| [Height](../../aspose.threed.entities/pyramid/height/) { get; set; } | Height of the pyramid |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [TopArea](../../aspose.threed.entities/pyramid/toparea/) { get; set; } | Area of the top cap |

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
| override [ToMesh](../../aspose.threed.entities/pyramid/tomesh/)() | Convert current object to mesh |

### See Also

* class [Primitive](../primitive/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


