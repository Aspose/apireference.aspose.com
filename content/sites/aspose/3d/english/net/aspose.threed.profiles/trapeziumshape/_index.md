---
title: Class TrapeziumShape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.TrapeziumShape class. IFC compatible Trapezium shape defined by parameters
type: docs
weight: 1730
url: /net/aspose.threed.profiles/trapeziumshape/
---
## TrapeziumShape class

IFC compatible Trapezium shape defined by parameters.

```csharp
public class TrapeziumShape : ParameterizedProfile
```

## Constructors

| Name | Description |
| --- | --- |
| [TrapeziumShape](trapeziumshape/)() | Constructor of `TrapeziumShape` |

## Properties

| Name | Description |
| --- | --- |
| [BottomXDim](../../aspose.threed.profiles/trapeziumshape/bottomxdim/) { get; set; } | Gets or sets the extent of the bottom line measured along the x-axis. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [TopXDim](../../aspose.threed.profiles/trapeziumshape/topxdim/) { get; set; } | Gets or sets the extent of the top line measured along the x-axis. |
| [TopXOffset](../../aspose.threed.profiles/trapeziumshape/topxoffset/) { get; set; } | Gets or sets the offset from the beginning of the top line to the bottom line. |
| [YDim](../../aspose.threed.profiles/trapeziumshape/ydim/) { get; set; } | Gets or sets the distance between the top and bottom lines measured along the y-axis. |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Profile`](../profile/).) |
| override [GetExtent](../../aspose.threed.profiles/trapeziumshape/getextent/)() | Gets the extent in x and y dimension. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [ParameterizedProfile](../parameterizedprofile/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


