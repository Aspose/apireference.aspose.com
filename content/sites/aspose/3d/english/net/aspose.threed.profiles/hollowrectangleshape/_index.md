---
title: Class HollowRectangleShape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Profiles.HollowRectangleShape class. IFC compatible hollow rectangular shape with both inner/outer rounding corners
type: docs
weight: 1100
url: /net/aspose.threed.profiles/hollowrectangleshape/
---
## HollowRectangleShape class

IFC compatible hollow rectangular shape with both inner/outer rounding corners.

```csharp
public class HollowRectangleShape : RectangleShape
```

## Constructors

| Name | Description |
| --- | --- |
| [HollowRectangleShape](hollowrectangleshape/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [InnerFilletRadius](../../aspose.threed.profiles/hollowrectangleshape/innerfilletradius/) { get; set; } | The inner fillet radius of the inner rectangle. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RoundingRadius](../../aspose.threed.profiles/rectangleshape/roundingradius/) { get; set; } | Gets or sets the radius of the circular arcs of all four corners, measured in degrees. Default value is 0.0(Inherited from [`RectangleShape`](../rectangleshape/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [WallThickness](../../aspose.threed.profiles/hollowrectangleshape/wallthickness/) { get; set; } | The thickness between the boundary of the rectangle and the inner hole |
| [XDim](../../aspose.threed.profiles/rectangleshape/xdim/) { get; set; } | Gets or sets the extent of the rectangle in the direction of x-axis Default value is 2.0(Inherited from [`RectangleShape`](../rectangleshape/).) |
| [YDim](../../aspose.threed.profiles/rectangleshape/ydim/) { get; set; } | Gets or sets the extent of the rectangle in the direction of y-axis Default value is 2.0(Inherited from [`RectangleShape`](../rectangleshape/).) |

## Methods

| Name | Description |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Profile`](../profile/).) |
| override [GetExtent](../../aspose.threed.profiles/rectangleshape/getextent/)() | Gets the extent in x and y dimension.(Inherited from [`RectangleShape`](../rectangleshape/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [RectangleShape](../rectangleshape/)
* namespace [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* assembly [Aspose.3D](../../)


