---
title: Class CircleShape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.CircleShape class. IFC compatible circle profile which can be used to construct a mesh through LinearExtrusion
type: docs
weight: 1600
url: /net/aspose.threed.profiles/circleshape/
---
## CircleShape class

IFC compatible circle profile, which can be used to construct a mesh through [`LinearExtrusion`](../../aspose.threed.entities/linearextrusion/)

```csharp
public class CircleShape : ParameterizedProfile
```

## Constructors

| Name | Description |
| --- | --- |
| [CircleShape](circleshape/#constructor)() | Construct a `CircleShape` profile with default radius(5). |
| [CircleShape](circleshape/#constructor_1)(double) | Construct a `CircleShape` profile with specified radius. |

## Properties

| Name | Description |
| --- | --- |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [Radius](../../aspose.threed.profiles/circleshape/radius/) { get; set; } | Gets or sets the radius of the circle. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| override [GetExtent](../../aspose.threed.profiles/circleshape/getextent/)() | Gets the extent in x and y dimension. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |

### See Also

* class [ParameterizedProfile](../parameterizedprofile/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


